package br.com.technocorp.database.repository;

import br.com.technocorp.database.modeldb.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionariosRepository  extends JpaRepository<Funcionario, Long> {

}
