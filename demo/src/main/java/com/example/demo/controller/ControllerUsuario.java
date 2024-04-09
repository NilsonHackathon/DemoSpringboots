package com.example.demo.controller;

import com.example.demo.Model.Usuarios;
import com.example.demo.Service.IServiceUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.init.RepositoriesPopulatedEvent;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Usuario")
public class ControllerUsuario {

    @Autowired
    private IServiceUsuario serviceUsuario;

    @GetMapping("/all")
    public ResponseEntity<List<Usuarios>> getAll(){
        List<Usuarios> Lista = serviceUsuario.getAll();
        if ( (Lista.isEmpty())){
            return ResponseEntity.badRequest().body(Lista);
        }
        return ResponseEntity.ok(Lista);
    }

    @PostMapping("/create")
    public ResponseEntity<String> create(@RequestBody Usuarios usuarios){
        /*if (usuarios.getNombre().length() > 31 ){
            return  ResponseEntity.badRequest("No se puede mas de 31");
        }¨*/
        serviceUsuario.createUsuario(usuarios);
        return ResponseEntity.ok("Usuario creado");
    }

    @PutMapping("/update")
    public ResponseEntity<String> update(@RequestBody Usuarios usuarios){
        serviceUsuario.createUsuario(usuarios);
        return ResponseEntity.ok("Usuario actualizado");
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Integer id){
        serviceUsuario.deleteUsuario(id);
        return ResponseEntity.ok("Usuario borrado");
    }
}
