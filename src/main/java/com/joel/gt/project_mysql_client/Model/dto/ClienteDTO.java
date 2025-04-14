package com.joel.gt.project_mysql_client.Model.dto;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

//para crear get and set
@Data
//para crear el constructor
@AllArgsConstructor
//para el constructor vacio
@NoArgsConstructor
@ToString
//decir que esta clase es una entidad
@Entity
@Table(name = "clientes")
public class ClienteDTO implements Serializable {

    @Id
    @Column(name = "id_cliente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idCliente;

    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "correo")
    private String correo;
    @Column(name = "fecha_registro")
    private Date fechaRegistro;


}
