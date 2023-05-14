/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.donn.stefany.interfaces;

import com.donn.stefany.model.Study;
import java.util.List;

public interface IStudyService {
    
    // Trae lista de usuarios
    public List<Study> getStudies ();
    
    // Añade un usuario
    public void saveStudy (Study study);
    
    // Elimina un usuario
    public void deleteStudy (Long id);
    
    // Busca un usuario
    public Study findStudyById (Long id);
    
    // Actualiza un usuario
    public Study updateStudy(Study study, Long study_id);
    
}