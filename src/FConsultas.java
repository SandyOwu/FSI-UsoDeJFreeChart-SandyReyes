
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FConsultas extends javax.swing.JFrame {

    ArrayList<ArrayList<String>> datos = new ArrayList();
    ArrayList<String> series = new ArrayList();
    GraficaXY chart;

    Conexion cnx;

    public FConsultas() {
        initComponents();
        setLocationRelativeTo(this);

        PGrafica.setLayout(new java.awt.BorderLayout());
        PGrafica.setPreferredSize(new java.awt.Dimension(780, 320));
        pack();

        cnx = new Conexion();

        if (cnx.conectar("localhost", "insulina", "root", null) == 0) {
            JOptionPane.showMessageDialog(this, "No se pudo conectar a la base de datos");
            System.exit(0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        BPromedio = new javax.swing.JButton();
        BMensualLuisa = new javax.swing.JButton();
        BMenualScott = new javax.swing.JButton();
        PGrafica = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TQuery = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        BPromedio.setText("PROMEDIO");
        BPromedio.setFocusable(false);
        BPromedio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BPromedio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BPromedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPromedioActionPerformed(evt);
            }
        });
        jToolBar1.add(BPromedio);

        BMensualLuisa.setText("PROMEDIO MENSUAL");
        BMensualLuisa.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LUISA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        BMensualLuisa.setFocusable(false);
        BMensualLuisa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BMensualLuisa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BMensualLuisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMensualLuisaActionPerformed(evt);
            }
        });
        jToolBar1.add(BMensualLuisa);

        BMenualScott.setText("PROMEDIO MENSUAL");
        BMenualScott.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SCOTT", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        BMenualScott.setFocusable(false);
        BMenualScott.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BMenualScott.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BMenualScott.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMenualScottActionPerformed(evt);
            }
        });
        jToolBar1.add(BMenualScott);

        PGrafica.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout PGraficaLayout = new javax.swing.GroupLayout(PGrafica);
        PGrafica.setLayout(PGraficaLayout);
        PGraficaLayout.setHorizontalGroup(
            PGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PGraficaLayout.setVerticalGroup(
            PGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        TQuery.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(TQuery);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PGrafica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BPromedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPromedioActionPerformed

        String query = "SELECT nombrep, glucosa_prom FROM promedios";

        datos = cnx.consultar(query);
        series.clear();
        series.add("promedio");

        PGrafica.removeAll();
        chart = new GraficaXY("Promedio de glucosa por paciente", "Paciente", "mg/dL", series, datos);
        PGrafica.add(chart.chartPanel);
        PGrafica.updateUI();

        cnx.entablar(query, TQuery, 60, 40);
    }//GEN-LAST:event_BPromedioActionPerformed

    private void BMensualLuisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMensualLuisaActionPerformed
        String query = "SELECT CONCAT(año, '-', LPAD(mes, 2, '0')) AS periodo, glucosa_prom FROM promedios_mensual WHERE curp = 'ausl120130a' ORDER BY año, mes";

        datos = cnx.consultar(query);
        series.clear();
        series.add("promedio mensual");

        PGrafica.removeAll();
        chart = new GraficaXY("Promedio mensual de glucosa. Luisa", "Mes", "mg/dL", series, datos);
        PGrafica.add(chart.chartPanel, java.awt.BorderLayout.CENTER);
        PGrafica.revalidate();
        PGrafica.repaint();

        cnx.entablar(query, TQuery);
    }//GEN-LAST:event_BMensualLuisaActionPerformed

    private void BMenualScottActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMenualScottActionPerformed
        String query = "SELECT CONCAT(año, '-', LPAD(mes, 2, '0')) AS periodo, glucosa_prom FROM promedios_mensual WHERE curp = 'pals070827b' ORDER BY año, mes";

        datos = cnx.consultar(query);
        series.clear();
        series.add("promedio mensual");

        PGrafica.removeAll();
        chart = new GraficaXY("Promedio mensual de glucosa. Scott", "Mes", "mg/dL", series, datos);
        PGrafica.add(chart.chartPanel, java.awt.BorderLayout.CENTER);
        PGrafica.revalidate();
        PGrafica.repaint();

        cnx.entablar(query, TQuery, 60, 40);
    }//GEN-LAST:event_BMenualScottActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FConsultas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BMensualLuisa;
    private javax.swing.JButton BMenualScott;
    private javax.swing.JButton BPromedio;
    private javax.swing.JPanel PGrafica;
    private javax.swing.JTable TQuery;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
