/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.donn.stefany.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "projects")
public class Project {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long project_id;
    private String name;
    private String logo_url;
    private String status;
    private String position;
    private String startDate;
    private String endDate;
    private String type;
    private String url;
    @Lob
    @Column(columnDefinition = "TEXT")
    private String about;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_userData_id")
    private UserData userData;

    public Project() {
    }

    public Project(Long project_id, String name, String logo_url, String status, String position, String startDate, String endDate, String type, String url, String about) {
        this.project_id = project_id;
        this.name = name;
        this.logo_url = logo_url;
        this.status = status;
        this.position = position;
        this.startDate = startDate;
        this.endDate = endDate;
        this.type = type;
        this.url = url;
        this.about = about;
    }
    
}