package com.joel.gt.project_mysql_client.service.impl;

import com.joel.gt.project_mysql_client.Model.DAO.ClienteDao;
import com.joel.gt.project_mysql_client.Model.Entity.Cliente;
import com.joel.gt.project_mysql_client.service.ICliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


//Tenemos que definir a esta capa de servicio que es un service
@Service
public class ClientImpl implements ICliente {

//    inyeccion de dependencia
    @Autowired
    private ClienteDao clienteDao;

    @Transactional
    @Override
    public Cliente save(Cliente cliente) {

        return clienteDao.save(cliente);
    }

    // se coloca readOnly quiere decir que es una consulta solo de lectura
    @Override
    @Transactional(readOnly = true)
    public Cliente findById(Integer id) {

        return clienteDao.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public void delete(Cliente cliente) {

        clienteDao.delete(cliente);
    }
}
