package Modelo;

public class Venta {
    
    private int id;
    private String nombre;
    private double precio;
    private int stock;
    private double importe;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public double getImporte() {
        return importe;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    } 
}
