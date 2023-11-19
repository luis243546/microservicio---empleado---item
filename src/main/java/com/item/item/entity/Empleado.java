package com.item.item.entity;

import java.time.LocalDate;

public class Empleado {
    private Long dni;
	private String nombre;
	private String ap_pat;
	private String ap_mat;
	private Double horas_lab;
	private LocalDate fecha_nac;
    
    public Long getDni() {
        return dni;
    }
    public void setDni(Long dni) {
        this.dni = dni;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getAp_pat() {
        return ap_pat;
    }
    public void setAp_pat(String ap_pat) {
        this.ap_pat = ap_pat;
    }
    public String getAp_mat() {
        return ap_mat;
    }
    public void setAp_mat(String ap_mat) {
        this.ap_mat = ap_mat;
    }
    public Double getHoras_lab() {
        return horas_lab;
    }
    public void setHoras_lab(Double horas_lab) {
        this.horas_lab = horas_lab;
    }
    public LocalDate getFecha_nac() {
        return fecha_nac;
    }
    public void setFecha_nac(LocalDate fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    
}
