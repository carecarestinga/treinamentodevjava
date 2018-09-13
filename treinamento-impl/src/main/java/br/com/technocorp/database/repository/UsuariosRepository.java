package br.com.technocorp.database.repository;

import br.com.technocorp.database.modeldb.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import reactor.core.publisher.Flux;

public interface UsuariosRepository extends JpaRepository<Usuario, Long> {

}
