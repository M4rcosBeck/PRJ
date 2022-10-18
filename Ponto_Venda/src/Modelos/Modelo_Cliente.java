package Modelos;
/**
*
* @author MarcosBeck
*/
public class Modelo_Cliente {

    private int idCliente;
    private String nomeCliente;
    private String enderecoCliente;
    private int numeroCliente;
    private String compCliente;
    private String bairroCliente;
    private String estadoCliente;
    private String cepCliente;
    private String telCliente;
    private String emailCliente;
    private String cidadeCliente;

    /**
    * Construtor
    */
    public Modelo_Cliente(){}

    /**
    * seta o valor de idCliente
    * @param pIdCliente
    */
    public void setIdCliente(int pIdCliente){
        this.idCliente = pIdCliente;
    }
    /**
    * @return pk_idCliente
    */
    public int getIdCliente(){
        return this.idCliente;
    }

    /**
    * seta o valor de nomeCliente
    * @param pNomeCliente
    */
    public void setNomeCliente(String pNomeCliente){
        this.nomeCliente = pNomeCliente;
    }
    /**
    * @return nomeCliente
    */
    public String getNomeCliente(){
        return this.nomeCliente;
    }

    /**
    * seta o valor de enderecoCliente
    * @param pEnderecoCliente
    */
    public void setEnderecoCliente(String pEnderecoCliente){
        this.enderecoCliente = pEnderecoCliente;
    }
    /**
    * @return enderecoCliente
    */
    public String getEnderecoCliente(){
        return this.enderecoCliente;
    }

    /**
    * seta o valor de numeroCliente
    * @param pNumeroCliente
    */
    public void setNumeroCliente(int pNumeroCliente){
        this.numeroCliente = pNumeroCliente;
    }
    /**
    * @return numeroCliente
    */
    public int getNumeroCliente(){
        return this.numeroCliente;
    }

    /**
    * seta o valor de compCliente
    * @param pCompCliente
    */
    public void setCompCliente(String pCompCliente){
        this.compCliente = pCompCliente;
    }
    /**
    * @return compCliente
    */
    public String getCompCliente(){
        return this.compCliente;
    }

    /**
    * seta o valor de bairroCliente
    * @param pBairroCliente
    */
    public void setBairroCliente(String pBairroCliente){
        this.bairroCliente = pBairroCliente;
    }
    /**
    * @return bairroCliente
    */
    public String getBairroCliente(){
        return this.bairroCliente;
    }

    /**
    * seta o valor de estadoCliente
    * @param pEstadoCliente
    */
    public void setEstadoCliente(String pEstadoCliente){
        this.estadoCliente = pEstadoCliente;
    }
    /**
    * @return estadoCliente
    */
    public String getEstadoCliente(){
        return this.estadoCliente;
    }

    /**
    * seta o valor de cepCliente
    * @param pCepCliente
    */
    public void setCepCliente(String pCepCliente){
        this.cepCliente = pCepCliente;
    }
    /**
    * @return cepCliente
    */
    public String getCepCliente(){
        return this.cepCliente;
    }

    /**
    * seta o valor de telCliente
    * @param pTelCliente
    */
    public void setTelCliente(String pTelCliente){
        this.telCliente = pTelCliente;
    }
    /**
    * @return telCliente
    */
    public String getTelCliente(){
        return this.telCliente;
    }

    /**
    * seta o valor de emailCliente
    * @param pEmailCliente
    */
    public void setEmailCliente(String pEmailCliente){
        this.emailCliente = pEmailCliente;
    }
    /**
    * @return emailCliente
    */
    public String getEmailCliente(){
        return this.emailCliente;
    }

    /**
    * seta o valor de cidadeCliente
    * @param pCidadeCliente
    */
    public void setCidadeCliente(String pCidadeCliente){
        this.cidadeCliente = pCidadeCliente;
    }
    /**
    * @return cidadeCliente
    */
    public String getCidadeCliente(){
        return this.cidadeCliente;
    }

    @Override
    public String toString(){
        return "ModelCliente {" + "::idCliente = " + this.idCliente + "::nomeCliente = " + this.nomeCliente + "::enderecoCliente = " + this.enderecoCliente + "::numeroCliente = " + this.numeroCliente + "::compCliente = " + this.compCliente + "::bairroCliente = " + this.bairroCliente + "::estadoCliente = " + this.estadoCliente + "::cepCliente = " + this.cepCliente + "::telCliente = " + this.telCliente + "::emailCliente = " + this.emailCliente + "::cidadeCliente = " + this.cidadeCliente +  "}";
    }
}