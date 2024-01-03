/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CodeFusion.EducaFlowNet.Controller;

import com.CodeFusion.EducaFlowNet.Model.Usuario;
import com.CodeFusion.EducaFlowNet.Service.ServicioUsuario;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jonathan._.MP
 */
@RestController
@RequestMapping("/usuario")
@CrossOrigin
public class ControladorUsuario
{
    @Autowired
    private ServicioUsuario servicioUsuario;

    @PostMapping("/registro")
    public String add(@RequestBody Usuario usuario)
    {
        servicioUsuario.guardarUsuarios(usuario);
        return "Usuario nuevo agregado";
    }

    @GetMapping("/todos")
    public List<Usuario> getTodosLosUsuarios()
    {
        return servicioUsuario.obtenerTodosLosUsuarios();
    }

    @PostMapping("/actualizar")
    public String update(@RequestBody Usuario usuario)
    {
        servicioUsuario.guardarUsuarios(usuario);
        return "Usuario actualizado";
    }

    @GetMapping(path = "/{id}")
    public Optional<Usuario> encontrarPorIdentificador(@PathVariable("id") long id)
    {
        return servicioUsuario.encontrarPorIdentificador(id);
    }

    @DeleteMapping(path = "/borrar/{id}")
    public String eliminarPorIdentificador(@PathVariable("id") long id)
    {
        boolean borrar = servicioUsuario.eliminarUsuarioPorIdentificador(id);
        if (borrar)
        {
            return "Se elimino el usuario con id " + id;
        } else
        {
            return "No se pudo eliminar el usuario con id " + id;
        }
    }
}
