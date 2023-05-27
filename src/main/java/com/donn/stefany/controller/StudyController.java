package com.donn.stefany.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.donn.stefany.interfaces.IStudyService;
import com.donn.stefany.model.Study;

@RestController
@RequestMapping("/studies")
public class StudyController {
    
    @Autowired
    private IStudyService studyServ;
    
    @GetMapping ("/watch")
    @ResponseBody
    public List<Study> seeStudies () {
        return studyServ.getStudies();
    }
    
    @PostMapping ("/add")
    public void addStudy (@RequestBody Study study) {
        studyServ.saveStudy(study);
    }
    
    @PutMapping("/edit/{study_id}")
    public Study updateStudy (@RequestBody Study study, @PathVariable Long study_id) {
        return studyServ.updateStudy(study, study_id);
    }
    
    @GetMapping("/id/{study_id}")
    public Study getStudyById (@PathVariable Long study_id) {
        return studyServ.findStudyById(study_id);
    }
    
    @DeleteMapping ("/delete/{study_id}")
    public void deleteStudy (@PathVariable("study_id") Long study_id) {
        studyServ.deleteStudy(study_id);
    }
    
}