/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlumnosConListas;

import javax.swing.JOptionPane;

/**
 *
 * @author ilichh1
 */
public class AlumnosVista extends javax.swing.JFrame {
    public static final ListaAlumnos ALUMNOS = new ListaAlumnos();
    private boolean showList = false;

    /**
     * Creates new form AlumnosVista
     */
    public AlumnosVista() {
        initComponents();
        customInit();
    }
    
    private void customInit() {
        // setLocationRelativeTo(null);
        verTodosPanel.setVisible(false);
        contadorLabel.setText(ALUMNOS.getSize() + " registro(s).");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registroPanel = new javax.swing.JPanel();
        guardarButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        codigoTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        edadTxt = new javax.swing.JTextField();
        contadorLabel = new javax.swing.JLabel();
        actionButton = new javax.swing.JButton();
        verTodosPanel = new javax.swing.JPanel();
        nombreLabel = new javax.swing.JLabel();
        codigoLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        edadLabel = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        guardarButton.setText("Guardar");
        guardarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarButtonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel7.setText("Registro");

        jLabel1.setText("Codigo:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Edad");

        contadorLabel.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        contadorLabel.setText("0 registo(s).");

        javax.swing.GroupLayout registroPanelLayout = new javax.swing.GroupLayout(registroPanel);
        registroPanel.setLayout(registroPanelLayout);
        registroPanelLayout.setHorizontalGroup(
            registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registroPanelLayout.createSequentialGroup()
                .addGap(0, 117, Short.MAX_VALUE)
                .addComponent(guardarButton))
            .addGroup(registroPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registroPanelLayout.createSequentialGroup()
                        .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edadTxt)
                            .addComponent(codigoTxt)
                            .addComponent(nombreTxt)))
                    .addGroup(registroPanelLayout.createSequentialGroup()
                        .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(contadorLabel))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        registroPanelLayout.setVerticalGroup(
            registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registroPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contadorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(codigoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(edadTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guardarButton))
        );

        actionButton.setText("Ver registros");
        actionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionButtonActionPerformed(evt);
            }
        });

        nombreLabel.setText("Nombre: ");

        codigoLabel.setText("Codigo:");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel6.setText("Alumnos");

        edadLabel.setText("Edad:");

        jButton3.setText("Siguiente");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout verTodosPanelLayout = new javax.swing.GroupLayout(verTodosPanel);
        verTodosPanel.setLayout(verTodosPanelLayout);
        verTodosPanelLayout.setHorizontalGroup(
            verTodosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(verTodosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(verTodosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreLabel)
                    .addComponent(codigoLabel)
                    .addComponent(jLabel6)
                    .addComponent(edadLabel))
                .addContainerGap(105, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, verTodosPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton3))
        );
        verTodosPanelLayout.setVerticalGroup(
            verTodosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(verTodosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(codigoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nombreLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(edadLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registroPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(actionButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(verTodosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(verTodosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(actionButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(registroPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void actionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionButtonActionPerformed
        toggleList();
    }//GEN-LAST:event_actionButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        mostrarSiguienteNodo();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void guardarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarButtonActionPerformed
        // TODO add your handling code here:
        if (ALUMNOS.getSize() == 7) {
            showMessage(
                    "Limite de tamaño",
                    "No se pueden agregar más alumnos",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        int codigo = -1;
        int edad = -1;
        String nombre = "";
        nombre = nombreTxt.getText();
        try {
            codigo = Integer.parseInt(codigoTxt.getText());
            edad = Integer.parseInt(edadTxt.getText());
        } catch (NumberFormatException e) {
            showMessage(
                    "Datos invalidos",
                    "Los valores introducidos para edad o codigo son incorrectos.",
                    JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getLocalizedMessage());
            return;
        }
        if (codigo == -1 && edad == -1 && nombre.isEmpty()) {
            showMessage(
                    "Datos faltantes",
                    "No ha introducido todos los datos",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        ALUMNOS.agregar(new Alumno(codigo, nombre, edad));
        showMessage(
                "Éxito",
                "Alumno registrado exitosamente.",
                JOptionPane.PLAIN_MESSAGE);
        clearInputs();
        contadorLabel.setText(ALUMNOS.getSize() + " registro(s).");
    }//GEN-LAST:event_guardarButtonActionPerformed
    
    private void mostrarSiguienteNodo() {
        Nodo siguienteNodo = ALUMNOS.getSiguienteNodo();
        if (siguienteNodo == null) {
            showMessage(
                    "Fin de la lista",
                    "Ha llegado al final de la lista",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        setLabelsData(siguienteNodo.getValor());
    }
    
    private void setLabelsData(Alumno a) {
        codigoLabel.setText("Código: " + a.getCodigo());
        nombreLabel.setText("Nombre: " + a.getNombre());
        edadLabel.setText("Edad: " + a.getEdad());
    }
    
    private void clearLabels() {
        codigoLabel.setText("Código: ");
        nombreLabel.setText("Nombre: ");
        edadLabel.setText("Edad: ");
    }
    
    private void clearInputs() {
        codigoTxt.setText(null);
        nombreTxt.setText(null);
        edadTxt.setText(null);
    }
    
    private void toggleList() {
        if (showList) {
            actionButton.setText("Ver todos");
            verTodosPanel.setVisible(false);
            registroPanel.setVisible(true);
            showList = false;
        } else {
            actionButton.setText("Registrar alumnos");
            clearLabels();
            mostrarSiguienteNodo();
            verTodosPanel.setVisible(true);
            registroPanel.setVisible(false);
            showList = true;
        }
    }
    
    private void showMessage(String title, String msg, int option) {
        JOptionPane.showMessageDialog(this, msg, title, option);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        ALUMNOS.agregar(new Alumno(001, "Ilich Arredondo", 21));
        ALUMNOS.agregar(new Alumno(002, "Samir Arredondo", 20));
        ALUMNOS.agregar(new Alumno(004, "Alan Castañeda", 25));
        ALUMNOS.agregar(new Alumno(005, "Miguel De Loera", 22));
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
            java.util.logging.Logger.getLogger(AlumnosVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlumnosVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlumnosVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlumnosVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlumnosVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actionButton;
    private javax.swing.JLabel codigoLabel;
    private javax.swing.JTextField codigoTxt;
    private javax.swing.JLabel contadorLabel;
    private javax.swing.JLabel edadLabel;
    private javax.swing.JTextField edadTxt;
    private javax.swing.JButton guardarButton;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JPanel registroPanel;
    private javax.swing.JPanel verTodosPanel;
    // End of variables declaration//GEN-END:variables
}