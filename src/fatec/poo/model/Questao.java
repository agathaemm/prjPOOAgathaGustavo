
package fatec.poo.model;

/**
 *
 * @author Agatha Gustavo
 */
public class Questao {
    
    //define os atributos da classe
    private int numero;
    private String enunciado;
    private String alternativa_A;
    private String alternativa_B;
    private String alternativa_C;
    private String alternativa_D;
    private char resposta;
    private char alternativaGabarito;
    
    /**
     * 
     * Questao
     * 
     * metodo construtor da classe
     * 
     * @param numero 
     */
    public Questao(int numero) {
        this.numero = numero;
    }
    
    /**
     * 
     * setEnunciado
     * 
     * define um valor ao atributo enunciado
     * 
     * @param enunciado 
     */
    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }
    
    /**
     * 
     * setAlternativa_A
     * 
     * define um valor para a alternativa a
     * 
     * @param alternativa_A 
     */
    public void setAlternativa_A(String alternativa_A) {
        this.alternativa_A = alternativa_A;
    }
    
    /**
     * 
     * setAlternativa_B
     * 
     * define um valor para a alternativa b
     * 
     * @param alternativa_B 
     */
    public void setAlternativa_B(String alternativa_B) {
        this.alternativa_B = alternativa_B;
    }
    
    /**
     * 
     * setAlternativa_C
     * 
     * define um valor para a alternativa c
     * 
     * @param alternativa_C 
     */
    public void setAlternatica_C(String alternativa_C) {
        this.alternativa_C = alternativa_C;
    }
    
    /**
     * 
     * setAlternativa_D
     * 
     * define um valor para a alternativa d
     * 
     * @param alternativa_D 
     */
    public void setAlternatica_D(String alternativa_D) {
        this.alternativa_D = alternativa_D;
    }
    
    /**
     * 
     * setResposta
     * 
     * define o valor da resposta
     * 
     * @param resposta 
     */
    public void setResposta(char resposta) {
        this.resposta = resposta;
    }
    
    /**
     * 
     * setAlternativaGabarito
     * 
     * define o valor da alternativa correta no gabarito
     * 
     * @param alternativaGabarito 
     */
    public void setAlternativaGabarito(char alternativaGabarito) {
        this.alternativaGabarito = alternativaGabarito;
    }  
    
    /**
     * 
     * getEnunciado
     * 
     * retorna o enunciado da questao
     * 
     * @return 
     */
    public String getEnunciado() {
        return enunciado;
    }
    
    /**
     * 
     * getAlternativa_A
     * 
     * retorna o valor da alternativa a
     * 
     * @return 
     */
    public String getAlternativa_A() {
        return alternativa_A;
    }
    
    /**
     * 
     * getAlternativa_B
     * 
     * retorna o valor da alternativa b
     * 
     * @return 
     */
    public String getAlternatica_B() {
        return alternativa_B;
    }
    
    /**
     * 
     * getAlternativa_C
     * 
     * retorna o valor da alternativa c
     * 
     * @return 
     */ 
    public String getAlternatica_C() {
        return alternativa_C;
    }
    
    /**
     * 
     * getAlternativa_D
     * 
     * retorna o valor da alternativa D
     * 
     * @return 
     */
    public String getAlternatica_D() {
        return alternativa_D;
    }
    
    /**
     * 
     * getRespota
     * 
     * retorna a resposta da questao
     * 
     * @return 
     */
    public char getResposta() {
        return resposta;
    }
    
    /**
     * 
     * getAlternativaGabarito
     * 
     * retorna a alternativa correta do gabarito
     * 
     * @return 
     */
    public char getAlternativaGabarito() {
        return alternativaGabarito;
    }

    
}
