/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.portfolio.mgb.Controller;

import com.portfolio.mgb.Entity.Persona;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Usuario
 */
public class PersonaControllerTest {
    
    public PersonaControllerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getPersona method, of class PersonaController.
     */
//    @Test
    public void testGetPersona() {
        System.out.println("getPersona");
        PersonaController instance = new PersonaController();
        List<Persona> expResult = null;
        List<Persona> result = instance.getPersona();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createPersona method, of class PersonaController.
     */
//    @Test
    public void testCreatePersona() {
        System.out.println("createPersona");
        Persona persona = null;
        PersonaController instance = new PersonaController();
        String expResult = "";
        String result = instance.createPersona(persona);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletePersona method, of class PersonaController.
     */
//    @Test
    public void testDeletePersona() {
        System.out.println("deletePersona");
        Long id = null;
        PersonaController instance = new PersonaController();
        String expResult = "";
        String result = instance.deletePersona(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editPersona method, of class PersonaController.
     */
//    @Test
    public void testEditPersona() {
        System.out.println("editPersona");
        Long id = null;
        String nuevoNombre = "";
        String nuevoApellido = "";
        String nuevoImg = "";
        PersonaController instance = new PersonaController();
        Persona expResult = null;
        Persona result = instance.editPersona(id, nuevoNombre, nuevoApellido, nuevoImg);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
