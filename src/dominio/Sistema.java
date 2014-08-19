package dominio;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Persona> lstPersonas;

    public ArrayList<Persona> getLstPersonas() {
        return lstPersonas;
    }

    public void setLstPersonas(ArrayList<Persona> lstPersonas) {
        this.lstPersonas = lstPersonas;
    }

    public Sistema() {
        this.lstPersonas = new ArrayList<Persona>();
    }
    
    public boolean agregarPersona(int cedula, String nombre, int edad){
        boolean ok = false;
        Persona unaPersona = new Persona(nombre, edad, cedula);
        if (!this.getLstPersonas().contains(unaPersona)){
            this.getLstPersonas().add(unaPersona);
            ok = true;
        }
        return ok;
    }
    
    public boolean modificarPersona(int cedula, String nombre, int edad){
        boolean ok = false;
        //Persona unaPersona = ;
        if (!this.getLstPersonas().contains(unaPersona)){
            this.getLstPersonas().add(unaPersona);
            ok = true;
        }
        return ok;
    }
}
