
package fatec.poo.model;

/**
 *
 * @author Agatha Gustavo
 */
public abstract class Pessoa {

    //Atributos da classe
    private String cpf;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private Concurso concurso;
    
    /**
     * 
     * Pessoa
     * 
     * Método construtor da classe
     * 
     * @param cpf
     * @param nome
     * @param endereco 
     */
    public Pessoa(String cpf, String nome, String endereco) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
    }
    
    /**
     * 
     * setTelefone
     * 
     * define um valor para o atributo telefone
     * 
     * @param telefone 
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * 
     * setEmail
     * 
     * define um valor para o atributo email
     * 
     * @param email 
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * 
     * getCpf
     * 
     * retorna o valor do cpf
     * 
     * @return 
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * 
     * getNome
     * 
     * retorna o valor do Nome
     * 
     * @return 
     */
    public String getNome() {
        return nome;
    }

    /**
     * 
     * getEndereco
     * 
     * retorna o valor do Endereco
     * 
     * @return 
     */
    public String getEndereco() {
        return endereco;
    }
    
    /**
     * 
     * getTelefone
     * 
     * retorna o valor do Telefone
     * 
     * @return 
     */
    public String getTelefone() {
        return telefone;
    }
    
    /**
     * 
     * getEmail
     * 
     * retorna o valor do Email
     * 
     * @return 
     */
    public String getEmail() {
        return email;
    }
    
    /**
     * 
     * setConcurso
     * 
     * Adiciona a pessoa ao concurso passado
     * 
     * @param c 
     */
    public void setConcurso(Concurso c) {
        this.concurso = c;
        this.concurso.addPessoa(this);
    }
}
