package com.tgco.jpa.repositories;

import com.tgco.jpa.models.Student;

public interface StudentRepository {

    void save(Student theStudent);

    Student findById(int id);
}
