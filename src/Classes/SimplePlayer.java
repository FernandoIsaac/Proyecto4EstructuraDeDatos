/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.FileInputStream;
import javazoom.jl.player.Player;

/**
 *
 * @author isaac
 */
public class SimplePlayer {

    public SimplePlayer(){

        try{
            //FileInputStream fis = new FileInputStream("/home/isaac/NetBeansProjects/Proyecto4FernandoReyes-11341092/src/Images/DBZ _ The Legacy of Goku 2 Soundtrack - Big Mouth.mp3");
            //FileInputStream fis = new FileInputStream("/home/isaac/Desktop/Music/NOFX/Fuck The Kids/01 Fuck The Kids.mp3");             
            //Player playMP3 = new Player(fis); 
            for(int i = 0; i < 30; i ++){
             //FileInputStream fis = new FileInputStream("/home/isaac/Desktop/Music/NOFX/Fuck The Kids/01 Fuck The Kids.mp3");             
             FileInputStream fis = new FileInputStream("/home/isaac/NetBeansProjects/Proyecto4FernandoReyes-11341092/src/Images/DBZ _ The Legacy of Goku 2 Soundtrack - Big Mouth.mp3");
             Player playMP3 = new Player(fis);
             System.out.println("antes de la cancion 2");
             playMP3.play();
             System.out.println("despues de la cancion 2");                
            
             }
        }  catch(Exception e){
             System.out.println(e);
           }
    }
    
    public static void main(String[] args) {
        System.out.println("antes de la cancion");
        SimplePlayer p = new SimplePlayer();
        System.out.println("despues de la cancion");
        
    }
}