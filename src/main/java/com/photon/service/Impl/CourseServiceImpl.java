package com.photon.service.Impl;

import com.photon.domain.Courses;
import com.photon.service.CrudService;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CourseServiceImpl implements CrudService<Courses> {

    private List<Courses> courses;
    // inject repository here, and work with it.

    public CourseServiceImpl() {
        courses = new ArrayList<>();
        courses.add(new Courses(1L,
                "Getting started with how to be lazy, lol",
                "I will teach you the way of life",
                "my links are universally available"));
    }

    @Override public List<Courses> getAll() {
        return courses;
    }

    @Override public Courses create(Courses courses) {
        return null;
    }

    @Override public Optional<Courses> getById(Long id) {
        return Optional.empty();
    }

    @Override public void update(Courses courses, Long id) {

    }

    @Override public void delete(Long id) {

    }
}
