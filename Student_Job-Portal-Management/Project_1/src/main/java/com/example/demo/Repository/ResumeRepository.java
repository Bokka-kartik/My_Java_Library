package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Resume;


@Repository
public interface ResumeRepository extends JpaRepository<Resume,Long>{

}
