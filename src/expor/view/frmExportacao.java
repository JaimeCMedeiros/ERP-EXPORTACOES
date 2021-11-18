/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expor.view;

import expor.dao.ClienteJuridicoDAO;
import expor.dao.ContainersDAO;
import expor.dao.ExportacaoDAO;
import expor.dao.PortosDAO;
import expor.dao.ShipperDAO;
import expor.objects.Exportacao;
import java.sql.ResultSet;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jaime
 */
public class frmExportacao extends javax.swing.JFrame {
    String ponumber, valor, productDescription, netweight, ncm, manutown, manunome,manuindustrial, manucounty,
    distance,data,containers, freight, inconterms, portdestiny, portorigin, cliente, shipper;

    public void limparcampo(){
        tfDistance.setText("");
        tfManuCounty.setText("");
        tfManuIndustrial.setText("");
        tfManuNome.setText("");
        tfManuTown.setText("");
        tfValor.setText("");
        tfNCM.setText("");
        tfNetWeight.setText("");
        tfProductDescription.setText("");
        tfponumber.setText("");
        
        
    }
    public void setardata(){
        Date hoje = new Date();
        SimpleDateFormat dataBr = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = dataBr.format(hoje);
        tfData.setText(dataFormatada);
        
    }
    public void listar(){
        ExportacaoDAO dao = new ExportacaoDAO();
        List<Exportacao> lista = dao.listExportacao();
        DefaultTableModel dados = (DefaultTableModel) tabelaExportacao.getModel();
        dados.setNumRows(0);
        for(Exportacao f : lista){
            dados.addRow(new Object[]{
                f.getPoNumber(),
                f.getClienteJuridico2(),
                f.getData(),
                f.getManufacturerName(),
                f.getManufacturerTown(),
                f.getManufacturerIndustrialZone(),
                f.getManufacturerCountry(),
                f.getShipper2(),
                f.getPortoDeOrigem2(),
                f.getPortoDeDestino2(),
                f.getInconterms(),
                f.getContainer2(),
                f.getItemDescricao(),
                f.getPesoLiquido(),
                f.getNCM(),
                f.getFreight(),
                f.getDistanciaKM(),
                f.getValor()
                //f.getNivelAcesso().getIdNivelAcesso(),

            });
        }
    }
    
    Vector<Integer> idClienteJuridico = new Vector<Integer>();
    public void PreencherComboBoxClienteJuridico(){
        try {
            ClienteJuridicoDAO cjDAO = new ClienteJuridicoDAO();
            ResultSet rs = cjDAO.ListarClientes();
            
            while (rs.next()) {
                idClienteJuridico.addElement(rs.getInt(1));
                cbxClienteJuridico.addItem(rs.getString(2));
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error no PreencherComboBoForne: "+ e);
        }
    }
    
    Vector<Integer> idShipper = new Vector<Integer>();
    public void PreencherComboBoxShipper(){
        try {
            ShipperDAO sDAO = new ShipperDAO();
            ResultSet rs = sDAO.ListarShipper();
            
            while (rs.next()) {
                idShipper.addElement(rs.getInt(1));
                cbShipper.addItem(rs.getString(2));
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error no PreencherComboBoForne: "+ e);
        }
    }
    Vector<Integer> idPortoOrigim = new Vector<Integer>();
    public void PreencherComboBoxPortoOrigin(){
        try {
            PortosDAO pDAO = new PortosDAO();
            ResultSet rs = pDAO.ListarP();
            
            while (rs.next()) {
                idPortoOrigim.addElement(rs.getInt(1));
                cbPortOrigin.addItem(rs.getString(2));
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error no PreencherComboBoForne: "+ e);
        }
    }
    Vector<Integer> idPortoDestino = new Vector<Integer>();
    public void PreencherComboBoxPortoDestino(){
        try {
            PortosDAO ptDAO = new PortosDAO();
            ResultSet rs = ptDAO.ListarP();
            
            while (rs.next()) {
                idPortoDestino.addElement(rs.getInt(1));
                cbPortDestiny.addItem(rs.getString(2));
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error no PreencherComboBoForne: "+ e);
        }
    }
    Vector<Integer> idContainers = new Vector<Integer>();
    public void PreencherComboBoxContainers(){
        try {
            ContainersDAO ctDAO = new ContainersDAO();
            ResultSet rs = ctDAO.ListarContainers();
            
            while (rs.next()) {
                idContainers.addElement(rs.getInt(1));
                cbContainersType.addItem(rs.getString(2));
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error no PreencherComboBoForne: "+ e);
        }
    }
    
    public frmExportacao() {
        initComponents();
        setardata();
        PreencherComboBoxClienteJuridico();
        PreencherComboBoxContainers();
        PreencherComboBoxPortoDestino();
        PreencherComboBoxPortoOrigin();
        PreencherComboBoxShipper();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        tfData = new javax.swing.JTextField();
        tfponumber = new javax.swing.JTextField();
        tfManuNome = new javax.swing.JTextField();
        tfManuTown = new javax.swing.JTextField();
        tfManuIndustrial = new javax.swing.JTextField();
        tfManuCounty = new javax.swing.JTextField();
        cbShipper = new javax.swing.JComboBox<>();
        cbPortOrigin = new javax.swing.JComboBox<>();
        cbPortDestiny = new javax.swing.JComboBox<>();
        cbContainersType = new javax.swing.JComboBox<>();
        cbInconterms = new javax.swing.JComboBox<>();
        cbFreight = new javax.swing.JComboBox<>();
        tfProductDescription = new javax.swing.JTextField();
        tfNetWeight = new javax.swing.JTextField();
        tfNCM = new javax.swing.JTextField();
        tfDistance = new javax.swing.JTextField();
        tfValor = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        cbxClienteJuridico = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfPesquisarTabela = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaExportacao = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciamento de Exportações");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Exportação"));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel3.setText("Cliente:");

        jLabel2.setText("Data:");

        jLabel5.setText("Cliente:");

        jLabel6.setText("PO Number");

        jLabel7.setText("Manufacturer:");

        jLabel8.setText("Nome");

        jLabel9.setText("Town");

        jLabel10.setText("IndustrialZone");

        jLabel11.setText("Country");

        jLabel12.setText("Shipper:");

        jLabel13.setText("Origem");

        jLabel14.setText("Porto de Origem");

        jLabel15.setText("Porto de Destino");

        jLabel16.setText("Containers Type");

        jLabel17.setText("Inconterms");

        jLabel18.setText("Freight");

        jLabel19.setText("Produto:");

        jLabel20.setText("Description");

        jLabel21.setText("Net Weight");

        jLabel22.setText("NCM");

        jLabel23.setText("Distance(KM)");

        jLabel24.setText("Valor");

        tfponumber.setEditable(false);

        cbInconterms.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EXW ", "FCA ", "FAS ", "FOB ", "CFR ", "CIF ", "CPT", "CIP", "DPU", "DAP ", "DDP" }));

        cbFreight.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Contratação normal", "Subcontratação", "CIF", "Redespacho", "Carga fracionada", "FOB", "Carga lotação" }));

        tfDistance.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfDistanceFocusLost(evt);
            }
        });
        tfDistance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDistanceActionPerformed(evt);
            }
        });

        btnAdd.setText("Salvar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnInicio.setText("Inicio");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(tfponumber, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel13)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfData, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbxClienteJuridico, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(tfManuTown, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfManuNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(cbPortOrigin, javax.swing.GroupLayout.Alignment.LEADING, 0, 208, Short.MAX_VALUE)
                                                .addComponent(cbShipper, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jLabel12))
                                        .addGap(34, 34, 34)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel15)
                                                .addComponent(cbPortDestiny, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel5Layout.createSequentialGroup()
                                                    .addComponent(cbContainersType, 0, 104, Short.MAX_VALUE)
                                                    .addGap(51, 51, 51)))))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addGap(262, 262, 262)
                                        .addComponent(jLabel21))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(tfProductDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfNetWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbFreight, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel22)
                                                .addComponent(jLabel18)
                                                .addComponent(cbInconterms, 0, 84, Short.MAX_VALUE)
                                                .addComponent(jLabel17)
                                                .addComponent(tfNCM))
                                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel5Layout.createSequentialGroup()
                                                    .addGap(18, 18, 18)
                                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(tfDistance, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel23)))
                                                .addGroup(jPanel5Layout.createSequentialGroup()
                                                    .addGap(38, 38, 38)
                                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                                        .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel24)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(tfManuCounty, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(tfManuIndustrial)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnImprimir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(9, 9, 9)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(cbxClienteJuridico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfManuNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfManuIndustrial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfManuTown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfManuCounty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfponumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbShipper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbContainersType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbInconterms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel18))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbPortOrigin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbPortDestiny, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbFreight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel19))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNovo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnExcluir))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdd)
                            .addComponent(btnInicio))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEditar)
                            .addComponent(btnImprimir))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfProductDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNetWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNCM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDistance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Exportação", jPanel1);

        jLabel1.setText("Pesquisar:");

        tabelaExportacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "PoN", "Cliente", "Data", "ManufacName", "ManufacTown", "ManufacIndZone", "ManufacCountry", "Shipper", "PortoOrigin", "PortoDestino", "Inconterms", "Container", "ItemDescri", "Net Wieght", "NCM", "Freight", "Distance", "Valor"
            }
        ));
        tabelaExportacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaExportacaoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaExportacao);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 945, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfPesquisarTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPesquisarTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Lista", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfDistanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDistanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDistanceActionPerformed

    private void tfDistanceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDistanceFocusLost
        double vezes;
        vezes = (Integer.parseInt(tfDistance.getText()) * 3);
        tfValor.setText(String.valueOf(vezes));
    }//GEN-LAST:event_tfDistanceFocusLost

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        
        Exportacao obj = new Exportacao();
        obj.setPoNumber(Integer.parseInt(tfponumber.getText()));
        ExportacaoDAO edao = new ExportacaoDAO();
        edao.deleteExportacao(obj);
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        
        limparcampo();
        
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        int CodigoCliente, CodigoPortoO, CodigoPortoD, CodigoShipper, CodigoContainers;
        Exportacao obj = new Exportacao();
        
        
        CodigoCliente = idClienteJuridico.get(cbxClienteJuridico.getSelectedIndex());
        obj.setClienteJuridico(CodigoCliente);
        obj.setData(tfData.getText());
        obj.setManufacturerName(tfManuNome.getText());
        obj.setManufacturerTown(tfManuTown.getText());
        obj.setManufacturerIndustrialZone(tfManuIndustrial.getText());
        obj.setManufacturerCountry(tfManuCounty.getText());
        CodigoShipper = idShipper.get(cbShipper.getSelectedIndex());
        obj.setShiper(CodigoShipper);
        CodigoPortoO = idPortoOrigim.get(cbPortOrigin.getSelectedIndex());
        obj.setPortoDeOrigem(CodigoPortoO);
        CodigoPortoD = idPortoDestino.get(cbPortDestiny.getSelectedIndex());
        obj.setPortoDeDestino(CodigoPortoD);
        obj.setInconterms(cbInconterms.getSelectedItem().toString());
        CodigoContainers = idContainers.get(cbContainersType.getSelectedIndex());
        obj.setContainer(CodigoContainers);
        obj.setItemDescricao(tfProductDescription.getText());
        obj.setPesoLiquido(Integer.parseInt(tfNetWeight.getText()));
        obj.setNCM(tfNCM.getText());
        obj.setFreight(cbFreight.getSelectedItem().toString());
        obj.setDistanciaKM(Integer.parseInt(tfDistance.getText()));
        obj.setValor(Double.parseDouble(tfValor.getText()));
        
        ExportacaoDAO cdao = new ExportacaoDAO();
        cdao.addExportacao(obj);
        
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        int CodigoCliente, CodigoPortoO, CodigoPortoD, CodigoShipper, CodigoContainers;
        Exportacao obj = new Exportacao();
        
        
        CodigoCliente = idClienteJuridico.get(cbxClienteJuridico.getSelectedIndex());
        obj.setClienteJuridico(CodigoCliente);
        obj.setData(tfData.getText());
        obj.setManufacturerName(tfManuNome.getText());
        obj.setManufacturerTown(tfManuTown.getText());
        obj.setManufacturerIndustrialZone(tfManuIndustrial.getText());
        obj.setManufacturerCountry(tfManuCounty.getText());
        CodigoShipper = idShipper.get(cbShipper.getSelectedIndex());
        obj.setShiper(CodigoShipper);
        CodigoPortoO = idPortoOrigim.get(cbPortOrigin.getSelectedIndex());
        obj.setPortoDeOrigem(CodigoPortoO);
        CodigoPortoD = idPortoDestino.get(cbPortDestiny.getSelectedIndex());
        obj.setPortoDeDestino(CodigoPortoD);
        obj.setInconterms(cbInconterms.getSelectedItem().toString());
        CodigoContainers = idContainers.get(cbContainersType.getSelectedIndex());
        obj.setContainer(CodigoContainers);
        obj.setItemDescricao(tfProductDescription.getText());
        obj.setPesoLiquido(Integer.parseInt(tfNetWeight.getText()));
        obj.setNCM(tfNCM.getText());
        obj.setFreight(cbFreight.getSelectedItem().toString());
        obj.setDistanciaKM(Integer.parseInt(tfDistance.getText()));
        obj.setValor(Double.parseDouble(tfValor.getText()));
        obj.setPoNumber(Integer.parseInt(tfponumber.getText()));
        
        ExportacaoDAO cdao = new ExportacaoDAO();
        cdao.updateExportacao(obj);
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        
        frmInicio tela = new frmInicio();
        tela.setVisible(true);
        dispose(); //[51,0,153]
        
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed

        
        ponumber = tfponumber.getText();
        valor = tfValor.getText();
        productDescription = tfProductDescription.getText();
        netweight = tfNetWeight.getText();
        ncm = tfNCM.getText();
        manutown = tfManuTown.getText();
        manunome = tfManuNome.getText();
        manuindustrial = tfManuIndustrial.getText();
        manucounty = tfManuCounty.getText();
        distance = tfDistance.getText();
        data = tfData.getText();
        containers =(String)cbContainersType.getSelectedItem();
        freight = (String)cbFreight.getSelectedItem();
        inconterms = (String)cbInconterms.getSelectedItem();
        portdestiny = (String)cbPortDestiny.getSelectedItem();
        portorigin = (String)cbPortOrigin.getSelectedItem();
        cliente = (String)cbxClienteJuridico.getSelectedItem();
        shipper = (String)cbShipper.getSelectedItem();
        
        //jpImprimir telap = new jpImprimir();
        frmImprimir2 telap = new frmImprimir2();
        telap.tfPoNumber2.setText(ponumber);
        telap.cbCliente2.addItem(cliente);
        telap.tfValor2.setText(valor);
        telap.tfDescricao2.setText(productDescription);
        telap.tfPesoLiquido2.setText(netweight);
        telap.tfNcm2.setText(ncm);
        telap.tfManuNome2.setText(manunome);
        telap.tfManuCountry2.setText(manucounty);
        telap.tfManuIndZone2.setText(manuindustrial);
        telap.tfManuTown2.setText(manutown);
        telap.tfDistancia2.setText(distance);
        telap.tfData2.setText(data);
        telap.cbContainers2.addItem(containers);
        telap.cbFreight2.addItem(freight);
        telap.cbInconterms2.addItem(inconterms);
        telap.cbPortoDestino2.addItem(portdestiny);
        telap.cbPortoOrigem2.addItem(portorigin);
        telap.cbShipper2.addItem(shipper);
        //telap.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
        listar();
        
    }//GEN-LAST:event_formWindowActivated

    private void tabelaExportacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaExportacaoMouseClicked
        
        jTabbedPane1.setSelectedIndex(0);
        tfponumber.setText(tabelaExportacao.getValueAt(tabelaExportacao.getSelectedRow(),0).toString());
        cbxClienteJuridico.setSelectedItem(tabelaExportacao.getValueAt(tabelaExportacao.getSelectedRow(),1).toString());
        tfData.setText(tabelaExportacao.getValueAt(tabelaExportacao.getSelectedRow(),2).toString());
        tfManuNome.setText(tabelaExportacao.getValueAt(tabelaExportacao.getSelectedRow(),3).toString());
        tfManuTown.setText(tabelaExportacao.getValueAt(tabelaExportacao.getSelectedRow(),4).toString());
        tfManuIndustrial.setText(tabelaExportacao.getValueAt(tabelaExportacao.getSelectedRow(),5).toString());
        tfManuCounty.setText(tabelaExportacao.getValueAt(tabelaExportacao.getSelectedRow(),6).toString());
        cbShipper.setSelectedItem(tabelaExportacao.getValueAt(tabelaExportacao.getSelectedRow(),7).toString());
        cbPortOrigin.setSelectedItem(tabelaExportacao.getValueAt(tabelaExportacao.getSelectedRow(),8).toString());
        cbPortDestiny.setSelectedItem(tabelaExportacao.getValueAt(tabelaExportacao.getSelectedRow(),9).toString());
        cbInconterms.setSelectedItem(tabelaExportacao.getValueAt(tabelaExportacao.getSelectedRow(),10).toString());
        cbContainersType.setSelectedItem(tabelaExportacao.getValueAt(tabelaExportacao.getSelectedRow(),11).toString());
        tfProductDescription.setText(tabelaExportacao.getValueAt(tabelaExportacao.getSelectedRow(),12).toString());
        tfNetWeight.setText(tabelaExportacao.getValueAt(tabelaExportacao.getSelectedRow(),13).toString());
        tfNCM.setText(tabelaExportacao.getValueAt(tabelaExportacao.getSelectedRow(),14).toString());
        cbFreight.setSelectedItem(tabelaExportacao.getValueAt(tabelaExportacao.getSelectedRow(),15).toString());
        tfDistance.setText(tabelaExportacao.getValueAt(tabelaExportacao.getSelectedRow(),16).toString());
        tfValor.setText(tabelaExportacao.getValueAt(tabelaExportacao.getSelectedRow(),17).toString());
        
                
        
    }//GEN-LAST:event_tabelaExportacaoMouseClicked


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmExportacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmExportacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmExportacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmExportacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmExportacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnNovo;
    private javax.swing.JComboBox<String> cbContainersType;
    private javax.swing.JComboBox<String> cbFreight;
    private javax.swing.JComboBox<String> cbInconterms;
    private javax.swing.JComboBox<String> cbPortDestiny;
    private javax.swing.JComboBox<String> cbPortOrigin;
    private javax.swing.JComboBox<String> cbShipper;
    public javax.swing.JComboBox<String> cbxClienteJuridico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tabelaExportacao;
    private javax.swing.JTextField tfData;
    private javax.swing.JTextField tfDistance;
    private javax.swing.JTextField tfManuCounty;
    private javax.swing.JTextField tfManuIndustrial;
    private javax.swing.JTextField tfManuNome;
    private javax.swing.JTextField tfManuTown;
    private javax.swing.JTextField tfNCM;
    private javax.swing.JTextField tfNetWeight;
    private javax.swing.JTextField tfPesquisarTabela;
    private javax.swing.JTextField tfProductDescription;
    private javax.swing.JTextField tfValor;
    private javax.swing.JTextField tfponumber;
    // End of variables declaration//GEN-END:variables
}
