package com.farmaciascomunales.ventas.controller;

import com.farmaciascomunales.ventas.model.Venta;
import com.farmaciascomunales.ventas.service.VentaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ventas")
public class VentaController {

    private final VentaService service;

    public VentaController(VentaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Venta> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Venta obtener(@PathVariable Long id) {
        return service.obtenerPorId(id);
    }

    @PostMapping
    public Venta crear(@RequestBody Venta venta) {
        return service.crear(venta);
    }
}