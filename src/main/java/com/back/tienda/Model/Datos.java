package com.back.tienda.Model;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Datos implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,updatable = false)
    private long id;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
    private List<Producto> productos;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
    private List<Categoria> categorias;
}
