package com.back.tienda.Service;

import com.back.tienda.Model.Notificacion;
import com.back.tienda.Repository.NotificacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class NotificacionService {
    private final NotificacionRepository notificacionRepository;
    @Autowired
    public NotificacionService(NotificacionRepository notificacionRepository){
        this.notificacionRepository = notificacionRepository;
    }
    public Notificacion agregar(Notificacion notificacion){
        return notificacionRepository.save(notificacion);
    }
    public List<Notificacion> listar(){
        return notificacionRepository.findAll();
    }
    public Notificacion editar(Notificacion notificacion){
        return notificacionRepository.save(notificacion);
    }
    public boolean eliminar(Long id){
        try{
            notificacionRepository.deleteById(id);
            return true;
        }catch(Error err){
            return false;
        }
    }
    public Notificacion buscarPorId(Long id){
        return notificacionRepository.findById(id).orElseThrow();
    }
}
