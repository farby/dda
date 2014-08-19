package dominio;

public class Persona {
    String nombre;
    int edad;
    int cedula;

    public Persona(String nombre, int edad, int cedula) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
    @Override
    public String toString(){
        return this.getCedula() + " " + this.getNombre();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + this.cedula;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.cedula != other.cedula) {
            return false;
        }
        return true;
    }
    
    
    
    
}
