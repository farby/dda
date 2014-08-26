/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dominio;

/**
 *
 * @author alumnoFI
 */
public class Semaforo {
    String ubicacion;
    int estado;

    public Semaforo(String ubicacion) {
        this.ubicacion = ubicacion;
        this.estado = 2;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getEstado() {
        return estado;
    }

    private void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Semaforo " + ubicacion;
    }
    
    public void cambiar(){
        if(this.getEstado() < 2){
            this.setEstado(this.getEstado() + 1);
        }
        else{
            this.setEstado(0);
        }
    }
}
