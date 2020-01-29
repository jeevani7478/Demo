package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Table1;

@Repository
public interface table1Repository extends JpaRepository<Table1, Integer> {

}
