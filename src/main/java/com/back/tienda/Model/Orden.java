package com.back.tienda.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Orden {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombre;
    private String apellido;
    private String email;
    private long telefono;
    private String ciudad;
    private String codigoPostal;
    private String direccion;
    private String pisoDepto;
    private String descripcion;
    private String fecha;
    private float total;
    private String estadoDeEnvio;
    private String estadoDePago;

}
