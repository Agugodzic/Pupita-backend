package com.back.tienda.Model;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.lang.String;

import static java.awt.SystemColor.text;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombre;
    private Number precio;
    private String categoria;
    private String marca;
    @Column(length=2000000)
    private String descripcion;
    private String descripcioncorta;
    @Column(length=2000000)
    private String imagen1;
    @Column(length=2000000)
    private String imagen2;
    @Column(length=2000000)
    private String imagen3;
    @Column(length=2000000)
    private String imagen4;
}
