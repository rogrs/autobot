package br.com.rogrs.cronus.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.rogrs.cronus.domain.Teacher;

@RepositoryRestResource(collectionResourceRel = "courses", path = "courses")
public interface TeacherRepository extends JpaRepository<Teacher, UUID> {
}