package com.uepa.br.arqsoftmvc.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_developer")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class DeveloperModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="nome")
    private String nome;

    @ManyToMany
    private List<SkillsModel> skills;
}
