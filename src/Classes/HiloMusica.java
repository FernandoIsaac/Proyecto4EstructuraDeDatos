package Classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isaac
 */
public class HiloMusica implements Runnable {
   private Thread t;
   //private String threadName;
   
   public HiloMusica(){
       //threadName = name;
       //System.out.println("Creating " +  threadName );
   }

    public HiloMusica(Thread aThis, String threadName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   public void run() {
       
       SimplePlayer p = new SimplePlayer();
      /*System.out.println("Running " +  threadName );
      try {
         for(int i = 4; i > 0; i--) {
            System.out.println("Thread: " + threadName + ", " + i);
            // Let the thread sleep for a while.
            Thread.sleep(50);
         }
     } catch (InterruptedException e) {
         System.out.println("Thread " +  threadName + " interrupted.");
     }
     System.out.println("Thread " +  threadName + " exiting.");*/
   }
   
   public void start ()
   {
      //System.out.println("Starting " +  threadName );
      if (t == null)
      {
         t = new Thread (this);
         t.start ();
      }
   }

     public static void main(String args[]) {
   
      HiloMusica R1 = new HiloMusica( /*"Thread-1"*/);
         System.out.println("NO importa donde ponga los sout siempre van a salir?");
      R1.start();
         System.out.println("aieojrea");
      HiloMusica R2 = new HiloMusica( /*"Thread-2"*/);
         System.out.println("QUiere decir que todo vale verga entonces?");
      R2.start();
   }   
   
}

