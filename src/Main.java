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
    }
}