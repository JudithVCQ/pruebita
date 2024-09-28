package Controlador;

import Modelo.Producto;
import Modelo.ProductoFabrica;
import Modelo.ProductoRepositorio;
import java.io.IOException;
import java.util.List;

public class TiendaControlador {
    private ProductoRepositorio repositorio;
    private ProductoFabrica fabrica;

    public TiendaControlador(ProductoRepositorio repositorio, ProductoFabrica fabrica) {
        this.repositorio = repositorio;
        this.fabrica = fabrica;
    }

    public List<Producto> obtenerProductos() throws IOException {
        return repositorio.leerProductos();
    }

    public Producto crearProducto(String nombre, double precio, int stock) throws IOException {
        return fabrica.crearProducto(nombre, precio, stock);
    }

    public String[] obtenerNombresDeProductos() throws IOException {
        return repositorio.obtenerNombresDeProductos();
    }
    
    public void añadirStock(String nombre, int cantidad) throws IOException {
        repositorio.añadirStock(nombre, cantidad);
    }

    public void removerStock(String nombre, int cantidad) throws IOException {
        repositorio.removerStock(nombre, cantidad);
    }
    
    public void editarNombreProducto(String nombre, String nuevoNombre) throws IOException {
        repositorio.editarNombre(nombre, nuevoNombre);
    }
    
    public void editarPrecioProducto(String nombre, double nuevoPrecio) throws IOException {
        repositorio.editarPrecio(nombre, nuevoPrecio);
    }
    
    public void eliminarProducto(String nombre) throws IOException {
        repositorio.eliminarProducto(nombre);
    }
    
    public Producto obtenerProductoPorNombre(String nombre) throws IOException {
        return repositorio.obtenerProductoPorNombre(nombre);
    }
}   
