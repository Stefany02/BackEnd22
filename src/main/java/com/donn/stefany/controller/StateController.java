/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.donn.stefany.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.donn.stefany.interfaces.IStateService;
import com.donn.stefany.model.State;

@RestController
@RequestMapping("/states")
public class StateController {
    
    @Autowired
    private IStateService stateServ;
    
    @GetMapping ("/watch")
    @ResponseBody
    public List<State> seeStates () {
        return stateServ.getStates();
    }
    
    @PostMapping ("/add")
    public void addState (@RequestBody State state) {
        stateServ.saveState(state);
    }
    
    @PutMapping("/edit/{state_id}")
    public State updateState (@RequestBody State state, @PathVariable Long state_id) {
        return stateServ.updateState(state, state_id);
    }
    
    @GetMapping("/id/{state_id}")
    public State getStateById (@PathVariable Long state_id) {
        return stateServ.findStateById(state_id);
    }
    
    @DeleteMapping ("/delete/{state_id}")
    public void deleteState (@PathVariable("state_id") Long state_id) {
        stateServ.deleteState(state_id);
    }

}