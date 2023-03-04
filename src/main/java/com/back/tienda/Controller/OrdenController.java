package com.back.tienda.Controller;

import com.back.tienda.Model.Orden;
import com.back.tienda.Model.Producto;
import com.back.tienda.Service.OrdenService;
import com.back.tienda.Service.ProductosService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orden")
public class OrdenController {

    private final OrdenService ordenService;
    public OrdenController(OrdenService ordenService){
        this.ordenService = ordenService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Orden> buscarPorId(@PathVariable("id") Long id) {
        Orden orden = ordenService.buscarPorId(id);
        return new ResponseEntity<>(orden, HttpStatus.OK);
    }

    @GetMapping("/listar")
    public List<Orden> listar() {
        return ordenService.listar();
    }

    @PutMapping("/editar")
    public ResponseEntity<Orden> editar(@RequestBody Orden orden){
        Orden editarOrden = ordenService.editar(orden);
        return new ResponseEntity<>(editarOrden,HttpStatus.OK);
    }

    @PutMapping("/agregar")
    public ResponseEntity<Orden> agregar(@RequestBody Orden orden){
        Orden agregarOrden = ordenService.editar(orden);
        return new ResponseEntity<>(agregarOrden,HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.ordenService.eliminar(id);
        if(ok) {
            return "El elemento se borro correctamente";
        }else{
            return "No se pudo eliminar el elemento.";
        }
    }
}
