/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.donn.stefany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.donn.stefany.interfaces.IProjectService;
import com.donn.stefany.model.Project;

@RestController
@RequestMapping("/projects")
public class ProjectController {
    
    @Autowired
    private IProjectService projectServ;
    
    @GetMapping ("/watch")
    @ResponseBody
    public List<Project> seeProjects () {
        return projectServ.getProjects();
    }
    
    @PostMapping ("/add")
    public void addProyect (@RequestBody Project project) {
        projectServ.saveProject(project);
    }
    
    @PutMapping("/edit/{project_id}")
    public Project updateProject (@RequestBody Project project, @PathVariable Long project_id) {
        return projectServ.updateProject(project, project_id);
    }
    
    @GetMapping("/id/{project_id}")
    public Project getProjectById (@PathVariable Long project_id) {
        return projectServ.findProjectById(project_id);
    }
    
    @DeleteMapping ("/delete/{project_id}")
    public void deleteProject (@PathVariable("project_id") Long project_id) {
        projectServ.deleteProject(project_id);
    }

}