public class Empleado {

    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    public void aplicarAumento(double porcentaje) {
        if (porcentaje > 0) {
            this.salario += this.salario * (porcentaje / 100);
            System.out.println("-> Aumento del " + porcentaje + "% a " + this.nombre);
        } else {
            System.out.println("-> El porcentaje debe ser mayor a 0.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("ID: " + this.id);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Puesto: " + this.puesto);
        System.out.printf("Salario: $%.2f\n", this.salario);
        System.out.println("-----------------------------------");
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getPuesto() { return puesto; }
    public double getSalario() { return salario; }
}