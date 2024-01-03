/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CodeFusion.EducaFlowNet.Service;

import com.CodeFusion.EducaFlowNet.Model.Usuario;
import com.CodeFusion.EducaFlowNet.Repository.RepositorioUsuario;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jonathan._.MP
 */
@Service
public class ImplementacionServicioUsuario implements ServicioUsuario
{

    @Autowired
    private RepositorioUsuario repositorioUsuario;

    @Override
    public Usuario guardarUsuarios(Usuario usuario)
    {
        return repositorioUsuario.save(usuario);
    }

    @Override
    public List<Usuario> obtenerTodosLosUsuarios()
    {
        return repositorioUsuario.findAll();
    }

    @Override
    public Optional<Usuario> encontrarPorIdentificador(long id)
    {
        return repositorioUsuario.findById(id);
    }

    @Override
    public boolean eliminarUsuarioPorIdentificador(long id)
    {
        try
        {
            repositorioUsuario.deleteById(id);
            return true;
        } catch (Exception err)
        {
            return false;
        }
    }
}
