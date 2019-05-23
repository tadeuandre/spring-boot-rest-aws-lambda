package com.keyholesoftware.lambda.rest;

import com.keyholesoftware.lambda.model.Material;
import com.keyholesoftware.lambda.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/materials")
public class MaterialController {

    @Autowired
    private MaterialService materialService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Material> getAllMaterials(){
        return materialService.getAllMaterials();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Material getMaterialById(@PathVariable("id") int id){
        return materialService.getMaterialById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteMaterialById(@PathVariable("id") int id){
        materialService.removeMaterialById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void deleteMaterialById(@RequestBody Material material){
        materialService.save(material);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertMaterial(@RequestBody Material material){
        materialService.save(material);
    }
}
