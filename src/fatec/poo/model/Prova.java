
package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Agatha Gustavo
 */
public class Prova {
    
    //define os atributos da classe
    private String materia;
    private int peso;
    private double nota;
    private int qtdeQuestoes;
    private Concurso concurso;
    private Questao[] questoes;
    private Candidato candidato;  
    
    /**
     * 
     * Prova
     * 
     * Metodo construtor da classe
     * 
     * @param materia 
     * @param qq
     */
    public Prova(String materia, int qq) {
        this.materia = materia;
        this.qtdeQuestoes = qq;
        this.questoes = new Questao[this.qtdeQuestoes];
    }
    
    /**
     * 
     * setPeso
     * 
     * Define um valor ao atributo peso
     * 
     * @param peso 
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    /**
     * 
     * efetuarCorrecao
     * 
     * Realiza a correcao da prova
     * 
     */
    public void efetuarCorrecao() {
        
        //percorre todas as questoes da prova
        for (int x = 0; x < questoes.length; x++) {
            
            //verifica de a resposta esta correta 
            if (questoes[x].getResposta() == questoes[x].getAlternativaGabarito())
                
                //calcula a nota
                nota++;
        }
    }

    /**
     * 
     * getMateria
     * 
     * retorna o atributo materia
     * 
     * @return 
     */
    public String getMateria() {
        return materia;
    }
    
    /**
     * 
     * getPeso
     * 
     * retorna o atributo peso
     * 
     * @return 
     */
    public int getPeso() {
        return peso;
    }
    
    /**
     * 
     * getNota
     * 
     * retorna o atributo nota
     * 
     * @return 
     */
    public double getNota() {
        return nota;
    }
    
    /**
     * 
     * getQtdeQuestoes
     * 
     * retorna o atributo qtdeQuestoes
     * 
     * @return 
     */
    public int getQtdeQuestoes() {
        return qtdeQuestoes;
    }
    
    /**
     * 
     * setConcurso
     * 
     * Defina o concurso o qual a prova é aplicada
     * 
     * @param c 
     */
    public void setConcurso(Concurso c) {
        this.concurso = c;
        this.concurso.addProva(this);
    }

    /**
     * 
     * addQuestao
     * 
     * Adiciona um objeto questao ao array de questoes da classe
     * 
     * @param q 
     */
    public void addQuestao( Questao q ){
        this.questoes[this.questoes.length] = q;
    }
    
    /**
     * 
     * setCandidato
     * 
     * define o candidato da prova
     * 
     * @param c 
     */
    public void setCandidato( Candidato c) {
        this.candidato = c;
    }
}
