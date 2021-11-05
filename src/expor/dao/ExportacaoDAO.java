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
            String sql = "insert into exportacao (clienteJuridicooo, data, manufacturerName, "
                    + "manufacturerTown, manufacturerIndustrialZone, manufacturerState, "
                    + "manufacturerCountry,shipper,portoDeOrigem,portoDeDestino,"
                    + "inconterms,container,itemDescricao,pesoLiquido,NCM,freight,distanciaKM,valor) "
                    + "value (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1,obj.getClienteJuridicooo());
            stm.setString(2,obj.getData());
            stm.setString(3,obj.getManufacturerName());
            stm.setString(4,obj.getManufacturerTown());
            stm.setString(5,obj.getManufacturerIndustrialZone());
            stm.setString(6,obj.getManufacturerState());
            stm.setString(7,obj.getManufacturerCountry());
            stm.setInt(8,obj.getShipper());
            stm.setInt(9,obj.getPortoDeOrigem());
            stm.setInt(10,obj.getPortoDeDestino());
            stm.setString(11,obj.getInconterms());
            stm.setInt(12,obj.getContainer());
            stm.setString(13, obj.getItemDescricao());
            stm.setInt(14,obj.getPesoLiquido());
            stm.setString(15, obj.getNCM());
            stm.setString(16, obj.getFreight());
            stm.setInt(17, obj.getDistanciaKM());
            stm.setDouble(18, obj.getValor());
            //stm.setInt(1, obj.getPoNumber());
            //stm.setInt(2, obj.getClienteJuridico().getIdCliJuridico());
            stm.execute();
            stm.close();
            
            JOptionPane.showMessageDialog(null, "Cadastrado realizado com sucesso");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error ao cadastrar:" + " " +e);
        }
    }
    
    public void updateClienteJuridico(Exportacao obj){
        try {
          String sql = "insert into exportacao (clienteJuridicooo =?, data =?, manufacturerName =?, "
                    + "manufacturerTown =?, manufacturerIndustrialZone =?, manufacturerState =?, "
                    + "manufacturerCountry =?,shipper =?,portoDeOrigem =?,portoDeDestino =?,"
                    + "inconterms =?,container =?,itemDescricao =?,pesoLiquido =?,NCM =?,freight =?,"
                  + "distanciaKM =?,valor=? where poNumber = ?) ";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1,obj.getClienteJuridicooo());
            stm.setString(2,obj.getData());
            stm.setString(3,obj.getManufacturerName());
            stm.setString(4,obj.getManufacturerTown());
            stm.setString(5,obj.getManufacturerIndustrialZone());
            stm.setString(6,obj.getManufacturerState());
            stm.setString(7,obj.getManufacturerCountry());
            stm.setInt(8,obj.getShipper());
            stm.setInt(9,obj.getPortoDeOrigem());
            stm.setInt(10,obj.getPortoDeDestino());
            stm.setString(11,obj.getInconterms());
            stm.setInt(12,obj.getContainer());
            stm.setString(13, obj.getItemDescricao());
            stm.setInt(14,obj.getPesoLiquido());
            stm.setString(15, obj.getNCM());
            stm.setString(16, obj.getFreight());
            stm.setInt(17, obj.getDistanciaKM());
            stm.setDouble(18, obj.getValor());
            stm.setInt(19, obj.getPoNumber());
            
            stm.execute();
            stm.close();
            
            JOptionPane.showMessageDialog(null, "Sucesso ao atualizar exportacao");
            
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error ao atualizar exportacao dao "+ e);
        }
    }
    
    
     public void deleteExportacao(Exportacao obj){
        try {
            String sql = "delete from exportacao where poNumber =?";
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
                
                obj.setPoNumber(rs.getInt(""));
                obj.setClienteJuridicooo(rs.getInt("clienteJuridico"));
                obj.setData(rs.getString("data"));
                obj.setManufacturerName(rs.getString("manufacturerName"));
                obj.setManufacturerTown(rs.getString("manufacturerTown"));
                obj.setManufacturerIndustrialZone(rs.getString("manufacturerIndustrialZone"));
                obj.setManufacturerState(rs.getString("manufacturerState"));
                obj.setManufacturerCountry(rs.getString("manufacturerCountry"));
                obj.setShipper(rs.getInt("shipper"));
                obj.setPortoDeOrigem(rs.getInt("portoDeOrigem"));
                obj.setPortoDeDestino(rs.getInt("portoDeDestinho"));
                obj.setInconterms(rs.getString("inconterms"));
                obj.setContainer(rs.getInt("container"));
                obj.setItemDescricao(rs.getString("itemDescricao")); // obj.setPoNumber(rs.getInt(""));
                obj.setPesoLiquido(rs.getInt("pesoLiquido"));
                obj.setNCM(rs.getString("ncm"));
                obj.setFreight(rs.getString("freight"));
                obj.setDistanciaKM(rs.getInt("distanciaKM"));
                obj.setValor(rs.getDouble("valor"));
                list.add(obj);
                
            }   
            return list;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error ao listar exportacao dao "+e);
            return null;
        }
    }
     public List<Exportacao> listClienteJuridicoPerName(String ncm){
        try {
            List<Exportacao> list = new ArrayList<>();
            
            String sql = "select * from exportacao where ncm like ?";
            
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, ncm);
            ResultSet rs = stm.executeQuery();
            
            while(rs.next()){
                Exportacao obj = new Exportacao();
                
                obj.setPoNumber(rs.getInt(""));
                obj.setClienteJuridicooo(rs.getInt("clienteJuridico"));
                obj.setData(rs.getString("data"));
                obj.setManufacturerName(rs.getString("manufacturerName"));
                obj.setManufacturerTown(rs.getString("manufacturerTown"));
                obj.setManufacturerIndustrialZone(rs.getString("manufacturerIndustrialZone"));
                obj.setManufacturerState(rs.getString("manufacturerState"));
                obj.setManufacturerCountry(rs.getString("manufacturerCountry"));
                obj.setShipper(rs.getInt("shipper"));
                obj.setPortoDeOrigem(rs.getInt("portoDeOrigem"));
                obj.setPortoDeDestino(rs.getInt("portoDeDestinho"));
                obj.setInconterms(rs.getString("inconterms"));
                obj.setContainer(rs.getInt("container"));
                obj.setItemDescricao(rs.getString("itemDescricao")); // obj.setPoNumber(rs.getInt(""));
                obj.setPesoLiquido(rs.getInt("pesoLiquido"));
                obj.setNCM(rs.getString("ncm"));
                obj.setFreight(rs.getString("freight"));
                obj.setDistanciaKM(rs.getInt("distanciaKM"));
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
