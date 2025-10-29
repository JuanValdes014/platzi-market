package com.platzi_market.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "categorias")
public class Cliente {
    @Id
    @Column(name = "id")
    private String idCliente;

    private String nombre;

    @Column(name = "apellidos")
    private String apellido;

    private Integer celular;

    private String direccion;

    @Column(name = "correo_electronico")
    private String correoElectronico;

}
