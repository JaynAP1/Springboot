package org.example.campustallerrefuerzo.repository;

import org.example.campustallerrefuerzo.model.productos;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class productoRepositorio {
    private final ArrayList<productos> productosData = new ArrayList<>();
    {
        productosData.add(new productos(1L, "Laptop Lenovo", "Electrónica", 3499.99, 10));
        productosData.add(new productos(2L, "Mouse Logitech", "Accesorios", 149.99, 50));
        productosData.add(new productos(3L, "Teclado Mecánico", "Accesorios", 299.99, 30));
        productosData.add(new productos(4L, "Monitor Samsung", "Electrónica", 1999.99, 15));
        productosData.add(new productos(5L, "Smartphone Xiaomi", "Electrónica", 2599.99, 20));
        productosData.add(new productos(6L, "Audífonos Sony", "Audio", 899.99, 25));
        productosData.add(new productos(7L, "Tablet Huawei", "Electrónica", 1899.99, 12));
        productosData.add(new productos(8L, "Smartwatch Amazfit", "Wearables", 699.99, 18));
        productosData.add(new productos(9L, "Cámara Canon", "Fotografía", 4599.99, 8));
        productosData.add(new productos(10L, "Impresora HP", "Oficina", 1399.99, 10));
        productosData.add(new productos(11L, "Silla Gamer", "Muebles", 1599.99, 7));
        productosData.add(new productos(12L, "Router TP-Link", "Redes", 499.99, 22));
        productosData.add(new productos(13L, "Disco Duro Externo", "Almacenamiento", 799.99, 40));
        productosData.add(new productos(14L, "Memoria USB 64GB", "Almacenamiento", 99.99, 100));
        productosData.add(new productos(15L, "Power Bank Xiaomi", "Accesorios", 349.99, 35));
        productosData.add(new productos(16L, "Cargador Rápido", "Accesorios", 199.99, 60));
        productosData.add(new productos(17L, "Laptop HP", "Electrónica", 4299.99, 8));
        productosData.add(new productos(18L, "TV LG 50\"", "Electrónica", 6799.99, 6));
        productosData.add(new productos(19L, "Micrófono Blue Yeti", "Audio", 1299.99, 11));
        productosData.add(new productos(20L, "Lámpara LED Escritorio", "Hogar", 299.99, 25));
    }
    public List<productos> findAll() {
        return productosData;
    }

}
