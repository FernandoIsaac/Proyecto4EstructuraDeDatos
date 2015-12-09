/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;

/**
 *
 * @author isaac
 */
public class Orden {
    int number;
    String cliente;
    double precioTotal;
    int tiempoTotal;
    ArrayList<Producto> productosOrdenes = new ArrayList();
    public static boolean cocinada;

    public  boolean isCocinada() {
        return cocinada;
    }

    public  void setCocinada() {
        Orden.cocinada = true;
    }
    
    public Orden() {
    }

    
    public Orden(int number, String cliente, double precioTotal, int tiempoTotal) {
        this.number = number;
        this.cliente = cliente;
        this.precioTotal = precioTotal;
        this.tiempoTotal = tiempoTotal;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void setTiempoTotal(int tiempoTotal) {
        this.tiempoTotal = tiempoTotal;
    }

    public ArrayList<Producto> getProductosOrdenes() {
        return productosOrdenes;
    }

    public void setProductosOrdenes(ArrayList<Producto> productosOrdenes) {
        this.productosOrdenes = productosOrdenes;
    }

    @Override
    public String toString() {
        return "{" +number + '}';
    }
    
    
    
}
