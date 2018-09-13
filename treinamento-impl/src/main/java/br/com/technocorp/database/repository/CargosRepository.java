package br.com.technocorp.database.repository;

import br.com.technocorp.database.modeldb.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CargosRepository extends JpaRepository<Cargo, Long> {

}
