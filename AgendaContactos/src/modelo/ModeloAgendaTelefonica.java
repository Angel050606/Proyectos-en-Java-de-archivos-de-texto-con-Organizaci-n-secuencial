package modelo;

public class ModeloAgendaTelefonica {
    private String nombre;
    private String telefono;
    private String email;

    public ModeloAgendaTelefonica(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmial() {
        return email;
    }

    public void setEmial(String email) {
        this.email = email;
    }

 

    @Override
    public String toString() {
        return nombre + "," + telefono + "," + email;
    }
}