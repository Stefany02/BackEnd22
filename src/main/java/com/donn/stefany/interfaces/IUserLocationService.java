/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.donn.stefany.interfaces;

import com.donn.stefany.model.UserLocation;
import java.util.List;

public interface IUserLocationService {
    
    // Trae lista de usuarios
    public List<UserLocation> getLocations ();
    
    // Añade un usuario
    public void saveLocation (UserLocation location);
    
    // Elimina un usuario
    public void deleteLocation (Long id);
    
    // Busca un usuario
    public UserLocation findLocationById (Long id);
    
    // Actualiza un usuario
    public UserLocation updateLocation(UserLocation location, Long location_id);
    
}