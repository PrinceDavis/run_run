package com.tgco.jpa.repositories;

import com.tgco.jpa.models.Student;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class StudentRepositoryImp implements StudentRepository{
    private EntityManager entityManager;

    @Autowired
    public StudentRepositoryImp(EntityManager manager) {
        this.entityManager = manager;
    }
    @Override
    @Transactional
    public void save(Student theStudent) {
        this.entityManager.persist(theStudent);
    }
}
