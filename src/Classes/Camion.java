/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import static Windows.MainWindow.ContCamiones;
import java.util.ArrayList;

/**
 *
 * @author isaac
 */
public class Camion {
    ArrayList <Orden> OrdenesCamion;
    int contOrden=0;
    
    int ID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
        ContCamiones++;
    }
    
    

    public Camion(ArrayList<Orden> OrdenesCamion) {
        this.OrdenesCamion = OrdenesCamion;
        this.contOrden=0;
    }
    
    public Camion(){
        
    }

    public int getContOrden() {
        return contOrden;
    }

    public void setContOrden(int contOrden) {
        this.contOrden = contOrden;
    }
    
    

    public ArrayList<Orden> getOrdenesCamion() {
        return OrdenesCamion;
    }

    public void setOrdenesCamion(ArrayList<Orden> OrdenesCamion) {
        this.OrdenesCamion = OrdenesCamion;
    }

    @Override
    public String toString() {
        return "Camion " + ID;
    }
    
    
    
}
