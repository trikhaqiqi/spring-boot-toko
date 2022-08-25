package com.kudangkoding.toko.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kudangkoding.toko.entity.Produk;

public interface ProdukRepository extends JpaRepository<Produk, String> {
    
}
