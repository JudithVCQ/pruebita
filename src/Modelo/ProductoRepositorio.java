package Modelo;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductoRepositorio {
    private String fileName;

    public ProductoRepositorio(String fileName) {
        this.fileName = "src/Data/" + fileName;
    }

    public List<Producto> leerProductos() throws IOException {
        List<Producto> productos = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    productos.add(Producto.fromString(line));
                }
            }
        }
        return productos;
    }

    public void escribirProductos(List<Producto> productos) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Producto producto : productos) {
                writer.write(producto.toString());
                writer.newLine();
            }
        }
    }
    
    public String[] obtenerNombresDeProductos() throws IOException {
        List<Producto> productos = leerProductos();
        String[] nombres = new String[productos.size()];
        for (int i = 0; i < productos.size(); i++) {
            nombres[i] = productos.get(i).getNombre();
        }
        return nombres;
    }
    
    public void añadirStock(String nombre, int cantidad) throws IOException {
        List<Producto> productos = leerProductos();
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                producto.setStock(producto.getStock() + cantidad);
                escribirProductos(productos);
                return;
            }
        }
    }

    public void removerStock(String nombre, int cantidad) throws IOException {
        List<Producto> productos = leerProductos();
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                if (producto.getStock() < cantidad) {
                    throw new IllegalArgumentException("Stock insuficiente para remover.");
                }
                producto.setStock(producto.getStock() - cantidad);
                escribirProductos(productos);
                return;
            }
        }
    }
    
    public void editarNombre(String nombre, String nuevoNombre) throws IOException {
        List<Producto> productos = leerProductos();
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                producto.setNombre(nuevoNombre);
                escribirProductos(productos);
                return;
            }
        }
    }
    
    public void editarPrecio(String nombre, double nuevoPrecio) throws IOException {
        List<Producto> productos = leerProductos();
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                producto.setPrecio(nuevoPrecio);
                escribirProductos(productos);
                return;
            }
        }
    }
    
    public void eliminarProducto(String nombre) throws IOException {
        List<Producto> productos = leerProductos();
        Iterator<Producto> iterator = productos.iterator();
        while (iterator.hasNext()) {
            Producto producto = iterator.next();
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                iterator.remove();
            }      
        }
        escribirProductos(productos);
    }
    
    public Producto obtenerProductoPorNombre(String nombre) throws IOException {
        List<Producto> productos = leerProductos();
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
        return null;
    }
}