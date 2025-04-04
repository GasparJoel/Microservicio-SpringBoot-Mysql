package com.joel.gt.project_mysql_client.service;

import com.joel.gt.project_mysql_client.Model.Entity.Cliente;

public interface ICliente {

    Cliente save(Cliente cliente);
    Cliente findById(Integer id);
    void delete(Cliente cliente);
}
