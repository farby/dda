/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dominio;

import java.util.ArrayList;

/**
 *
 * @author alumnoFI
 */
public class ControladorSemaforos {
    ArrayList<Semaforo> lstSemaforos;

    public ControladorSemaforos() {
        this.lstSemaforos = new ArrayList<Semaforo>();
    }

    public ArrayList<Semaforo> getLstSemaforos() {
        return lstSemaforos;
    }

    public void setLstSemaforos(ArrayList<Semaforo> lstSemaforos) {
        this.lstSemaforos = lstSemaforos;
    }
    
    public void agregarSemaforo(String ubicacion){
        Semaforo unSemaforo = new Semaforo(ubicacion);
        this.getLstSemaforos().add(unSemaforo);
    }
    
    public void cambiarLuz(Semaforo unSemaforo){
        unSemaforo.cambiar();
    }
}
