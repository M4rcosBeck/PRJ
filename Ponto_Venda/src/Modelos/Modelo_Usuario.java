package Modelos;
/**
*
* @author MarcosBeck
*/
public class Modelo_Usuario {

    private int idUsuario;
    private String nomeUser;
    private String loginUser;
    private String passwordUser;
    private Boolean status;

    /**
    * Construtor
    */
    public Modelo_Usuario(){}

    /**
    * seta o valor de idUsuario
    * @param pIdUsuario
    */
    public void setIdUsuario(int pIdUsuario){
        this.idUsuario = pIdUsuario;
    }
    /**
    * @return idUsuario
    */
    public int getIdUsuario(){
        return this.idUsuario;
    }

    /**
    * seta o valor de nomeUser
    * @param pNomeUser
    */
    public void setNomeUser(String pNomeUser){
        this.nomeUser = pNomeUser;
    }
    /**
    * @return nomeUser
    */
    public String getNomeUser(){
        return this.nomeUser;
    }

    /**
    * seta o valor de loginUser
    * @param pLoginUser
    */
    public void setLoginUser(String pLoginUser){
        this.loginUser = pLoginUser;
    }
    /**
    * @return loginUser
    */
    public String getLoginUser(){
        return this.loginUser;
    }

    /**
    * seta o valor de passwordUser
    * @param pPasswordUser
    */
    public void setPasswordUser(String pPasswordUser){
        this.passwordUser = pPasswordUser;
    }
    /**
    * @return passwordUser
    */
    public String getPasswordUser(){
        return this.passwordUser;
    }

    @Override
    public String toString(){
        return "ModelUsuario {" + "::idUsuario = " + this.idUsuario + "::nomeUser = " + this.nomeUser + "::loginUser = " + this.loginUser + "::passwordUser = " + this.passwordUser +  "}";
    }

    public void setStatus(boolean b) {
        this.status = b;
    }
    
    public Boolean getStatus(){
        return status;
    }
}