/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl.backend_parqueaderos.controllers;

import ec.edu.utpl.backend_parqueaderos.entities.Gestor;
import ec.edu.utpl.backend_parqueaderos.repositories.GestorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.*;



/**
 *
 * @author alexa
 */
@RestController
@RequestMapping("/api")
public class GestorController {
    
    @Autowired
    GestorRepository gestorRepository;

    @GetMapping("/all")
    public Iterable<Gestor> getAll(){
        System.out.println("Hola usuario bienvenido");
        return gestorRepository.findAll();
    }

}
