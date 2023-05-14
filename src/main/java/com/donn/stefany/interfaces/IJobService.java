/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.donn.stefany.interfaces;

import com.donn.stefany.model.Job;
import java.util.List;

public interface IJobService {
    
    // Trae lista de usuarios
    public List<Job> getJobs ();
    
    // Añade un usuario
    public void saveJob (Job job);
    
    // Elimina un usuario
    public void deleteJob (Long id);
    
    // Busca un usuario
    public Job findJobById (Long id);
    
    // Actualiza un usuario
    public Job updateJob(Job job, Long job_id);
    
}