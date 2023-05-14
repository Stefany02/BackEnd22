/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.donn.stefany.interfaces;

import com.donn.stefany.model.Project;
import java.util.List;

public interface IProjectService {
    
    // Trae lista de usuarios
    public List<Project> getProjects ();
    
    // Añade un usuario
    public void saveProyect (Project project);
    
    // Elimina un usuario
    public void deleteProject (Long id);
    
    // Busca un usuario
    public Project findProjectById (Long id);
    
    // Actualiza un usuario
    public Project updateProject(Project project, Long project_id);

    public void saveProject(Project project);
    
}