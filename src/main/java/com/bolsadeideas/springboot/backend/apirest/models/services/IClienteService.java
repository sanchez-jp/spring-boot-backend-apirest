package com.bolsadeideas.springboot.backend.apirest.models.services;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Cliente;

import java.util.List;

public interface IClienteService {

    /**
     * Obtiene todos los clientes de la base de datos
     *
     * @return el listado de todos los clientes almacenados en la base de datos
     */
    public List<Cliente> findAll();
}
