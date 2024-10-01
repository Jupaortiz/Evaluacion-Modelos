package org.example.Modelos;

import java.util.Date;

public class Accidente {

    private String descripcion;
    private String lugar;
    private String tipoAccidente;
    private Integer idAccidente;
    private Integer numeroAfectados;
    private Boolean huboHeridos;
    private Boolean huboFallecidos;
    private String fechaAccidente;
    private String fechaReporte;
    private Integer montoReclamado;

    public Accidente() {
    }

    public Accidente(String descripcion, String lugar, String tipoAccidente, Integer idAccidente, Integer numeroAfectados, Boolean huboHeridos, Boolean huboFallecidos, String fechaAccidente, String fechaReporte, Integer montoReclamado) {
        this.descripcion = descripcion;
        this.lugar = lugar;
        this.tipoAccidente = tipoAccidente;
        this.idAccidente = idAccidente;
        this.numeroAfectados = numeroAfectados;
        this.huboHeridos = huboHeridos;
        this.huboFallecidos = huboFallecidos;
        this.fechaAccidente = fechaAccidente;
        this.fechaReporte = fechaReporte;
        this.montoReclamado = montoReclamado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getTipoAccidente() {
        return tipoAccidente;
    }

    public void setTipoAccidente(String tipoAccidente) {
        this.tipoAccidente = tipoAccidente;
    }

    public Integer getIdAccidente() {
        return idAccidente;
    }

    public void setIdAccidente(Integer idAccidente) {
        this.idAccidente = idAccidente;
    }

    public Integer getNumeroAfectados() {
        return numeroAfectados;
    }

    public void setNumeroAfectados(Integer numeroAfectados) {
        this.numeroAfectados = numeroAfectados;
    }

    public Boolean getHuboHeridos() {
        return huboHeridos;
    }

    public void setHuboHeridos(Boolean huboHeridos) {
        this.huboHeridos = huboHeridos;
    }

    public Boolean getHuboFallecidos() {
        return huboFallecidos;
    }

    public void setHuboFallecidos(Boolean huboFallecidos) {
        this.huboFallecidos = huboFallecidos;
    }

    public String getFechaAccidente() {
        return fechaAccidente;
    }

    public void setFechaAccidente(String fechaAccidente) {
        this.fechaAccidente = fechaAccidente;
    }

    public String getFechaReporte() {
        return fechaReporte;
    }

    public void setFechaReporte(String fechaReporte) {
        this.fechaReporte = fechaReporte;
    }

    public Integer getMontoReclamado() {
        return montoReclamado;
    }

    public void setMontoReclamado(Integer montoReclamado) {
        this.montoReclamado = montoReclamado;
    }

    @Override
    public String toString() {
        return "Accidente{" +
                "descripcion='" + descripcion + '\'' +
                ", lugar='" + lugar + '\'' +
                ", tipoAccidente='" + tipoAccidente + '\'' +
                ", idAccidente=" + idAccidente +
                ", numeroAfectados=" + numeroAfectados +
                ", huboHeridos=" + huboHeridos +
                ", huboFallecidos=" + huboFallecidos +
                ", fechaAccidente='" + fechaAccidente + '\'' +
                ", fechaReporte='" + fechaReporte + '\'' +
                ", montoReclamado=" + montoReclamado +
                '}';
    }

}
