package com.masters.Tables.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masters.Tables.model.LoginHistory;

@Repository
public interface LoginHistoryRepo extends JpaRepository<LoginHistory,Long>{

}
