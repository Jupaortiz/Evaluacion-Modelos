package org.example.Modelos;

import java.util.Date;

public class Beneficiario {

        private String nombreCompleto;
        private String relacionConAsegurado;
        private String direccion;
        private String telefono;
        private Integer idBeneficiario;
        private Integer edad;
        private Boolean esPrincipal;
        private Boolean esMenorDeEdad;
        private String fechaNacimiento;
        private String fechaInclusion;

        // Constructor por defecto
        public Beneficiario() {
        }

        // Constructor con parámetros
        public Beneficiario(String nombreCompleto, String relacionConAsegurado, String direccion,
                            String telefono, Integer idBeneficiario, Integer edad,
                            Boolean esPrincipal, Boolean esMenorDeEdad,
                            String fechaNacimiento, String fechaInclusion) {
            this.nombreCompleto = nombreCompleto;
            this.relacionConAsegurado = relacionConAsegurado;
            this.direccion = direccion;
            this.telefono = telefono;
            this.idBeneficiario = idBeneficiario;
            this.edad = edad;
            this.esPrincipal = esPrincipal;
            this.esMenorDeEdad = esMenorDeEdad;
            this.fechaNacimiento = fechaNacimiento;
            this.fechaInclusion = fechaInclusion;
        }

        // Getters y Setters
        public String getNombreCompleto() {
            return nombreCompleto;
        }

        public void setNombreCompleto(String nombreCompleto) {
            this.nombreCompleto = nombreCompleto;
        }

        public String getRelacionConAsegurado() {
            return relacionConAsegurado;
        }

        public void setRelacionConAsegurado(String relacionConAsegurado) {
            this.relacionConAsegurado = relacionConAsegurado;
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

        public Integer getIdBeneficiario() {
            return idBeneficiario;
        }

        public void setIdBeneficiario(Integer idBeneficiario) {
            this.idBeneficiario = idBeneficiario;
        }

        public Integer getEdad() {
            return edad;
        }

        public void setEdad(Integer edad) {
            this.edad = edad;
        }

        public Boolean getEsPrincipal() {
            return esPrincipal;
        }

        public void setEsPrincipal(Boolean esPrincipal) {
            this.esPrincipal = esPrincipal;
        }

        public Boolean getEsMenorDeEdad() {
            return esMenorDeEdad;
        }

        public void setEsMenorDeEdad(Boolean esMenorDeEdad) {
            this.esMenorDeEdad = esMenorDeEdad;
        }

        public String getFechaNacimiento() {
            return fechaNacimiento;
        }

        public void setFechaNacimiento(String fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
        }

        public String getFechaInclusion() {
            return fechaInclusion;
        }

        public void setFechaInclusion(String fechaInclusion) {
            this.fechaInclusion = fechaInclusion;
        }

        @Override
        public String toString() {
            return "Beneficiario{" +
                    "nombreCompleto='" + nombreCompleto + '\'' +
                    ", relacionConAsegurado='" + relacionConAsegurado + '\'' +
                    ", direccion='" + direccion + '\'' +
                    ", telefono='" + telefono + '\'' +
                    ", idBeneficiario=" + idBeneficiario +
                    ", edad=" + edad +
                    ", esPrincipal=" + esPrincipal +
                    ", esMenorDeEdad=" + esMenorDeEdad +
                    ", fechaNacimiento='" + fechaNacimiento + '\'' +
                    ", fechaInclusion='" + fechaInclusion + '\'' +
                    '}';
        }
    }
