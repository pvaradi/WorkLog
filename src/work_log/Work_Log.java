/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package work_log;

import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.util.WorkbookUtil;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import javax.swing.table.DefaultTableModel;
import java.util.Iterator;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;




/**
 *
 * @author pvaradi
 */
public class Work_Log extends javax.swing.JFrame {
    
    public Work_Log() {
        initComponents(); 
        
        String[] tableBuilder = new String[8];
        
        try {                                                                           //TODO class
            Workbook workbook;
            workbook = new HSSFWorkbook(new FileInputStream("Test.xls"));
            Sheet sheet = workbook.getSheetAt(0);
            
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();           //jTable
            int i = 0;                                                                  //TODO
            
            for(Iterator<Row> rit = sheet.rowIterator();rit.hasNext();){
                Row row = rit.next();
                
                for(Iterator<Cell> cit = row.cellIterator() ;cit.hasNext();){
                    Cell cell = cit.next();
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    System.out.print(cell.getStringCellValue() + "\t");
                    if(!cell.getStringCellValue().trim().equals(null)){
                        tableBuilder[i++] = cell.getStringCellValue();
                    }
                }
                i = 0;                                                                  //TODO 
                model.addRow(new Object[]{  tableBuilder[0],                            //TODO for
                                            tableBuilder[1],
                                            tableBuilder[2],
                                            tableBuilder[3],
                                            tableBuilder[4],
                                            tableBuilder[5],
                                            tableBuilder[6],
                });
                tableBuilder[6] = "-";                                                  //TODO ha üres megjegyzés lenne
                i = 0;
                
                System.out.println();
        }
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Nem található az adatbázis!", "Hiba",JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Work_Log.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(0);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Hibás adatbázis!", "Hiba",JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Work_Log.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(0);
        }
        int setAzonosito = Integer.parseInt(tableBuilder[0]);
        jTextField1.setText(String.valueOf(++setAzonosito));
        
        /*
        Row row = sheet.createRow(0);
        Cell cell = row.createCell(4);
        
        cell.setCellValue("Hi there!");
        
        System.out.println(cell.getRichStringCellValue().toString());
       */
    }
      

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.darkGray);
        setSize(new java.awt.Dimension(1010, 800));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("ENGEL - Karbantartás");
        jLabel1.setToolTipText("");

        jTable1.setForeground(new java.awt.Color(102, 102, 102));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Munkaszám", "Azonosító", "Gépszám", "Tevékenység", "Állási idő", "Dátum", "Megjegyzés"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTextField1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextField1.setText("1");
        jTextField1.setToolTipText("");
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField1.setEnabled(false);
        jTextField1.setMaximumSize(new java.awt.Dimension(150, 26));
        jTextField1.setMinimumSize(new java.awt.Dimension(100, 26));
        jTextField1.setName(""); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Munkaszám");
        jLabel2.setToolTipText("");

        jTextField2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextField2.setToolTipText("");
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField2.setMaximumSize(new java.awt.Dimension(150, 26));
        jTextField2.setMinimumSize(new java.awt.Dimension(150, 26));
        jTextField2.setName(""); // NOI18N
        jTextField2.setPreferredSize(new java.awt.Dimension(150, 26));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Azonosító");
        jLabel3.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Gép szám");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Tevékenység");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Állási idő /min/");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("Dátum");

        jTextField9.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField9.setToolTipText("");
        jTextField9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton2.setText("Kilépés");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton4.setText("Munka mentése");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/work_log/img/logo.jpg"))); // NOI18N

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/work_log/img/engel.jpg"))); // NOI18N
        jLabel16.setToolTipText("");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "36691 ES 80/20   HLS      /25      REXROTH  Axiál", "36690 ES 80/20   HLS      /25      REXROTH  Axiál", "36689 ES 80/20   HLS      /25      REXROTH  Axiál", "36692 ES 80/20   HLS      /25      REXROTH  Axiál", "33968 ES 80/20   HLS      /25      REXROTH  Axiál", "33967 ES 80/20   HLS      /25      REXROTH  Axiál", "35943 ES 200/40 HLS      /25      sziv.RKP-45", "35324 ES 80/30   HL ST   /25      sziv.RKP-32", "35323 ES 80/30   HL ST   /25    sziv.RKP-32", "35942 ES 200/40 HLS              /30   sziv.RKP-45", "40338 ES 200/45 HL-V            /30  sziv.RKP-45", "40472 ES 200/45 HL-V            /30  sziv.RKP-45", "47818       200/45 Victory       /30  sziv.RKP-45", "47547       200/45 Victory      /30   sziv.RKP-45", "52606       200/45 Victory      /30       sziv.RKP-45", "39922 ES 330/75 HL-V           /30   sziv.RKP-45", "41844 ES 330/75 HL-V           /30  sziv.RKP-45", "40474 ES 330/75 HL-V           /30  sziv.RKP-45", "61273       330/80 Victory       /35     sziv.RKP-63", "52607       330/80 Victory      /30     sziv.RKP-63", "43057 ES 330/75 HL-V           /30  sziv.RKP-63", "43056 ES 330/75 HL-V          /30  sziv.RKP-63", "47290       330/80 Victory       /30   sziv.RKP-63", "52871       330/120 Victory   /30   sziv.RKP-63", "52877       330/120 Victory   /30    sziv.RKP-63", "56603       330/80 Victory      /35       sziv.RKP-63", "56607       330/80 Victory      /35     sziv.RKP-63", "61275       330/80 Victory      / 35     sziv.RKP-63", "62266       330/120 Victory     /35    sziv.RKP-63", "62265       330/120 Victory    /35    sziv.RKP-63", "175444     330/120 Victory  /30        ECO-drive", "175445     330/120 Victory   /30       ECO-drive", "175863     330/120 Victory   /30       ECO-drive", "175864     330/120 Victory   /30       ECO-drive", " " }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Szerszám csere", "Henger + Csiga csere", "Fűtőpatron csere", "Olaj+szűrő csere", "Gyűrű csere", "Vízkör karbantartás", "Zsírzás", "Ventillátor tisztítás", "Elektromos szekrény ellenőrzés", "Henger központosítás", "Szervíz", "Munkahiány" }));

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 400, 5));
        jSpinner1.setOpaque(false);

        jSpinner2.setModel(new javax.swing.SpinnerDateModel());

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setText("Megjegyzés");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 856, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton4)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField9)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addGap(58, 58, 58)
                                    .addComponent(jLabel1))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2))
                                    .addGap(58, 58, 58)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10))
                                    .addGap(42, 42, 42)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(jLabel8))
                            .addGap(40, 40, 40)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel16)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10))
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jLabel2.getAccessibleContext().setAccessibleName("Munka Szám");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        Workbook workbook;
        String[] writeExcel = new String[] {jTextField1.getText(),
                                            jTextField2.getText(),
                                            String.valueOf(jComboBox1.getSelectedItem()),
                                            String.valueOf(jComboBox2.getSelectedItem()),
                                            jSpinner1.getValue().toString(),
                                            jSpinner2.getValue().toString(),
                                            jTextField9.getText()
        };
        
        if(jTextField2.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Hiányzó Azonosító!", "Hiba",JOptionPane.ERROR_MESSAGE);
        }
        else{
            try {
                workbook = new HSSFWorkbook(new FileInputStream("Test.xls"));
                Sheet sheet = workbook.getSheetAt(0);
                int nextEmptyRow;

                nextEmptyRow = sheet.getPhysicalNumberOfRows();
                Row row = sheet.createRow(nextEmptyRow);

                for(int i = 0;i<7;i++){
                    Cell cell = row.createCell(i);
                    cell.setCellValue(writeExcel[i]);
                }            
                    try {
                        FileOutputStream output = new FileOutputStream("Test.xls");
                        workbook.write(output);
                        output.close();
                    }
                    catch(Exception e){
                        e.printStackTrace();
                    }




                    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

                    if(jTextField9.getText().equals("")){
                        jTextField9.setText("-");
                }
                    model.addRow(new Object[]{  jTextField1.getText(),
                                                jTextField2.getText(),
                                                String.valueOf(jComboBox1.getSelectedItem()),
                                                String.valueOf(jComboBox2.getSelectedItem()),
                                                jSpinner1.getValue().toString(),
                                                jSpinner2.getValue().toString(),
                                                jTextField9.getText()
                    });
                    jTextField2.setText("");
                    jTextField9.setText("");
                    int setAzonosito = Integer.parseInt(jTextField1.getText());
                    jTextField1.setText(String.valueOf(++setAzonosito));
  
            } catch (IOException ex) {
                Logger.getLogger(Work_Log.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Work_Log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Work_Log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Work_Log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Work_Log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Work_Log().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton4;
    public javax.swing.JComboBox jComboBox1;
    public javax.swing.JComboBox jComboBox2;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel15;
    public javax.swing.JLabel jLabel16;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JSpinner jSpinner1;
    public javax.swing.JSpinner jSpinner2;
    public javax.swing.JTable jTable1;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField2;
    public javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
