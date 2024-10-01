package org.example.Modelos;

import java.util.Date;

public class Vehiculo {

        private String marca;
        private String modelo;
        private String numeroPlaca;
        private String color;
        private Integer idVehiculo;
        private Integer añoFabricacion;
        private Integer numeroPuertas;
        private Boolean esElectrico;
        private Boolean tieneSeguro;
        private Boolean esConvertible;
        private String fechaCompra;
        private String fechaUltimoMantenimiento;
        private String fechaExpiracionSeguro;
        private Integer precio;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, String numeroPlaca, String color, Integer idVehiculo, Integer añoFabricacion, Integer numeroPuertas, Boolean esElectrico, Boolean tieneSeguro, Boolean esConvertible, String fechaCompra, String fechaUltimoMantenimiento, String fechaExpiracionSeguro, Integer precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroPlaca = numeroPlaca;
        this.color = color;
        this.idVehiculo = idVehiculo;
        this.añoFabricacion = añoFabricacion;
        this.numeroPuertas = numeroPuertas;
        this.esElectrico = esElectrico;
        this.tieneSeguro = tieneSeguro;
        this.esConvertible = esConvertible;
        this.fechaCompra = fechaCompra;
        this.fechaUltimoMantenimiento = fechaUltimoMantenimiento;
        this.fechaExpiracionSeguro = fechaExpiracionSeguro;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(Integer idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public Integer getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(Integer añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public Integer getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(Integer numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public Boolean getEsElectrico() {
        return esElectrico;
    }

    public void setEsElectrico(Boolean esElectrico) {
        this.esElectrico = esElectrico;
    }

    public Boolean getTieneSeguro() {
        return tieneSeguro;
    }

    public void setTieneSeguro(Boolean tieneSeguro) {
        this.tieneSeguro = tieneSeguro;
    }

    public Boolean getEsConvertible() {
        return esConvertible;
    }

    public void setEsConvertible(Boolean esConvertible) {
        this.esConvertible = esConvertible;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public String getFechaUltimoMantenimiento() {
        return fechaUltimoMantenimiento;
    }

    public void setFechaUltimoMantenimiento(String fechaUltimoMantenimiento) {
        this.fechaUltimoMantenimiento = fechaUltimoMantenimiento;
    }

    public String getFechaExpiracionSeguro() {
        return fechaExpiracionSeguro;
    }

    public void setFechaExpiracionSeguro(String fechaExpiracionSeguro) {
        this.fechaExpiracionSeguro = fechaExpiracionSeguro;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", numeroPlaca='" + numeroPlaca + '\'' +
                ", color='" + color + '\'' +
                ", idVehiculo=" + idVehiculo +
                ", añoFabricacion=" + añoFabricacion +
                ", numeroPuertas=" + numeroPuertas +
                ", esElectrico=" + esElectrico +
                ", tieneSeguro=" + tieneSeguro +
                ", esConvertible=" + esConvertible +
                ", fechaCompra='" + fechaCompra + '\'' +
                ", fechaUltimoMantenimiento='" + fechaUltimoMantenimiento + '\'' +
                ", fechaExpiracionSeguro='" + fechaExpiracionSeguro + '\'' +
                ", precio=" + precio +
                '}';
    }
}





