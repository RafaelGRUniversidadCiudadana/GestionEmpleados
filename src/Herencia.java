

/**
 * Clase Base que define los atributos y métodos genéricos heredables.
 */
public class Herencia {
    protected String nombreEntidad;
    protected int codigoIdentificador;

    public Herencia(String nombreEntidad, int codigoIdentificador) {
        this.nombreEntidad = nombreEntidad;
        this.codigoIdentificador = codigoIdentificador;
    }

    public void ejecutarOperacionBase() {
        System.out.println("Ejecutando operación base para: " + nombreEntidad);
    }

    public void mostrarDetalles() {
        System.out.println("Entidad: " + nombreEntidad + " | Código: " + codigoIdentificador);
    }
}