package com.keyholesoftware.lambda.service;


import com.keyholesoftware.lambda.model.Material;
import com.keyholesoftware.lambda.repository.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class MaterialService {

    @Autowired
    private MaterialRepository materialRepository;

    public Collection<Material> getAllMaterials(){
        return this.materialRepository.findAll();
    }

    public Material getMaterialById(int id){
        return this.materialRepository.findOne(id);
    }

    public void removeMaterialById(int id) {
        this.materialRepository.delete(id);
    }

    public void save(Material material){
        this.materialRepository.save(material);
    }

}
