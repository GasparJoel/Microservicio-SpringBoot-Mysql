package com.joel.gt.project_mysql_client.Model.DAO;

import com.joel.gt.project_mysql_client.Model.Entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteDao extends CrudRepository<Cliente, Integer> {
}
