package com.eduPortal.EduPortalWeb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eduPortal.EduPortalWeb.Entity.Developer;

@Repository
public interface DeveloperRepository extends JpaRepository<Developer, Integer>{

}