/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expor.objects;

import expor.dao.NivelAcessoDAO;

/**
 *Funcionario relação com nivelacesso (funcionario.nivelacesso <-> niveldeacesso.tiponivelacesso )
 * @author Jaime
 */
public class Funcionario {
    
    private int idFuncionario;
    private String nome;
    private String cpf;
    private String rg;
    private String idade;
    private String sexo;
    private String uf;
    private String cidade;
    private String bairro;
    private String complemento;
    private String endereco;
    private String numero;
    private NivelAcesso NivelAcesso;
    private String nivelAceso;
    private String login;
    private String senha;

    
    public Funcionario(){
        
    }
    public Funcionario(int id, String login, String senha, NivelAcesso nivelAcesso, String nome, String rg, String cpf, String endereco, String cep, String cidade, String uf, String numero, String bairro){
        super();
        this.idFuncionario = id;
        this.login = login;
        this.senha = senha;
        this.NivelAcesso = NivelAcesso;
        this.nome = nome;
        this.rg = rg;
        this.cpf= cpf;
        this.cidade = cidade;
        this.uf = uf;
        this.numero = numero;
        this.bairro = bairro;
    }
    
    public NivelAcessoDAO ndao = new NivelAcessoDAO();

    public String getNivelAceso() {
        return nivelAceso;
    }

    public void setNivelAceso(String nivelAceso) {
        this.nivelAceso = nivelAceso;
    }
    
    
    
    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    
    
    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public NivelAcesso getNivelAcesso() {
        return NivelAcesso;
    }

    public void setNivelAcesso(int id) {
        NivelAcesso obj = ndao.nivelAcessoIdSearch(id);
        this.NivelAcesso = obj;
    }



    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
}
