/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl.backend_parqueaderos.repositories;

import ec.edu.utpl.backend_parqueaderos.entities.Gestor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author alexa
 */
@Repository
public interface GestorRepository extends JpaRepository<Gestor, Long>{
   
}
