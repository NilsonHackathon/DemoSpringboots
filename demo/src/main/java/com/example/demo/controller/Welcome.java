package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Todo archivo debe estar dentro de la carpeta de com.example.demo, nada puede salir de ahí
/**/
@RestController
@RequestMapping("/Welcome") //Definir servicio
public class Welcome {

    @GetMapping("/greeting")
    public ResponseEntity<String> greeting(){
        //return new ResponseEntity<>("Hola", HttpStatus.OK);
        return ResponseEntity.ok("Hola");
        //
    }
    @GetMapping("/goodBye")
    public ResponseEntity<String> goodBye(){ /*El ResponseEntity es . . . */
        return new ResponseEntity<>("Adios", HttpStatus.OK);
    }
}
