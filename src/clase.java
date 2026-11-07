

/**
 * Clase Derivada que hereda de Herencia, sobrescribe un método y agrega un método exclusivo.
 */
public class clase extends Herencia {
    private String parametroExclusivo; // Atributo exclusivo de esta subclase

    public clase(String nombreEntidad, int codigoIdentificador, String parametroExclusivo) {
        super(nombreEntidad, codigoIdentificador); // Llama al constructor de la clase base
        this.parametroExclusivo = parametroExclusivo;
    }

    // Sobrescritura (Overriding) del método de la clase base
    @Override
    public void ejecutarOperacionBase() {
        System.out.println("Operación sobrescrita en la clase derivada con parámetro: " + parametroExclusivo);
    }

    // Método exclusivo de esta subclase
    public void metodoExclusivoSubclase() {
        System.out.println("Ejecutando comportamiento exclusivo de la subclase en: " + nombreEntidad);
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("   [Parámetro Exclusivo: " + parametroExclusivo + "]");
    }
}