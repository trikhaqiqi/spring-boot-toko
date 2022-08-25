package com.kudangkoding.toko.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kudangkoding.toko.entity.Pengguna;

public interface PenggunaRepository extends JpaRepository<Pengguna, String> {

    boolean existsByEmail(String email);
    
}
