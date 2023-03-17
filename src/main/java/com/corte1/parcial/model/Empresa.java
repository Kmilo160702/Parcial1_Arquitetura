package com.corte1.parcial.model;

public class Empresa {

    private long cedula;
    private String nombreEmpresa;
    private String nombreRepresentante;
    private String direccion;
    private String fechaCreacion;
    private String correo;
    private int telefono;
    private int certificado;
    private int actividadEconomica;
    private int capital;
    private int numEmpleados;
    private int estrato;

    public Empresa() {
    }

    public Empresa(long cedula, String nombreEmpresa, String nombreRepresentante, String direccion,
                   String fechaCreacion, String correo, int telefono, int certificado, int actividadEconomica, int capital,
                   int numEmpleados, int estrato) {
        this.cedula = cedula;
        this.nombreEmpresa = nombreEmpresa;
        this.nombreRepresentante = nombreRepresentante;
        this.direccion = direccion;
        this.fechaCreacion = fechaCreacion;
        this.correo = correo;
        this.telefono = telefono;
        this.certificado = certificado;
        this.actividadEconomica = actividadEconomica;
        this.capital = capital;
        this.numEmpleados = numEmpleados;
        this.estrato = estrato;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNombreRepresentante() {
        return nombreRepresentante;
    }

    public void setNombreRepresentante(String nombreRepresentante) {
        this.nombreRepresentante = nombreRepresentante;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCertificado() {
        return certificado;
    }

    public void setCertificado(int certificado) {
        this.certificado = certificado;
    }

    public int getActividadEconomica() {
        return actividadEconomica;
    }

    public void setActividadEconomica(int actividadEconomica) {
        this.actividadEconomica = actividadEconomica;
    }

    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }

    public int getNumEmpleados() {
        return numEmpleados;
    }

    public void setNumEmpleados(int numEmpleados) {
        this.numEmpleados = numEmpleados;
    }

    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

}
