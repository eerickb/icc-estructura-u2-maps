import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.EmpleadoDAO;
import controllers.EmpleadoDAOHashMap;
import controllers.EmpleadoDAOTreeMap;
import controllers.Mapa;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("----Practica Mapas----");
        System.out.println("Nombre: Erick Bermeo"); /// Cambiar por su nombre
        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        runMapExample();

        // // Ejecuta el ejemplo de gestión de empleados usando HashMap
        // runEmpleadoExample();

        // // Ejecuta los ejercicios de sumatoria y anagramas
        // runEjerccios();
    }

    private static void runMapExample() {
        EmpleadoDAO empleadoDAOHash = new EmpleadoDAOHashMap();
        EmpleadoContoller empControllerHash = new EmpleadoContoller(empleadoDAOHash);
        EmpleadoDAO empleadoDAOTree = new EmpleadoDAOTreeMap();
        EmpleadoContoller empControllerTree = new EmpleadoContoller(empleadoDAOTree);
        
        Empleado emp1 = new Empleado(4, "Pedro", "DEV");
        Empleado emp2 = new Empleado(2, "Pedro", "DEV");
        Empleado emp3 = new Empleado(5, "Juan", "DEV");
        Empleado emp4 = new Empleado(3, "Maria", "DEV");
        Empleado emp5 = new Empleado(1, "Juan", "DEV");
        
        empControllerHash.agregarEmpleado(emp1);
        empControllerHash.agregarEmpleado(emp2);
        empControllerHash.agregarEmpleado(emp3);
        empControllerHash.agregarEmpleado(emp4);
        empControllerHash.agregarEmpleado(emp5);
        empControllerTree.agregarEmpleado(emp1);
        empControllerTree.agregarEmpleado(emp2);
        empControllerTree.agregarEmpleado(emp3);
        empControllerTree.agregarEmpleado(emp4);
        empControllerTree.agregarEmpleado(emp5);

        System.out.println("Lista con Hash: ");
        empControllerHash.list();
        System.out.println("Lista sin el (2) con Hash: ");
        empControllerHash.remove(2);
        empControllerHash.list();

        System.out.println("Lista con Tree: ");
        empControllerTree.list();
        System.out.println("Lista sin el (2) con Tree: ");
        empControllerTree.remove(2);
        empControllerTree.list();
    }


    private static void runEmpleadoExample() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private static void runEjerccios() {
        throw new UnsupportedOperationException("Not implemented yet");

    }
}