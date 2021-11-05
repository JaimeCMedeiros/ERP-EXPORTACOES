/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expor.dao;

import expor.jdbc.ConnectionFactory;
import expor.objects.Shipper;
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
public class ShipperDAO {
    
    public Connection con;
    
    public ShipperDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    public void addShipper(Shipper obj){
        try {
            String sql = "insert into shipper ( nomeFantasia, localizacao, emailContato)"
                    + "value (?,?,?)";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, obj.getNomeFantasia());
            stm.setString(2,obj.getLocalizacao());
            stm.setString(3, obj.getEmailContato());
            stm.execute();
            stm.close();
            JOptionPane.showMessageDialog(null, "Shipper cadastrado com sucesso ");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar Shipper"+ e);
        }
    }
    
    public void updateShipper(Shipper obj){
        try {
            String sql = "update shipper set nomeFantasia=?, localizacao=?, emailContato=? where idShipper = ?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, obj.getNomeFantasia());
            stm.setString(2, obj.getLocalizacao());
            stm.setString(3, obj.getEmailContato());
            stm.setInt(4, obj.getIdShipper());
            stm.execute();
            stm.close();
            JOptionPane.showMessageDialog(null, "Sucesso ao atualizar o Shipper ");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro ao atualizar o shipper dao " +e);
        }
    }
    public void deleteShipper(Shipper obj){
        try {
            String sql = "delete from shipper where idShipper = ?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1, obj.getIdShipper());
            stm.execute();
            stm.close();
            JOptionPane.showMessageDialog(null, "Sucesso ao deletar o Shipper ");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar Shipper dao "+e);
        }
    }
    public List<Shipper> listShipper(){
        try {
            List<Shipper> list = new ArrayList<>();
            String sql = "select * from shipper";
            PreparedStatement stm = con.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            
            while (rs.next()) {
                Shipper obj = new Shipper();
                
                obj.setIdShipper(rs.getInt("idShipper"));
                obj.setNomeFantasia(rs.getString("nomeFantasia"));
                obj.setLocalizacao(rs.getString("localizacao"));
                obj.setEmailContato(rs.getString("emailContato"));
                
                list.add(obj);
            }
            return list;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar shipper dao");
            return null;
        }
    }
    public List<Shipper> listShipperPerNameFantasia(String nomeFantasia){
        try {
            List<Shipper> list = new ArrayList<>();
            String sql = "select * from shipper where nomeFantasia like ?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, nomeFantasia);
            ResultSet rs = stm.executeQuery();
            
            while (rs.next()) {
                Shipper obj = new Shipper();
                obj.setIdShipper(rs.getInt("idShipper"));
                obj.setNomeFantasia(rs.getString("nomeFantasia"));
                obj.setLocalizacao(rs.getString("localizacao"));
                obj.setEmailContato(rs.getString("emailContato"));
                
                list.add(obj);
            }
            return list;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro ao listar shipper por nome dao "+e);
            return null;
        }
    }
}
