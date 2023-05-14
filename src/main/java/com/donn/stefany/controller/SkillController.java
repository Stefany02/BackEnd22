/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.donn.stefany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.donn.stefany.interfaces.ISkillService;
import com.donn.stefany.model.Skill;

@RestController
@RequestMapping("/skills")
public class SkillController {
    
    @Autowired
    private ISkillService skillServ;
    
    @GetMapping ("/watch")
    @ResponseBody
    public List<Skill> seeSkills () {
        return skillServ.getSkills();
    }
    
    @PostMapping ("/add")
    public void addSkill (@RequestBody Skill skill) {
        skillServ.saveSkill(skill);
    }
    
    @PutMapping("/edit/{skill_id}")
    public Skill updateSkill (@RequestBody Skill skill, @PathVariable Long skill_id) {
        return skillServ.updateSkill(skill, skill_id);
    }
    
    @GetMapping("/id/{skill_id}")
    public Skill getSkillById (@PathVariable Long skill_id) {
        return skillServ.findSkillById(skill_id);
    }
    
    @DeleteMapping ("/delete/{skill_id}")
    public void deleteSkill (@PathVariable("skill_id") Long skill_id) {
        skillServ.deleteSkill(skill_id);
    }

}