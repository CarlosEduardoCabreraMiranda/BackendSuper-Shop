package com.corhuila.shoppingcar.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "autor")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;

    @Column(name = "apellido", length = 50, nullable = false)
    private String apellido;

    @Column(name = "nacionalidad", length = 50, nullable = false)
    private String nacionalidad;

    @Column(name = "fechaNacimiento", length = 50, nullable = false)
    private Date fechaNacimiento;

    @Column(name = "biografia", length = 300, nullable = false)
    private String biografia;


    public Autor(){}
    public Autor(Long id, String nombre, String apellido, String nacionalidad, Date fechaNacimiento, String biografia) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
        this.biografia = biografia;
    }
}
/*INSERT INTO libro (id, titulo, isbn, genero, ani_publicacion, sinopsis, autor_id)
VALUES (1, 'TODA LA VERDAD DE MIS MENTIRAS', 9788491291893, 'Road Trip', '2019/02/21', 'Un road trip divertido, surrealista, donde todo puede suceder. Una aventura en carretera que habla de la verdad que se esconde detrás de todas las mentiras.', 1);
*/