

/**
 * Clase Principal para instanciar objetos y probar la herencia y los métodos.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== PRUEBAS DE HERENCIA EN JAVA ===\n");

        // Instanciación de un objeto de la subclase
        clase objetoDerivado = new clase("Componente Alpha", 101, "Config_A");

        // Prueba de métodos heredados y sobrescritos
        System.out.println("--- Prueba de Métodos Base y Sobrescritos ---");
        objetoDerivado.mostrarDetalles();
        objetoDerivado.ejecutarOperacionBase();

        // Prueba de método exclusivo
        System.out.println("\n--- Prueba de Método Exclusivo ---");
        objetoDerivado.metodoExclusivoSubclase();
    }
}