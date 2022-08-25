package com.kudangkoding.toko.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kudangkoding.toko.entity.Kategori;
import com.kudangkoding.toko.exception.ResourceNotFoundException;
import com.kudangkoding.toko.repository.KategoriRepository;


@Service
public class KategoriService {
    
    @Autowired
    private KategoriRepository kategoriRepository;

    public Kategori findById(String id) {
        return kategoriRepository.findById(id)
                .orElseThrow(() ->  new ResourceNotFoundException("Kategori dengan id " + id + " tidak ditemukan"));
    }

    public List<Kategori> findAll() {
        return kategoriRepository.findAll();
    }

    public Kategori create(Kategori kategori) {
        kategori.setId(UUID.randomUUID().toString());
        return kategoriRepository.save(kategori);
    }

    public Kategori edit(Kategori kategori) {
        return kategoriRepository.save(kategori);
    }

    public void deteleById(String id) {
        kategoriRepository.deleteById(id);
    }
}
