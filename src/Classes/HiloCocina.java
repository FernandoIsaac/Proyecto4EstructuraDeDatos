/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import static Windows.MainWindow.ImageLabel;
import static Windows.MainWindow.MessageDialog;
import static Windows.MainWindow.ProgresoCocineros;
import static Windows.MainWindow.TextoMensaje;
import static Windows.MainWindow.cb_OrdenesCamiones;
import static Windows.MainWindow.cb_OrdenesCocineros;
import static Windows.MainWindow.cocineros;
import static Windows.MainWindow.ingredientes;
import static Windows.MainWindow.ordenesCamiones;
import static Windows.MainWindow.rojo;
import static Windows.MainWindow.verde;
import java.util.ArrayList;
import java.util.TimerTask;
import javafx.scene.control.ProgressBar;
import java.util.Timer;

/**
 *
 * @author isaac
 */
public class HiloCocina implements Runnable{
    public static int counter = 0;
    public static int totalTime;
    private Thread t;
    public static int controladorIngredientes = 0;
    public static int contIngredientes=0;
    public static int posicionCocinero;
    public static ArrayList<Ingrediente> tempIngredientes = new ArrayList();
    public static int iterator=0;
    boolean controlador=true;
    public HiloCocina(Thread athis, ProgressBar bar, Cocinero cocinero){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public HiloCocina(int index){
        counter = 0;
        posicionCocinero = index;
    }
    
    public void updateBar(int newValue) {
    //pbar.setValue(newValue);
  }
    
    
    public TimerTask timerTask = new TimerTask() {
        
            @Override
            public void run() {
                //if(counter == 14){
               //     System.out.println("el cocinero lleva "+counter+"segundos");
               // }
               // if(counter<31){
                System.out.println("TimerTask executing counter is: " + counter);
                ProgresoCocineros.setValue(counter);
                counter++;//increments the counter
                cocineros.get(posicionCocinero).setProgress(counter);
                //}
                //if(counter==31){
                  //  System.out.println("esto llego a su fin");
                   // System.exit(0);
               // }
                if(counter==totalTime){
                    cocineros.get(posicionCocinero).setDisponible(true);
                    rojo.setVisible(false);
                    verde.setVisible(true);
                    cb_OrdenesCamiones.addItem(cocineros.get(posicionCocinero).getOrdenesAPreprar().peek());
                    cb_OrdenesCocineros.removeItem(cocineros.get(posicionCocinero).getOrdenesAPreprar().peek()); 
                    //cb_OrdenesCamiones.addItem(cocineros.get(posicionCocinero).getOrdenesAPreprar().peek());
                    ordenesCamiones.add(cocineros.get(posicionCocinero).getOrdenesAPreprar().poll());
                    //cb_OrdenesCamiones.addItem();
                    MessageDialog.pack();
                    MessageDialog.setModal(true);
                    MessageDialog.setLocationRelativeTo(null);
                    TextoMensaje.setText("El Cocinero "+ cocineros.get(posicionCocinero).getID()+" Termino La Orden");
                    ImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/panadero.jpeg")));
                    MessageDialog.setVisible(true);
                    //counter = 0;
                    
                    
                }
            }
        };
    /*Timer timer = new Timer("MyTimer");//create a new Timer

        timer.scheduleAtFixedRate(timerTask, 30, 1000);//this line starts the timer at the same time its executed*/
       public void run() {
           /*while(controlador==true){
               cocineros.get(posicionCocinero).getOrdenesAPreprar().peek().getProductosOrdenes().get(controladorIngredientes).getIngredientes().get(controladorIngredientes);
               contIngredientes+=cocineros.get(posicionCocinero).getOrdenesAPreprar().peek().getProductosOrdenes().get(controladorIngredientes).getIngredientes().size();
               controladorIngredientes++;
               if (cocineros.get(posicionCocinero).getOrdenesAPreprar().peek().getProductosOrdenes()) {
                   
               }
           }*/
           
       
      try {
          cocineros.get(posicionCocinero).setDisponible(false);
          verde.setVisible(false);
          rojo.setVisible(true);
           for (int i = 0; i < cocineros.get(posicionCocinero).getOrdenesAPreprar().peek().getProductosOrdenes().size(); i++) {
               for (int j = 0; j < cocineros.get(posicionCocinero).getOrdenesAPreprar().peek().getProductosOrdenes().get(i).getIngredientes().size(); j++) {
                 cocineros.get(posicionCocinero).getIngredientesCocinero().push(cocineros.get(posicionCocinero).getOrdenesAPreprar().peek().getProductosOrdenes().get(i).getIngredientes().get(j));
               }
               totalTime+=cocineros.get(posicionCocinero).getOrdenesAPreprar().peek().getProductosOrdenes().get(i).getTiempoDePreparacion();
               //contIngredientes+=cocineros.get(posicionCocinero).getOrdenesAPreprar().peek().getProductosOrdenes().get(i).getIngredientes().size();
           }
           
           
           ProgresoCocineros.setMaximum(totalTime);
           
           Timer timer = new Timer("My Timer");
           timer.scheduleAtFixedRate(timerTask, totalTime, 1000);
           
           
           
         
       //     System.out.println("Thread: " + threadName + ", " + i);
            // Let the thread sleep for a while.
            Thread.sleep(0);
         
     } catch (InterruptedException e) {
         System.out.println("Thread "/* +  threadName*/ + " interrupted.");
     }
     System.out.println("Thread " /*+  threadName*/ + " exiting.");
   }
       
        public void start ()
   {
     // System.out.println("Starting " +  threadName );
      // System.out.println("como se si esto esta funcionando?"); 
      if (t == null)
      {
         t = new Thread (this);
         t.start ();
      }
   }
}
