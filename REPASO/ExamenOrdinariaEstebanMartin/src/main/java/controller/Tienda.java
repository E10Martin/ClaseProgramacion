package controller;

import dto.ProductosDTO;
import model.Productos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {

    static Scanner scanner = new Scanner(System.in);
    private ArrayList<Productos> listaProductos = new ArrayList<>();

    public void menuInsertar(){
        System.out.println("id");
        int id = scanner.nextInt();
        System.out.println("nombre");
        String nombre = scanner.next();
        System.out.println("precio");
        int precio = scanner.nextInt();
        System.out.println("cantidad");
        int cantidad = scanner.nextInt();

        ProductosDTO productosDTO = new ProductosDTO();
        productosDTO.insertarProductos(new Productos(id, nombre, precio, cantidad));
        listaProductos.add(new Productos(id, nombre, precio, cantidad));
    }
    public void menuEsliminar(){
        System.out.println("ID que quires ver");
        int id = scanner.nextInt();

        ProductosDTO productosDTO  =new ProductosDTO();
        productosDTO.eliminarProductos(id);
    }

    public void mostrarProducto(){
        System.out.println("ID que quires eliminar");
        int id = scanner.nextInt();

        ProductosDTO productosDTO = new ProductosDTO();
        Productos productoConsultado = productosDTO.mostrarProducto(id);
        if (productoConsultado != null){
            productoConsultado.mostrarProductos();
        } else {
            System.out.println("No se encontro ningun producto con ese id");
        }
    }

    public void menuTienda(){
        ProductosDTO productosDTO = new ProductosDTO();
        productosDTO.mostrarTienda();
    }

    public void actualizarProducto(){
        System.out.println("ID que quires ver");
        int id = scanner.nextInt();

        ProductosDTO productosDTO = new ProductosDTO();
        productosDTO.actualizarProducto(id);
    }

    public void productosCSV(){
        String url = "C:\\Users\\Usuario DAM1\\Documents\\GitHub\\ClaseProgramacion\\REPASO\\ExamenOrdinariaEstebanMartin\\src\\main\\resources\\productos.txt";

        try(FileWriter writer = new FileWriter(url)) {
            writer.write("id | nombre | precio | cantidad");
            for ( Productos productos :listaProductos){
                writer.write("%s | %s | %s | %s");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
