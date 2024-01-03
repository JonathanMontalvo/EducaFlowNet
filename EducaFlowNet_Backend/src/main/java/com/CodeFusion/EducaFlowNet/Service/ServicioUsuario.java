/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.CodeFusion.EducaFlowNet.Service;

import com.CodeFusion.EducaFlowNet.Model.Usuario;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Jonathan._.MP
 */
public interface ServicioUsuario
{
 
    public Usuario guardarUsuarios(Usuario usuario);

    public List<Usuario> obtenerTodosLosUsuarios();

    public Optional<Usuario> encontrarPorIdentificador(long id);

    public boolean eliminarUsuarioPorIdentificador(long id);
}
