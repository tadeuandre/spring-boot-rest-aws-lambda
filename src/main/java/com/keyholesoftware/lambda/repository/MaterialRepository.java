package com.keyholesoftware.lambda.repository;

import com.keyholesoftware.lambda.model.Material;
import com.keyholesoftware.lambda.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialRepository extends JpaRepository<Material, Integer> {

}
