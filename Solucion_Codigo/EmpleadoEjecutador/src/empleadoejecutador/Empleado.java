package empleadoejecutador;

public class Empleado {

    private String nombre;
    private double salario;
    private int edad;

    public Empleado(String nombre, double salario, int edad) {
        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void calcularAumentoSalario(double porcentaje) {
        salario += salario * (porcentaje / 100);
    }

    public String toString() { 
        return " Nombre: " + nombre + " Salario: " + salario + " Edad: " + edad;
    }
}