/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expor.objects;

/** -data
 * po number(product order)
 *  -poNumber
 * shipper/exporter(ligacao)
 *  -NomeFantasia
 *  -Localizacao
 *  -emailContato
 *  -porto
 * Manutacturer
 *  -ManufacturerNome
 *  -ManufacturerTown
 *  -ManufacturerIndustrialZone         Modo +- certo de cadastrar um serviço de exportação.
 *  -ManufacturerState                  Manufacturer não tem classe por causa que é algo informado 
 *  -ManufacturerCountry                pelo cliente na hora da compra do serviço,
 * Importer(ligacao)                    por causa que ele é o distribuidor do proprio cliente
 * -portoDeOrigem                       então não tem classe associado a ele já que não tem como
 * -portoDeDestinho                     fazer um pre registro de algo que não se tem ideia.
 * -inconterms(termos comerciais internacionais)
 * -Containers
 * -ItemDescricao
 * -pesoLiquido
 * -ncm
 * 
 * exportação relação com cliente(
 * @author Jaime
 */
public class Exportacao {
    
    private int poNumber;// 
    private ClienteJuridico clienteJuridico;//relaçao(salvar id do cliente)
    private int clienteJuridicooo;//(caso der errado)
    private String data;
    private String manufacturerName;
    private String manufacturerTown;
    private String manufacturerIndustrialZone;
    private String manufacturerState;
    private String manufacturerCountry;
    private int shipper; // relaçao(salvar id do shipper) 
    private int portoDeOrigem; //relação(salvar id do porto)
    private int portoDeDestino; // relação(salvar id do porto)
    private String inconterms;
    private int container; // relação(salvar id do container)
    private String itemDescricao;
    private int pesoLiquido;
    private String NCM;
    private String freight;
    private int distanciaKM;
    private double valor;

    
    public int getClienteJuridicooo() {
        return clienteJuridicooo;
    }

    public void setClienteJuridicooo(int clienteJuridicooo) {
        this.clienteJuridicooo = clienteJuridicooo;
    }
    
    public String getFreight() {
        return freight;
    }

    public void setFreight(String freight) {
        this.freight = freight;
    }

    
    public ClienteJuridico getClienteJuridico() {
        return clienteJuridico;
    }

    public void setClienteJuridico(ClienteJuridico clienteJuridico) {
        this.clienteJuridico = clienteJuridico;
    }

    public int getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(int poNumber) {
        this.poNumber = poNumber;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getManufacturerTown() {
        return manufacturerTown;
    }

    public void setManufacturerTown(String manufacturerTown) {
        this.manufacturerTown = manufacturerTown;
    }

    public String getManufacturerIndustrialZone() {
        return manufacturerIndustrialZone;
    }

    public void setManufacturerIndustrialZone(String manufacturerIndustrialZone) {
        this.manufacturerIndustrialZone = manufacturerIndustrialZone;
    }

    public String getManufacturerState() {
        return manufacturerState;
    }

    public void setManufacturerState(String manufacturerState) {
        this.manufacturerState = manufacturerState;
    }

    public String getManufacturerCountry() {
        return manufacturerCountry;
    }

    public void setManufacturerCountry(String manufacturerCountry) {
        this.manufacturerCountry = manufacturerCountry;
    }

    public int getShipper() {
        return shipper;
    }

    public void setShipper(int shipper) {
        this.shipper = shipper;
    }

    public int getPortoDeOrigem() {
        return portoDeOrigem;
    }

    public void setPortoDeOrigem(int portoDeOrigem) {
        this.portoDeOrigem = portoDeOrigem;
    }

    public int getPortoDeDestino() {
        return portoDeDestino;
    }

    public void setPortoDeDestino(int portoDeDestino) {
        this.portoDeDestino = portoDeDestino;
    }

    public String getInconterms() {
        return inconterms;
    }

    public void setInconterms(String inconterms) {
        this.inconterms = inconterms;
    }

    public int getContainer() {
        return container;
    }

    public void setContainer(int container) {
        this.container = container;
    }

    public String getItemDescricao() {
        return itemDescricao;
    }

    public void setItemDescricao(String itemDescricao) {
        this.itemDescricao = itemDescricao;
    }

    public int getPesoLiquido() {
        return pesoLiquido;
    }

    public void setPesoLiquido(int pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
    }

    public String getNCM() {
        return NCM;
    }

    public void setNCM(String NCM) {
        this.NCM = NCM;
    }

    public int getDistanciaKM() {
        return distanciaKM;
    }

    public void setDistanciaKM(int distanciaKM) {
        this.distanciaKM = distanciaKM;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    
    
    
}
