package Modelo;

import java.io.IOException;
import java.util.List;

public class ProductoFabrica {
    private ProductoRepositorio repositorio;
    private int idActual;

    public ProductoFabrica(ProductoRepositorio repositorio) throws IOException {
        this.repositorio = repositorio;
        this.idActual = calcularSiguienteId();
    }

    private int calcularSiguienteId() throws IOException {
        List<Producto> productos = repositorio.leerProductos();
        return productos.stream()
                        .mapToInt(Producto::getId)
                        .max()
                        .orElse(0) + 1;
    }

    public Producto crearProducto(String nombre, double precio, int stock) throws IOException {
        List<Producto> productos = repositorio.leerProductos();
        
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                throw new IllegalArgumentException("El producto con el nombre \"" + nombre + "\" ya existe.");
            }
        }
        
        Producto nuevoProducto = new Producto(idActual, nombre, precio, stock);
        productos.add(nuevoProducto);
        repositorio.escribirProductos(productos);
        idActual++;
        return nuevoProducto;
    }
}