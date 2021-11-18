/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expor.objects;

import expor.dao.ClienteJuridicoDAO;
import expor.dao.ContainersDAO;
import expor.dao.PortosDAO;
import expor.dao.ShipperDAO;

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
    private int clienteJuridico2;//(caso der errado)
    private String data;
    private String manufacturerName;
    private String manufacturerTown;
    private String manufacturerIndustrialZone;
    private String manufacturerState;
    private String manufacturerCountry;
    
    private Shipper shipper;
    private int shipper2; // relaçao(salvar id do shipper) 
    
    private Portos portoDeOrigem;
    private int portoDeOrigem2; //relação(salvar id do porto)
    
    private Portos portoDeDestino;
    private int portoDeDestino2; // relação(salvar id do porto)
    
    private String inconterms;
    
    private Containers container;
    private int container2; // relação(salvar id do container)
    
    private String itemDescricao;
    private int pesoLiquido;
    private String NCM;
    private String freight;
    private int distanciaKM;
    private double valor;
    
    public ClienteJuridicoDAO cjDAO = new ClienteJuridicoDAO();
    public ContainersDAO cDAO = new ContainersDAO();
    public ShipperDAO sDAO = new ShipperDAO();
    public PortosDAO pDAO = new PortosDAO();

    public Shipper getShipper() {
        return shipper;
    }

    public void setShiper(int id) {
        Shipper obj = sDAO.shipperIdSearch(id);
        this.shipper = obj;
    }

    public Portos getPortoDeOrigem() {
        return portoDeOrigem;
    }

    public void setPortoDeOrigem(int id) {
        Portos obj = pDAO.portosIdSearch(id);
        this.portoDeOrigem = obj;
    }

    public Portos getPortoDeDestino() {
        return portoDeDestino;
    }

    public void setPortoDeDestino(int id) {
        Portos obj = pDAO.portosIdSearch(id);
        this.portoDeDestino = obj;
    }

    public Containers getContainer() {
        return container;
    }

    public void setContainer(int id) {
        Containers obj = cDAO.containersIdSearch(id);
        this.container = obj;
    }

    public Exportacao(){
    }
    
    
    public int getClienteJuridico2() {
        return clienteJuridico2;
    }

    public void setClienteJuridico2(int clienteJuridico2) {
        this.clienteJuridico2 = clienteJuridico2;
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

    public void setClienteJuridico(int id) {
        ClienteJuridico obj = cjDAO.clienteIdSearch(id);
        this.clienteJuridico = obj;
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

    public int getShipper2() {
        return shipper2;
    }

    public void setShipper(int shipper2) {
        this.shipper2 = shipper2;
    }

    public int getPortoDeOrigem2() {
        return portoDeOrigem2;
    }

    public void setPortoDeOrigem2(int portoDeOrigem2) {
        this.portoDeOrigem2 = portoDeOrigem2;
    }

    public int getPortoDeDestino2() {
        return portoDeDestino2;
    }

    public void setPortoDeDestino2(int portoDeDestino2) {
        this.portoDeDestino2 = portoDeDestino2;
    }

    public String getInconterms() {
        return inconterms;
    }

    public void setInconterms(String inconterms) {
        this.inconterms = inconterms;
    }

    public int getContainer2() {
        return container2;
    }

    public void setContainer2(int container2) {
        this.container2 = container2;
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
