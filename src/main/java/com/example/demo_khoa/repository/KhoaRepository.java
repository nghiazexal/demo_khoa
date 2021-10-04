package com.example.demo_khoa.repository;

import com.example.demo_khoa.entity.Khoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KhoaRepository extends JpaRepository<Khoa,Long> {
}
