package com.example.restapi_crm.controllers;

import com.example.restapi_crm.models.Persona;
import com.example.restapi_crm.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class PersonaController {
    private PersonaRepository personaRepository;

    @Autowired
    public PersonaController(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    @PostMapping("/clientes")
    public Persona crearPersona(@RequestBody Persona persona) {
        return this.personaRepository.save(persona);
    }

    @GetMapping("/clientes/{id}")
    public Optional<Persona> obtenerPersona(@PathVariable int id) {
        return this.personaRepository.findById(id);
    }

    @GetMapping("/clientes")
    public List<Persona> obtenerTodasLasPersona() {
        return this.personaRepository.findAll();
    }

    @PutMapping("/clientes/{id}")
    public Persona actualizarPersona(@RequestBody Persona persona, @PathVariable Integer id) {
        return this.personaRepository.save(
                Persona.builder()
                        .id(id)
                        .email(persona.getEmail())
                        .empresa(persona.getEmpresa())
                        .nombre(persona.getNombre())
                        .notas(persona.getNotas())
                        .telefono(persona.getTelefono())
                        .build()
        );
    }

    @DeleteMapping("/clientes/{id}")
    public void borrarPersona(@PathVariable Integer id) {
        this.personaRepository.deleteById(id);
    }

}
