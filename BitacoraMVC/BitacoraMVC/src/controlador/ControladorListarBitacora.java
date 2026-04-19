package controlador;

import javax.swing.table.DefaultTableModel;
import modelo.ListarBitacora;
import vista.VistaBitacora;

public class ControladorListarBitacora {

    ListarBitacora objModelo;
    VistaBitacora vista;

    public ControladorListarBitacora(VistaBitacora vista) {
        this.vista = vista;
        this.objModelo = new ListarBitacora();
    }

    public void listar(String[] columnas) {
        Object[][] datos = this.objModelo.listar(columnas);
        DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
        vista.tblBitacora.setModel(modelo);
    }
}