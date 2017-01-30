package br.com.rogrs.autobot.repository;

import br.com.rogrs.autobot.domain.ExecutarPlano;

import org.springframework.data.jpa.repository.*;

import java.util.List;

/**
 * Spring Data JPA repository for the ExecutarPlano entity.
 */
@SuppressWarnings("unused")
public interface ExecutarPlanoRepository extends JpaRepository<ExecutarPlano,Long> {

}