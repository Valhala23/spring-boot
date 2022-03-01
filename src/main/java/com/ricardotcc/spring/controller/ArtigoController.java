package com.ricardotcc.spring.controller;

import java.util.List;
import com.ricardotcc.spring.model.Artigo;
import com.ricardotcc.spring.repository.ArtigoRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(maxAge = 3600)
@RestController
public class ArtigoController {
    @Autowired
    private ArtigoRepositorio artigoRepositorio;

    @RequestMapping(value = "/artigosapi", method = RequestMethod.GET)
    public List<Artigo> Get() {
        return artigoRepositorio.findAll();
    }
}