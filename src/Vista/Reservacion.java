/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import hotel.DatosReservacion;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author Tito
 */
public class Reservacion extends javax.swing.JFrame {
    RegistroHabitacion registro = new RegistroHabitacion();
    ArrayList<DatosReservacion> listaReservaciones = new ArrayList();
    FondoPanel fondo = new FondoPanel();
   

    /**
     * Creates new form Reservacion
     */
    public Reservacion() {
        this.setContentPane(fondo);
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

        jPanel1 = new FondoPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jTextTelefono = new javax.swing.JTextField();
        jTextCedula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextDia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextMes = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextAnio = new javax.swing.JTextField();
        jButtonReservar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new FondoPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableHabitaciones = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new FondoPanel();
        jButtonHabitacionesDisponibles = new javax.swing.JButton();
        jButtonHabitacionesSuits = new javax.swing.JButton();
        jButtonHabitacionesIndividuales = new javax.swing.JButton();
        jButtonHabitacionMatrimonial = new javax.swing.JButton();
        jButtonHabitacionFamiliar = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Reservacion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 18), new java.awt.Color(204, 204, 204))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Nombre: ");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("C??dula: ");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Telefono: ");

        jTextNombre.setBackground(new java.awt.Color(204, 204, 204));

        jTextTelefono.setBackground(new java.awt.Color(204, 204, 204));

        jTextCedula.setBackground(new java.awt.Color(204, 204, 204));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Dia: ");

        jTextDia.setBackground(new java.awt.Color(204, 204, 204));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Mes: ");

        jTextMes.setBackground(new java.awt.Color(204, 204, 204));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("A??o: ");

        jTextAnio.setBackground(new java.awt.Color(204, 204, 204));

        jButtonReservar.setBackground(new java.awt.Color(51, 255, 204));
        jButtonReservar.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jButtonReservar.setText("RESERVAR");
        jButtonReservar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReservarActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 255, 102));
        jButton2.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jButton2.setText("LIMPIAR");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextDia, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextMes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextNombre)
                                    .addComponent(jTextTelefono)
                                    .addComponent(jTextCedula, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)))
                            .addComponent(jButtonReservar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonReservar, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Habitaciones disponibles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 24), new java.awt.Color(204, 204, 204))); // NOI18N

        jTableHabitaciones.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jTableHabitaciones.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jTableHabitaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Numeraci??n", "Tipo", "Estado", "Costo"
            }
        ));
        jScrollPane1.setViewportView(jTableHabitaciones);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Seleccione un habitaci??n");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 18), new java.awt.Color(204, 204, 204))); // NOI18N

        jButtonHabitacionesDisponibles.setBackground(new java.awt.Color(204, 204, 204));
        jButtonHabitacionesDisponibles.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jButtonHabitacionesDisponibles.setText("Mostrar habitaciones disponibles");
        jButtonHabitacionesDisponibles.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonHabitacionesDisponibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHabitacionesDisponiblesActionPerformed(evt);
            }
        });

        jButtonHabitacionesSuits.setBackground(new java.awt.Color(204, 204, 204));
        jButtonHabitacionesSuits.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jButtonHabitacionesSuits.setText("Mostrar habitaciones siuts");
        jButtonHabitacionesSuits.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonHabitacionesSuits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHabitacionesSuitsActionPerformed(evt);
            }
        });

        jButtonHabitacionesIndividuales.setBackground(new java.awt.Color(204, 204, 204));
        jButtonHabitacionesIndividuales.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jButtonHabitacionesIndividuales.setText("Mostrar habitaciones individuales");
        jButtonHabitacionesIndividuales.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonHabitacionesIndividuales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHabitacionesIndividualesActionPerformed(evt);
            }
        });

        jButtonHabitacionMatrimonial.setBackground(new java.awt.Color(204, 204, 204));
        jButtonHabitacionMatrimonial.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jButtonHabitacionMatrimonial.setText("Mostrar habitaciones matrimoniales");
        jButtonHabitacionMatrimonial.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonHabitacionMatrimonial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHabitacionMatrimonialActionPerformed(evt);
            }
        });

        jButtonHabitacionFamiliar.setBackground(new java.awt.Color(204, 204, 204));
        jButtonHabitacionFamiliar.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jButtonHabitacionFamiliar.setText("Mostrar habitaciones familiares");
        jButtonHabitacionFamiliar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonHabitacionFamiliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHabitacionFamiliarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonHabitacionesDisponibles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonHabitacionesSuits, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonHabitacionesIndividuales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonHabitacionMatrimonial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonHabitacionFamiliar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonHabitacionesDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonHabitacionesSuits, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonHabitacionesIndividuales, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonHabitacionMatrimonial, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonHabitacionFamiliar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton8.setBackground(new java.awt.Color(51, 204, 255));
        jButton8.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton8.setText("Regresar");
        jButton8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(220, 220, 220))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonHabitacionesIndividualesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHabitacionesIndividualesActionPerformed
        // TODO add your handling code here:
        filtroTipos("Individual","Disponible");
    }//GEN-LAST:event_jButtonHabitacionesIndividualesActionPerformed

    private void jButtonHabitacionMatrimonialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHabitacionMatrimonialActionPerformed
        // TODO add your handling code here:
        filtroTipos("Matrimonial","Disponible");
    }//GEN-LAST:event_jButtonHabitacionMatrimonialActionPerformed

    private void jButtonHabitacionFamiliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHabitacionFamiliarActionPerformed
        // TODO add your handling code here:
        filtroTipos("Familiar","Disponible");
    }//GEN-LAST:event_jButtonHabitacionFamiliarActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButtonReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReservarActionPerformed
        // TODO add your handling code here:
        int fila= this.jTableHabitaciones.getSelectedRow();
        if(fila<0){ 
            JOptionPane.showMessageDialog(null,"Seleccione una habitaci??n");
        }else{
            if(this.jTextNombre.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Poner su nombre");
            }if(this.jTextCedula.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Poner su c??dula"); 
            }if(this.jTextTelefono.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Poner su tel??fono");
            }if(this.jTextDia.getText().equals("")||this.jTextMes.getText().equals("")||
                    this.jTextAnio.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Completar la fecha de reservaci??n");
            }
            else{
                registro.hotel.getListaHabitaciones().get(fila).setEstado("RESERVADO");
                mostrar();
                //Variables que componen el objeto persona. 
                String nombre = this.jTextNombre.getText();
                String cedula = this.jTextCedula.getText();
                String telefono = this.jTextTelefono.getText();

                //Varibles que componen el objeto habitacion 
                String numeracion = registro.hotel.getListaHabitaciones().get(fila).getNumeracion();
                String tipo = registro.hotel.getListaHabitaciones().get(fila).getTipo();
                String estado= registro.hotel.getListaHabitaciones().get(fila).getEstado();

                //Variables que componen el objeto Fecha. 
                String dia = this.jTextDia.getText();
                String mes = this.jTextMes.getText();
                String anio = this.jTextAnio.getText();

                DatosReservacion reservacion = new DatosReservacion(nombre,cedula,telefono,numeracion,
                tipo,estado,dia,mes,anio); 
                listaReservaciones.add(reservacion);
                JOptionPane.showMessageDialog(null,"Habitaci??n reservada con ??xito");
            }
         }
    }//GEN-LAST:event_jButtonReservarActionPerformed
    //Metodo donde limpia los datos llenados. 
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.jTextNombre.setText(null);
        this.jTextCedula.setText(null);
        this.jTextTelefono.setText(null);
        this.jTextDia.setText(null);
        this.jTextMes.setText(null);
        this.jTextAnio.setText(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonHabitacionesDisponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHabitacionesDisponiblesActionPerformed
        // TODO add your handling code here:
        filtroDisponibles();
    }//GEN-LAST:event_jButtonHabitacionesDisponiblesActionPerformed

    private void jButtonHabitacionesSuitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHabitacionesSuitsActionPerformed
        // TODO add your handling code here:
        filtroTipos("Suit","Disponible");
    }//GEN-LAST:event_jButtonHabitacionesSuitsActionPerformed
    
    //M??todo para mostrar las habitaciones de un arreglo mediante una tabla.  
    public void mostrar(){
        String Vector [][]= new String [registro.hotel.getListaHabitaciones().size()][4];
        for(int i=0; i<registro.hotel.getListaHabitaciones().size();i++){
            arregloAuxiliar(i,Vector);

        }
        this.jTableHabitaciones.setModel(new javax.swing.table.DefaultTableModel( 
            Vector,new String [] { "N??mero", "Tipo", "Estado","Costo"}));
    }
    
    //Metodo para filtrar en pantalla las habitacioes que se requiere, en este caso las que esten displonibles.  
    private void filtroDisponibles(){
        String Vector [][]= new String [registro.hotel.getListaHabitaciones().size()][4];
        for(int i=0 ; i<registro.hotel.getListaHabitaciones().size();i++){
           if("Disponible".equals(registro.hotel.getListaHabitaciones().get(i).getEstado())){
               arregloAuxiliar(i,Vector);
           }
        this.jTableHabitaciones.setModel(new javax.swing.table.DefaultTableModel( 
            Vector,new String [] { "N??mero", "Tipo", "Estado","Costo"}));           
       }
    }
    //Metodo para filtrar en plantalla las habitaciones segun el tipo que se requieran. 
    private void filtroTipos(String Tipo , String Estado){
        String Vector [][]= new String [registro.hotel.getListaHabitaciones().size()][4];
        for(int i=0 ; i<registro.hotel.getListaHabitaciones().size();i++){
           if(Tipo.equals(registro.hotel.getListaHabitaciones().get(i).getTipo())&&Estado.equals(registro.
                   hotel.getListaHabitaciones().get(i).getEstado())){
               arregloAuxiliar(i,Vector);
           }
        this.jTableHabitaciones.setModel(new javax.swing.table.DefaultTableModel( 
            Vector,new String [] { "N??mero", "Tipo", "Estado","Costo"}));           
       }
    }
    
    private void arregloAuxiliar(int i, String Vector [][]){
        Vector [i][0]=registro.hotel.getListaHabitaciones().get(i).getNumeracion();
        Vector [i][1]=registro.hotel.getListaHabitaciones().get(i).getTipo();
        Vector [i][2]=registro.hotel.getListaHabitaciones().get(i).getEstado();
        Vector [i][3]=String.valueOf(registro.hotel.getListaHabitaciones().get(i).getCosto());
    }
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
            java.util.logging.Logger.getLogger(Reservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reservacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButtonHabitacionFamiliar;
    private javax.swing.JButton jButtonHabitacionMatrimonial;
    private javax.swing.JButton jButtonHabitacionesDisponibles;
    private javax.swing.JButton jButtonHabitacionesIndividuales;
    private javax.swing.JButton jButtonHabitacionesSuits;
    private javax.swing.JButton jButtonReservar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableHabitaciones;
    private javax.swing.JTextField jTextAnio;
    private javax.swing.JTextField jTextCedula;
    private javax.swing.JTextField jTextDia;
    private javax.swing.JTextField jTextMes;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextTelefono;
    // End of variables declaration//GEN-END:variables
    class FondoPanel extends JPanel{
        private Image imagen;
        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/Imagenes/36779.jpg")).getImage();
            g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
            setOpaque(false);
            super.paint(g);
        }
    }
}
