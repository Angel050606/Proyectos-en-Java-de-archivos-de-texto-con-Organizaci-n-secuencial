package controlador;

import javax.swing.table.DefaultTableModel;
import modelo.ModeloArchivoTexto;
import vista.VistaContactos;

public class ControladorMostrarContactos {
    ModeloArchivoTexto objArch;

    public void mostrar(String[] columnas, VistaContactos vista) {
        objArch = new ModeloArchivoTexto();
        objArch.abrirArchivoTexto('r', "agenda.txt");
        Object[][] datos = objArch.obtenerMatrizLineas(columnas.length);
        objArch.cerrarArchivo('r');

        DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
        vista.tblContactos.setModel(modelo);
    }
}