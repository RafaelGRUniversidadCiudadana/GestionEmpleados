<<<<<<< HEAD


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
=======
public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTIÓN DE EMPLEADOS ===\n");

        Empleado emp1 = new Empleado(101, "Ana Gómez", "Desarrolladora Java", 25000.00);
        Empleado emp2 = new Empleado(102, "Carlos López", "Analista de Datos", 22000.00);

        System.out.println("--- Estado Inicial ---");
        emp1.mostrarInformacion();
        emp2.mostrarInformacion();

        System.out.println("--- Aplicando Aumentos Salariales ---");
        emp1.aplicarAumento(10);
        emp2.aplicarAumento(5);

        System.out.println("\n--- Estado Actualizado ---");
        emp1.mostrarInformacion();
        emp2.mostrarInformacion();
>>>>>>> origin/master
    }
}