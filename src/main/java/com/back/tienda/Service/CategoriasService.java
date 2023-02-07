package com.back.tienda.Service;

import com.back.tienda.Model.Categoria;
import com.back.tienda.Repository.CategoriasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CategoriasService {
    private final CategoriasRepository categoriasRepository;

    @Autowired
    public CategoriasService(CategoriasRepository categoriasRepository){
        this.categoriasRepository = categoriasRepository;
    }

    public Categoria agregar(Categoria  categoria){
        return categoriasRepository.save(categoria);
    }

    public List<Categoria> listar(){
        return categoriasRepository.findAll();
    }

    public Categoria editar(Categoria categoria){
        return categoriasRepository.save(categoria);
    }

    public boolean eliminar(Long id){
        try{
            categoriasRepository.deleteById(id);
            return true;
        }catch(Error err){
            return false;
        }
    }

    public Categoria buscarPorId(Long id){
        return categoriasRepository.findById(id).orElseThrow();
    }
}
