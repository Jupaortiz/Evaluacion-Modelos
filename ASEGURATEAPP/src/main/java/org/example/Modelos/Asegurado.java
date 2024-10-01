package org.example.Modelos;

import java.util.Date;

public class Asegurado {
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    private Integer idAsegurado;
    private Integer edad;
    private Integer numeroPoliza;
    private Boolean tieneCoberturaMedica;
    private Boolean esFumador;
    private Boolean tieneAccidentesPrevios;
    private String fechaNacimiento;
    private String fechaInicioPoliza;
    private String fechaVencimientoPoliza;
    private Integer montoAsegurado;

    public Asegurado() {
    }

    public Asegurado(String nombre, String direccion, String telefono, String email, Integer idAsegurado, Integer edad, Integer numeroPoliza, Boolean tieneCoberturaMedica, Boolean esFumador, Boolean tieneAccidentesPrevios, String fechaNacimiento, String fechaInicioPoliza, String fechaVencimientoPoliza, Integer montoAsegurado) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.idAsegurado = idAsegurado;
        this.edad = edad;
        this.numeroPoliza = numeroPoliza;
        this.tieneCoberturaMedica = tieneCoberturaMedica;
        this.esFumador = esFumador;
        this.tieneAccidentesPrevios = tieneAccidentesPrevios;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaInicioPoliza = fechaInicioPoliza;
        this.fechaVencimientoPoliza = fechaVencimientoPoliza;
        this.montoAsegurado = montoAsegurado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIdAsegurado() {
        return idAsegurado;
    }

    public void setIdAsegurado(Integer idAsegurado) {
        this.idAsegurado = idAsegurado;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(Integer numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public Boolean getTieneCoberturaMedica() {
        return tieneCoberturaMedica;
    }

    public void setTieneCoberturaMedica(Boolean tieneCoberturaMedica) {
        this.tieneCoberturaMedica = tieneCoberturaMedica;
    }

    public Boolean getEsFumador() {
        return esFumador;
    }

    public void setEsFumador(Boolean esFumador) {
        this.esFumador = esFumador;
    }

    public Boolean getTieneAccidentesPrevios() {
        return tieneAccidentesPrevios;
    }

    public void setTieneAccidentesPrevios(Boolean tieneAccidentesPrevios) {
        this.tieneAccidentesPrevios = tieneAccidentesPrevios;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getFechaInicioPoliza() {
        return fechaInicioPoliza;
    }

    public void setFechaInicioPoliza(String fechaInicioPoliza) {
        this.fechaInicioPoliza = fechaInicioPoliza;
    }

    public String getFechaVencimientoPoliza() {
        return fechaVencimientoPoliza;
    }

    public void setFechaVencimientoPoliza(String fechaVencimientoPoliza) {
        this.fechaVencimientoPoliza = fechaVencimientoPoliza;
    }

    public Integer getMontoAsegurado() {
        return montoAsegurado;
    }

    public void setMontoAsegurado(Integer montoAsegurado) {
        this.montoAsegurado = montoAsegurado;
    }

    @Override
    public String toString() {
        return "Asegurado{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", idAsegurado=" + idAsegurado +
                ", edad=" + edad +
                ", numeroPoliza=" + numeroPoliza +
                ", tieneCoberturaMedica=" + tieneCoberturaMedica +
                ", esFumador=" + esFumador +
                ", tieneAccidentesPrevios=" + tieneAccidentesPrevios +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", fechaInicioPoliza='" + fechaInicioPoliza + '\'' +
                ", fechaVencimientoPoliza='" + fechaVencimientoPoliza + '\'' +
                ", montoAsegurado=" + montoAsegurado +
                '}';
    }
}
