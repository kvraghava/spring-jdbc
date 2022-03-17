package com.raghava.springbootjpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HibernateRepository extends JpaRepository<Employee,Integer> {

}
