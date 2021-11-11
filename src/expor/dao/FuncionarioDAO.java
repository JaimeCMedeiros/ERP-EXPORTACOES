/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expor.dao;

import expor.jdbc.ConnectionFactory;
import expor.objects.Funcionario;
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
public class FuncionarioDAO {
    
        private Connection con;
    
    public FuncionarioDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    public void adicionarFuncionario(Funcionario obj){
        try {
            String sql = "insert into funcionario (nome, cpf, rg, idade, sexo, uf, "
                    + "cidade, bairro, complemento, endereco, numero, nivelAcesso, login, senha) "
                    + "value (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stm = con.prepareStatement(sql);
           
            stm.setString(1, obj.getNome());
            stm.setString(2, obj.getCpf());
            stm.setString(3, obj.getRg());
            stm.setString(4, obj.getIdade());
            stm.setString(5, obj.getSexo());
            stm.setString(6, obj.getUf());
            stm.setString(7, obj.getCidade());
            stm.setString(8, obj.getBairro());
            stm.setString(9, obj.getComplemento());
            stm.setString(10,obj.getEndereco());
            stm.setString(11, obj.getNumero());
            stm.setInt(12, obj.getNivelAcesso().getIdNivelAcesso());
            stm.setString(13, obj.getLogin());
            stm.setString(14, obj.getSenha());
            
            stm.execute();
            stm.close();
            
            JOptionPane.showMessageDialog(null, "Cadastrado de funcionario realizado com sucesso");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error ao cadastrar funcionario :" + " " +e);
        }
    }
    
    public void updateFuncionario(Funcionario obj){
        try {
            String sql = "update funcionario set nome=?, cpf=?, rg=?, idade=?, sexo=?, uf=?, "
                    + "cidade=?, bairro=?, complemento=?, endereco=?, numero=?, nivelAcesso=?, login=?, senha=? where idFuncionario =? ";
            
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, obj.getNome());
            stm.setString(2, obj.getCpf());
            stm.setString(3, obj.getRg());
            stm.setString(4, obj.getIdade());
            stm.setString(5, obj.getSexo());
            stm.setString(6, obj.getUf());
            stm.setString(7, obj.getCidade());
            stm.setString(8, obj.getBairro());
            stm.setString(9, obj.getComplemento());
            stm.setString(10,obj.getEndereco());
            stm.setString(11, obj.getNumero());
            stm.setInt(12, obj.getNivelAcesso().getIdNivelAcesso());
            //stm.setString(12, obj.getNivelAcesso());
            stm.setString(13, obj.getLogin());
            stm.setString(14, obj.getSenha());
            stm.setInt(15, obj.getIdFuncionario());
            
            stm.execute();
            stm.close();
            
            JOptionPane.showMessageDialog(null, "Cadastrado alterado com sucesso");
                    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar cadastro:"+" "+e);
        }
    }
    
    public void deleteFuncionario(Funcionario obj){
        try {
            String sql ="delete from funcionario where id=?";
            
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1,obj.getIdFuncionario());
            
            stm.execute();
            stm.close();
            
            JOptionPane.showMessageDialog(null, "Cadastrado do Funcionario excluido com sucesso");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir cadastro de Funcionario: "+" "+e);
        }
    }
    
    public List<Funcionario> listarFuncionario(){
            try {
                List<Funcionario> lista = new ArrayList<>();
                
                String sql = "select * from funcionario";
                
                PreparedStatement stm = con.prepareStatement(sql);
                ResultSet rs = stm.executeQuery();
                
                while (rs.next()){
                    Funcionario obj = new Funcionario();
                    
                    obj.setIdFuncionario(rs.getInt("idFuncionario"));
                    obj.setNome(rs.getString("nome"));
                    obj.setCpf(rs.getString("cpf"));
                    obj.setRg(rs.getString("rg"));
                    obj.setIdade(rs.getString("idade"));
                    obj.setSexo(rs.getString("sexo"));
                    obj.setUf(rs.getString("uf"));
                    obj.setCidade(rs.getString("cidade"));
                    obj.setBairro(rs.getString("bairro"));
                    obj.setComplemento(rs.getString("complemento"));
                    obj.setEndereco(rs.getString("endereco"));
                    obj.setNumero(rs.getString("numero"));
                    obj.setNivelAceso(rs.getString("nivelAcesso"));
                    obj.setLogin(rs.getString("login"));
                    obj.setSenha(rs.getString("senha"));
                    lista.add(obj);
                }
                return lista;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao Listar funcionario :"+" "+e);
                return null;
            }
}
    public List<Funcionario> buscarFuncionarioPorNome(String nome){
        try {
            List<Funcionario> lista = new ArrayList();
            
            String sql ="select * from funcionario where nome like ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,nome);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Funcionario obj = new Funcionario();
                
                    obj.setIdFuncionario(rs.getInt("idFuncionario"));
                    obj.setNome(rs.getString("nome"));
                    obj.setCpf(rs.getString("cpf"));
                    obj.setRg(rs.getString("rg"));
                    obj.setIdade(rs.getString("idade"));
                    obj.setSexo(rs.getString("sexo"));
                    obj.setUf(rs.getString("uf"));
                    obj.setCidade(rs.getString("cidade"));
                    obj.setBairro(rs.getString("bairro"));
                    obj.setComplemento(rs.getString("complemento"));
                    obj.setEndereco(rs.getString("endereco"));
                    obj.setNumero(rs.getString("numero"));
                    obj.setNivelAceso(rs.getString("nivelAcesso"));
                    obj.setLogin(rs.getString("login"));
                    obj.setSenha(rs.getString("senha"));
                    
                    lista.add(obj);           
            }
            return lista;
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao Buscar Funcionario:"+" "+e);
                return null;
        }
    }
    
    public Funcionario buscarFuncionarioPerCpf(String cpf){
        try {
            //List<Funcionario> lista = new ArrayList();
            
            String sql ="select * from funcionario where cpf like ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,cpf);
            ResultSet rs = stmt.executeQuery();
            Funcionario obj = new Funcionario();
            if(rs.next()){
                
                    obj.setIdFuncionario(rs.getInt("idFuncionario"));
                    obj.setNome(rs.getString("nome"));
                    obj.setCpf(rs.getString("cpf"));
                    obj.setRg(rs.getString("rg"));
                    obj.setIdade(rs.getString("idade"));
                    obj.setSexo(rs.getString("sexo"));
                    obj.setUf(rs.getString("uf"));
                    obj.setCidade(rs.getString("cidade"));
                    obj.setBairro(rs.getString("bairro"));
                    obj.setComplemento(rs.getString("complemento"));
                    obj.setEndereco(rs.getString("endereco"));
                    obj.setNumero(rs.getString("numero"));
                    obj.setNivelAceso(rs.getString("nivelAcesso"));
                    obj.setLogin(rs.getString("login"));
                    obj.setSenha(rs.getString("senha"));
                                 
            }
            return obj;
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao Buscar Funcionario:"+" "+e);
                return null;
        }
    }
    
}
