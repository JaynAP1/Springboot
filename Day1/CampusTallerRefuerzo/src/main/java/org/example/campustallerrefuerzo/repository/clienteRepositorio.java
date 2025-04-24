package org.example.campustallerrefuerzo.repository;

import org.example.campustallerrefuerzo.model.clientes;
import org.example.campustallerrefuerzo.model.productos;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class clienteRepositorio {
    private final ArrayList<clientes> clientesData = new ArrayList<>();
    {
        clientesData.add(new clientes(1L, "Ana", "Ramírez", "ana.ramirez@gmail.com"));
        clientesData.add(new clientes(2L, "Luis", "Martínez", "luis.martinez@hotmail.com"));
        clientesData.add(new clientes(3L, "Carla", "López", "carla.lopez@yahoo.com"));
        clientesData.add(new clientes(4L, "Juan", "Pérez", "juan.perez@gmail.com"));
        clientesData.add(new clientes(5L, "Marta", "García", "marta.garcia@outlook.com"));
        clientesData.add(new clientes(6L, "Diego", "Torres", "diego.torres@gmail.com"));
        clientesData.add(new clientes(7L, "Lucía", "Mendoza", "lucia.mendoza@gmail.com"));
        clientesData.add(new clientes(8L, "Pedro", "Fernández", "pedro.fernandez@gmail.com"));
        clientesData.add(new clientes(9L, "Laura", "Castro", "laura.castro@gmail.com"));
        clientesData.add(new clientes(10L, "Sofía", "Vargas", "sofia.vargas@gmail.com"));
        clientesData.add(new clientes(11L, "Andrés", "Silva", "andres.silva@hotmail.com"));
        clientesData.add(new clientes(12L, "Natalia", "Reyes", "natalia.reyes@gmail.com"));
        clientesData.add(new clientes(13L, "Carlos", "Suárez", "carlos.suarez@yahoo.com"));
        clientesData.add(new clientes(14L, "Patricia", "Morales", "patricia.morales@gmail.com"));
        clientesData.add(new clientes(15L, "Jorge", "Ortega", "jorge.ortega@gmail.com"));
        clientesData.add(new clientes(16L, "Valeria", "Cruz", "valeria.cruz@hotmail.com"));
        clientesData.add(new clientes(17L, "Emilio", "Navarro", "emilio.navarro@gmail.com"));
        clientesData.add(new clientes(18L, "Isabel", "Ruiz", "isabel.ruiz@gmail.com"));
        clientesData.add(new clientes(19L, "David", "Mejía", "david.mejia@gmail.com"));
        clientesData.add(new clientes(20L, "Camila", "Hernández", "camila.hernandez@gmail.com"));
    }
    public List<clientes> findAll() {
        return clientesData;
    }
}
