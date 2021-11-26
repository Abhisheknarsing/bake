package com.neoline.MyBake.entitys.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.neoline.MyBake.entitys.Report;

public interface ReportsRepo extends JpaRepository<Report, Integer> {

}
