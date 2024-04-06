package com.corhuila.shoppingcar.Controller;

import com.corhuila.shoppingcar.Entity.Libro;
import com.corhuila.shoppingcar.IService.ILibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/libro")
public class LibroController {

    //Inyectar el servicio
    @Autowired
    private ILibroService service;

    @GetMapping("/libros")
    public List<Libro> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Libro> findById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping("/guardar")
    public Libro save(@RequestBody Libro libro) {
        return service.save(libro);
    }

    @PutMapping("editar/{id}")
    public void update(@RequestBody Libro libro, @PathVariable String id) {
        service.update(libro, id);
    }
    @DeleteMapping("eliminar/{id}")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
