package com.corhuila.shoppingcar.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "libro")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titulo", length = 50, nullable = false)
    private String titulo;

    @Column(name = "isbn", length = 50, nullable = false)
    private String isbn;

    @Column(name = "genero", length = 50, nullable = false)
    private String genero;

    @Column(name = "anio_publicacion")
    private Date anioPublicacion;

    @Column(name = "sinopsis", length = 300, nullable = false)
    private String sinopsis;

    public Libro(){}
    public Libro(Long id, String titulo, String isbn, String genero, Date anioPublicacion, String sinopsis, Autor autor) {
        this.id = id;
        this.titulo = titulo;
        this.isbn = isbn;
        this.genero = genero;
        this.anioPublicacion = anioPublicacion;
        this.sinopsis = sinopsis;
        this.autor = autor;
    }



    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    private Autor autor;

}
