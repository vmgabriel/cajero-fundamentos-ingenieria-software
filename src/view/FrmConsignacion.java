/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.EveFrmClave;
import controller.EveFrmConsignacion;

/**
 *
 * @author admin
 */
public class FrmConsignacion extends javax.swing.JFrame {

    /**
     * Creates new form FrmConsignacion
     */
    private FrmError frmerror;
    private EveFrmConsignacion eveconsignacion;
    private EveFrmClave eveclave;
    public FrmConsignacion(FrmError frmerror, EveFrmConsignacion frmconsignacion, EveFrmClave eveclave) {
        initComponents();
        this.frmerror = frmerror;
        this.eveconsignacion = frmconsignacion;
        this.eveclave = eveclave;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnConsignar = new javax.swing.JButton();
        txtMonto = new javax.swing.JTextField();
        lblCantidad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnConsignar.setText("Ingresar Monto");
        btnConsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsignarActionPerformed(evt);
            }
        });

        txtMonto.setText("Cantidad a Consignar");

        lblCantidad.setText("Ingrese la cantidad a Consignar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtMonto)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnConsignar)))
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCantidad)
                        .addContainerGap(234, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addComponent(lblCantidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConsignar)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsignarActionPerformed
        //Hello
        if (this.txtMonto.getText().isEmpty())
        {
            this.mostrarError();
        }
        else if (Integer.parseInt(this.txtMonto.getText()) < 0 ||
                Integer.parseInt(this.txtMonto.getText()) > 2000000)
        {
            javax.swing.JOptionPane.showMessageDialog(this,
                "La consignacion tiene que ser mayor a cero y menor a 2.000.000",
                "Datos mal Introducidos",javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            this.enviarTransaccion();
        }
    }//GEN-LAST:event_btnConsignarActionPerformed

    private void enviarTransaccion()
    {
        if (this.eveconsignacion.enviarConsignacion(txtMonto.getText()))
        {
            this.cargarSatisfactorio();
        }
        else
        {
            javax.swing.JOptionPane.showMessageDialog(this,
                "Error Inesperado a la hora de enviar",
                "???",javax.swing.JOptionPane.ERROR_MESSAGE);
            //Cerrar en el peor de los casos que la base de datos se halla cerrado
            System.exit(1);
        }
    }
    
    private void cargarSatisfactorio()
    {
        FrmSatisfactorio frm = new FrmSatisfactorio();
        this.dispose();
        frm.setVisible(true);
    }
    
    private void mostrarError()
    {
        if (this.eveclave.generarErrorHistoria())
            {
                //Cargar el Formulario de error
                this.dispose();
                this.frmerror.setVisible(true);
            }
            else
            {
                //Cerrar en el peor de los casos que la base de datos se halla cerrado
                System.exit(1);
            }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsignar;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables
}