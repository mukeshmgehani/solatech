package com.hackthon.solatech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackthon.solatech.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long>{

}
