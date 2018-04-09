package com.bolsadeideas.springboot.backend.apirest.models.services;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Cliente;

import java.util.List;

public interface IClienteService {

    /**
     * Obtiene un cliente por su identificador
     *
     * @param id el identificador del cliente
     * @return el cliente buscado
     */
    Cliente findById(Long id);

    /**
     * Obtiene todos los clientes de la base de datos
     *
     * @return el listado de todos los clientes almacenados en la base de datos
     */
    List<Cliente> findAll();

    /**
     * Guarda un cliente en la base de datos
     *
     * @param cliente el cliente a guardar
     * @return el cliente guardado
     */
    Cliente save(Cliente cliente);

    /**
     * Elimina un cliente de la base de datos por su identificador
     *
     * @param id el identificador del cliente a borrar.
     */
    void delete(Long id);

}
