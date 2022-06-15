package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Instrumento;

public interface InstrumentoRepository extends JpaRepository <Instrumento, Integer>{

}
