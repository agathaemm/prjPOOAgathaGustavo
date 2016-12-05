
package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Agatha Gustavo
 */
public class Candidato extends Pessoa {
    
    //Atributos da classe
    private String inscricao;
    private double media;
    private ArrayList <Prova> provas;
    
    /**
     * 
     * Candidato
     * 
     * Metodo construtor da classe
     * 
     * @param i
     * @param cpf
     * @param nome
     * @param endereco 
     */
    public Candidato(String i, String cpf, String nome, String endereco) {
        super(cpf, nome, endereco);
        this.inscricao = i;
    }

    /**
     * 
     * getInscricao
     * 
     * retorna a inscricao
     * 
     * @return 
     */
    public String getInscricao() {
        return inscricao;
    }
    
    /**
     * 
     * calcularMedia
     * 
     * calcula a media do candidato
     * 
     */
    public void calcularMedia(){
        
        //variaveis usadas para guardar as somatorias
        int    somaP = 0;
        double somaN = 0;
        
        //percorre todas as provas do candidato
        for (int x = 0; x < provas.size(); x++) {
            
            //acrecenta o peso da prova
            somaP = somaP + provas.get(x).getPeso();
            
            //adiciona a nota da prova
            somaN = somaN + (provas.get(x).getPeso() * provas.get(x).getNota());
        }
        
        //seta a media do candidato
        this.media = somaN / somaP;
    }
    
    /**
     * 
     * addProva
     * 
     * Adiciona uma prova ao candidato
     * 
     * @param p 
     */
    public void addProva(Prova p){
        this.addProva(p);
    }
}
