/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.donn.stefany.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.donn.stefany.interfaces.IProjectService;
import com.donn.stefany.model.Project;
import com.donn.stefany.repository.ProjectRepository;
import org.springframework.stereotype.Service;

@Service
public class ProjectService implements IProjectService {

    @Autowired
    public ProjectRepository projectRepo;

    @Override
    public List<Project> getProjects() {
        return projectRepo.findAll();
    }

    @Override
    public void saveProject(Project project) {
        projectRepo.save(project);
    }

    @Override
    public void deleteProject(Long id) {
        projectRepo.deleteById(id);
    }

    @Override
    public Project findProjectById(Long id) {
        return projectRepo.findById(id).orElse(null);
    }

    @Override
    public Project updateProject(Project project, Long project_id) {
        Optional<Project> localProject = projectRepo.findById(project_id);
        Project projecti = null;
        if (localProject.isPresent()) {
            projecti = localProject.get();
            projecti.setAbout(project.getAbout());
            projecti.setEndDate(project.getEndDate());
            projecti.setLogo_url(project.getLogo_url());
            projecti.setName(project.getName());
            projecti.setStartDate(project.getStartDate());
            projecti.setStatus(project.getStatus());
            projecti.setType(project.getType());
            projecti.setUrl(project.getUrl());
            projecti = projectRepo.save(projecti);
        }
        return projecti;
    }

    @Override
    public void saveProyect(Project project) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveProyect'");
    }

}