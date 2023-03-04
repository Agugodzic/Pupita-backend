package com.back.tienda.Service;

import com.back.tienda.Model.Orden;
import com.back.tienda.Repository.OrdenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class OrdenService {
    private final OrdenRepository ordenRepository;

    @Autowired
    public OrdenService(OrdenRepository ordenRepository){
        this.ordenRepository = ordenRepository;
    }

    public Orden agregar(Orden  orden){
        return ordenRepository.save(orden);
    }

    public List<Orden> listar(){
        return ordenRepository.findAll();
    }

    public Orden editar(Orden orden){
        return ordenRepository.save(orden);
    }

    public boolean eliminar(Long id){
        try{
            ordenRepository.deleteById(id);
            return true;
        }catch(Error err){
            return false;
        }
    }

    public Orden buscarPorId(Long id){
        return ordenRepository.findById(id).orElseThrow();
    }
}
