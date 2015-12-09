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
public class Producto {
    String nombre;
    ArrayList<Ingrediente> ingredientes;
    int TiempoDePreparacion;
    double precio;
    

    public Producto(String nombre, ArrayList<Ingrediente> ingredientes, int TiempoDePreparacion, double precio) {
        this.nombre = nombre;
        //for (int i = 0; i < ingredientes.size(); i++) {
          //  this.ingredientes.add(ingredientes.get(i));
        //}
        this.ingredientes = ingredientes;
        this.TiempoDePreparacion = TiempoDePreparacion;
        this.precio = precio;
    }

    public Producto(){
        
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        if(!this.ingredientes.isEmpty()){
            for (int i = 0; i < this.ingredientes.size(); i++) {
                this.ingredientes.remove(i);
            }
        }
        for (int i = 0; i < ingredientes.size(); i++) {
            this.ingredientes.add(ingredientes.get(i));
        }
    }

    public int getTiempoDePreparacion() {
        return TiempoDePreparacion;
    }

    public void setTiempoDePreparacion(int TiempoDePreparacion) {
        this.TiempoDePreparacion = TiempoDePreparacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
