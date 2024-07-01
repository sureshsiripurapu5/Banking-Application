package com.suresh.ba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suresh.ba.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
