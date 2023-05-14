/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.donn.stefany.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.donn.stefany.interfaces.IStudyService;
import com.donn.stefany.model.Study;
import com.donn.stefany.repository.StudyRepository;
import org.springframework.stereotype.Service;

@Service
public class StudyService implements IStudyService {

    @Autowired
    public StudyRepository studyRepo;

    @Override
    public List<Study> getStudies() {
        return studyRepo.findAll();
    }

    @Override
    public void saveStudy(Study study) {
        studyRepo.save(study);
    }

    @Override
    public void deleteStudy(Long id) {
        studyRepo.deleteById(id);
    }

    @Override
    public Study findStudyById(Long id) {
        return studyRepo.findById(id).orElse(null);
    }

    @Override
    public Study updateStudy(Study study, Long study_id) {
        Optional<Study> localStudy = studyRepo.findById(study_id);
        Study stdy = null;
        if (localStudy.isPresent()) {
            stdy = localStudy.get();
            stdy.setAbout(study.getAbout());
            stdy.setEndDate(study.getEndDate());
            stdy.setInstitution(study.getInstitution());
            stdy.setLogo_url(study.getLogo_url());
            stdy.setName(study.getName());
            stdy.setStartDate(study.getStartDate());
            stdy.setTitle(study.getTitle());
            stdy = studyRepo.save(stdy);
        }
        return stdy;
    }

}