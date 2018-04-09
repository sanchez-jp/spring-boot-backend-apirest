package com.bolsadeideas.springboot.backend.apirest.models.services;

import com.bolsadeideas.springboot.backend.apirest.models.dao.IClienteDao;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClienteServiceImpl implements IClienteService {

    @Autowired
    private IClienteDao clienteDao;

    /**
     * Obtiene un cliente por su identificador
     *
     * @param id el identificador del cliente
     * @return el cliente buscado o NULL si no lo encuentra
     */
    @Override
    @Transactional(readOnly = true)
    public Cliente findById(Long id) {
        return clienteDao.findById(id).orElse(null);
    }

    /**
     * Obtiene todos los clientes de la base de datos
     *
     * @return el listado de todos los clientes almacenados en la base de datos
     */
    @Override
    @Transactional(readOnly = true)
    public List<Cliente> findAll() {
        return (List<Cliente>) clienteDao.findAll();
    }

    /**
     * Guarda un cliente en la base de datos
     *
     * @param cliente el cliente a guardar
     * @return el cliente guardado
     */
    @Override
    @Transactional
    public Cliente save(Cliente cliente) {
        return clienteDao.save(cliente);
    }

    /**
     * Elimina un cliente de la base de datos por su identificador
     *
     * @param id el identificador del cliente a borrar.
     */
    @Override
    @Transactional
    public void delete(Long id) {
        clienteDao.deleteById(id);
    }
}
