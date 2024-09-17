package br.com.etechoracio.pw3_study.repository;

import br.com.etechoracio.pw3_study.entity.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisponibilidadeRepository extends JpaRepository<Disciplina, Long> {

}
