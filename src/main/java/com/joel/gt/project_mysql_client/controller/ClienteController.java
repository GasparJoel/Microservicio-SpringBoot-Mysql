package com.joel.gt.project_mysql_client.controller;

import com.joel.gt.project_mysql_client.Model.Entity.Cliente;
import com.joel.gt.project_mysql_client.service.ICliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/api/v1")
public class ClienteController {

    @Autowired
    private ICliente clienteService;

    @PostMapping("cliente")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente createCliente(@RequestBody Cliente cliente) {
        return clienteService.save(cliente);
    }

    @PutMapping("cliente")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente updateCliente(@RequestBody Cliente cliente) {
        return  clienteService.save(cliente);

    }

    @DeleteMapping("cliente/{id}")
    public ResponseEntity<?>  deleteCliente(@PathVariable Integer id) {
        Map<String, Object> response =new HashMap<>();
         try {
             Cliente clienteDelete =clienteService.findById(id);
             clienteService.delete(clienteDelete);
            return  new ResponseEntity<>(clienteDelete, HttpStatus.NO_CONTENT);
         }catch( DataAccessException Dtex) {
             response.put("mensaje",Dtex.getMessage());
             response.put("cliente",null);
            return new ResponseEntity<>(response,HttpStatus.INTERNAL_SERVER_ERROR);
         }
    }
    @GetMapping("cliente/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Cliente showById(@PathVariable  Integer id) {
        return clienteService.findById(id);
    }


}
