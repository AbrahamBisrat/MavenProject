package com.photon.service;

import java.util.List;
import java.util.Optional;

public interface CrudService <T> {
    List<T> getAll();
    T create(T t);
    Optional<T> getById(Long id);
    void update(T t, Long id);
    void delete(Long id);
}
