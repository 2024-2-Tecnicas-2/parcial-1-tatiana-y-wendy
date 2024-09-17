/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parcial1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class Mavenproject1 {

    private static class cantidad {

        public cantidad() {
        }
    }
    public class producto {

        String nombre;
         String descripcion;
         int precio;
         int inventario;
         
         public producto (String nombre, String descripcion, int precio, int inventario)
         {
             this.nombre = nombre;
             this.descripcion = descripcion;
             this.precio = precio;
             this.inventario = inventario;
         }
         
         public String getNombre(){
             return nombre;
         }
         
         public String getDescripcion(){
             return descripcion;
        }
         public double getprecio(){
             return precio;
        }
         public int getinventario(){
             return inventario;
         }
         public void disminuirInventario(int cantidad) {
        if (inventario >= cantidad) {
            inventario -= cantidad;
        } else {
            System.out.println("Inventario insuficiente para " + nombre);
        }
    }
 
    public void mostrarProducto() {
        System.out.println("Producto: " + nombre + ", Descripción: " + descripcion + ", Precio: $" + precio + ", Inventario: " + inventario);
    }

        private static class getInventario {

            public getInventario() {
            }
        }
    }
    class Telefono extends Producto {
    private final String marca;
    private String modelo;
 
    public Telefono(String nombre, String descripcion, double precio, int inventario, String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
 
    public void mostrarTelefono() {
    System.out.println("Marca: " + marca + ", Modelo: " + modelo);
    }
}
    class Laptop extends Producto {
    private String procesador;
    private int memoriaRAM;
 
    public Laptop(String nombre, String descripcion, double precio, int inventario, String procesador, int memoriaRAM) {
        this.procesador = procesador;
        this.memoriaRAM = memoriaRAM;
    }
 
    public void mostrarLaptop() {
    System.out.println("Procesador: " + procesador + ", Memoria RAM: " + memoriaRAM + "GB");
    }
}
 
class Accesorio extends Producto {
    private String tipo;
 
    public Accesorio(String nombre, String descripcion, double precio, int inventario, String tipo) {
    this.tipo = tipo;
    }
         class Cliente {
    private String nombre;
    private String direccionEnvio;
    private List<Pedido> listaPedidos;
            private Object cantidades;
            private Object productos;
            private Object cliente;
 
    public Cliente(String nombre, String direccionEnvio) {
        this.nombre = nombre;
        this.direccionEnvio = direccionEnvio;
        this.listaPedidos = new ArrayList<>();
          }
 
    public String getNombre() {
        return nombre;
    }
 
    public String getDireccionEnvio() {
        return direccionEnvio;
    }
 
    public List<Pedido> getListaPedidos() {
        return listaPedidos;
    }
 
    public void agregarPedido(Pedido pedido) {
        listaPedidos.add(pedido);
    }
    class Pedido {
    private Cliente cliente;
    private List<Producto> productos;
    private List<Integer> cantidades;
 
    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.cantidades = new ArrayList<>();
    }
 
    public void agregarProducto(Producto producto, int cantidad) {
        
    }
        if (cantidad >= producto.getInventario()); {
            System.out.println("No hay suficiente inventario de " + producto.getNombre());
        } else {
            productos.add(producto);
            cantidades.add(cantidad);
            producto.disminuirInventario(cantidad);
        }
    }
 
    public void mostrarPedido() {
        System.out.println("Pedido del cliente: " + cliente.getNombre());
        System.out.println("Dirección de envío: " + cliente.getDireccionEnvio());
        for (int i = 0; i < productos.size(); i++) {
            Producto producto = productos.get(i);
            int cantidad = cantidades.get(i);
            System.out.println("Producto: " + producto.getNombre() + ", Cantidad: " + cantidad);
        }
    }
        }
    public class TiendaVirtual {
 
    public static void main(String[] args) {
       
        
    }
    }
    


