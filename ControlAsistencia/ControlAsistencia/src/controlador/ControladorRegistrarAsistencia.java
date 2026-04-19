package controlador;

import modelo.RegistrarAsistencia;

public class ControladorRegistrarAsistencia {

    RegistrarAsistencia objModelo;

    public ControladorRegistrarAsistencia() {
        this.objModelo = new RegistrarAsistencia();
    }

    public void registrar(String nombre, String fecha, String estado) {
        this.objModelo.registrar(nombre, fecha, estado);
    }
}