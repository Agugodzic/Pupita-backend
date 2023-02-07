package com.back.tienda.Controller;

import com.back.tienda.Model.Producto;
import com.back.tienda.Service.ProductosService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductosController {

    private final ProductosService productosService;
    public ProductosController(ProductosService productosService){
        this.productosService=productosService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Producto> buscarPorId(@PathVariable("id") Long id) {
        Producto producto = productosService.buscarPorId(id);
        return new ResponseEntity<>(producto, HttpStatus.OK);
    }

    @GetMapping("/listar")
    public List<Producto> listar() {
        return productosService.listar();
    }

    @PutMapping("/editar")
    public ResponseEntity<Producto> editar(@RequestBody Producto producto){
        Producto editarProducto = productosService.editar(producto);
        return new ResponseEntity<>(editarProducto,HttpStatus.OK);
    }

    @PutMapping("/agregar")
    public ResponseEntity<Producto> agregar(@RequestBody Producto producto){
        Producto nuevoProducto = productosService.agregar(producto);
        return new ResponseEntity<>(nuevoProducto,HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.productosService.eliminar(id);
        if(ok) {
            return "El elemento se borro correctamente";
        }else{
            return "No se pudo eliminar el elemento.";
        }
    }
}
