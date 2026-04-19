package controlador;

import modelo.RegistrarBitacora;

public class ControladorRegistrarBitacora {

    RegistrarBitacora objModelo;

    public ControladorRegistrarBitacora() {
        this.objModelo = new RegistrarBitacora();
    }

    public void registrar(String fecha, String actividad) {
        this.objModelo.registrar(fecha, actividad);
    }
}