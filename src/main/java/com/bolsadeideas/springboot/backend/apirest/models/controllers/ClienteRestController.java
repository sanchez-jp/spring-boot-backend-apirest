package com.bolsadeideas.springboot.backend.apirest.models.controllers;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Cliente;
import com.bolsadeideas.springboot.backend.apirest.models.services.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClienteRestController {

    @Autowired
    private IClienteService clienteService;

    /**
     * Obtiene el listado de todos los clientes
     *
     * @return listado de todos los clientes
     */
    @GetMapping("/clientes")
    public List<Cliente> index() {
        return clienteService.findAll();
    }
}
