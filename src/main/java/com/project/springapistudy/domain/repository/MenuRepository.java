package com.project.springapistudy.domain.repository;

import com.project.springapistudy.domain.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {
    // Repository 메서드 선언
}