package com.corhuila.shoppingcar.Entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;



@Document(collection = "autor")
public class Autor {

    @Id
    private String id;

    @Field(name = "nombre")
    private String nombre;

    @Field(name = "apellido")
    private String apellido;

    @Field(name = "nacionalidad")
    private String nacionalidad;

    @Field(name = "fechaNacimiento")
    private Date fechaNacimiento;

    @Field(name = "biografia")
    private String biografia;


    public Autor(){}
    public Autor(String id, String nombre, String apellido, String nacionalidad, Date fechaNacimiento, String biografia) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
        this.biografia = biografia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }
}
