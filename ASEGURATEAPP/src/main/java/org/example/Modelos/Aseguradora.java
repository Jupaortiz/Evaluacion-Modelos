package org.example.Modelos;

import java.util.Date;

public class Aseguradora {
    private String nombre;
    private String direccion;
    private String telefono;
    private String correoElectronico;
    private Integer idAseguradora;
    private Integer numeroPolizasEmitidas;
    private Boolean esNacional;
    private Boolean tieneServicio24Horas;
    private String fechaFundacion;
    private String fechaUltimaActualizacion;

    public Aseguradora() {
    }

    public Aseguradora(String nombre, String direccion, String telefono, String correoElectronico, Integer idAseguradora, Integer numeroPolizasEmitidas, Boolean esNacional, Boolean tieneServicio24Horas, String fechaFundacion, String fechaUltimaActualizacion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.idAseguradora = idAseguradora;
        this.numeroPolizasEmitidas = numeroPolizasEmitidas;
        this.esNacional = esNacional;
        this.tieneServicio24Horas = tieneServicio24Horas;
        this.fechaFundacion = fechaFundacion;
        this.fechaUltimaActualizacion = fechaUltimaActualizacion;
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

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Integer getIdAseguradora() {
        return idAseguradora;
    }

    public void setIdAseguradora(Integer idAseguradora) {
        this.idAseguradora = idAseguradora;
    }

    public Integer getNumeroPolizasEmitidas() {
        return numeroPolizasEmitidas;
    }

    public void setNumeroPolizasEmitidas(Integer numeroPolizasEmitidas) {
        this.numeroPolizasEmitidas = numeroPolizasEmitidas;
    }

    public Boolean getEsNacional() {
        return esNacional;
    }

    public void setEsNacional(Boolean esNacional) {
        this.esNacional = esNacional;
    }

    public Boolean getTieneServicio24Horas() {
        return tieneServicio24Horas;
    }

    public void setTieneServicio24Horas(Boolean tieneServicio24Horas) {
        this.tieneServicio24Horas = tieneServicio24Horas;
    }

    public String getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(String fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public String getFechaUltimaActualizacion() {
        return fechaUltimaActualizacion;
    }

    public void setFechaUltimaActualizacion(String fechaUltimaActualizacion) {
        this.fechaUltimaActualizacion = fechaUltimaActualizacion;
    }

    @Override
    public String toString() {
        return "Aseguradora{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", idAseguradora=" + idAseguradora +
                ", numeroPolizasEmitidas=" + numeroPolizasEmitidas +
                ", esNacional=" + esNacional +
                ", tieneServicio24Horas=" + tieneServicio24Horas +
                ", fechaFundacion='" + fechaFundacion + '\'' +
                ", fechaUltimaActualizacion='" + fechaUltimaActualizacion + '\'' +
                '}';
    }
}
