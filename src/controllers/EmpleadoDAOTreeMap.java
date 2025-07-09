package controllers;

import java.util.Map;
import java.util.TreeMap;
import models.Empleado;

public class EmpleadoDAOTreeMap implements EmpleadoDAO {

    private Map<Empleado, Empleado> empleados;

    public EmpleadoDAOTreeMap() {
        empleados = new TreeMap<>();
    }

    @Override
    public void add(Empleado emp) {
        empleados.put(emp, emp);
    }

    @Override
    public void list() {
        empleados.values().forEach(System.out::println);
    }

    @Override
    public void remove(int id) {
        empleados.remove(new Empleado(id));
    }
}