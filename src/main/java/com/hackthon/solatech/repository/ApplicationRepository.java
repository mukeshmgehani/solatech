package com.hackthon.solatech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hackthon.solatech.entity.Application;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, Integer> {


}
