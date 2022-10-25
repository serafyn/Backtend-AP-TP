package com.portfolioap.backendportfolioap.Interface;

import com.portfolioap.backendportfolioap.Entity.Persona;
import java.util.List;


/**
 *
 * To Get info about a Person
 */
public interface IPersonaService {
    public List<Persona> getPersona();
    
    //Save a Type Person Object 
    public void savePersona(Persona persona);
            
    //Delete a person object
    public void deletePersona(Long id);
    
    //Find persons
    public Persona findPersona(Long id);
}
