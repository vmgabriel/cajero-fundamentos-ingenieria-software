/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.EveFrmClave;
import controller.EveFrmConsignacion;
import controller.EveFrmHistorial;
import controller.EveTransaccion;
import model.Cuenta;
import view.FrmError;
import view.FrmSaldoDisponible;
import view.FrmHistorial;
import model.Conexion;

/**
 *
 * @author gabriel
 */
public class FrmClave extends javax.swing.JFrame {

    /**
     * Creates new form FrmClave
     */
    private EveFrmClave evefclave;
    private FrmError frmerror;
    private int formulario;
    public FrmClave(int formulario, EveFrmClave evefclave, FrmError frmerror) {
        this.evefclave = evefclave;
        this.frmerror = frmerror;
        this.formulario = formulario;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        lblMensaje = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        btnBorrar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnnull0 = new javax.swing.JButton();
        btnnull1 = new javax.swing.JButton();
        btnnull2 = new javax.swing.JButton();
        btnnull3 = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMensaje.setBackground(new java.awt.Color(0, 0, 154));
        lblMensaje.setForeground(new java.awt.Color(255, 255, 255));
        lblMensaje.setText("INGRESE SU CONTRASEÑA");
        getContentPane().add(lblMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 180, -1));

        txtPass.setBackground(new java.awt.Color(153, 153, 153));
        txtPass.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 270, -1));

        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/tbdel.png"))); // NOI18N
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 150, 50, 40));

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/tb int.png"))); // NOI18N
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 200, 50, 40));

        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/tb2.png"))); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 150, 40, 40));

        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/tb3.png"))); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 150, 40, 40));

        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/tb1.png"))); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, 40, 40));

        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/tb5.png"))); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 200, 40, 40));

        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/tb4.png"))); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, 40, 40));

        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/tb7.png"))); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 240, 40, 40));

        btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/tb8.png"))); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, 40, 40));

        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/tb6.png"))); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 200, 40, 40));

        btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/tb9.png"))); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 240, 40, 40));

        btn0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/tb0.png"))); // NOI18N
        btn0.setToolTipText("");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 290, 40, 40));

        btnnull0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/tbnull.png"))); // NOI18N
        getContentPane().add(btnnull0, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 240, 50, 40));

        btnnull1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/tbnull.png"))); // NOI18N
        getContentPane().add(btnnull1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 290, 50, 40));

        btnnull2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/tbnull.png"))); // NOI18N
        getContentPane().add(btnnull2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, 40, 40));

        btnnull3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/tbnull.png"))); // NOI18N
        getContentPane().add(btnnull3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 290, 40, 40));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Teclado.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if (this.txtPass.getText().isEmpty())
        {
            javax.swing.JOptionPane.showMessageDialog(this,
            "Clave no Ingresada","Datos Requeridos",
            javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        else if (this.evefclave.revisarClave(this.txtPass.getText()))
        {
            if (this.evefclave.consultarClave(this.txtPass.getText())){
                //Encontrado y todo en orden
                switch(this.formulario)
                {
                    case (1):
                    {
                        //Carga Transaccion
                        this.evefclave.construirCuenta();
                        Cuenta cuen = this.evefclave.getCuenta();
                        EveTransaccion evetran = new EveTransaccion(new Conexion(), cuen);
                        FrmTransaccion frm = new FrmTransaccion(this.evefclave,this.frmerror, evetran);
                        this.dispose();
                        frm.setVisible(true);
                        
                    }
                    break;
                    case (2):
                    {
                        //Carga Consignacion
                        this.evefclave.construirCuenta();
                        Cuenta cuen = this.evefclave.getCuenta();
                        EveFrmConsignacion evento = new EveFrmConsignacion(new Conexion(),cuen);
                        FrmConsignacion consignacion = new FrmConsignacion(this.frmerror,evento,this.evefclave);
                        dispose();
                        consignacion.setVisible(true);
                    }
                    break;
                    case (3):
                    {
                        //Carga Saldo
                        FrmSatisfactorio frms = new FrmSatisfactorio();
                        this.evefclave.construirCuenta();
                        Cuenta cuen = this.evefclave.getCuenta();
                        FrmSaldoDisponible frm = new FrmSaldoDisponible(cuen,frms);
                        dispose();
                        frm.setVisible(true);
                        
                    }
                    break;
                    case (4):
                    {
                        //Carga Historial
                        FrmSatisfactorio frms = new FrmSatisfactorio();
                        this.evefclave.construirCuenta();
                        Cuenta cuen = this.evefclave.getCuenta();
                        EveFrmHistorial eventos = new EveFrmHistorial(new Conexion());
                        FrmHistorial frm = new FrmHistorial(cuen,frms,eventos);
                        dispose();
                        frm.setVisible(true);
                    }
                    break;
                    case (5):
                    {
                        //Carga Transacciones Externas
                        FrmTransferenciaExterna frm = new FrmTransferenciaExterna();
                        this.dispose();
                        frm.setVisible(true);
                    }
                    break;
                }
            }
            else{
                //No encontrado, error
                if (this.evefclave.generarErrorHistoria())
                {
                    //Cargar el Formulario de error
                    dispose();
                    this.frmerror.setVisible(true);
                }
                else
                {
                    //Cerrar
                    System.exit(1);
                }
            }
        }
        else
        {
            javax.swing.JOptionPane.showMessageDialog(this,
            "Clave no Satisfactoria","Datos Mal Ingresados",
            javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        this.txtPass.setText("");
        this.txtPass.requestFocus();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        this.txtPass.setText(this.txtPass.getText()+"2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        this.txtPass.setText(this.txtPass.getText()+"3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        this.txtPass.setText(this.txtPass.getText()+"1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        this.txtPass.setText(this.txtPass.getText()+"5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        this.txtPass.setText(this.txtPass.getText()+"4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        this.txtPass.setText(this.txtPass.getText()+"7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        this.txtPass.setText(this.txtPass.getText()+"8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        this.txtPass.setText(this.txtPass.getText()+"6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        this.txtPass.setText(this.txtPass.getText()+"9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        this.txtPass.setText(this.txtPass.getText()+"0");
    }//GEN-LAST:event_btn0ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnnull0;
    private javax.swing.JButton btnnull1;
    private javax.swing.JButton btnnull2;
    private javax.swing.JButton btnnull3;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}
