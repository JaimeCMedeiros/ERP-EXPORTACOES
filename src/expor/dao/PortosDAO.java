/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expor.dao;

import expor.jdbc.ConnectionFactory;
import expor.objects.Portos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Jaime
 */
public class PortosDAO {
    
    private Connection con;
    
    public PortosDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
     public void addPortos(Portos obj){
        try {
            String sql = "insert into portos (nome, cidade, estado, pais"
                    + ", telefoneComercial, contato)"
                    + "value (?,?,?,?,?,?)";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, obj.getNome());
            stm.setString(2, obj.getCidade());
            stm.setString(3, obj.getEstado());
            stm.setString(4, obj.getPais());
            stm.setString(5, obj.getTelefoneComercial());
            stm.setString(6, obj.getContato());
            
            stm.execute();
            stm.close();
            
            JOptionPane.showMessageDialog(null,"Sucesso ao cadastrar Container");
                    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error ao cadastrar container"+ e);
        }
    }
    
    public void updatePortos(Portos obj){
        try {
            String sql = "update portos set nome=?, cidade=?, estado=?, pais=?,"
                    + "telefoneComercial=?, contato=? where idPortos = ?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, obj.getNome());
            stm.setString(2, obj.getCidade());
            stm.setString(3, obj.getEstado());
            stm.setString(4, obj.getPais());
            stm.setString(5, obj.getTelefoneComercial());
            stm.setString(6, obj.getContato());
            stm.setInt(7, obj.getIdPortos());
            
            stm.execute();
            stm.close();
            
            JOptionPane.showMessageDialog(null, "Sucesso ao atualiar o container ");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro ao atualiar o container dao "+e);
        }
    }
    
    public void deletePortos(Portos obj){
        try {
            String sql = "delete from portos where idPortos = ?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1, obj.getIdPortos());
            
            stm.execute();
            stm.close();
            
            JOptionPane.showMessageDialog(null,"Sucesso ao deletar porto ");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro ao deletar porto dao "+e);
        }
    }
    public List<Portos> listPortos(){
        try {
            List<Portos> list = new ArrayList<>();
            
            String sql = "select * from portos";
            PreparedStatement stm = con.prepareStatement(sql);
            ResultSet rs= stm.executeQuery();
            
            while (rs.next()) {
                Portos obj = new Portos();
                
                obj.setIdPortos(rs.getInt("idPortos"));
                obj.setNome(rs.getString("nome"));
                obj.setCidade(rs.getString("cidade"));
                obj.setEstado(rs.getString("estado"));
                obj.setPais(rs.getString("pais")); 
                obj.setTelefoneComercial(rs.getString("telefoneComercial")); 
                obj.setContato(rs.getString("contato")); 
                
                list.add(obj);
            }
            return list;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro ao listar Containers "+e);
            return null;
            
        }
    }
    public List<Portos> listPortosPerName(String nome){
        try {
            List<Portos> list = new ArrayList<>();
            
            String sql = "select * from portos where nome like ?";
            
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, nome);
            ResultSet rs = stm.executeQuery();
            
            while (rs.next()) {
                Portos obj = new Portos();
                
                obj.setIdPortos(rs.getInt("idPortos"));
                obj.setNome(rs.getString("nome"));
                obj.setCidade(rs.getString("cidade"));
                obj.setEstado(rs.getString("estado"));
                obj.setPais(rs.getString("pais")); 
                obj.setTelefoneComercial(rs.getString("telefoneComercial")); 
                obj.setContato(rs.getString("contato")); 
                
                list.add(obj);
                
            }
            return list;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error ao listar portos por nome dao" +e);
            return null;
        }
    }
    
    public ResultSet ListarPortos(){
            
            try {
                String sql = "select * from portos";
                PreparedStatement stm = con.prepareStatement(sql);
                ResultSet rs = stm.executeQuery();
                return rs;
                 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error no Listar Portos"+e);
            return null;
        }

    }
    
    public ResultSet ListarP(){
            
            try {
                String sql = "select * from portos";
                PreparedStatement stm = con.prepareStatement(sql);
                ResultSet rs = stm.executeQuery();
                return rs;
                 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error no Listar portos "+e);
            return null;
        }

    }
    
    public Portos portosIdSearch(int id){
        try {
            
            String sql ="select * from portos where idPortos = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1,id);
            ResultSet rs = stmt.executeQuery();
            Portos  obj = new Portos();
            
            while(rs.next()){
                    obj.setIdPortos(rs.getInt("idPortos"));
                    obj.setNome(rs.getString("nome"));
            }
            return obj;
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao buscar portos dao :"+e);
                return null;
        }
    }
}
