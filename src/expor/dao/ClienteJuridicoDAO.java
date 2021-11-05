/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expor.dao;

import expor.jdbc.ConnectionFactory;
import expor.objects.ClienteJuridico;
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
public class ClienteJuridicoDAO {
    
    private Connection con;
    
    public ClienteJuridicoDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    public void addClienteJuridico(ClienteJuridico obj){
        try {
            String sql = "insert into clientesjuridico ( nome, cnpj, ie, contato, "
                    + "cargoContato, emailContato, idade, uf, "
                    + "cidade, bairro, complemento, endereco, numero)"
                    + "value (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1,obj.getNome());
            stm.setString(2,obj.getCnpj());
            stm.setString(3,obj.getIe());
            stm.setString(4,obj.getContato());
            stm.setString(5,obj.getCargoContato());
            stm.setString(6,obj.getEmailContato());
            stm.setString(7,obj.getIdade());
            stm.setString(8,obj.getUf());
            stm.setString(9,obj.getCidade());
            stm.setString(10,obj.getBairro());
            stm.setString(11,obj.getComplemento());
            stm.setString(12,obj.getEndereco());
            stm.setString(13,obj.getNumero());
            
            stm.execute();
            stm.close();
            
            JOptionPane.showMessageDialog(null, "Sucesso ao cadastar Cliente dao");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error ao cadastar cliente dao"+ e);
        }
    }
    
    public void updateClienteJuridico(ClienteJuridico obj){
        try {
            String sql = "update clientesjuridico set nome=?, cnpj=?, ie=?, contato=?,"
                    + "emailContato=?, idade=?, uf=?, cidade=?, bairro=?, complemento=?,"
                    + "endereco=?, numero=? where id=?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1,obj.getNome());
            stm.setString(2,obj.getCnpj());
            stm.setString(3,obj.getIe());
            stm.setString(4,obj.getContato());
            stm.setString(5,obj.getCargoContato());
            stm.setString(6,obj.getEmailContato());
            stm.setString(7,obj.getIdade());
            stm.setString(8,obj.getUf());
            stm.setString(9,obj.getCidade());
            stm.setString(10,obj.getBairro());
            stm.setString(11,obj.getComplemento());
            stm.setString(12,obj.getEndereco());
            stm.setString(13,obj.getNumero());
            stm.setInt(14, obj.getIdCliJuridico());
            
            stm.execute();
            stm.close();
            
            JOptionPane.showMessageDialog(null, "Sucesso ao atualizar cliente dao");
            
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error ao atualizar cliente dao"+ e);
        }
    }
    
    public void deleteClienteJuridico(ClienteJuridico obj){
        try {
            String sql = "delete from clientesjuridico where id =?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1,obj.getIdCliJuridico());
            
            stm.execute();
            stm.close();
            
            JOptionPane.showMessageDialog(null,"Sucesso ao excluir clientes dao ");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error ao excluir cliente dao "+e);
        }
    }
    
    public List<ClienteJuridico> listClienteJuridico(){
        try {
            List<ClienteJuridico> list = new ArrayList<>();
            
            String sql = "select * from clientesjuridico";
            
            PreparedStatement stm = con.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            
            while(rs.next()){
                ClienteJuridico obj = new ClienteJuridico();
                
                obj.setIdCliJuridico(rs.getInt("idClienteJuridico"));
                obj.setNome(rs.getString("nome"));
                obj.setCnpj(rs.getString("cnpj"));
                obj.setIe(rs.getString("ie"));
                obj.setContato(rs.getString("contato"));
                obj.setCargoContato(rs.getString("cargoContato"));
                obj.setEmailContato(rs.getString("emailContato"));
                obj.setIdade(rs.getString("idade"));
                obj.setUf(rs.getString("uf"));
                obj.setCidade(rs.getString("cidade"));
                obj.setBairro(rs.getString("bairro"));
                obj.setComplemento(rs.getString("complemento"));
                obj.setEndereco(rs.getString("endereco"));
                obj.setNumero(rs.getString("numero"));
                
                list.add(obj);
                
            }   
            return list;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error ao listar Cliente "+e);
            return null;
        }
    }
    
    public List<ClienteJuridico> listClienteJuridicoPerName(String nome){
        try {
            List<ClienteJuridico> list = new ArrayList<>();
            
            String sql = "select * from clientesjuridico where nome like ?";
            
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, nome);
            ResultSet rs = stm.executeQuery();
            
            while(rs.next()){
                ClienteJuridico obj = new ClienteJuridico();
                
                obj.setIdCliJuridico(rs.getInt("idClienteJuridico"));
                obj.setNome(rs.getString("nome"));
                obj.setCnpj(rs.getString("cnpj"));
                obj.setIe(rs.getString("ie"));
                obj.setContato(rs.getString("contato"));
                obj.setCargoContato(rs.getString("cargoContato"));
                obj.setEmailContato(rs.getString("emailContato"));
                obj.setIdade(rs.getString("idade"));
                obj.setUf(rs.getString("uf"));
                obj.setCidade(rs.getString("cidade"));
                obj.setBairro(rs.getString("bairro"));
                obj.setComplemento(rs.getString("complemento"));
                obj.setEndereco(rs.getString("endereco"));
                obj.setNumero(rs.getString("numero"));
                
                list.add(obj);
                
            }   
            return list;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error ao listar Cliente "+e);
            return null;
        }
    }
    
    public ClienteJuridico listClienteJuridicoPerCnpj(String cnpj){
        try {
            
            
            String sql = "select * from clientesjuridico where cnpj like ?";
            
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, cnpj);
            ResultSet rs = stm.executeQuery();
            ClienteJuridico obj = new ClienteJuridico();
            if(rs.next()){
                
                obj.setIdCliJuridico(rs.getInt("idClienteJuridico"));
                obj.setNome(rs.getString("nome"));
                obj.setCnpj(rs.getString("cnpj"));
                obj.setIe(rs.getString("ie"));
                obj.setContato(rs.getString("contato"));
                obj.setCargoContato(rs.getString("cargoContato"));
                obj.setEmailContato(rs.getString("emailContato"));
                obj.setIdade(rs.getString("idade"));
                obj.setUf(rs.getString("uf"));
                obj.setCidade(rs.getString("cidade"));
                obj.setBairro(rs.getString("bairro"));
                obj.setComplemento(rs.getString("complemento"));
                obj.setEndereco(rs.getString("endereco"));
                obj.setNumero(rs.getString("numero"));
                
            }   
            return obj;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error ao listar Cliente "+e);
            return null;
        }
    }
}
