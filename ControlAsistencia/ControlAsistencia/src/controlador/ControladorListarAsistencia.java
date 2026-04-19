package controlador;

import javax.swing.table.DefaultTableModel;
import modelo.ListarAsistencia;
import vista.VistaAsistencia;

public class ControladorListarAsistencia {

    ListarAsistencia objModelo;
    VistaAsistencia vista;

    public ControladorListarAsistencia(VistaAsistencia vista) {
        this.vista = vista;
        this.objModelo = new ListarAsistencia();
    }

    public void listar(String[] columnas) {

        Object[][] datos = this.objModelo.listar(columnas);

        DefaultTableModel modelo = new DefaultTableModel(datos, columnas);

        vista.tblAsistencia.setModel(modelo);
    }
}