package com.corhuila.shoppingcar.IService;

import com.corhuila.shoppingcar.Entity.Libro;

import java.util.List;
import java.util.Optional;

public interface ILibroService {
    List<Libro> findAll(); // Devuelve una lista de libros
    Optional<Libro> findById(String id); // Devuelve un libro por su id
    Libro save(Libro libro); // Guarda un libro
    void update(Libro libro, String id); // Actualiza un libro
    void delete(String id); // Elimina un libro

}
