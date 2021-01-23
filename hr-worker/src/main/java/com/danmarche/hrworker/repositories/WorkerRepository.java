package com.danmarche.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danmarche.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
