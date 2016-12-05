

package fatec.poo.control;

import fatec.poo.model.Fiscal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoFiscal {
    
    private Connection conn;
    private Fiscal c;

    /**
     * DaoFiscal
     * 
     * metodo construtor da classe
     * 
     * @param conn 
     */
    public DaoFiscal(Connection conn) {
        this.conn = conn;
    }
    
    /**
     * Inserir
     * 
     * insere os dados na tabela candidato
     * 
     * @param fiscal 
     */
    public void Inserir(Fiscal fiscal) {
        
        PreparedStatement ps = null;
        
        try {
            ps = conn.prepareStatement("insert into tbfiscal(codigo, cpf, nome, endereco, telefone, email, local) values(?,?,?,?,?,?,?)");
            
            //insere os dados nos campos correspondentes
            ps.setString(1, fiscal.getCodigo());
            ps.setString(2, fiscal.getCpf());
            ps.setString(3, fiscal.getNome());
            ps.setString(4, fiscal.getEndereco());
            ps.setString(5, fiscal.getTelefone());
            ps.setString(6, fiscal.getEmail());
            ps.setString(7, fiscal.getLocal());
            
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
    public void Alterar(Fiscal fiscal) {
        
        PreparedStatement ps = null;
        
        try {
            
            //prepara a declaracao
            ps = conn.prepareStatement("update tbfiscal set cpf = ?, nome = ?, endereco = ?, telefone = ?, email = ?, local = ? where codigo = ?");
            
            ps.setString(1, fiscal.getCpf());
            ps.setString(2, fiscal.getNome());
            ps.setString(3, fiscal.getEndereco());
            ps.setString(4, fiscal.getTelefone());
            ps.setString(5, fiscal.getEmail());
            ps.setString(6, fiscal.getLocal());            
            ps.setString(7, fiscal.getCodigo());

            
            ps.execute();            
            
        }catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
    
    public Fiscal Consultar(String codigo) {
        
        Fiscal f = null;
        
        PreparedStatement ps = null;
        
        try {
            ps = conn.prepareStatement("select * from tbfiscal where codigo = ?");
            
            ps.setString(1, codigo);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next() == true) {
                f = new Fiscal (codigo, rs.getString("cpf"), rs.getString("nome"), rs.getString("endereco"));
                f.setTelefone(rs.getString("telefone"));
                f.setEmail(rs.getString("email"));
                f.setLocal(rs.getString("local"));
            }
        
        }catch (SQLException e) {
            System.out.println(e.toString());
        }
        
        return f;       
    }
    
    public void Excluir(Fiscal fiscal) {
        
        PreparedStatement ps = null;
        
        try {
            ps = conn.prepareStatement("delete from tbfiscal where codigo = ?");
            
            ps.setString(1, fiscal.getCodigo());
            
            ps.execute();
            
        }catch (SQLException e) {
            System.out.println(e.toString());
        }    
    }   
}
