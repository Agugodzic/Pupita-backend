package com.back.tienda.Controller;

import com.back.tienda.Model.Categoria;
import com.back.tienda.Service.CategoriasService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriasController {

    private final CategoriasService categoriasService;
    public CategoriasController(CategoriasService categoriasService){
        this.categoriasService=categoriasService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Categoria> buscarPorId(@PathVariable("id") Long id) {
        Categoria categoria = categoriasService.buscarPorId(id);
        return new ResponseEntity<>(categoria, HttpStatus.OK);
    }

    @GetMapping("/listar")
    public List<Categoria> listar() {
        return categoriasService.listar();
    }

    @PutMapping("/editar")
    public ResponseEntity<Categoria> editar(@RequestBody Categoria categoria){
        Categoria editarCategoria = categoriasService.editar(categoria);
        return new ResponseEntity<>(editarCategoria,HttpStatus.OK);
    }

    @PutMapping("/agregar")
    public ResponseEntity<Categoria> agregar(@RequestBody Categoria categoria){
        Categoria nuevaCategoria = categoriasService.agregar(categoria);
        return new ResponseEntity<>(nuevaCategoria,HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.categoriasService.eliminar(id);
        if(ok) {
            return "El elemento se borro correctamente";
        }else{
            return "Error al eliminar el elemento.";
        }
    }
}
