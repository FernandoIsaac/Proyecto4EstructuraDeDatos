/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
import static Windows.MainWindow.ContadorCocineros;
import java.util.Queue;
import java.util.Stack;
/**
 *
 * @author isaac
 */
public class Cocinero {
    Queue<Orden> OrdenesAPreprar;
    Stack<Ingrediente> IngredientesCocinero;
    boolean disponible;
    int ID;
    int progress;

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }
    
    
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
        ContadorCocineros++;
    }
    
    
   
    public Cocinero(){
        System.out.println("xavi se la come");
    }
    
    public Cocinero(Queue<Orden> OrdenesAPreprar, Stack<Ingrediente> IngredientesCocinero, boolean disponible) {
        this.OrdenesAPreprar = OrdenesAPreprar;
        this.IngredientesCocinero = IngredientesCocinero;
        this.disponible = disponible;
    }

    public Queue<Orden> getOrdenesAPreprar() {
        return OrdenesAPreprar;
    }

    public void setOrdenesAPreprar(Queue<Orden> OrdenesAPreprar) {
        this.OrdenesAPreprar = OrdenesAPreprar;
    }

    public Stack<Ingrediente> getIngredientesCocinero() {
        return IngredientesCocinero;
    }

    public void setIngredientesCocinero(Stack<Ingrediente> IngredientesCocinero) {
        this.IngredientesCocinero = IngredientesCocinero;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return ""+ID;
    }
    
    
    
}
