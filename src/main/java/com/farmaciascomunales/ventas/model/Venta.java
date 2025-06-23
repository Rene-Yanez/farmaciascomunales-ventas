package com.farmaciascomunales.ventas.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long idBeneficiario; // FK a microservicio beneficiarios
    private Long idProducto;     // FK a productos
    private int cantidad;
    private int precioUnitario;
    private boolean conAlertaRetiro;

    private LocalDate fechaVenta;

    // Getters y setters
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public Long getIdBeneficiario() { return idBeneficiario; }

    public void setIdBeneficiario(Long idBeneficiario) { this.idBeneficiario = idBeneficiario; }

    public Long getIdProducto() { return idProducto; }

    public void setIdProducto(Long idProducto) { this.idProducto = idProducto; }

    public int getCantidad() { return cantidad; }

    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public int getPrecioUnitario() { return precioUnitario; }

    public void setPrecioUnitario(int precioUnitario) { this.precioUnitario = precioUnitario; }

    public boolean isConAlertaRetiro() { return conAlertaRetiro; }

    public void setConAlertaRetiro(boolean conAlertaRetiro) { this.conAlertaRetiro = conAlertaRetiro; }

    public LocalDate getFechaVenta() { return fechaVenta; }

    public void setFechaVenta(LocalDate fechaVenta) { this.fechaVenta = fechaVenta; }
}