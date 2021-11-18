/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expor.dao;

import expor.jdbc.ConnectionFactory;
import expor.objects.Containers;
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
public class ContainersDAO {
    
    private Connection con;
    
    public ContainersDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    public void addContainers(Containers obj){
        try {
            String sql = "insert into containers (numeroR, tipo, dimensao, capMax)"
                    + "value (?,?,?,?)";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, obj.getNumeroR());
            stm.setString(2, obj.getTipo());
            stm.setString(3, obj.getDimensao());
            stm.setString(4, obj.getCapMax());
            
            stm.execute();
            stm.close();
            
            JOptionPane.showMessageDialog(null,"Sucesso ao cadastrar Container");
                    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error ao cadastrar container"+ e);
        }
    }
    
    public void updateContainers(Containers obj){
        try {
            String sql = "update containers set numeroR=?, tipo=?, dimensao=?, capMax=?"
                    + "where id = ?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, obj.getNumeroR());
            stm.setString(2, obj.getTipo());
            stm.setString(3, obj.getDimensao());
            stm.setString(4, obj.getCapMax());
            stm.setInt(5, obj.getId());
            
            stm.execute();
            stm.close();
            
            JOptionPane.showMessageDialog(null, "Sucesso ao atualiar o container ");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro ao atualiar o container "+e);
        }
    }
    
    public void deleteContainers(Containers obj){
        try {
            String sql = "delete from containers where id = ?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1, obj.getId());
            
            stm.execute();
            stm.close();
            
            JOptionPane.showMessageDialog(null,"Sucesso ao deletar container ");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro ao deletar container"+e);
        }
    }
    public List<Containers> listContainers(){
        try {
            List<Containers> list = new ArrayList<>();
            
            String sql = "select * from containers";
            PreparedStatement stm = con.prepareStatement(sql);
            ResultSet rs= stm.executeQuery();
            
            while (rs.next()) {
                Containers obj = new Containers();
                
                obj.setId(rs.getInt("id"));
                obj.setTipo(rs.getString("tipo"));
                obj.setDimensao(rs.getString("dimensao"));
                obj.setCapMax(rs.getString("capMax"));
                obj.setNumeroR(rs.getString("numeroR")); 
                
                list.add(obj);
            }
            return list;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro ao listar Containers "+e);
            return null;
            
        }
    }
    public List<Containers> listContainersPerNumeroR(String numeroR){
        try {
            List<Containers> list = new ArrayList<>();
            
            String sql = "select * from containers where numeroR like ?";
            
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, numeroR);
            ResultSet rs = stm.executeQuery();
            
            while (rs.next()) {
                Containers obj = new Containers();
                
                obj.setId(rs.getInt("id"));
                obj.setTipo(rs.getString("tipo"));
                obj.setDimensao(rs.getString("dimensao"));
                obj.setCapMax(rs.getString("capMax"));
                obj.setNumeroR(rs.getString("numeroR")); 
                
                list.add(obj);
                
            }
            return list;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error ao listar portos por nome" +e);
            return null;
        }
    }
    public ResultSet ListarContainers(){
            
            try {
                String sql = "select * from containers";
                PreparedStatement stm = con.prepareStatement(sql);
                ResultSet rs = stm.executeQuery();
                return rs;
                 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error no ListarFornece"+e);
            return null;
        }

    }
    public Containers containersIdSearch(int id){
        try {
            
            String sql ="select * from containers where id = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1,id);
            ResultSet rs = stmt.executeQuery();
            Containers  obj = new Containers();
            
            while(rs.next()){
                    obj.setId(rs.getInt("id"));
                    obj.setTipo(rs.getString("tipo"));
            }
            return obj;
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao Buscar nivel de acesso dao :"+e);
                return null;
        }
    }
}
