package com.example.demo.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity

public class Empleado {

    private String nombre;

    private String apellido;

    private String dni;
    
    private String domicilio;


}
