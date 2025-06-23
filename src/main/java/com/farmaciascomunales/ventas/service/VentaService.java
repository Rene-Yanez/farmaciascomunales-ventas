package com.farmaciascomunales.ventas.service;

import com.farmaciascomunales.ventas.model.Venta;
import com.farmaciascomunales.ventas.repository.VentaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentaService {

    private final VentaRepository repository;

    public VentaService(VentaRepository repository) {
        this.repository = repository;
    }

    public List<Venta> listar() {
        return repository.findAll();
    }

    public Venta obtenerPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Venta crear(Venta venta) {
        return repository.save(venta);
    }
}