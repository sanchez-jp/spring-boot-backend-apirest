package com.bolsadeideas.springboot.backend.apirest.models.controllers;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Cliente;
import com.bolsadeideas.springboot.backend.apirest.models.services.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200"})
// Permite solicitudes de origen cruzado en clases específicas de controlador y / o métodos de controlador.
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

    /**
     * Obtiene un cliente por su identificador
     *
     * @param id el identificador del cliente
     * @return el cliente buscado, NULL si no lo encuentra
     */
    @GetMapping("/clientes/{id}")
    public Cliente show(@PathVariable Long id) {
        return clienteService.findById(id);
    }

    /**
     * Inserta un nuevo cliente en la base de datos
     *
     * @param cliente el cliente a insertar en la base de datos
     * @return el cliente insertado
     */
    @PostMapping("/clientes") // RequestBody necesario para transformar el JSON de la consulta a objeto cliente
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente create(@RequestBody Cliente cliente) {
        return clienteService.save(cliente);
    }

    /**
     * Actualiza la información de un cliente de la base de datos
     *
     * @param cliente objeto con los nuevos datos para el cliente
     * @param id      el identificador del cliente a modificar
     * @return el cliente modificado
     */
    @PutMapping("/clientes/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente update(@RequestBody Cliente cliente, @PathVariable Long id) {
        Cliente clienteActual = clienteService.findById(id);

        clienteActual.setNombre(cliente.getNombre());
        clienteActual.setApellido(cliente.getApellido());
        clienteActual.setEmail(cliente.getEmail());

        return clienteService.save(clienteActual);
    }

    /**
     * Elimina un cliente de la base de datos
     * @param id el identificador del cliente a eliminar
     */
    @DeleteMapping("/clientes/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        clienteService.delete(id);
    }
}
