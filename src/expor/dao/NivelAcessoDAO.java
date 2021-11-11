/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expor.dao;

import expor.jdbc.ConnectionFactory;
import expor.objects.NivelAcesso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Jaime
 */
public class NivelAcessoDAO {
    
   public Connection con;
   
   public NivelAcessoDAO(){
       this.con = new ConnectionFactory().getConnection();
   }
   
   public void adicionarNivelAcesso(NivelAcesso obj){
       
        try {
            String sql = "insert into clienteJuridico (nome) value (?)";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1,obj.getTipoNivelAcesso());
            
            
            stm.execute();
            stm.close();
            
            JOptionPane.showMessageDialog(null, "Sucesso ao cadastar NivelAcesso");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error ao cadastar NivelAcesso"+ e);
        }  
   }
    
   public ResultSet ListarNivelAcesso(){
            
            try {
                String sql = "select * from niveldeacesso";
                PreparedStatement stm = con.prepareStatement(sql);
                ResultSet rs = stm.executeQuery();
                return rs;
                 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error no Listar Niveis de Acesso "+e);
            return null;
        }

    }
    public NivelAcesso nivelAcessoIdSearch(int id){
        try {
            
            String sql ="select * from niveldeacesso where id = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1,id);
            ResultSet rs = stmt.executeQuery();
            NivelAcesso  obj = new NivelAcesso();
            
            while(rs.next()){
                    obj.setIdNivelAcesso(rs.getInt("id"));
                    obj.setTipoNivelAcesso(rs.getString("nome"));
            }
            return obj;
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao Buscar nivel de acesso dao :"+e);
                return null;
        }
    }
   
    
   
}
