package com.bolsadeideas.springboot.backend.apirest.models.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;
    private String email;

    @Temporal(TemporalType.DATE)
    @Column(name = "create_at")
    private Date createAt;

    /**
     * Asigna un valor a createAt justo antes de persistir el objeto.
     */
    @PrePersist
    public void prePersist(){
        createAt = new Date();
    }

    /**
     * Obtiene el identificador de cliente
     *
     * @return el identificador de cliente
     */
    public Long getId() {
        return id;
    }

    /**
     * Establece el identificador de cliente
     *
     * @param id el identificador de cliente
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del cliente
     *
     * @return el nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del cliente
     *
     * @param nombre el nombre del cliente
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido del cliente
     *
     * @return el apellido del cliente
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Establece el apellido del cliente
     *
     * @param apellido el apellido del cliente
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Obtiene el email del cliente
     *
     * @return el email del cliente
     */
    public String getEmail() {
        return email;
    }

    /**
     * Establece el email del cliente
     *
     * @param email el email del cliente
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Obtiene la fecha de creación del cliente
     *
     * @return la fecha de creación del cliente
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * Establece la fecha de creación del cliente
     *
     * @param createAt la fecha de creación del cliente
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    private static final long serialVersionUID = 1L;
}
