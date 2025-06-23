package com.farmaciascomunales.ventas.repository;

import com.farmaciascomunales.ventas.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaRepository extends JpaRepository<Venta, Long> {
}