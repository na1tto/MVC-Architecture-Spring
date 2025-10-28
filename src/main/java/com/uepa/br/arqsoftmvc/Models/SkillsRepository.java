package com.uepa.br.arqsoftmvc.Models;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface SkillsRepository extends CrudRepository<SkillsModel, Long> {
    public List<SkillsModel> findByName(String name);
}
