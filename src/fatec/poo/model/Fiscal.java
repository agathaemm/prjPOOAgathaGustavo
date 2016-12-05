
package fatec.poo.model;

/**
 *
 * @author Agatha Gustavo
 */
public class Fiscal extends Pessoa {

    //Atributos da classe
    private String codigo;
    private String local;
    
   /**
    * 
    * Fiscal
    * 
    * metodo construtor da classe
    * 
    * @param c
    * @param cpf
    * @param nome
    * @param endereco 
    */
    public Fiscal(String c, String cpf, String nome, String endereco) {
        super(cpf, nome, endereco);
        this.codigo = c;
    }
    
    /**
     * 
     * setLocal
     * 
     * define um valor ao atributo local
     * 
     * @param local 
     */
    public void setLocal(String local) {
        this.local = local;
    }

    /**
     * 
     * getCodigo
     * 
     * retorna o codigo
     * 
     * @return 
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * 
     * getLocal
     * 
     * retorna o local
     * 
     * @return 
     */
    public String getLocal() {
        return local;
    }
}
