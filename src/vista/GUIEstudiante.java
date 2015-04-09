/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControlEstudiante;
import javax.swing.JOptionPane;
import modelo.RegistroEstudiante;

/**
 *
 * @author aaron
 */
public class GUIEstudiante extends javax.swing.JFrame {

    /**
     * Creates new form GUIEstudiante
     */
    private ControlEstudiante controlEstudiante;
    private RegistroEstudiante registroEst;
    
    public GUIEstudiante(RegistroEstudiante registroEstudiante) {
        registroEst=registroEstudiante;
        
        initComponents();
        controlEstudiante=new ControlEstudiante(panelEstudiante1,panelBotones1,registroEst,this);
        panelBotones1.escuchar(controlEstudiante);
        panelEstudiante1.escucharConsulta(controlEstudiante);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEstudiante1 = new vista.PanelEstudiante();
        panelBotones1 = new vista.PanelBotones();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema de Registro de Estudiantes (SIRES)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEstudiante1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelBotones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelEstudiante1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelBotones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private vista.PanelBotones panelBotones1;
    private vista.PanelEstudiante panelEstudiante1;
    // End of variables declaration//GEN-END:variables

    public static void mensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }
}











