package Metodos;

import Modelos.Modelo_Usuario;
import Conexoes.Conexao;
import java.util.ArrayList;

/**
 *
 * @author MarcosBeck
 */
public class Metodo_Usuarios extends Conexao {

    /**
     * grava Usuario
     *
     * @param pModelUsuario
     * @return int
     */
    public int salvarUsuarioDAO(Modelo_Usuario pModelUsuario) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tb_usuario ("
                    + "nome_user,"
                    + "login_user,"
                    + "password_user"
                    + ") VALUES ("
                    + "'" + pModelUsuario.getNomeUser() + "',"
                    + "'" + pModelUsuario.getLoginUser() + "',"
                    + "'" + pModelUsuario.getPasswordUser() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * recupera Usuario
     *
     * @param pIdUsuario
     * @return Modelo_Usuario
     */
    public Modelo_Usuario getUsuarioDAO(int pIdUsuario) {
        Modelo_Usuario modelUsuario = new Modelo_Usuario();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "id_usuario,"
                    + "nome_user,"
                    + "login_user,"
                    + "password_user"
                    + " FROM"
                    + " tb_usuario"
                    + " WHERE"
                    + " id_usuario = '" + pIdUsuario + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelUsuario.setIdUsuario(this.getResultSet().getInt(1));
                modelUsuario.setNomeUser(this.getResultSet().getString(2));
                modelUsuario.setLoginUser(this.getResultSet().getString(3));
                modelUsuario.setPasswordUser(this.getResultSet().getString(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelUsuario;
    }
    
    /**
     * recupera Usuario
     *
     * @param pLogin
     * @return Modelo_Usuario
     */
    public Modelo_Usuario getUsuarioDAO(String pLogin) {
        Modelo_Usuario modelUsuario = new Modelo_Usuario();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "id_usuario,"
                    + "nome_user,"
                    + "login_user,"
                    + "password_user"
                    + " FROM"
                    + " tb_usuario"
                    + " WHERE"
                    + " login_user = '" + pLogin + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelUsuario.setIdUsuario(this.getResultSet().getInt(1));
                modelUsuario.setNomeUser(this.getResultSet().getString(2));
                modelUsuario.setLoginUser(this.getResultSet().getString(3));
                modelUsuario.setPasswordUser(this.getResultSet().getString(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelUsuario;
    }

    /**
     * recupera uma lista de Usuario
     *
     * @return ArrayList
     */
    public ArrayList<Modelo_Usuario> getListaUsuarioDAO() {
        ArrayList<Modelo_Usuario> listamodelUsuario = new ArrayList();
        Modelo_Usuario modelUsuario = new Modelo_Usuario();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "id_usuario,"
                    + "nome_user,"
                    + "login_user,"
                    + "password_user"
                    + " FROM"
                    + " tb_usuario"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelUsuario = new Modelo_Usuario();
                modelUsuario.setIdUsuario(this.getResultSet().getInt(1));
                modelUsuario.setNomeUser(this.getResultSet().getString(2));
                modelUsuario.setLoginUser(this.getResultSet().getString(3));
                modelUsuario.setPasswordUser(this.getResultSet().getString(4));
                listamodelUsuario.add(modelUsuario);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelUsuario;
    }

    /**
     * atualiza Usuario
     *
     * @param pModelUsuario
     * @return boolean
     */
    public boolean atualizarUsuarioDAO(Modelo_Usuario pModelUsuario) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tb_usuario SET "
                    + "id_usuario = '" + pModelUsuario.getIdUsuario() + "',"
                    + "nome_user = '" + pModelUsuario.getNomeUser() + "',"
                    + "login_user = '" + pModelUsuario.getLoginUser() + "',"
                    + "password_user = '" + pModelUsuario.getPasswordUser() + "'"
                    + " WHERE "
                    + "id_usuario = '" + pModelUsuario.getIdUsuario() + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * exclui Usuario
     *
     * @param pIdUsuario
     * @return boolean
     */
    public boolean excluirUsuarioDAO(int pIdUsuario) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tb_usuario "
                    + " WHERE "
                    + "id_usuario = '" + pIdUsuario + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * VALIDA USUÁRIO PARA O LOGIN
     * @param modelo_usuario
     * @return 
     */
    public boolean getValidarUsuarioDAO(Modelo_Usuario modelo_usuario) {
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "id_usuario,"
                    + "nome_user,"
                    + "login_user,"
                    + "password_user"
                    + " FROM"
                    + " tb_usuario"
                    + " WHERE"
                    + " login_user = '" + modelo_usuario.getLoginUser() + "' AND password_user = '" + modelo_usuario.getPasswordUser() + "'"
                    + ";"
            );
            if (getResultSet().next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
}
