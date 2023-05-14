/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.donn.stefany.interfaces;


import com.donn.stefany.model.UserData;
import java.util.List;

public interface IUserDataService {
    
    // Trae lista de usuarios
    public List<UserData> getUsersData ();
    
    // Añade un usuario
    public void saveUserData (UserData userData);
    
    // Elimina un usuario
    public void deleteUserData (Long id);
    
    // Busca un usuario
    public UserData findUserDataById (Long id);
    
    // Actualiza un usuario
    public UserData updateUserData(UserData userData, Long data_id);
    
}