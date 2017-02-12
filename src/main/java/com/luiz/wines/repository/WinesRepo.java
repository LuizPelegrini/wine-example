package com.luiz.wines.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luiz.wines.model.Wine;

public interface WinesRepo extends JpaRepository<Wine, Long>{

}
