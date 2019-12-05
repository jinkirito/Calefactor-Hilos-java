/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.preexamenhilos;

import static java.lang.Thread.sleep;

/**
 *
 * @author Antonio Jose Adamuz Sereno
 */
public class hilore extends Thread {

    private boolean SR;
    private boolean PR;

    @Override
    public void run() {
        while (true) {
            try {
                sleep(1000);
                compruebaTemperatura();
                synchronized (this) {
                    while (SR) {
                        wait();
                    }
                    if (PR) {
                        break;
                    }
                }
                Temperatura.getInstance().disminuir();
                JFMain.ajustarTemperatura(String.valueOf(Temperatura.getInstance().getTemperatura()));
            } catch (InterruptedException ex) {

            }

        }
    }

    private void compruebaTemperatura() {

        if (Temperatura.getInstance().getTemperatura() <= (Temperatura.getInstance().getDeseada() - 5)) {
           suspenderhilo();
        }

    }

    synchronized void pausarhilo() {
        PR = true;
        SR = false;
        notifyAll();
    }

    synchronized void suspenderhilo() {
        SR = true;
    }

    synchronized void renaudarhilo() {
        SR = false;
        notifyAll();
    }

}
