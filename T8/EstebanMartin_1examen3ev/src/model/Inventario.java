package model;

import java.util.ArrayList;

public class Inventario<T> {

    private ArrayList<T> arrayList;
    private Producto producto;

    public Inventario(ArrayList<T> arrayList, Producto producto) {
        this.arrayList = arrayList;
        this.producto = producto;
    }




    public Inventario() {

    }

    public void anadirElemento(Inventario<T> inventario){
        inventario.producto.anadirPro();
    }

    @Override
    public String toString() {
        return "Inventario{" +
                "arrayList=" + arrayList +
                ", producto=" + producto +
                '}';
    }

    public ArrayList<T> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<T> arrayList) {
        this.arrayList = arrayList;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public class Producto{

        private String nombre;
        private double precio;
        private int stock;

        public Producto(String nombre, double precio, int stock) {
            this.nombre = nombre;
            this.precio = precio;
            this.stock = stock;
        }

        public void anadirPro(Producto producto){
           arrayList.add((T) producto);
        }
        @Override
        public String toString() {
            return "Producto{" +
                    "nombre='" + nombre + '\'' +
                    ", precio=" + precio +
                    ", stock=" + stock +
                    '}';
        }

        public void anadirPro() {
        }
    }
}
