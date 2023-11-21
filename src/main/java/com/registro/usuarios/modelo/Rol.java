package com.registro.usuarios.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Clase de entidad que representa un rol de usuario.
 */
@Entity
@Table(name = "rol")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    /**
     * Obtiene el ID del rol.
     *
     * @return El ID del rol.
     */
    public Long getId() {
        return id;
    }

    /**
     * Establece el ID del rol.
     *
     * @param id El nuevo ID del rol.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del rol.
     *
     * @return El nombre del rol.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del rol.
     *
     * @param nombre El nuevo nombre del rol.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Constructor que inicializa un objeto Rol con los parámetros proporcionados.
     *
     * @param id     El ID del rol.
     * @param nombre El nombre del rol.
     */
    public Rol(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    /**
     * Constructor por defecto sin parámetros.
     */
    public Rol() {
    }

    /**
     * Constructor que inicializa un objeto Rol con el nombre proporcionado.
     *
     * @param nombre El nombre del rol.
     */
    public Rol(String nombre) {
        this.nombre = nombre;
    }
}
