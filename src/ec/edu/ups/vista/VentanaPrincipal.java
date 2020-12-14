/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorAdministrador;
import ec.edu.ups.controlador.ControladorCliente;
import ec.edu.ups.controlador.ControladorContrato;
import ec.edu.ups.controlador.ControladorFactura;
import ec.edu.ups.controlador.ControladorSitio;
import ec.edu.ups.controlador.ControladorUsuario;
import ec.edu.ups.controlador.ControladorVehiculo;
import javax.swing.JDesktopPane;
import javax.swing.JMenuItem;

/**
 *
 * @author NANCY
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private ControladorAdministrador controladorAdministrador;
    private ControladorUsuario controladorUsuario;
    private ControladorCliente controladorCliente;
    private ControladorVehiculo controladorVehiculo;
    private ControladorSitio controladorSitio;
    private ControladorFactura controladorFactura;
    private ControladorContrato controladorContrato;
    
    private VentanaCrearUusuario ventanaCrearUusuario;
    private VentanaIniciarSesion ventanaIniciarSesion;
    private VentanaCrearCliente ventanaCrearCliente;
    private VentanaGestionVehiculo ventanaGestionVehiculo;
    private VentanaSitios ventanaSitios;
    private VentanaTiketIngreso ventanaTiketIngreso;
    private VentanaCobro ventanaCobro;
    private VentanaContrato ventanaContrato;
    private VentanaListarFacturasYContratos ventanaListarFacturasYContratos;
    private VentanaCrearSitios ventanaCrearSitios;
    private String keyUnlock;
    
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        
        controladorAdministrador = new ControladorAdministrador();
        controladorUsuario = new ControladorUsuario("datos/usuarios.obj");
        controladorCliente = new ControladorCliente("datos/cliente.obj");
        controladorVehiculo= new ControladorVehiculo("datos/vehiculo.obj");
        controladorSitio= new ControladorSitio("datos/sitios.obj");
        controladorFactura = new ControladorFactura("datos/facturas.obj");
        controladorContrato= new ControladorContrato("datos/contratos.obj");
        keyUnlock="Proyecto";
        
        ventanaCrearUusuario = new VentanaCrearUusuario(controladorUsuario,keyUnlock);
        ventanaCrearCliente= new VentanaCrearCliente(controladorCliente);
        ventanaGestionVehiculo= new VentanaGestionVehiculo(controladorVehiculo,controladorCliente,this,ventanaCrearCliente);
        ventanaTiketIngreso= new VentanaTiketIngreso(controladorFactura,controladorSitio,controladorVehiculo,controladorCliente);
        ventanaSitios= new VentanaSitios(controladorSitio,controladorVehiculo,controladorCliente,this,ventanaGestionVehiculo,ventanaTiketIngreso);
        ventanaCobro= new VentanaCobro(controladorFactura,controladorSitio);
        ventanaContrato= new VentanaContrato(controladorContrato,controladorSitio,controladorVehiculo,controladorCliente,this,ventanaGestionVehiculo);
        ventanaCrearSitios= new VentanaCrearSitios(ventanaSitios);
        ventanaListarFacturasYContratos = new VentanaListarFacturasYContratos(controladorContrato,controladorFactura);
        ventanaIniciarSesion= new VentanaIniciarSesion(controladorAdministrador,controladorUsuario,this,keyUnlock);
        
        menuItemCerrarSesion.setVisible(false);
        menuItemCobrar.setVisible(false);
        menuItemContratos.setVisible(false);
        menuItemCrearUsuario.setVisible(false);
        menuItemGestionVehiculo.setVisible(false);
        menuItemSitios.setVisible(false);
        menuItemCrearCliente.setVisible(false);
        menuItemListarFacturasYContratos.setVisible(false);
        menuItemAbrirSitios.setVisible(false);
        desktopPane.add(ventanaTiketIngreso);
        
        //controladorSitio.crearSitios();
    }

    public JDesktopPane getDesktopPane() {
        return desktopPane;
    }

    public JMenuItem getMenuItemCerrarSesion() {
        return menuItemCerrarSesion;
    }

    public JMenuItem getMenuItemCobrar() {
        return menuItemCobrar;
    }

    public JMenuItem getMenuItemContratos() {
        return menuItemContratos;
    }

   

    public JMenuItem getMenuItemCrearUsuario() {
        return menuItemCrearUsuario;
    }

    public JMenuItem getMenuItemGestionVehiculo() {
        return menuItemGestionVehiculo;
    }

    public JMenuItem getMenuItemIniciarSesion() {
        return menuItemIniciarSesion;
    }

    public JMenuItem getMenuItemSitios() {
        return menuItemSitios;
    }

    public JMenuItem getMenuItemCrearCliente() {
        return menuItemCrearCliente;
    }

    public JMenuItem getMenuItemListarFacturasYContratos() {
        return menuItemListarFacturasYContratos;
    }

    public JMenuItem getMenuItemAbrirSitios() {
        return menuItemAbrirSitios;
    }
    
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        menuItemIniciarSesion = new javax.swing.JMenuItem();
        menuItemCrearUsuario = new javax.swing.JMenuItem();
        menuItemCrearCliente = new javax.swing.JMenuItem();
        menuItemGestionVehiculo = new javax.swing.JMenuItem();
        menuItemSitios = new javax.swing.JMenuItem();
        menuItemAbrirSitios = new javax.swing.JMenuItem();
        menuItemCobrar = new javax.swing.JMenuItem();
        menuItemContratos = new javax.swing.JMenuItem();
        menuItemListarFacturasYContratos = new javax.swing.JMenuItem();
        menuItemCerrarSesion = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        menuItemIniciarSesion.setMnemonic('o');
        menuItemIniciarSesion.setText("Iniciar Sesion");
        menuItemIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemIniciarSesionActionPerformed(evt);
            }
        });
        fileMenu.add(menuItemIniciarSesion);

        menuItemCrearUsuario.setMnemonic('s');
        menuItemCrearUsuario.setText("Crear Usuario");
        menuItemCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCrearUsuarioActionPerformed(evt);
            }
        });
        fileMenu.add(menuItemCrearUsuario);

        menuItemCrearCliente.setMnemonic('a');
        menuItemCrearCliente.setText("CrearCliente");
        menuItemCrearCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCrearClienteActionPerformed(evt);
            }
        });
        fileMenu.add(menuItemCrearCliente);

        menuItemGestionVehiculo.setText("Gestion Vehiculo");
        menuItemGestionVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemGestionVehiculoActionPerformed(evt);
            }
        });
        fileMenu.add(menuItemGestionVehiculo);

        menuItemSitios.setText("Sitios");
        menuItemSitios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSitiosActionPerformed(evt);
            }
        });
        fileMenu.add(menuItemSitios);

        menuItemAbrirSitios.setText("Abrir Sitios");
        menuItemAbrirSitios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAbrirSitiosActionPerformed(evt);
            }
        });
        fileMenu.add(menuItemAbrirSitios);

        menuItemCobrar.setText("Cobrar");
        menuItemCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCobrarActionPerformed(evt);
            }
        });
        fileMenu.add(menuItemCobrar);

        menuItemContratos.setText("Contratos");
        menuItemContratos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemContratosActionPerformed(evt);
            }
        });
        fileMenu.add(menuItemContratos);

        menuItemListarFacturasYContratos.setText("Listar Facturas y Contratos");
        menuItemListarFacturasYContratos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListarFacturasYContratosActionPerformed(evt);
            }
        });
        fileMenu.add(menuItemListarFacturasYContratos);

        menuItemCerrarSesion.setText("Cerrar Sesion");
        menuItemCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCerrarSesionActionPerformed(evt);
            }
        });
        fileMenu.add(menuItemCerrarSesion);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void menuItemIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemIniciarSesionActionPerformed
        desktopPane.add(ventanaIniciarSesion);
        ventanaIniciarSesion.setVisible(true);
    }//GEN-LAST:event_menuItemIniciarSesionActionPerformed

    private void menuItemCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCrearUsuarioActionPerformed
        desktopPane.add(ventanaCrearUusuario);
        ventanaCrearUusuario.setVisible(true);
    }//GEN-LAST:event_menuItemCrearUsuarioActionPerformed

    private void menuItemCrearClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCrearClienteActionPerformed
        desktopPane.add(ventanaCrearCliente);
        ventanaCrearCliente.setVisible(true);
    }//GEN-LAST:event_menuItemCrearClienteActionPerformed

    private void menuItemGestionVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemGestionVehiculoActionPerformed
        desktopPane.add(ventanaGestionVehiculo);
        ventanaGestionVehiculo.setVisible(true);
    }//GEN-LAST:event_menuItemGestionVehiculoActionPerformed

    private void menuItemSitiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSitiosActionPerformed
        desktopPane.add(ventanaSitios);
        ventanaSitios.setVisible(true);
    }//GEN-LAST:event_menuItemSitiosActionPerformed

    private void menuItemCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCobrarActionPerformed
        desktopPane.add(ventanaCobro);
        ventanaCobro.setVisible(true);
    }//GEN-LAST:event_menuItemCobrarActionPerformed

    private void menuItemContratosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemContratosActionPerformed
        desktopPane.add(ventanaContrato);
        ventanaContrato.setVisible(true);
    }//GEN-LAST:event_menuItemContratosActionPerformed

    private void menuItemCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCerrarSesionActionPerformed
        menuItemCerrarSesion.setVisible(false);
        menuItemCobrar.setVisible(false);
        menuItemContratos.setVisible(false);
        menuItemCrearUsuario.setVisible(false);
        menuItemGestionVehiculo.setVisible(false);
        menuItemSitios.setVisible(false);
        menuItemCrearCliente.setVisible(false);
        menuItemListarFacturasYContratos.setVisible(false);
        menuItemAbrirSitios.setVisible(false);
        menuItemIniciarSesion.setVisible(true);
    }//GEN-LAST:event_menuItemCerrarSesionActionPerformed

    private void menuItemListarFacturasYContratosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListarFacturasYContratosActionPerformed
        desktopPane.add(ventanaListarFacturasYContratos);
        ventanaListarFacturasYContratos.setVisible(true);
    }//GEN-LAST:event_menuItemListarFacturasYContratosActionPerformed

    private void menuItemAbrirSitiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAbrirSitiosActionPerformed
        desktopPane.add(ventanaCrearSitios);
        ventanaCrearSitios.setVisible(true);
    }//GEN-LAST:event_menuItemAbrirSitiosActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuItemAbrirSitios;
    private javax.swing.JMenuItem menuItemCerrarSesion;
    private javax.swing.JMenuItem menuItemCobrar;
    private javax.swing.JMenuItem menuItemContratos;
    private javax.swing.JMenuItem menuItemCrearCliente;
    private javax.swing.JMenuItem menuItemCrearUsuario;
    private javax.swing.JMenuItem menuItemGestionVehiculo;
    private javax.swing.JMenuItem menuItemIniciarSesion;
    private javax.swing.JMenuItem menuItemListarFacturasYContratos;
    private javax.swing.JMenuItem menuItemSitios;
    // End of variables declaration//GEN-END:variables

}
