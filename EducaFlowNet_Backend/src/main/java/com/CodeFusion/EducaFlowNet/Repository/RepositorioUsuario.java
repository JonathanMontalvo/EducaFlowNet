/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.CodeFusion.EducaFlowNet.Repository;

import com.CodeFusion.EducaFlowNet.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Jonathan._.MP
 */
public interface RepositorioUsuario extends JpaRepository<Usuario, Long>
{
    
}
