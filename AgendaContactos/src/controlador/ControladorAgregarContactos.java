package controlador;

import modelo.ModeloAgendaTelefonica;
import modelo.ModeloArchivoTexto;

public class ControladorAgregarContactos {
    ModeloArchivoTexto objArch;

    public void agregarContacto(String nombre, String telefono, String email) {
        ModeloAgendaTelefonica contacto = new ModeloAgendaTelefonica(nombre, telefono, email);
        objArch = new ModeloArchivoTexto();
        
        objArch.abrirArchivoTexto('w', "agenda.txt");
        objArch.crearLinea(contacto.toString());
        objArch.cerrarArchivo('w');
    }
}