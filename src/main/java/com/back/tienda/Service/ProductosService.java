package com.back.tienda.Service;

import com.back.tienda.Model.Producto;
import com.back.tienda.Repository.ProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductosService {
    private final ProductosRepository productosRepository;

    @Autowired
    public ProductosService(ProductosRepository productosRepository){
        this.productosRepository = productosRepository;
    }

    public Producto agregar(Producto  producto){
        return productosRepository.save(producto);
    }

    public List<Producto> listar(){
        return productosRepository.findAll();
    }

    public Producto editar(Producto producto){
        return productosRepository.save(producto);
    }

    public boolean eliminar(Long id){
        try{
            productosRepository.deleteById(id);
            return true;
        }catch(Error err){
            return false;
        }
    }

    public Producto buscarPorId(Long id){
        return productosRepository.findById(id).orElseThrow();
    }
}
