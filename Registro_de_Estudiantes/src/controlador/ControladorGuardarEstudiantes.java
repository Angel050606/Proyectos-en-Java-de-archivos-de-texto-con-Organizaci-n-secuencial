package controlador;

import modelo.ModeloArchivoTexto;
import modelo.ModeloEstudiante;

public class ControladorGuardarEstudiantes {
    ModeloArchivoTexto objArch;

    public void guardarEstudiantes(String numControl, String nombre, String carrera, double promedio) {
        ModeloEstudiante objEst = new ModeloEstudiante(numControl, nombre, carrera, promedio);
        
        this.objArch = new ModeloArchivoTexto();
        this.objArch.abrirArchivoTexto('w', "estudiantes.txt");
        this.objArch.crearLinea(objEst.toString());
        this.objArch.cerrarArchivo('w');
    }
}