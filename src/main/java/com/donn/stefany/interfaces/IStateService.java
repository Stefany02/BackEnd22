/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.donn.stefany.interfaces;

import com.donn.stefany.model.State;
import java.util.List;

public interface IStateService {
    
    // Trae lista de usuarios
    public List<State> getStates ();
    
    // Añade un usuario
    public void saveState (State state);
    
    // Elimina un usuario
    public void deleteState (Long id);
    
    // Busca un usuario
    public State findStateById (Long id);
    
    // Actualiza un usuario
    public State updateState(State state, Long state_id);
    
}