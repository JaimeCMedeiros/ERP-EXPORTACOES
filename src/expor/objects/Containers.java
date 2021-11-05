/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expor.objects;

/** alugar um container que pode ser de um dos portos navios cadastrado.
 *  vai ter cargaMax, numeroContainer, peso, altura, largura, comprimento.
 * @author Jaime
 */
public class Containers {
    
    private int id;
    private String numeroR;
    private String tipo;
    private String dimensao;
    private String capMax;
    

    public String getNumeroR() {
        return numeroR;
    }

    public void setNumeroR(String numeroR) {
        this.numeroR = numeroR;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDimensao() {
        return dimensao;
    }

    public void setDimensao(String dimensao) {
        this.dimensao = dimensao;
    }

    public String getCapMax() {
        return capMax;
    }

    public void setCapMax(String capMax) {
        this.capMax = capMax;
    }
    
    
    
}
