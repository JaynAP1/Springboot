package org.example.campustallerrefuerzo.controller;

import org.example.campustallerrefuerzo.model.clientes;
import org.example.campustallerrefuerzo.model.productos;
import org.example.campustallerrefuerzo.repository.productoRepositorio;
import org.example.campustallerrefuerzo.repository.clienteRepositorio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")

public class campusTallerRefuerzoController {
    private final productoRepositorio repoProductos;
    private final clienteRepositorio repoClientes;
    public campusTallerRefuerzoController(productoRepositorio repoProductos, clienteRepositorio repoClientes) {
        this.repoProductos = repoProductos;
        this.repoClientes = repoClientes;
    }

    @GetMapping("/productos")
    public List<productos> obtenerProductos(
        @RequestParam(required = false) Double minPrice,
        @RequestParam(required = false) Double maxPrice,
        @RequestParam(required = false) String category,
        @RequestParam(defaultValue = "0") int skip,
        @RequestParam(defaultValue = "10") int limit
    ){
        return repoProductos.findAll().stream()
                .filter(productos -> minPrice == null || productos.getPrice() >= minPrice)
                .filter(productos -> maxPrice == null || productos.getPrice() <= maxPrice)
                .filter(productos -> category == null || productos.getCategory().equalsIgnoreCase(category))
                .skip(skip)
                .limit(limit)
                .toList();
    }

    @GetMapping("/productos/estadisticas")
    public Map<String, Double> obtenerEstadisticasProductos(
        @RequestParam(required = false) String category
    ){

        List<productos>filtrados = repoProductos.findAll().stream()
            .filter(productos -> category == null || productos.getCategory().equalsIgnoreCase(category))
                .toList();

        DoubleSummaryStatistics estadisticas = filtrados.stream()
            .mapToDouble(productos::getPrice)
            .summaryStatistics();

        return Map.of(
                "count", (double) estadisticas.getCount(),
                "avgPrice", estadisticas.getAverage(),
                "minPrice", estadisticas.getMin(),
                "maxPrice", estadisticas.getMax(),
                "totalValue", estadisticas.getSum()
        );
    }
    @GetMapping("/clientes")
    public List<clientes> obtenerClientes(
            @RequestParam(required = false) String email,
            @RequestParam(defaultValue = "0") int skip,
            @RequestParam(defaultValue = "10") int limit
    ){
        return repoClientes.findAll().stream()
                .filter(clientes -> email == null || clientes.getEmail().equalsIgnoreCase(email) )
                .skip(skip)
                .limit(limit)
                .toList();
    }
}
