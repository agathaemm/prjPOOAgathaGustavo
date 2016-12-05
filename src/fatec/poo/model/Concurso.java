
package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Agatha Gustavo
 */
public class Concurso {
    
    //define os atributos da classe
    private String sigla;
    private String descricao;
    private String dataRealizacao;
    private double taxaInscricao;
    private ArrayList <Prova> provas;
    private ArrayList <Pessoa> pessoas;

    /**
     * 
     * Questao
     * 
     * Metodo construtor da classe
     * 
     * @param sigla
     * @param descricao
     * @param dataRealizacao 
     */
    public Concurso(String sigla, String descricao, String dataRealizacao) {
        this.sigla = sigla;
        this.descricao = descricao;
        this.dataRealizacao = dataRealizacao;
    }

    /**
     * 
     * setTaxaInscricao
     * 
     * Define um valor para o atributo inscricao
     * 
     * @param taxaInscricao 
     */
    public void setTaxaInscricao(double taxaInscricao) {
        this.taxaInscricao = taxaInscricao;
    }

    /**
     * 
     * getSigla
     * 
     * retorna o atributo sigla
     * 
     * @return 
     */
    public String getSigla() {
        return sigla;
    }
    
    /**
     * 
     * getDescricao
     * 
     * retorna o atributo descricao
     * 
     * @return 
     */
    public String getDescricao() {
        return descricao;
    }
    
    /**
     * 
     * getDataRealizacao
     * 
     * retorna o atributo DataRealizacao
     * 
     * @return 
     */
    public String getDataRealizacao() {
        return dataRealizacao;
    }
    
    /**
     * 
     * getTaxaInscricao
     * 
     * retorna o valor do atrinuto taxaInscricao
     * 
     * @return 
     */
    public double getTaxaInscricao() {
        return taxaInscricao;
    }
    
    /**
     * 
     * addProva
     * 
     * Adiciona uma prova ao concurso
     * 
     * @param p 
     */
    public void addProva(Prova p){
        provas.add(p);
    }
        
    /**
     * 
     * addPessoa
     * 
     * adiciona uma pessoa ao array de pessoas
     * 
     * @param p 
     */
    public void addPessoa(Pessoa p){
        this.pessoas.add(p);
    }
}
