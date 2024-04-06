package com.corhuila.shoppingcar.IService;

import com.corhuila.shoppingcar.Entity.Autor;

import java.util.List;
import java.util.Optional;

public interface IAutorService {
    List<Autor> findAll(); // Devuelve una lista de autores
    Optional<Autor> findById(String id); // Devuelve un autor por su id
    Autor save(Autor autor); // Guarda un autor
    void update(Autor autor, String id); // Actualiza un autor
    void delete(String id); // Elimina un autor
}
