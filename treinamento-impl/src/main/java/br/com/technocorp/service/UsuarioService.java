package br.com.technocorp.service;

import br.com.technocorp.database.modeldb.Usuario;
import br.com.technocorp.database.repository.UsuariosRepository;
import br.com.technocorp.facade.UsuarioFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UsuarioService implements UsuarioFacade {

    private UsuariosRepository usuariosRepository;

    @Autowired
    public UsuarioService(UsuariosRepository usuariosRepository) {
        this.usuariosRepository = usuariosRepository;
    }


    public Iterable<Usuario> buscarTodosUsuarios(){
        return  usuariosRepository.findAll();
    }


    public Usuario buscarUsuarioPorId(Long id){
        return usuariosRepository.findById(id).get();
    }


    public Boolean salvarUsuario(Usuario usuario){
        if(usuario != null){
            usuariosRepository.save(usuario);
            return true;
        } else {
            return false;
        }
    }


    public Boolean atualizarUsuario(Usuario usuario, Long id){
        Usuario usu = buscarUsuarioPorId(id);
        if(usuario != null){
            usu.setNome(usuario.getNome());
            usu.setLogin(usuario.getLogin());
            usu.setSenha(usuario.getSenha());
            usuariosRepository.save(usuario);
            return true;
        } else {
            return false;
        }
    }


    public Boolean excluirUsuario(Usuario usuario){
        if(usuario != null){
            usuariosRepository.delete(usuario);
            return true;
        } else {
            return false;
        }
    }


}
