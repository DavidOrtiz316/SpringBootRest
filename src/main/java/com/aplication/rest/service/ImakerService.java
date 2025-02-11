package com.aplication.rest.service;

import com.aplication.rest.entities.Maker;

import java.util.List;
import java.util.Optional;

public interface ImakerService {

    List<Maker> findAll();
    Optional<Maker> findById(Long id);
    void save(Maker maker);
    void deleteById(Long id);
}
