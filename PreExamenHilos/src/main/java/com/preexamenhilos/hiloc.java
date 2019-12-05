/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.preexamenhilos;

import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Antonio Jose Adamuz Sereno
 */
public class hiloc extends Thread{
   private boolean S; 
   private boolean P;
   
    @Override
    public void run() { 
        while (true) {    
            try {
                sleep(1000);
                compruebaTemperatura();
                  synchronized(this){
                            while(S){
                                wait();
                            }
                            if(P)break;
                     }
                 Temperatura.getInstance().aumentar();
                 JFMain.ajustarTemperatura(String.valueOf(Temperatura.getInstance().getTemperatura()));
            } catch (InterruptedException ex) {
               
            }
            
       }
    }
    
    private void compruebaTemperatura(){
        if(Temperatura.getInstance().getTemperatura()>=(Temperatura.getInstance().getDeseada()+5)){
            suspenderhilo();
        }
        
    }
       
   
     synchronized void pausarhilo() {
        P = true;
        S = false;
        notifyAll();
    }

    synchronized void suspenderhilo() {
        S = true;
    }

    synchronized void renaudarhilo() {
        S = false;
        notifyAll();
    }
    
    
    
}
