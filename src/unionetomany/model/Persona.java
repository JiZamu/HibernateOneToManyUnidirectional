/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unionetomany.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jiza
 */
public class Persona {
    private Integer id;
    private String nombre;
    private List<Libro> libros = new ArrayList<Libro>();

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    private void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
    
    public void addlibro(Libro libro){
        this.libros.add(libro);
    }
}
