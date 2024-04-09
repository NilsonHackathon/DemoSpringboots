package com.example.demo.Service;

import com.example.demo.Model.Usuarios;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IServiceUsuario { //Open Close
    public List<Usuarios> getAll();

    void  createUsuario(Usuarios usuario);

    void deleteUsuario(Integer id);
}
