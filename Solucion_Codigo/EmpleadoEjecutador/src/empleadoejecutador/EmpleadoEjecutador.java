package empleadoejecutador;

import java.util.Scanner;

public class EmpleadoEjecutador {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        
        System.out.println("Numero de empleados: ");
        
        int nE, edad, tE = 0;
        double salario;
        String nombre;
        int opcion;
        nE = tcl.nextInt();
        Empleado[] empleados = new Empleado[nE];
        
        do {
            
            System.out.println("_");
            System.out.println("Menu de Empleados");
            System.out.println("_");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Mostrar Informacion de los empleados");
            System.out.println("3. Calcular Aumento de Salario");
            System.out.println("4. Salir");
            System.out.println("Opcion: ");
            opcion = tcl.nextInt();
            
            switch (opcion) {
                
                case 1:
                    
                    tcl.nextLine();
                    System.out.println("Nombre del empleado: ");
                    nombre = tcl.nextLine();
                    System.out.println("Edad: ");
                    edad = tcl.nextInt();
                    System.out.println("Salario del empleado: ");
                    salario = tcl.nextDouble();
                    empleados[tE] = new Empleado(nombre, salario, edad);
                    tE++;                    
                    break;
                    
                case 2:
                    
                    if (tE == 0) {
                        System.out.println("No hay empleados");
                    } else {
                        System.out.println("Empleados: ");
                        for (int i = 0; i < tE; i++) {
                            System.out.println(empleados[i]);
                        }
                    }
                    break;
                    
                case 3:
                    
                    double suma = 0;
                    for (int i = 0; i < tE; i++) {
                        suma += empleados[i].getSalario();
                    }
                    double promedio;
                    promedio = suma / tE;
                    System.out.println("Ingrese el aumento en porcentaje: ");
                    double porcentaje;
                    porcentaje = tcl.nextDouble();
                    int i = 0;
                    
                    do {
                        
                        if (empleados[i].getSalario() < promedio) {
                            empleados[i].calcularAumentoSalario(porcentaje);
                            System.out.println("Nuevo salario para " + empleados[i]);
                        }
                        i++;
                    } while (i < tE);
            }
            
        } while (opcion != 4);
        
        System.out.println("Saliendo :)");
    }
}