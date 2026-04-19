package controlador;

import javax.swing.table.DefaultTableModel;
import modelo.ModeloArchivoTexto;
import vista.VistaRegistroEstudiantes;

public class ControladorListaEstudiantes {
    ModeloArchivoTexto objArchivoTexto;

    public void listarEst(String[] columnas, VistaRegistroEstudiantes vista) {
        this.objArchivoTexto = new ModeloArchivoTexto();
        this.objArchivoTexto.abrirArchivoTexto('r', "estudiantes.txt");
        Object[][] datos = this.objArchivoTexto.obtenerMatrizLineas(columnas.length);
        this.objArchivoTexto.cerrarArchivo('r');

        DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
        vista.tblListadoEstudiantes.setModel(modelo);
    }
}