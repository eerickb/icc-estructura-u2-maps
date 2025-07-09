package controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import models.Empleado;

public class Mapa {
    public Mapa() {
        System.out.println("Mapa Class");
    }

    public void runHashMap() {
        System.out.println("Ejercicio 1:");
        Map<String, String> mapa = new HashMap<>();
        mapa.put("001", "Celular");
        mapa.put("002", "Laptop");
        mapa.put("003", "Celular");
        mapa.put("003", "PC");

        System.out.println(mapa);
        System.out.println(mapa.keySet());

        for (String codigo : mapa.keySet()) {
            System.out.println(mapa.get(codigo));
        }

        System.out.println(mapa.get("001"));
        System.out.println(mapa.get("005"));
    }

    public void runLinkedHashMap() {
        System.out.println("Ejercicio 2:");
        /// Crear un mapa con clave numeros y valor nombre de personas solo nombre
        /// Integer - String
        /// Agregen 5 elementos e imrpimir los VALORES
        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "Erick");
        mapa.put(2, "Andres");
        mapa.put(3, "Paul");
        mapa.put(4, "Axel");
        mapa.put(5, "Pablo");

        for (Integer codigo : mapa.keySet()) {
            System.out.println(mapa.get(codigo));
        }
    }

    public void runTreeMap() {
        System.out.println("Ejercicio 3: ");
        Map<Integer, String> items = new TreeMap<>();
        items.put(3, "carro");
        items.put(6, "bicicleta");
        items.put(1, "moto");

        System.out.println(items);
    }

    public void runHashMapObj() {
        System.out.println("Ejercicio 4: ");
        Map<Empleado, Integer> empleados = new HashMap<>();
        empleados.put(new Empleado(1, "Juan", "Dev"), 1200);
        empleados.put(new Empleado(2, "Juan", "Dev"), 1500);
        empleados.put(new Empleado(3, "Pedro", "Dev"), 2000);
        empleados.put(new Empleado(1, "Juan", "Dev"), 2500);
        empleados.put(new Empleado(1, "Diego", "Dev"), 3000);
        System.out.println(empleados);
    }

    public void runTreeMapObj() {
        System.out.println("Ejercicio 5: ");
        Map<Empleado, Integer> empleados = new TreeMap<>();

        empleados.put(new Empleado(1, "Juan", "Dev"), 1200);
        empleados.put(new Empleado(2, "Juan", "Dev"), 1500);
        empleados.put(new Empleado(3, "Pedro", "Dev"), 2000);
        empleados.put(new Empleado(1, "Diego", "Dev"), 1200);
        empleados.put(new Empleado(1, "Juan", "Senior"), 3000);
        System.out.println(empleados);

    }
}
