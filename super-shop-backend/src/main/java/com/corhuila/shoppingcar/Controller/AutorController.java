package com.corhuila.shoppingcar.Controller;

import com.corhuila.shoppingcar.Entity.Autor;
import com.corhuila.shoppingcar.IService.IAutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/autor")
public class AutorController {
    //Inyectar el servicio
    @Autowired
    private IAutorService service;

    @GetMapping("/autores")
    public List<Autor> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Autor> findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping("/guardar")
    public Autor save(@RequestBody Autor autor) {
        return service.save(autor);
    }


    @PutMapping("/{id}")
    public void update(@RequestBody Autor autor, @PathVariable Long id) {
        service.update(autor, id);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
