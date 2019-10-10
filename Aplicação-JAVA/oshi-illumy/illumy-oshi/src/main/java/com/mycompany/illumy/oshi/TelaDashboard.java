package com.mycompany.illumy.oshi;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import oshi.SystemInfo;
import oshi.software.os.OperatingSystem;

public class TelaDashboard extends javax.swing.JFrame {

    private final Memoria memoria;
    private final Processador processador;
    private final Armazenamento armazenamento;
    private final SistemaOperacional sistemaOperacional;
    private final Hardware hardware;
    private final SystemInfo systemInfo;
    private final OperatingSystem operatingSystem;

    public TelaDashboard() {
        systemInfo = new SystemInfo();
        operatingSystem = systemInfo.getOperatingSystem();
        memoria = new Memoria();
        processador = new Processador();
        armazenamento = new Armazenamento(systemInfo.getOperatingSystem().getFileSystem());
        sistemaOperacional = new SistemaOperacional();
        hardware = new Hardware();
        initComponents();
    }

    public void exibeDados() {
        lbMarcaComputador.setText(hardware.getMarcaComputador());
        lbModeloCpu.setText(hardware.getModeloCPU());
        lbModeloPlacaMae.setText(hardware.getModeloPlacaMae());
        lbModeloSO.setText(sistemaOperacional.getModeloSO());
        lbMarcaSO.setText(sistemaOperacional.getFabricante());
        lbHostname.setText(sistemaOperacional.getHostname());

        try {
            while (true) {
                lbMemoriaDisponivel.setText(memoria.getMemoriaDisponivel(systemInfo.getHardware().getMemory()));
                lbMemoriaTotal.setText(memoria.getMemoriaTotal(systemInfo.getHardware().getMemory()));
                lbArmazenamentoTotal.setText(armazenamento.getDiscoTotal());
                lbArmazenamentoDisponivel.setText(armazenamento.getDiscoDisponivel());
                lbUsoProcessador.setText(processador.getUtilizacaoAtualProcessador(systemInfo.getHardware().getProcessor()));
                lbNucleos.setText(processador.getThreadsAtivos());
                lbTemperatura.setText(processador.getTemperaturaCpu());
            }
        } catch (Exception ex) {
            System.out.println("Erro:" + ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lbMemoriaDisponivel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lbUsoProcessador = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lbMarcaComputador = new javax.swing.JLabel();
        lbModeloCpu = new javax.swing.JLabel();
        lbModeloPlacaMae = new javax.swing.JLabel();
        lbModeloSO = new javax.swing.JLabel();
        lbMarcaSO = new javax.swing.JLabel();
        lbHostname = new javax.swing.JLabel();
        lbMemoriaTotal = new javax.swing.JLabel();
        lbNucleos = new javax.swing.JLabel();
        lbTemperatura = new javax.swing.JLabel();
        lbArmazenamentoTotal = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        lbArmazenamentoDisponivel = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Memória Disponivel:");

        lbMemoriaDisponivel.setText("--");

        jLabel2.setFont(new java.awt.Font("Bitstream Charter", 1, 18)); // NOI18N
        jLabel2.setText("Monitoramento de Máquina");

        jLabel3.setText("Informações de hardware");

        jLabel4.setText("Informações de SO");

        jLabel5.setText("Marca do computador: ");

        jLabel6.setText("Modelo Placa Mãe: ");

        jLabel7.setText("Modelo CPU: ");

        jLabel8.setText("Modelo SO:");

        jLabel9.setText("Marca SO:");

        jLabel10.setText("Hostname:");

        jLabel11.setFont(new java.awt.Font("Bitstream Charter", 1, 18)); // NOI18N
        jLabel11.setText("Dados Atuais");

        jLabel12.setText("Memória Total:");

        jLabel13.setText("Utilização do processador:");

        lbUsoProcessador.setText("--");

        jLabel14.setText("Threads em execução");

        jLabel15.setText("Temperatura atual:");

        lbMarcaComputador.setText("--");

        lbModeloCpu.setText("--");

        lbModeloPlacaMae.setText("--");

        lbModeloSO.setText("--");

        lbMarcaSO.setText("--");

        lbHostname.setText("--");

        lbMemoriaTotal.setText("--");

        lbNucleos.setText("--");

        lbTemperatura.setText("--");

        lbArmazenamentoTotal.setText("--");

        jLabel26.setText("Armazenamento total:");

        lbArmazenamentoDisponivel.setText("--");

        jLabel28.setText("Armazenamento disponivel:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(94, 94, 94))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbModeloPlacaMae, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbMemoriaDisponivel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbMemoriaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel26)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbArmazenamentoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel28)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbArmazenamentoDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbModeloCpu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbMarcaComputador, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbMarcaSO, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbHostname, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbModeloSO, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbUsoProcessador, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbNucleos, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(lbMarcaComputador)
                    .addComponent(lbModeloSO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(lbModeloCpu)
                    .addComponent(lbMarcaSO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10)
                    .addComponent(lbModeloPlacaMae)
                    .addComponent(lbHostname))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lbMemoriaDisponivel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(lbMemoriaTotal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(lbArmazenamentoTotal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(lbArmazenamentoDisponivel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(lbUsoProcessador))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(lbNucleos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(lbTemperatura))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                TelaDashboard tela = new TelaDashboard();
                tela.setVisible(true);
                tela.addWindowListener(new WindowListener() {

                    @Override
                    public void windowOpened(WindowEvent we) {
                        tela.exibeDados();
                    }

                    @Override
                    public void windowClosing(WindowEvent we) {}

                    @Override
                    public void windowClosed(WindowEvent we) {}

                    @Override
                    public void windowIconified(WindowEvent we) {}

                    @Override
                    public void windowDeiconified(WindowEvent we) {}

                    @Override
                    public void windowActivated(WindowEvent we) {}

                    @Override
                    public void windowDeactivated(WindowEvent we) {}
                });
            }
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbArmazenamentoDisponivel;
    private javax.swing.JLabel lbArmazenamentoTotal;
    private javax.swing.JLabel lbHostname;
    private javax.swing.JLabel lbMarcaComputador;
    private javax.swing.JLabel lbMarcaSO;
    private javax.swing.JLabel lbMemoriaDisponivel;
    private javax.swing.JLabel lbMemoriaTotal;
    private javax.swing.JLabel lbModeloCpu;
    private javax.swing.JLabel lbModeloPlacaMae;
    private javax.swing.JLabel lbModeloSO;
    private javax.swing.JLabel lbNucleos;
    private javax.swing.JLabel lbTemperatura;
    private javax.swing.JLabel lbUsoProcessador;
    // End of variables declaration//GEN-END:variables
}
