package Controlador;

import Modelos.Modelo_Usuario;
import Metodos.Metodo_Usuarios;
import java.util.ArrayList;

/**
*
* @author MarcosBeck
*/
public class Controlador_Usuario {

    private Metodo_Usuarios metodo_usuario = new Metodo_Usuarios();

    /**
    * grava Usuario
    * @param pModelUsuario
    * @return int
    */
    public int salvarUsuarioController(Modelo_Usuario pModelUsuario){
        return this.metodo_usuario.salvarUsuarioDAO(pModelUsuario);
    }

    /**
    * recupera Usuario
    * @param pIdUsuario
    * @return Modelo_Usuario
    */
    public Modelo_Usuario getUsuarioController(int pIdUsuario){
        return this.metodo_usuario.getUsuarioDAO(pIdUsuario);
    }
    
    /**
    * recupera Usuario
    * @param pLogin
    * @return Modelo_Usuario
    */
    public Modelo_Usuario getUsuarioController(String pLogin){
        return this.metodo_usuario.getUsuarioDAO(pLogin);
    }

    /**
    * recupera uma lista deUsuario
    * @param pIdUsuario
    * @return ArrayList
    */
    public ArrayList<Modelo_Usuario> getListaUsuarioController(){
        return this.metodo_usuario.getListaUsuarioDAO();
    }

    /**
    * atualiza Usuario
    * @param pModelUsuario
    * @return boolean
    */
    public boolean atualizarUsuarioController(Modelo_Usuario pModelUsuario){
        return this.metodo_usuario.atualizarUsuarioDAO(pModelUsuario);
    }

    /**
    * exclui Usuario
    * @param pIdUsuario
    * @return boolean
    */
    public boolean excluirUsuarioController(int pIdUsuario){
        return this.metodo_usuario.excluirUsuarioDAO(pIdUsuario);
    }

    /**
     * VALIDAR LOGIN DE ACESSO DO USUÁRIO
     * @param modelo_usuario
     * @return 
     */
    public boolean getUsuarioController(Modelo_Usuario modelo_usuario) {
        return this.metodo_usuario.getValidarUsuarioDAO(modelo_usuario);
    }
}