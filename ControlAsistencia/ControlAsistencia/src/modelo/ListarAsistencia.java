package modelo;

public class ListarAsistencia {

    ArchivoTexto objArchivoTexto;

    public Object[][] listar(String[] columnas) {

        this.objArchivoTexto = new ArchivoTexto();
        this.objArchivoTexto.abrirArchivoTexto('r', "asistencia.txt");

        Object[][] datos = this.objArchivoTexto.obtenerMatrizLineas(columnas.length);

        this.objArchivoTexto.cerrarArchivo('r');

        return datos;
    }
}