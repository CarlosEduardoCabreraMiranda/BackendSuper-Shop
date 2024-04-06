package com.corhuila.shoppingcar.Entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;


@Document(collection = "libro")
public class Libro {
    @Id
    private String id;

    @Field(name = "titulo")
    private String titulo;

    @Field(name = "isbn")
    private String isbn;

    @Field(name = "genero")
    private String genero;

    @Field(name = "anioPublicacion")
    private Date anioPublicacion;

    @Field(name = "sinopsis")
    private String sinopsis;
    @DBRef
    private Autor autor;

    public Libro(){}
    public Libro(String id, String titulo, String isbn, String genero, Date anioPublicacion, String sinopsis, Autor autor) {
        this.id = id;
        this.titulo = titulo;
        this.isbn = isbn;
        this.genero = genero;
        this.anioPublicacion = anioPublicacion;
        this.sinopsis = sinopsis;
        this.autor = autor;
    }






    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(Date anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
