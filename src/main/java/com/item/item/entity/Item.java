package com.item.item.entity;

import java.time.LocalDate;
import java.time.Period;

public class Item {

    private Empleado empleado;

	private Integer precio;

    public Item() {
    }

    public Item(Empleado empleado, Integer precio) {
        this.empleado = empleado;
        this.precio = precio;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Double getPagoTotal(){
        return empleado.getHoras_lab()*precio.doubleValue();
    }

    public int getEdad(){
        return Period.between(empleado.getFecha_nac(), LocalDate.now()).getYears();
    }
}
