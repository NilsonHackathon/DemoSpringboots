package com.example.demo.Service;

import com.example.demo.Model.Usuarios;
import com.example.demo.Repository.IUsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceUsuarios implements IServiceUsuario{

    @Autowired
    private IUsuarioRepositorio repo;

    @Override
    public List<Usuarios> getAll() {
        return repo.findAll();
    }

    @Override
    public void createUsuario(Usuarios usuario) {
        repo.save(usuario);
    }

    @Override
    public void deleteUsuario(Integer id) {
        repo.deleteById(id);
    }
}
