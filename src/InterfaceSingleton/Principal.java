/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceSingleton;

import PizzasOaxaca.*;
import PaqueteDecorador.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author manuel
 */
public class Principal extends javax.swing.JFrame implements ActionListener {
    private FabricaPizza pedido;
    private Pizza pizza;
    private String pizzas = "";
    
    private static Principal instance; 
    
    public static Principal getInstance(int x){
        if(instance == null){
            instance = new Principal(x);
        }
        return instance;
    }
    
    private Principal(int x) {
        initComponents();
        setSize(790, 550);
        setResizable(false);
        setVisible(true);
        setTitle("Realiza el pedido!!");
        palitosPan.addActionListener(this);
        palitosRellenos.addActionListener(this);
        quePapas.addActionListener(this);
        popsQueso.addActionListener(this);
        combos.addActionListener(this);
        hawaiana.addActionListener(this);
        pepperoni.addActionListener(this);
        queso.addActionListener(this);
        vegetariana.addActionListener(this);
        if(x == 1){
            pedido= new HUAPizzaSucursal();
        }
        else if(x == 2){
            pedido= new OAXPizzaSucursal();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        combos = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        hawaiana = new javax.swing.JCheckBox();
        queso = new javax.swing.JCheckBox();
        pepperoni = new javax.swing.JCheckBox();
        vegetariana = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        palitosPan = new javax.swing.JCheckBox();
        quePapas = new javax.swing.JCheckBox();
        palitosRellenos = new javax.swing.JCheckBox();
        popsQueso = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel6.setText("Paquete");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 110, 30);

        combos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ninguno", "Pareja", "Familia", "Con Todos" }));
        combos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combosActionPerformed(evt);
            }
        });
        getContentPane().add(combos);
        combos.setBounds(0, 30, 120, 40);

        jLabel2.setText("Pizzas");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(270, 100, 130, 40);

        hawaiana.setText("Hawaiana");
        getContentPane().add(hawaiana);
        hawaiana.setBounds(270, 140, 98, 21);

        queso.setText("Queso");
        getContentPane().add(queso);
        queso.setBounds(380, 140, 65, 21);

        pepperoni.setText("Pepperoni");
        getContentPane().add(pepperoni);
        pepperoni.setBounds(270, 170, 92, 21);

        vegetariana.setText("Vegetariana");
        getContentPane().add(vegetariana);
        vegetariana.setBounds(380, 170, 120, 21);

        jLabel3.setText("Agregar extras");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 270, 120, 30);

        palitosPan.setText("Palitos de Pan");
        palitosPan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                palitosPanActionPerformed(evt);
            }
        });
        getContentPane().add(palitosPan);
        palitosPan.setBounds(20, 300, 124, 21);

        quePapas.setText("QuePapas");
        getContentPane().add(quePapas);
        quePapas.setBounds(170, 300, 110, 21);

        palitosRellenos.setText("Palitos Rellenos");
        getContentPane().add(palitosRellenos);
        palitosRellenos.setBounds(20, 330, 134, 21);

        popsQueso.setText("Pops de Queso");
        getContentPane().add(popsQueso);
        popsQueso.setBounds(170, 330, 130, 21);

        jTextArea1.setColumns(8);
        jTextArea1.setRows(3);
        jTextArea1.setTabSize(4);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 100, 260, 120);

        jLabel4.setText("Descripcion Pizza");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(500, 70, 180, 30);

        jLabel5.setText("Pedido");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 360, 140, 30);

        jTextArea2.setColumns(10);
        jTextArea2.setRows(4);
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 390, 620, 110);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(500, 100, 280, 120);

        jLabel7.setText("Descripcion Paquete");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 70, 180, 30);

        jLabel8.setText("Descripcion");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 70, 180, 30);

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(650, 430, 100, 40);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfaceSingleton/Fiesta Toy story 12.JPG"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(-150, 0, 960, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combosActionPerformed

    }//GEN-LAST:event_combosActionPerformed

    private void palitosPanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_palitosPanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_palitosPanActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Realizando pedido");
        JOptionPane.showMessageDialog(null,"Confirmo su orden\n"+jTextArea2.getText());
        JOptionPane.showMessageDialog(null,"Las pizzas ordenadas dentro de su paquete son:"+pizzas);
        System.out.println(pizzas);
        seleccionPizza();
        pizzas = "";
        jTextArea1.setText("");
        jTextArea2.setText("");
        jTextArea3.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox combos;
    private javax.swing.JCheckBox hawaiana;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JCheckBox palitosPan;
    private javax.swing.JCheckBox palitosRellenos;
    private javax.swing.JCheckBox pepperoni;
    private javax.swing.JCheckBox popsQueso;
    private javax.swing.JCheckBox quePapas;
    private javax.swing.JCheckBox queso;
    private javax.swing.JCheckBox vegetariana;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if (combos.getSelectedIndex() == 1) {
            Paquete pareja = new PaquetePareja();
            jTextArea1.setText(pareja.getDescripcion());
            realizarPaquete(pareja);
        } else if (combos.getSelectedIndex() == 2) {
            Paquete Familia = new PaqueteFamilia();
            jTextArea1.setText(Familia.getDescripcion());
            realizarPaquete(Familia);
        } else if (combos.getSelectedIndex() == 3) {
            Paquete conTodos = new PaqueteConTodos();
            jTextArea1.setText(conTodos.getDescripcion());
            realizarPaquete(conTodos);
        } else {
            JOptionPane.showMessageDialog(null, "No ha realizado ningun pedido", "Advertencia!!!", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void infoPizza() {
        if (hawaiana.isSelected()) {
            pizza = pedido.crearPizza("Hawaiana");
            jTextArea3.setText(pizza.toString());
        }
        if (pepperoni.isSelected()) {
            pizza = pedido.crearPizza("Pepperoni");
            jTextArea3.setText(pizza.toString());

        }
        if (queso.isSelected()) {
            pizza = pedido.crearPizza("Queso");
            jTextArea3.setText(pizza.toString());
        }
        if (vegetariana.isSelected()) {
            pizza = pedido.crearPizza("Vegetariana");
            jTextArea3.setText(pizza.toString());
        }
    }

    private void seleccionPizza() {
        if (hawaiana.isSelected()) {
            pizza = pedido.ordenPizza("Hawaiana");
        }
        if (pepperoni.isSelected()) {
            pizza = pedido.ordenPizza("Pepperoni");
        }
        if (queso.isSelected()) {
            pizza = pedido.ordenPizza("Queso");
        }
        if (vegetariana.isSelected()) {
            pizza = pedido.ordenPizza("Vegetariana");
        }
    }
    
    private void realizarPaquete(Paquete paquete) {
        infoPizza();
        if (palitosPan.isSelected()) {
            paquete = new DCPalitosDePan(paquete);
        }
        if (palitosRellenos.isSelected()) {
            paquete = new DCPalitosRellenos(paquete);
        }
        if (quePapas.isSelected()) {
            paquete = new DCQuePapas(paquete);
        }
        if (popsQueso.isSelected()) {
            paquete = new DCPopsDeQueso(paquete);
        }
        jTextArea2.setText("Su Pedido: \n" + paquete.getDescripcion() + "\n"
                + "Valor:\n$" + paquete.valor());
    }
}
