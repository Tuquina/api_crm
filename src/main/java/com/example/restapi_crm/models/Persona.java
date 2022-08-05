package com.example.restapi_crm.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String nombre;
    private String empresa;
    private String email;
    private String telefono;
    private String notas;

//    public Persona(Integer id, String nombre, String empresa, String email, String telefono, String notas) {
//        this.id = id;
//        this.nombre = nombre;
//        this.empresa = empresa;
//        this.email = email;
//        this.telefono = telefono;
//        this.notas = notas;
//    }
}
