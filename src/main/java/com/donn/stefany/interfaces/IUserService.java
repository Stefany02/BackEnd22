/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.donn.stefany.interfaces;


import com.donn.stefany.model.User;
import java.util.List;

public interface IUserService {
    
    // Trae lista de usuarios
    public List<User> getUsers ();
    
    // Añade un usuario
    public void saveUser (User user);
    
    // Elimina un usuario
    public void deleteUser (Long id);
    
    // Busca un usuario
    public User findUserById (Long id);
    
    // Actualiza un usuario
    public User updateUser(User user, Long user_id);
    
}