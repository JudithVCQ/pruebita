package Modelo;

public class Producto {
    
    private int id;
    private String nombre;
    private double precio;
    private int stock;
    
    
    public Producto(int id, String nombre, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    
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

    @Override
    public String toString() {
        return id + "," + nombre + "," + precio + "," + stock;
    }
    
    public static Producto fromString(String str) {
        if (str == null || str.trim().isEmpty()) {
            throw new IllegalArgumentException("La cadena está vacía o es nula");
        }

        String[] parts = str.split(",");
        if (parts.length != 4) {
            throw new IllegalArgumentException("La cadena no tiene el formato correcto");
        }
        
        int id = Integer.parseInt(parts[0]);
        String nombre = parts[1];
        double precio = Double.parseDouble(parts[2]);
        int stock = Integer.parseInt(parts[3]);
        return new Producto(id, nombre, precio, stock);
        }
}
