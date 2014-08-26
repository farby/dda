/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaz;

import dominio.*;

/**
 *
 * @author alumnoFI
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ControladorSemaforos unSistema = new ControladorSemaforos();
        Menu menu = new Menu(unSistema);
        //FrmAltaSemaforo alta = new FrmAltaSemaforo(unSistema);
        /*Sistema unSistema = new Sistema();
        AltaPersonas ventana = new AltaPersonas(unSistema);*/
        menu.setVisible(true);
    }
    
}
