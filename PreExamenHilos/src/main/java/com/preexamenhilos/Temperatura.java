/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.preexamenhilos;

/**
 *
 * @author Antonio Jose Adamuz Sereno
 */
public class Temperatura {
    
    private static Integer T;
    private static Integer D;
    
    private static Temperatura tp;
    private Temperatura() {
        this.T =0;
        this.D = 0;
    }
    
    
    public static  Temperatura getInstance(){
        if(tp==null){
            tp = new Temperatura();
        }
        return tp;
    }
     
    public  Integer getTemperatura() {
        return T;
    }

    public void setTemperatura(Integer temperatura) {
        Temperatura.T = temperatura;
    }
    
    public  void aumentar(){
       T++;
    }
    
    public  void disminuir(){
        T--;
    }
    
    
    public  void aumentarDeseada(){
       D++;
    }

    public  Integer getDeseada() {
        return D;
    }

    public void setDeseada(Integer deseada) {
        Temperatura.D = deseada;
    }

      public  void disminuirDeseada(){
        D--;
    }
    
    
}
