package com.example.catalogo_servicios.model;

public class ServicioMedico {
    private String nombre;
    private String ubicacion;
    private String especialidad;
    private String horario;

    // Constructor, Getters y Setters
    public ServicioMedico(String nombre, String ubicacion, String especialidad, String horario) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.especialidad = especialidad;
        this.horario = horario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}

