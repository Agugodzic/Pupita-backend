package com.back.tienda.Controller;

import com.back.tienda.Model.Notificacion;
import com.back.tienda.Service.NotificacionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notificacion")
public class NotificacionController {
    private final NotificacionService notificacionService;
    public NotificacionController(NotificacionService notificacionService){
        this.notificacionService=notificacionService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Notificacion> buscarPorId(@PathVariable("id") Long id) {
        Notificacion notificacion = notificacionService.buscarPorId(id);
        return new ResponseEntity<>(notificacion, HttpStatus.OK);
    }

    @GetMapping("/listar")
    public List<Notificacion> listar() {
        return notificacionService.listar();
    }

    @PutMapping("/editar")
    public ResponseEntity<Notificacion> editar(@RequestBody Notificacion notificacion){
        Notificacion editarNotificacion = notificacionService.editar(notificacion);
        return new ResponseEntity<>(editarNotificacion,HttpStatus.OK);
    }

    @PutMapping("/agregar")
    public ResponseEntity<Notificacion> agregar(@RequestBody Notificacion notificacion){
        Notificacion nuevaNotificacion = notificacionService.agregar(notificacion);
        return new ResponseEntity<>(nuevaNotificacion,HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.notificacionService.eliminar(id);
        if(ok) {
            return "El elemento se borro correctamente";
        }else{
            return "Error al eliminar el elemento.";
        }
    }
}
