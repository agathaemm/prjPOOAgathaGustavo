
package fatec.poo.control;

import fatec.poo.model.Candidato;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class DaoCandidato {
    
    private Connection conn;

    /**
     * DaoCandidato
     * 
     * metodo construtor da classe
     * 
     * @param conn 
     */
    public DaoCandidato(Connection conn) {
        this.conn = conn;
    }
    
    /**
     * Inserir
     * 
     * insere os dados na tabela candidato
     * 
     * @param candidato 
     */
    public void Inserir(Candidato candidato) {
        
        PreparedStatement ps = null;
        
        try {
            ps = conn.prepareStatement("insert into tbcandidato(Inscricao, cpf, nome, endereco, telefone, email) values(?,?,?,?,?,?,?)");
            
            //insere os dados nos campos correspondentes
            ps.setString(1, candidato.getInscricao());
            ps.setString(2, candidato.getCpf());
            ps.setString(3, candidato.getNome());
            ps.setString(4, candidato.getEndereco());
            ps.setString(5, candidato.getTelefone());
            ps.setString(6, candidato.getEmail());
            
            //executa a acao
            ps.execute();
            
        }catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
    
    /**
     * Alterar
     * 
     * Altera os dados da tabela candidato 
     * 
     * @param candidato 
     */
    public void Alterar(Candidato candidato) {
        
        PreparedStatement ps = null;
        
        try {
            
            //prepara a declaracao
            ps = conn.prepareStatement("update tbcandidato set cpf = ?, nome = ?, endereco = ?, telefone = ?, email = ?" + "where inscricao = ?");
            
            ps.setString(1, candidato.getCpf());
            ps.setString(2, candidato.getNome());
            ps.setString(3, candidato.getEndereco());
            ps.setString(4, candidato.getTelefone());
            ps.setString(5, candidato.getEmail());
            
            ps.execute();            
            
        }catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
    
    public Candidato Consultar(String inscricao) {
        
        Candidato c = null;
        
        PreparedStatement ps = null;
        
        try {
            ps = conn.prepareStatement("select * from tbcandidato where inscricao = ?");
            
            ps.setString(1, inscricao);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next() == true) {
                c = new Candidato (inscricao, rs.getString("cpf"), rs.getString("nome"), rs.getString("endereco"));
                c.setTelefone(rs.getString("telefone"));
                c.setEmail(rs.getString("email"));
            }
        
        }catch (SQLException e) {
            System.out.println(e.toString());
        }
        
        return(c);       
    }
    
    public void Excluir(Candidato candidato) {
        
        PreparedStatement ps = null;
        
        try {
            ps = conn.prepareStatement("delete from tbcandidato where inscricao = ?");
            
            ps.setString(1, candidato.getInscricao());
            
            ps.execute();
            
        }catch (SQLException e) {
            System.out.println(e.toString());
        }
        
    }
    
}
