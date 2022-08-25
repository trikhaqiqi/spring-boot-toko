package com.kudangkoding.toko.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kudangkoding.toko.entity.PesananItem;

public interface PesananItemRepository extends JpaRepository<PesananItem, String> {
    
}
