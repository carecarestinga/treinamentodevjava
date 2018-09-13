package br.com.technocorp.database.repository;

import br.com.technocorp.database.modeldb.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentosRepository extends JpaRepository<Departamento, Long> {

}
