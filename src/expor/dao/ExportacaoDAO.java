/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expor.dao;

import expor.jdbc.ConnectionFactory;
import expor.objects.Exportacao;
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
public class ExportacaoDAO {
    public Connection con;
    
    public ExportacaoDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    public void addExportacao(Exportacao obj){
        try {
            String sql = "insert into exportacao (clientejuridico, dataa, manufacturername, "
                    + "manufacturertown, manufacturerindustrialZone,"
                    + "manufacturercountry,shipper,portodeorigem,portodedestino,"
                    + "inconterms,container,itemdescricao,pesoliquido,ncm,freight,distanciakm,valor) "
                    + "value (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1,obj.getClienteJuridico().getIdCliJuridico());
            stm.setString(2,obj.getData());
            stm.setString(3,obj.getManufacturerName());
            stm.setString(4,obj.getManufacturerTown());
            stm.setString(5,obj.getManufacturerIndustrialZone());
            stm.setString(6,obj.getManufacturerCountry());
            stm.setInt(7,obj.getShipper().getIdShipper());
            stm.setInt(8,obj.getPortoDeOrigem().getIdPortos());
            stm.setInt(9,obj.getPortoDeDestino().getIdPortos());
            stm.setString(10,obj.getInconterms());
            stm.setInt(11,obj.getContainer().getId());
            stm.setString(12, obj.getItemDescricao());
            stm.setInt(13,obj.getPesoLiquido());
            stm.setString(14, obj.getNCM());
            stm.setString(15, obj.getFreight());
            stm.setInt(16, obj.getDistanciaKM());
            stm.setDouble(17, obj.getValor());
            stm.execute();
            stm.close();
            
            JOptionPane.showMessageDialog(null, "Cadastrado realizado com sucesso");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error ao cadastrar:" + " " +e);
        }
    }
    
    public void updateExportacao(Exportacao obj){
        try {
          String sql = "update exportacao set clientejuridico=?, dataa=?, manufacturername=?, "
                    + "manufacturertown=?, manufacturerindustrialzone=?, "
                    + "manufacturercountry=?,shipper=?,portodeorigem=?,portodedestino=?,"
                    + "inconterms=?,container=?,itemdescricao=?,pesoliquido=?,ncm=?,freight=?,"
                  + "distanciakm=?,valor=? where ponumber=? ";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1,obj.getClienteJuridico().getIdCliJuridico());
            stm.setString(2,obj.getData());
            stm.setString(3,obj.getManufacturerName());
            stm.setString(4,obj.getManufacturerTown());
            stm.setString(5,obj.getManufacturerIndustrialZone());
            stm.setString(6,obj.getManufacturerCountry());
            stm.setInt(7,obj.getShipper().getIdShipper());
            stm.setInt(8,obj.getPortoDeOrigem().getIdPortos());
            stm.setInt(9,obj.getPortoDeDestino().getIdPortos());
            stm.setString(10,obj.getInconterms());
            stm.setInt(11,obj.getContainer().getId());
            stm.setString(12, obj.getItemDescricao());
            stm.setInt(13,obj.getPesoLiquido());
            stm.setString(14, obj.getNCM());
            stm.setString(15, obj.getFreight());
            stm.setInt(16, obj.getDistanciaKM());
            stm.setDouble(17, obj.getValor());
            stm.setInt(18, obj.getPoNumber());
            
            stm.execute();
            stm.close();
            
            JOptionPane.showMessageDialog(null, "Sucesso ao atualizar exportacao");
            
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error ao atualizar exportacao dao "+ e);
        }
    }
    
    
     public void deleteExportacao(Exportacao obj){
        try {
            String sql = "delete from exportacao where ponumber =?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1,obj.getPoNumber());
            
            stm.execute();
            stm.close();
            
            JOptionPane.showMessageDialog(null,"Sucesso ao excluir exportacao ");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error ao excluir esportacao dao "+e);
        }
    }
     
     public List<Exportacao> listExportacao(){
        try {
            List<Exportacao> list = new ArrayList<>();
            
            String sql = "select * from exportacao";
            
            PreparedStatement stm = con.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            
            while(rs.next()){
                Exportacao obj = new Exportacao();
                
                obj.setPoNumber(rs.getInt("ponumber"));
                obj.setClienteJuridico2(rs.getInt("clientejuridico"));
                obj.setData(rs.getString("dataa"));
                obj.setManufacturerName(rs.getString("manufacturername"));
                obj.setManufacturerTown(rs.getString("manufacturertown"));
                obj.setManufacturerIndustrialZone(rs.getString("manufacturerindustrialzone"));    
                obj.setManufacturerCountry(rs.getString("manufacturercountry"));
                obj.setShipper(rs.getInt("shipper"));
                obj.setPortoDeOrigem2(rs.getInt("portodeorigem"));
                obj.setPortoDeDestino2(rs.getInt("portodedestino"));
                obj.setInconterms(rs.getString("inconterms"));
                obj.setContainer2(rs.getInt("container"));
                obj.setItemDescricao(rs.getString("itemdescricao")); // obj.setPoNumber(rs.getInt(""));
                obj.setPesoLiquido(rs.getInt("pesoliquido"));
                obj.setNCM(rs.getString("ncm"));
                obj.setFreight(rs.getString("freight"));
                obj.setDistanciaKM(rs.getInt("distanciakm"));
                obj.setValor(rs.getDouble("valor"));
                list.add(obj);
                
            }   
            return list;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error ao listar exportacao dao "+e);
            return null;
        }
    }
     public List<Exportacao> listExportacaoPerNCM(String ncm){
        try {
            List<Exportacao> list = new ArrayList<>();
            
            String sql = "select * from exportacao where ncm like ?";
            
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, ncm);
            ResultSet rs = stm.executeQuery();
            
            while(rs.next()){
                Exportacao obj = new Exportacao();
                
                obj.setPoNumber(rs.getInt("ponumber"));
                obj.setClienteJuridico2(rs.getInt("clientejuridico"));
                obj.setData(rs.getString("dataa"));
                obj.setManufacturerName(rs.getString("manufacturername"));
                obj.setManufacturerTown(rs.getString("manufacturertown"));
                obj.setManufacturerIndustrialZone(rs.getString("manufacturerindustrialzone"));
                obj.setManufacturerCountry(rs.getString("manufacturercountry"));
                obj.setShipper(rs.getInt("shipper"));
                obj.setPortoDeOrigem2(rs.getInt("portodeorigem"));
                obj.setPortoDeDestino2(rs.getInt("portodedestinho"));
                obj.setInconterms(rs.getString("inconterms"));
                obj.setContainer2(rs.getInt("container"));
                obj.setItemDescricao(rs.getString("itemdescricao")); // obj.setPoNumber(rs.getInt(""));
                obj.setPesoLiquido(rs.getInt("pesoliquido"));
                obj.setNCM(rs.getString("ncm"));
                obj.setFreight(rs.getString("freight"));
                obj.setDistanciaKM(rs.getInt("distanciakm"));
                obj.setValor(rs.getDouble("valor"));
                
                list.add(obj);
                
            }   
            return list;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error ao listar Cliente "+e);
            return null;
        }
    }
}
