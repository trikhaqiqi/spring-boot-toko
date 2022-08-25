package com.kudangkoding.toko.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kudangkoding.toko.entity.Kategori;

public interface KategoriRepository extends JpaRepository<Kategori, String> {
    
}
