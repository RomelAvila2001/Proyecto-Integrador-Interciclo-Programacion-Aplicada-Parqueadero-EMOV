/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorCliente;
import ec.edu.ups.controlador.ControladorSitio;
import ec.edu.ups.controlador.ControladorVehiculo;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Sitio;
import ec.edu.ups.modelo.Vehiculo;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author NANCY
 */
public class VentanaSitios extends javax.swing.JInternalFrame {

    private ControladorCliente controladorCliente;
    private ControladorVehiculo controladorVehiculo;
    private ControladorSitio controladorSitio;
    private VentanaPrincipal ventanaPrincipal;
    private VentanaGestionVehiculo ventanaGestionVehiculo;
    private VentanaTiketIngreso ventanaTiketIngreso;
    /**
     * Creates new form VentanaSitios
     * @param controladorSitio
     * @param controladorVehiculo
     * @param controladorCliente
     * @param ventanaPrincipal
     * @param ventanaGestionVehiculo
     * @param ventanaTiketIngreso
     */
    public VentanaSitios(ControladorSitio controladorSitio,ControladorVehiculo controladorVehiculo,ControladorCliente controladorCliente
            , VentanaPrincipal ventanaPrincipal, VentanaGestionVehiculo ventanaGestionVehiculo, VentanaTiketIngreso ventanaTiketIngreso) {
        initComponents();
        
        this.controladorSitio=controladorSitio;
        this.controladorVehiculo=controladorVehiculo;
        this.controladorCliente= controladorCliente;
        this.ventanaPrincipal=ventanaPrincipal;
        this.ventanaGestionVehiculo=ventanaGestionVehiculo;
        this.ventanaTiketIngreso= ventanaTiketIngreso;
        
        btn51.setVisible(false);
        btn52.setVisible(false);
        btn53.setVisible(false);
        btn54.setVisible(false);
        btn55.setVisible(false);
        btn56.setVisible(false);
        btn57.setVisible(false);
        btn58.setVisible(false);
        btn59.setVisible(false);
        btn60.setVisible(false);
        txt51.setVisible(false);
        txt52.setVisible(false);
        txt53.setVisible(false);
        txt54.setVisible(false);
        txt55.setVisible(false);
        txt56.setVisible(false);
        txt57.setVisible(false);
        txt58.setVisible(false);
        txt59.setVisible(false);
        txt60.setVisible(false);
    }

    public JButton getBtn51() {
        return btn51;
    }

    public JButton getBtn52() {
        return btn52;
    }

    public JButton getBtn53() {
        return btn53;
    }

    public JButton getBtn54() {
        return btn54;
    }

    public JButton getBtn55() {
        return btn55;
    }

    public JButton getBtn56() {
        return btn56;
    }

    public JButton getBtn57() {
        return btn57;
    }

    public JButton getBtn58() {
        return btn58;
    }

    public JButton getBtn59() {
        return btn59;
    }

    public JButton getBtn60() {
        return btn60;
    }

    public JTextField getTxt51() {
        return txt51;
    }

    public JTextField getTxt52() {
        return txt52;
    }

    public JTextField getTxt53() {
        return txt53;
    }

    public JTextField getTxt54() {
        return txt54;
    }

    public JTextField getTxt55() {
        return txt55;
    }

    public JTextField getTxt56() {
        return txt56;
    }

    public JTextField getTxt57() {
        return txt57;
    }

    public JTextField getTxt58() {
        return txt58;
    }

    public JTextField getTxt59() {
        return txt59;
    }

    public JTextField getTxt60() {
        return txt60;
    }
    
    
    

    public void validarEstado(){
        controladorSitio.getListaGenerica().stream().map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn1.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn1.setEnabled(true);
                    txt1.setBackground(Color.WHITE);
                    txt1.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn1.setEnabled(false);
                        txt1.setBackground(Color.RED);
                        txt1.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn1.setEnabled(false);
                            txt1.setBackground(Color.BLUE);
                            txt1.setText("C");
                        }
                    }
                }   
            }
            return sitio;            
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn2.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn2.setEnabled(true);
                    txt2.setBackground(Color.WHITE);
                    txt2.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn2.setEnabled(false);
                        txt2.setBackground(Color.RED);
                        txt2.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn2.setEnabled(false);
                            txt2.setBackground(Color.BLUE);
                            txt2.setText("C");
                        }
                    }
                }   
            }
            return sitio;            
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn3.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn3.setEnabled(true);
                    txt3.setBackground(Color.WHITE);
                    txt3.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn3.setEnabled(false);
                        txt3.setBackground(Color.RED);
                        txt3.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn3.setEnabled(false);
                            txt3.setBackground(Color.BLUE);
                            txt3.setText("C");
                        }
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn4.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn4.setEnabled(true);
                    txt4.setBackground(Color.WHITE);
                    txt4.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn4.setEnabled(false);
                        txt4.setBackground(Color.RED);
                        txt4.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn4.setEnabled(false);
                            txt4.setBackground(Color.BLUE);
                            txt4.setText("C");
                        }
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn5.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn5.setEnabled(true);
                    txt5.setBackground(Color.WHITE);
                    txt5.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn5.setEnabled(false);
                        txt5.setBackground(Color.RED);
                        txt5.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn5.setEnabled(false);
                            txt5.setBackground(Color.BLUE);
                            txt5.setText("C");
                        }
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn6.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn6.setEnabled(true);
                    txt6.setBackground(Color.WHITE);
                    txt6.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn6.setEnabled(false);
                        txt6.setBackground(Color.RED);
                        txt6.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn6.setEnabled(false);
                            txt6.setBackground(Color.BLUE);
                            txt6.setText("C");
                        }
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn7.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn7.setEnabled(true);
                    txt7.setBackground(Color.WHITE);
                    txt7.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn7.setEnabled(false);
                        txt7.setBackground(Color.RED);
                        txt7.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn7.setEnabled(false);
                            txt7.setBackground(Color.BLUE);
                            txt7.setText("C");
                        }
                    }
                }   
            }
            return sitio;            
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn8.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn8.setEnabled(true);
                    txt8.setBackground(Color.WHITE);
                    txt8.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn8.setEnabled(false);
                        txt8.setBackground(Color.RED);
                        txt8.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn8.setEnabled(false);
                            txt8.setBackground(Color.BLUE);
                            txt8.setText("C");
                        }
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn9.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn9.setEnabled(true);
                    txt9.setBackground(Color.WHITE);
                    txt9.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn9.setEnabled(false);
                        txt9.setBackground(Color.RED);
                        txt9.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn9.setEnabled(false);
                            txt9.setBackground(Color.BLUE);
                            txt9.setText("C");
                        }
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn10.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn10.setEnabled(true);
                    txt10.setBackground(Color.WHITE);
                    txt10.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn10.setEnabled(false);
                        txt10.setBackground(Color.RED);
                        txt10.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn10.setEnabled(false);
                            txt10.setBackground(Color.BLUE);
                            txt10.setText("C");
                        }
                    }
                }   
            }
            return sitio;            
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn11.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn11.setEnabled(true);
                    txt11.setBackground(Color.WHITE);
                    txt11.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn11.setEnabled(false);
                        txt11.setBackground(Color.RED);
                        txt11.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn11.setEnabled(false);
                            txt11.setBackground(Color.BLUE);
                            txt11.setText("C");
                        }
                    }
                }   
            }
            return sitio;            
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn12.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn12.setEnabled(true);
                    txt12.setBackground(Color.WHITE);
                    txt12.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn12.setEnabled(false);
                        txt12.setBackground(Color.RED);
                        txt12.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn12.setEnabled(false);
                            txt12.setBackground(Color.BLUE);
                            txt12.setText("C");
                        }
                    }
                }   
            }
            return sitio;            
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn13.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn13.setEnabled(true);
                    txt13.setBackground(Color.WHITE);
                    txt13.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn13.setEnabled(false);
                        txt13.setBackground(Color.RED);
                        txt13.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn13.setEnabled(false);
                            txt13.setBackground(Color.BLUE);
                            txt13.setText("C");
                        }
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn14.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn14.setEnabled(true);
                    txt14.setBackground(Color.WHITE);
                    txt14.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn14.setEnabled(false);
                        txt14.setBackground(Color.RED);
                        txt14.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn14.setEnabled(false);
                            txt14.setBackground(Color.BLUE);
                            txt14.setText("C");
                        }
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn15.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn15.setEnabled(true);
                    txt15.setBackground(Color.WHITE);
                    txt15.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn15.setEnabled(false);
                        txt15.setBackground(Color.RED);
                        txt15.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn15.setEnabled(false);
                            txt15.setBackground(Color.BLUE);
                            txt15.setText("C");
                        }
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn16.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn16.setEnabled(true);
                    txt16.setBackground(Color.WHITE);
                    txt16.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn16.setEnabled(false);
                        txt16.setBackground(Color.RED);
                        txt16.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn16.setEnabled(false);
                            txt16.setBackground(Color.BLUE);
                            txt16.setText("C");
                        }
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn17.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn17.setEnabled(true);
                    txt17.setBackground(Color.WHITE);
                    txt17.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn17.setEnabled(false);
                        txt17.setBackground(Color.RED);
                        txt17.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn17.setEnabled(false);
                            txt17.setBackground(Color.BLUE);
                            txt17.setText("C");
                        }
                    }
                }   
            }
            return sitio;            
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn18.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn18.setEnabled(true);
                    txt18.setBackground(Color.WHITE);
                    txt18.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn18.setEnabled(false);
                        txt18.setBackground(Color.RED);
                        txt18.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn18.setEnabled(false);
                            txt18.setBackground(Color.BLUE);
                            txt18.setText("C");
                        }
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn19.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn19.setEnabled(true);
                    txt19.setBackground(Color.WHITE);
                    txt19.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn19.setEnabled(false);
                        txt19.setBackground(Color.RED);
                        txt19.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn19.setEnabled(false);
                            txt19.setBackground(Color.BLUE);
                            txt19.setText("C");
                        }
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn20.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn20.setEnabled(true);
                    txt20.setBackground(Color.WHITE);
                    txt20.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn20.setEnabled(false);
                        txt20.setBackground(Color.RED);
                        txt20.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn20.setEnabled(false);
                            txt20.setBackground(Color.BLUE);
                            txt20.setText("C");
                        }
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn21.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn21.setEnabled(true);
                    txt21.setBackground(Color.WHITE);
                    txt21.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn21.setEnabled(false);
                        txt21.setBackground(Color.RED);
                        txt21.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn21.setEnabled(false);
                            txt21.setBackground(Color.BLUE);
                            txt21.setText("C");
                        }
                    }
                }   
            }
            return sitio;            
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn22.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn22.setEnabled(true);
                    txt22.setBackground(Color.WHITE);
                    txt22.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn22.setEnabled(false);
                        txt22.setBackground(Color.RED);
                        txt22.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn22.setEnabled(false);
                            txt22.setBackground(Color.BLUE);
                            txt22.setText("C");
                        }
                    }
                }   
            }
            return sitio;            
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn23.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn23.setEnabled(true);
                    txt23.setBackground(Color.WHITE);
                    txt23.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn23.setEnabled(false);
                        txt23.setBackground(Color.RED);
                        txt23.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn23.setEnabled(false);
                            txt23.setBackground(Color.BLUE);
                            txt23.setText("C");
                        }
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn24.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn24.setEnabled(true);
                    txt24.setBackground(Color.WHITE);
                    txt24.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn24.setEnabled(false);
                        txt24.setBackground(Color.RED);
                        txt24.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn24.setEnabled(false);
                            txt24.setBackground(Color.BLUE);
                            txt24.setText("C");
                        }
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn25.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn25.setEnabled(true);
                    txt25.setBackground(Color.WHITE);
                    txt25.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn25.setEnabled(false);
                        txt25.setBackground(Color.RED);
                        txt25.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn25.setEnabled(false);
                            txt25.setBackground(Color.BLUE);
                            txt25.setText("C");
                        }
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn26.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn26.setEnabled(true);
                    txt26.setBackground(Color.WHITE);
                    txt26.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn26.setEnabled(false);
                        txt26.setBackground(Color.RED);
                        txt26.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn26.setEnabled(false);
                            txt26.setBackground(Color.BLUE);
                            txt26.setText("C");
                        }
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn27.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn27.setEnabled(true);
                    txt27.setBackground(Color.WHITE);
                    txt27.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn27.setEnabled(false);
                        txt27.setBackground(Color.RED);
                        txt27.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn27.setEnabled(false);
                            txt27.setBackground(Color.BLUE);
                            txt27.setText("C");
                        }
                    }
                }   
            }
            return sitio;            
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn28.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn28.setEnabled(true);
                    txt28.setBackground(Color.WHITE);
                    txt28.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn28.setEnabled(false);
                        txt28.setBackground(Color.RED);
                        txt28.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn28.setEnabled(false);
                            txt28.setBackground(Color.BLUE);
                            txt28.setText("C");
                        }
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn29.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn29.setEnabled(true);
                    txt29.setBackground(Color.WHITE);
                    txt29.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn29.setEnabled(false);
                        txt29.setBackground(Color.RED);
                        txt29.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn29.setEnabled(false);
                            txt29.setBackground(Color.BLUE);
                            txt29.setText("C");
                        }
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn30.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn30.setEnabled(true);
                    txt30.setBackground(Color.WHITE);
                    txt30.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn30.setEnabled(false);
                        txt30.setBackground(Color.RED);
                        txt30.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn30.setEnabled(false);
                            txt30.setBackground(Color.BLUE);
                            txt30.setText("C");
                        }
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn31.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn31.setEnabled(true);
                    txt31.setBackground(Color.WHITE);
                    txt31.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn31.setEnabled(false);
                        txt31.setBackground(Color.RED);
                        txt31.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn31.setEnabled(false);
                            txt31.setBackground(Color.BLUE);
                            txt31.setText("C");
                        }
                    }
                }   
            }
            return sitio;            
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn32.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn32.setEnabled(true);
                    txt32.setBackground(Color.WHITE);
                    txt32.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn32.setEnabled(false);
                        txt32.setBackground(Color.RED);
                        txt32.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn32.setEnabled(false);
                            txt32.setBackground(Color.BLUE);
                            txt32.setText("C");
                        }
                    }
                }   
            }
            return sitio;            
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn33.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn33.setEnabled(true);
                    txt33.setBackground(Color.WHITE);
                    txt33.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn33.setEnabled(false);
                        txt33.setBackground(Color.RED);
                        txt33.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn33.setEnabled(false);
                            txt33.setBackground(Color.BLUE);
                            txt33.setText("C");
                        }
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn34.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn34.setEnabled(true);
                    txt34.setBackground(Color.WHITE);
                    txt34.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn34.setEnabled(false);
                        txt34.setBackground(Color.RED);
                        txt34.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn34.setEnabled(false);
                            txt34.setBackground(Color.BLUE);
                            txt34.setText("C");
                        }
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn35.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn35.setEnabled(true);
                    txt35.setBackground(Color.WHITE);
                    txt35.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn35.setEnabled(false);
                        txt35.setBackground(Color.RED);
                        txt35.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn35.setEnabled(false);
                            txt35.setBackground(Color.BLUE);
                            txt35.setText("C");
                        }
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn36.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn36.setEnabled(true);
                    txt36.setBackground(Color.WHITE);
                    txt36.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn36.setEnabled(false);
                        txt36.setBackground(Color.RED);
                        txt36.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn36.setEnabled(false);
                            txt36.setBackground(Color.BLUE);
                            txt36.setText("C");
                        }
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn37.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn37.setEnabled(true);
                    txt37.setBackground(Color.WHITE);
                    txt37.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn37.setEnabled(false);
                        txt37.setBackground(Color.RED);
                        txt37.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn37.setEnabled(false);
                            txt37.setBackground(Color.BLUE);
                            txt37.setText("C");
                        }
                    }
                }   
            }
            return sitio;            
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn38.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn38.setEnabled(true);
                    txt38.setBackground(Color.WHITE);
                    txt38.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn38.setEnabled(false);
                        txt38.setBackground(Color.RED);
                        txt38.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn38.setEnabled(false);
                            txt38.setBackground(Color.BLUE);
                            txt38.setText("C");
                        }
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn39.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn39.setEnabled(true);
                    txt39.setBackground(Color.WHITE);
                    txt39.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn39.setEnabled(false);
                        txt39.setBackground(Color.RED);
                        txt39.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn39.setEnabled(false);
                            txt39.setBackground(Color.BLUE);
                            txt39.setText("C");
                        }
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn40.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn40.setEnabled(true);
                    txt40.setBackground(Color.WHITE);
                    txt40.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn40.setEnabled(false);
                        txt40.setBackground(Color.RED);
                        txt40.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn40.setEnabled(false);
                            txt40.setBackground(Color.BLUE);
                            txt40.setText("C");
                        }
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn41.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn41.setEnabled(true);
                    txt41.setBackground(Color.WHITE);
                    txt41.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn41.setEnabled(false);
                        txt41.setBackground(Color.RED);
                        txt41.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn41.setEnabled(false);
                            txt41.setBackground(Color.BLUE);
                            txt41.setText("C");
                        }
                    }
                }   
            }
            return sitio;            
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn42.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn42.setEnabled(true);
                    txt42.setBackground(Color.WHITE);
                    txt42.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn42.setEnabled(false);
                        txt42.setBackground(Color.RED);
                        txt42.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn42.setEnabled(false);
                            txt42.setBackground(Color.BLUE);
                            txt42.setText("C");
                        }
                    }
                }   
            }
            return sitio;            
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn43.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn43.setEnabled(true);
                    txt43.setBackground(Color.WHITE);
                    txt43.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn43.setEnabled(false);
                        txt43.setBackground(Color.RED);
                        txt43.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn43.setEnabled(false);
                            txt43.setBackground(Color.BLUE);
                            txt43.setText("C");
                        }
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn44.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn44.setEnabled(true);
                    txt44.setBackground(Color.WHITE);
                    txt44.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn44.setEnabled(false);
                        txt44.setBackground(Color.RED);
                        txt44.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn44.setEnabled(false);
                            txt44.setBackground(Color.BLUE);
                            txt44.setText("C");
                        }
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn45.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn45.setEnabled(true);
                    txt45.setBackground(Color.WHITE);
                    txt45.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn45.setEnabled(false);
                        txt45.setBackground(Color.RED);
                        txt45.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn45.setEnabled(false);
                            txt45.setBackground(Color.BLUE);
                            txt45.setText("C");
                        }
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn46.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn46.setEnabled(true);
                    txt46.setBackground(Color.WHITE);
                    txt46.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn46.setEnabled(false);
                        txt46.setBackground(Color.RED);
                        txt46.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn46.setEnabled(false);
                            txt46.setBackground(Color.BLUE);
                            txt46.setText("C");
                        }
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn47.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn47.setEnabled(true);
                    txt47.setBackground(Color.WHITE);
                    txt47.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn47.setEnabled(false);
                        txt47.setBackground(Color.RED);
                        txt47.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn47.setEnabled(false);
                            txt47.setBackground(Color.BLUE);
                            txt47.setText("C");
                        }
                    }
                }   
            }
            return sitio;            
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn48.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn48.setEnabled(true);
                    txt48.setBackground(Color.WHITE);
                    txt48.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn48.setEnabled(false);
                        txt48.setBackground(Color.RED);
                        txt48.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn48.setEnabled(false);
                            txt48.setBackground(Color.BLUE);
                            txt48.setText("C");
                        }
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn49.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn49.setEnabled(true);
                    txt49.setBackground(Color.WHITE);
                    txt49.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn49.setEnabled(false);
                        txt49.setBackground(Color.RED);
                        txt49.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn49.setEnabled(false);
                            txt49.setBackground(Color.BLUE);
                            txt49.setText("C");
                        }
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn50.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn50.setEnabled(true);
                    txt50.setBackground(Color.WHITE);
                    txt50.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn50.setEnabled(false);
                        txt50.setBackground(Color.RED);
                        txt50.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn50.setEnabled(false);
                            txt50.setBackground(Color.BLUE);
                            txt50.setText("C");
                        }
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn51.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn51.setEnabled(true);
                    txt51.setBackground(Color.WHITE);
                    txt51.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn51.setEnabled(false);
                        txt51.setBackground(Color.RED);
                        txt51.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn51.setEnabled(false);
                            txt51.setBackground(Color.BLUE);
                            txt51.setText("C");
                        }
                    }
                }   
            }
            return sitio;            
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn52.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn52.setEnabled(true);
                    txt52.setBackground(Color.WHITE);
                    txt52.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn52.setEnabled(false);
                        txt52.setBackground(Color.RED);
                        txt52.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn52.setEnabled(false);
                            txt52.setBackground(Color.BLUE);
                            txt52.setText("C");
                        }
                    }
                }   
            }
            return sitio;            
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn53.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn53.setEnabled(true);
                    txt53.setBackground(Color.WHITE);
                    txt53.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn53.setEnabled(false);
                        txt53.setBackground(Color.RED);
                        txt53.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn53.setEnabled(false);
                            txt53.setBackground(Color.BLUE);
                            txt53.setText("C");
                        }
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn54.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn54.setEnabled(true);
                    txt54.setBackground(Color.WHITE);
                    txt54.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn54.setEnabled(false);
                        txt54.setBackground(Color.RED);
                        txt54.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn54.setEnabled(false);
                            txt54.setBackground(Color.BLUE);
                            txt54.setText("C");
                        }
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn55.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn55.setEnabled(true);
                    txt55.setBackground(Color.WHITE);
                    txt55.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn55.setEnabled(false);
                        txt55.setBackground(Color.RED);
                        txt55.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn55.setEnabled(false);
                            txt55.setBackground(Color.BLUE);
                            txt55.setText("C");
                        }
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn56.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn56.setEnabled(true);
                    txt56.setBackground(Color.WHITE);
                    txt56.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn56.setEnabled(false);
                        txt56.setBackground(Color.RED);
                        txt56.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn56.setEnabled(false);
                            txt56.setBackground(Color.BLUE);
                            txt56.setText("C");
                        }
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn57.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn57.setEnabled(true);
                    txt57.setBackground(Color.WHITE);
                    txt57.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn57.setEnabled(false);
                        txt57.setBackground(Color.RED);
                        txt57.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn57.setEnabled(false);
                            txt57.setBackground(Color.BLUE);
                            txt57.setText("C");
                        }
                    }
                }   
            }
            return sitio;            
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn58.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn58.setEnabled(true);
                    txt58.setBackground(Color.WHITE);
                    txt58.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn58.setEnabled(false);
                        txt58.setBackground(Color.RED);
                        txt58.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn58.setEnabled(false);
                            txt58.setBackground(Color.BLUE);
                            txt58.setText("C");
                        }
                    }
                }   
            }
            return sitio;
        }).map(sitio -> {
            if(sitio.getNumero().equalsIgnoreCase(btn59.getText())){
                if(sitio.getEstado().equals("Libre")){
                    btn59.setEnabled(true);
                    txt59.setBackground(Color.WHITE);
                    txt59.setText("L");
                }else{
                    if(sitio.getEstado().equals("Ocupado")){
                        btn59.setEnabled(false);
                        txt59.setBackground(Color.RED);
                        txt59.setText("O");
                    }else{
                        if(sitio.getEstado().equals("Contrato")){
                            btn59.setEnabled(false);
                            txt59.setBackground(Color.BLUE);
                            txt59.setText("C");
                        }
                    }
                }   
            }
            return sitio;
        }).filter(sitio -> (sitio.getNumero().equalsIgnoreCase(btn60.getText()))).forEachOrdered(sitio -> {
            if(sitio.getEstado().equals("Libre")){
                btn60.setEnabled(true);
                txt60.setBackground(Color.WHITE);
                txt60.setText("L");
            }else{
                if(sitio.getEstado().equals("Ocupado")){
                    btn60.setEnabled(false);
                    txt60.setBackground(Color.RED);
                    txt60.setText("O");
                }else{
                    if(sitio.getEstado().equals("Contrato")){
                        btn60.setEnabled(false);
                        txt60.setBackground(Color.BLUE);
                        txt60.setText("C");
                    }
                }   
            }
        });
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        cbxEstado = new javax.swing.JComboBox<>();
        txtPlaca = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        btn15 = new javax.swing.JButton();
        btn16 = new javax.swing.JButton();
        btn17 = new javax.swing.JButton();
        btn18 = new javax.swing.JButton();
        btn19 = new javax.swing.JButton();
        btn20 = new javax.swing.JButton();
        btn21 = new javax.swing.JButton();
        btn22 = new javax.swing.JButton();
        btn23 = new javax.swing.JButton();
        btn24 = new javax.swing.JButton();
        btn25 = new javax.swing.JButton();
        btn26 = new javax.swing.JButton();
        btn27 = new javax.swing.JButton();
        btn28 = new javax.swing.JButton();
        btn29 = new javax.swing.JButton();
        btn30 = new javax.swing.JButton();
        btn31 = new javax.swing.JButton();
        btn32 = new javax.swing.JButton();
        btn33 = new javax.swing.JButton();
        btn34 = new javax.swing.JButton();
        btn35 = new javax.swing.JButton();
        btn36 = new javax.swing.JButton();
        btn37 = new javax.swing.JButton();
        btn38 = new javax.swing.JButton();
        btn39 = new javax.swing.JButton();
        btn40 = new javax.swing.JButton();
        btn41 = new javax.swing.JButton();
        btn42 = new javax.swing.JButton();
        btn43 = new javax.swing.JButton();
        btn44 = new javax.swing.JButton();
        btn45 = new javax.swing.JButton();
        btn46 = new javax.swing.JButton();
        btn47 = new javax.swing.JButton();
        btn48 = new javax.swing.JButton();
        btn49 = new javax.swing.JButton();
        btn50 = new javax.swing.JButton();
        btnGenerar = new javax.swing.JButton();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        txt5 = new javax.swing.JTextField();
        txt6 = new javax.swing.JTextField();
        txt7 = new javax.swing.JTextField();
        txt8 = new javax.swing.JTextField();
        txt9 = new javax.swing.JTextField();
        txt10 = new javax.swing.JTextField();
        txt11 = new javax.swing.JTextField();
        txt12 = new javax.swing.JTextField();
        txt13 = new javax.swing.JTextField();
        txt14 = new javax.swing.JTextField();
        txt15 = new javax.swing.JTextField();
        txt16 = new javax.swing.JTextField();
        txt17 = new javax.swing.JTextField();
        txt18 = new javax.swing.JTextField();
        txt19 = new javax.swing.JTextField();
        txt20 = new javax.swing.JTextField();
        txt21 = new javax.swing.JTextField();
        txt22 = new javax.swing.JTextField();
        txt23 = new javax.swing.JTextField();
        txt24 = new javax.swing.JTextField();
        txt25 = new javax.swing.JTextField();
        txt26 = new javax.swing.JTextField();
        txt27 = new javax.swing.JTextField();
        txt28 = new javax.swing.JTextField();
        txt29 = new javax.swing.JTextField();
        txt30 = new javax.swing.JTextField();
        txt31 = new javax.swing.JTextField();
        txt32 = new javax.swing.JTextField();
        txt33 = new javax.swing.JTextField();
        txt34 = new javax.swing.JTextField();
        txt35 = new javax.swing.JTextField();
        txt36 = new javax.swing.JTextField();
        txt37 = new javax.swing.JTextField();
        txt38 = new javax.swing.JTextField();
        txt39 = new javax.swing.JTextField();
        txt40 = new javax.swing.JTextField();
        txt41 = new javax.swing.JTextField();
        txt42 = new javax.swing.JTextField();
        txt43 = new javax.swing.JTextField();
        txt44 = new javax.swing.JTextField();
        txt45 = new javax.swing.JTextField();
        txt46 = new javax.swing.JTextField();
        txt47 = new javax.swing.JTextField();
        txt48 = new javax.swing.JTextField();
        txt49 = new javax.swing.JTextField();
        txt50 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btn51 = new javax.swing.JButton();
        btn52 = new javax.swing.JButton();
        txt51 = new javax.swing.JTextField();
        txt52 = new javax.swing.JTextField();
        btn53 = new javax.swing.JButton();
        btn54 = new javax.swing.JButton();
        txt53 = new javax.swing.JTextField();
        txt54 = new javax.swing.JTextField();
        btn55 = new javax.swing.JButton();
        btn56 = new javax.swing.JButton();
        txt55 = new javax.swing.JTextField();
        txt56 = new javax.swing.JTextField();
        btn57 = new javax.swing.JButton();
        btn58 = new javax.swing.JButton();
        txt57 = new javax.swing.JTextField();
        txt58 = new javax.swing.JTextField();
        btn59 = new javax.swing.JButton();
        btn60 = new javax.swing.JButton();
        txt59 = new javax.swing.JTextField();
        txt60 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jLabel2.setText("Numero del Sitio");

        jLabel3.setText("Estado");

        jLabel4.setText("Placa del Vehiculo");

        jLabel5.setText("Nombre del Cliente");

        jLabel6.setText("Cedula");

        txtNumero.setEditable(false);
        txtNumero.setBackground(new java.awt.Color(255, 255, 204));

        cbxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libre", "Ocupado" }));

        txtNombre.setEditable(false);
        txtNombre.setBackground(new java.awt.Color(255, 255, 204));

        txtCedula.setEditable(false);
        txtCedula.setBackground(new java.awt.Color(255, 255, 204));

        btnGuardar.setBackground(new java.awt.Color(0, 0, 0));
        btnGuardar.setForeground(new java.awt.Color(255, 255, 0));
        btnGuardar.setText("Buscar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(255, 255, 255));
        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(255, 255, 255));
        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/sitioespecial.PNG"))); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(255, 255, 255));
        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(255, 255, 255));
        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(255, 255, 255));
        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn1.setBackground(new java.awt.Color(255, 255, 255));
        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/sitioespecial.PNG"))); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(255, 255, 255));
        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(255, 255, 255));
        btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(255, 255, 255));
        btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn10.setBackground(new java.awt.Color(255, 255, 255));
        btn10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn10.setText("10");
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });

        btn11.setBackground(new java.awt.Color(255, 255, 255));
        btn11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn11.setText("11");
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });

        btn12.setBackground(new java.awt.Color(255, 255, 255));
        btn12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn12.setText("12");
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });

        btn13.setBackground(new java.awt.Color(255, 255, 255));
        btn13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn13.setText("13");
        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn13ActionPerformed(evt);
            }
        });

        btn14.setBackground(new java.awt.Color(255, 255, 255));
        btn14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn14.setText("14");
        btn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn14ActionPerformed(evt);
            }
        });

        btn15.setBackground(new java.awt.Color(255, 255, 255));
        btn15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn15.setText("15");
        btn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn15ActionPerformed(evt);
            }
        });

        btn16.setBackground(new java.awt.Color(255, 255, 255));
        btn16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn16.setText("16");
        btn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn16ActionPerformed(evt);
            }
        });

        btn17.setBackground(new java.awt.Color(255, 255, 255));
        btn17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn17.setText("17");
        btn17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn17ActionPerformed(evt);
            }
        });

        btn18.setBackground(new java.awt.Color(255, 255, 255));
        btn18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn18.setText("18");
        btn18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn18ActionPerformed(evt);
            }
        });

        btn19.setBackground(new java.awt.Color(255, 255, 255));
        btn19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn19.setText("19");
        btn19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn19ActionPerformed(evt);
            }
        });

        btn20.setBackground(new java.awt.Color(255, 255, 255));
        btn20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn20.setText("20");
        btn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn20ActionPerformed(evt);
            }
        });

        btn21.setBackground(new java.awt.Color(255, 255, 255));
        btn21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn21.setText("21");
        btn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn21ActionPerformed(evt);
            }
        });

        btn22.setBackground(new java.awt.Color(255, 255, 255));
        btn22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn22.setText("22");
        btn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn22ActionPerformed(evt);
            }
        });

        btn23.setBackground(new java.awt.Color(255, 255, 255));
        btn23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn23.setText("23");
        btn23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn23ActionPerformed(evt);
            }
        });

        btn24.setBackground(new java.awt.Color(255, 255, 255));
        btn24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn24.setText("24");
        btn24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn24ActionPerformed(evt);
            }
        });

        btn25.setBackground(new java.awt.Color(255, 255, 255));
        btn25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn25.setText("25");
        btn25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn25ActionPerformed(evt);
            }
        });

        btn26.setBackground(new java.awt.Color(255, 255, 255));
        btn26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn26.setText("26");
        btn26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn26ActionPerformed(evt);
            }
        });

        btn27.setBackground(new java.awt.Color(255, 255, 255));
        btn27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn27.setText("27");
        btn27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn27ActionPerformed(evt);
            }
        });

        btn28.setBackground(new java.awt.Color(255, 255, 255));
        btn28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn28.setText("28");
        btn28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn28ActionPerformed(evt);
            }
        });

        btn29.setBackground(new java.awt.Color(255, 255, 255));
        btn29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn29.setText("29");
        btn29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn29ActionPerformed(evt);
            }
        });

        btn30.setBackground(new java.awt.Color(255, 255, 255));
        btn30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn30.setText("30");
        btn30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn30ActionPerformed(evt);
            }
        });

        btn31.setBackground(new java.awt.Color(255, 255, 255));
        btn31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn31.setText("31");
        btn31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn31ActionPerformed(evt);
            }
        });

        btn32.setBackground(new java.awt.Color(255, 255, 255));
        btn32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn32.setText("32");
        btn32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn32ActionPerformed(evt);
            }
        });

        btn33.setBackground(new java.awt.Color(255, 255, 255));
        btn33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn33.setText("33");
        btn33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn33ActionPerformed(evt);
            }
        });

        btn34.setBackground(new java.awt.Color(255, 255, 255));
        btn34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn34.setText("34");
        btn34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn34ActionPerformed(evt);
            }
        });

        btn35.setBackground(new java.awt.Color(255, 255, 255));
        btn35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn35.setText("35");
        btn35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn35ActionPerformed(evt);
            }
        });

        btn36.setBackground(new java.awt.Color(255, 255, 255));
        btn36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn36.setText("36");
        btn36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn36ActionPerformed(evt);
            }
        });

        btn37.setBackground(new java.awt.Color(255, 255, 255));
        btn37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn37.setText("37");
        btn37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn37ActionPerformed(evt);
            }
        });

        btn38.setBackground(new java.awt.Color(255, 255, 255));
        btn38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn38.setText("38");
        btn38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn38ActionPerformed(evt);
            }
        });

        btn39.setBackground(new java.awt.Color(255, 255, 255));
        btn39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn39.setText("39");
        btn39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn39ActionPerformed(evt);
            }
        });

        btn40.setBackground(new java.awt.Color(255, 255, 255));
        btn40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn40.setText("40");
        btn40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn40ActionPerformed(evt);
            }
        });

        btn41.setBackground(new java.awt.Color(255, 255, 255));
        btn41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn41.setText("41");
        btn41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn41ActionPerformed(evt);
            }
        });

        btn42.setBackground(new java.awt.Color(255, 255, 255));
        btn42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn42.setText("42");
        btn42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn42ActionPerformed(evt);
            }
        });

        btn43.setBackground(new java.awt.Color(255, 255, 255));
        btn43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn43.setText("43");
        btn43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn43ActionPerformed(evt);
            }
        });

        btn44.setBackground(new java.awt.Color(255, 255, 255));
        btn44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn44.setText("44");
        btn44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn44ActionPerformed(evt);
            }
        });

        btn45.setBackground(new java.awt.Color(255, 255, 255));
        btn45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn45.setText("45");
        btn45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn45ActionPerformed(evt);
            }
        });

        btn46.setBackground(new java.awt.Color(255, 255, 255));
        btn46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn46.setText("46");
        btn46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn46ActionPerformed(evt);
            }
        });

        btn47.setBackground(new java.awt.Color(255, 255, 255));
        btn47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn47.setText("47");
        btn47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn47ActionPerformed(evt);
            }
        });

        btn48.setBackground(new java.awt.Color(255, 255, 255));
        btn48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn48.setText("48");
        btn48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn48ActionPerformed(evt);
            }
        });

        btn49.setBackground(new java.awt.Color(255, 255, 255));
        btn49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn49.setText("49");
        btn49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn49ActionPerformed(evt);
            }
        });

        btn50.setBackground(new java.awt.Color(255, 255, 255));
        btn50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn50.setText("50");
        btn50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn50ActionPerformed(evt);
            }
        });

        btnGenerar.setBackground(new java.awt.Color(0, 0, 0));
        btnGenerar.setForeground(new java.awt.Color(255, 255, 0));
        btnGenerar.setText("Generar Tiket");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        txt1.setEditable(false);
        txt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt1.setToolTipText("");

        txt2.setEditable(false);
        txt2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2ActionPerformed(evt);
            }
        });

        txt3.setEditable(false);
        txt3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt4.setEditable(false);
        txt4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt5.setEditable(false);
        txt5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt6.setEditable(false);
        txt6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt7.setEditable(false);
        txt7.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt8.setEditable(false);
        txt8.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt9.setEditable(false);
        txt9.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt10.setEditable(false);
        txt10.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt11.setEditable(false);
        txt11.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt12.setEditable(false);
        txt12.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt13.setEditable(false);
        txt13.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt14.setEditable(false);
        txt14.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt15.setEditable(false);
        txt15.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt16.setEditable(false);
        txt16.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt17.setEditable(false);
        txt17.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt18.setEditable(false);
        txt18.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt19.setEditable(false);
        txt19.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt20.setEditable(false);
        txt20.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt21.setEditable(false);
        txt21.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt22.setEditable(false);
        txt22.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt23.setEditable(false);
        txt23.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt24.setEditable(false);
        txt24.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt25.setEditable(false);
        txt25.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt26.setEditable(false);
        txt26.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt27.setEditable(false);
        txt27.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt28.setEditable(false);
        txt28.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt29.setEditable(false);
        txt29.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt30.setEditable(false);
        txt30.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt31.setEditable(false);
        txt31.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt32.setEditable(false);
        txt32.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt33.setEditable(false);
        txt33.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt34.setEditable(false);
        txt34.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt35.setEditable(false);
        txt35.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt36.setEditable(false);
        txt36.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt37.setEditable(false);
        txt37.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt38.setEditable(false);
        txt38.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt39.setEditable(false);
        txt39.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt40.setEditable(false);
        txt40.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt41.setEditable(false);
        txt41.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt42.setEditable(false);
        txt42.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt43.setEditable(false);
        txt43.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt44.setEditable(false);
        txt44.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt45.setEditable(false);
        txt45.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt46.setEditable(false);
        txt46.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt47.setEditable(false);
        txt47.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt48.setEditable(false);
        txt48.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt49.setEditable(false);
        txt49.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt50.setEditable(false);
        txt50.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 51, 51));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("O");

        jLabel7.setText("Ocupado");

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(0, 0, 255));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("C");

        jLabel8.setText("Bajo Contrato");

        jTextField3.setEditable(false);
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("L");

        jLabel9.setText("Libre");

        btn51.setBackground(new java.awt.Color(255, 255, 255));
        btn51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn51.setText("51");
        btn51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn51ActionPerformed(evt);
            }
        });

        btn52.setBackground(new java.awt.Color(255, 255, 255));
        btn52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn52.setText("52");
        btn52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn52ActionPerformed(evt);
            }
        });

        txt51.setEditable(false);
        txt51.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt52.setEditable(false);
        txt52.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btn53.setBackground(new java.awt.Color(255, 255, 255));
        btn53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn53.setText("53");
        btn53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn53ActionPerformed(evt);
            }
        });

        btn54.setBackground(new java.awt.Color(255, 255, 255));
        btn54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn54.setText("54");
        btn54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn54ActionPerformed(evt);
            }
        });

        txt53.setEditable(false);
        txt53.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt54.setEditable(false);
        txt54.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btn55.setBackground(new java.awt.Color(255, 255, 255));
        btn55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn55.setText("55");
        btn55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn55ActionPerformed(evt);
            }
        });

        btn56.setBackground(new java.awt.Color(255, 255, 255));
        btn56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn56.setText("56");
        btn56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn56ActionPerformed(evt);
            }
        });

        txt55.setEditable(false);
        txt55.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt56.setEditable(false);
        txt56.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btn57.setBackground(new java.awt.Color(255, 255, 255));
        btn57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn57.setText("57");
        btn57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn57ActionPerformed(evt);
            }
        });

        btn58.setBackground(new java.awt.Color(255, 255, 255));
        btn58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn58.setText("58");
        btn58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn58ActionPerformed(evt);
            }
        });

        txt57.setEditable(false);
        txt57.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt58.setEditable(false);
        txt58.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btn59.setBackground(new java.awt.Color(255, 255, 255));
        btn59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn59.setText("59");
        btn59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn59ActionPerformed(evt);
            }
        });

        btn60.setBackground(new java.awt.Color(255, 255, 255));
        btn60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/Sitio2.PNG"))); // NOI18N
        btn60.setText("60");
        btn60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn60ActionPerformed(evt);
            }
        });

        txt59.setEditable(false);
        txt59.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt60.setEditable(false);
        txt60.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText(" - (30 min o menos) Valor a Pagar: $0.60 ctn      - (31 min a 1 Hora) Valor a Pagar: $1.00     - (Pasada la Hora) Valor por Minuto: $0.02 ctn");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt21, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn21))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt22, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn22))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt23, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn23))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt24, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn24))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt25, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn25))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt26, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn26))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt27, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn27, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btn28)
                                .addComponent(txt28, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt29, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn29, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn30)
                                .addComponent(txt30, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt55, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn55))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn56)
                                .addComponent(txt56, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt41, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn41)
                                .addComponent(txt31, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn31))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt42, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt32, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn32, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn42, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt43, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn43))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt44, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn44))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt45, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn45))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt46, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn46))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt47, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn47))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt48, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn48))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt49, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn49))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btn50)
                                        .addComponent(txt50, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt59, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn59))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn60)
                                        .addComponent(txt60, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt33, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn33))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt34, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn34))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt35, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn35))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt36, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn36))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt37, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn37))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt38, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn38))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt39, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn39))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btn40)
                                        .addComponent(txt40, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt57, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn57))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn58)
                                        .addComponent(txt58, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt11, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn11)
                                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txt2, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txt12, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn12))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt13, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn13)
                                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btn14)
                                        .addComponent(txt4)
                                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt14, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt15, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn15)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btn5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt16)
                                        .addComponent(txt6, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btn16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btn17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txt17, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(btn18)
                                                .addComponent(txt18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txt19, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btn19))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(btn20)
                                                .addComponent(txt20, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txt53, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btn53)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txt8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txt9)
                                                .addComponent(btn9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(txt10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(txt51, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(btn10)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(btn51))))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(145, 145, 145)
                                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(41, 41, 41)
                                        .addComponent(btnGenerar))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(744, 744, 744)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel7)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel8))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(45, 45, 45)
                                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(cbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnGuardar)))))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn54)
                                .addComponent(txt54, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt52, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn52)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel9)))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1005, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(jTextField3)
                        .addComponent(jLabel9))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(cbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnGuardar)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn3)
                            .addComponent(btn1)
                            .addComponent(btn4)
                            .addComponent(btn5)
                            .addComponent(btn6)
                            .addComponent(btn7)
                            .addComponent(btn8)
                            .addComponent(btn9)
                            .addComponent(btn10)
                            .addComponent(btn2)
                            .addComponent(btn51)
                            .addComponent(btn52))
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn11)
                    .addComponent(btn13)
                    .addComponent(btn12)
                    .addComponent(btn14)
                    .addComponent(btn15)
                    .addComponent(btn16)
                    .addComponent(btn17)
                    .addComponent(btn18)
                    .addComponent(btn19)
                    .addComponent(btn20)
                    .addComponent(btn53)
                    .addComponent(btn54))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn21)
                        .addComponent(btn22)
                        .addComponent(btn23)
                        .addComponent(btn24)
                        .addComponent(btn25)
                        .addComponent(btn26)
                        .addComponent(btn27)
                        .addComponent(btn28)
                        .addComponent(btn29)
                        .addComponent(btn30)
                        .addComponent(btn55)
                        .addComponent(btn56))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn31)
                            .addComponent(btn32)
                            .addComponent(btn33))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn43)
                                    .addComponent(btn44)
                                    .addComponent(btn45)
                                    .addComponent(btn46)
                                    .addComponent(btn47)
                                    .addComponent(btn48)
                                    .addComponent(btn49)
                                    .addComponent(btn50)
                                    .addComponent(btn59)
                                    .addComponent(btn60))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn42)
                                    .addComponent(btn41))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn34)
                            .addComponent(btn35)
                            .addComponent(btn36)
                            .addComponent(btn37)
                            .addComponent(btn38)
                            .addComponent(btn39)
                            .addComponent(btn40)
                            .addComponent(btn57)
                            .addComponent(btn58))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        System.out.println(btnGuardar.getText());
        String palaca= txtPlaca.getText();
        Vehiculo v = new Vehiculo(palaca);
        Vehiculo vehiculo = controladorVehiculo.read(v);
        if(vehiculo!= null){
            Cliente cliente= vehiculo.getCliente();
            txtNombre.setText(cliente.getNombre());
            txtCedula.setText(cliente.getCedula());
            
        }else{
            int opcion=JOptionPane.showConfirmDialog(this, "Vehiculo no encontrado desea crear uno"); 
            if(opcion== JOptionPane.YES_OPTION)
            {
                ventanaPrincipal.getDesktopPane().add(ventanaGestionVehiculo);
                ventanaGestionVehiculo.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        txtNumero.setText(btn1.getText());
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        txtNumero.setText(btn2.getText());
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        txtNumero.setText(btn3.getText());
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        txtNumero.setText(btn4.getText());
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        txtNumero.setText(btn5.getText());
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        txtNumero.setText(btn6.getText());
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        txtNumero.setText(btn7.getText());
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        txtNumero.setText(btn8.getText());
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        txtNumero.setText(btn9.getText());
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        txtNumero.setText(btn10.getText());
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        txtNumero.setText(btn11.getText());
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        txtNumero.setText(btn12.getText());
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13ActionPerformed
        txtNumero.setText(btn13.getText());
    }//GEN-LAST:event_btn13ActionPerformed

    private void btn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn14ActionPerformed
        txtNumero.setText(btn14.getText());
    }//GEN-LAST:event_btn14ActionPerformed

    private void btn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn15ActionPerformed
        txtNumero.setText(btn15.getText());
    }//GEN-LAST:event_btn15ActionPerformed

    private void btn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn16ActionPerformed
        txtNumero.setText(btn16.getText());
    }//GEN-LAST:event_btn16ActionPerformed

    private void btn17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn17ActionPerformed
        txtNumero.setText(btn17.getText());
    }//GEN-LAST:event_btn17ActionPerformed

    private void btn18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn18ActionPerformed
        txtNumero.setText(btn18.getText());
    }//GEN-LAST:event_btn18ActionPerformed

    private void btn19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn19ActionPerformed
        txtNumero.setText(btn19.getText());
    }//GEN-LAST:event_btn19ActionPerformed

    private void btn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn20ActionPerformed
        txtNumero.setText(btn20.getText());
    }//GEN-LAST:event_btn20ActionPerformed

    private void btn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn21ActionPerformed
        txtNumero.setText(btn21.getText());
    }//GEN-LAST:event_btn21ActionPerformed

    private void btn22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn22ActionPerformed
        txtNumero.setText(btn22.getText());
    }//GEN-LAST:event_btn22ActionPerformed

    private void btn23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn23ActionPerformed
        txtNumero.setText(btn23.getText());
    }//GEN-LAST:event_btn23ActionPerformed

    private void btn24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn24ActionPerformed
        txtNumero.setText(btn24.getText());
    }//GEN-LAST:event_btn24ActionPerformed

    private void btn25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn25ActionPerformed
        txtNumero.setText(btn25.getText());
    }//GEN-LAST:event_btn25ActionPerformed

    private void btn26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn26ActionPerformed
        txtNumero.setText(btn26.getText());
    }//GEN-LAST:event_btn26ActionPerformed

    private void btn27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn27ActionPerformed
        txtNumero.setText(btn27.getText());
    }//GEN-LAST:event_btn27ActionPerformed

    private void btn28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn28ActionPerformed
        txtNumero.setText(btn28.getText());
    }//GEN-LAST:event_btn28ActionPerformed

    private void btn29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn29ActionPerformed
        txtNumero.setText(btn29.getText());
    }//GEN-LAST:event_btn29ActionPerformed

    private void btn30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn30ActionPerformed
        txtNumero.setText(btn30.getText());
    }//GEN-LAST:event_btn30ActionPerformed

    private void btn31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn31ActionPerformed
        txtNumero.setText(btn31.getText());
    }//GEN-LAST:event_btn31ActionPerformed

    private void btn32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn32ActionPerformed
        txtNumero.setText(btn32.getText());
    }//GEN-LAST:event_btn32ActionPerformed

    private void btn33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn33ActionPerformed
        txtNumero.setText(btn33.getText());
    }//GEN-LAST:event_btn33ActionPerformed

    private void btn34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn34ActionPerformed
        txtNumero.setText(btn34.getText());
    }//GEN-LAST:event_btn34ActionPerformed

    private void btn35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn35ActionPerformed
        txtNumero.setText(btn35.getText());
    }//GEN-LAST:event_btn35ActionPerformed

    private void btn36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn36ActionPerformed
        txtNumero.setText(btn36.getText());
    }//GEN-LAST:event_btn36ActionPerformed

    private void btn37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn37ActionPerformed
        txtNumero.setText(btn37.getText());
    }//GEN-LAST:event_btn37ActionPerformed

    private void btn38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn38ActionPerformed
        txtNumero.setText(btn38.getText());
    }//GEN-LAST:event_btn38ActionPerformed

    private void btn39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn39ActionPerformed
        txtNumero.setText(btn39.getText());
    }//GEN-LAST:event_btn39ActionPerformed

    private void btn40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn40ActionPerformed
        txtNumero.setText(btn40.getText());
    }//GEN-LAST:event_btn40ActionPerformed

    private void btn41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn41ActionPerformed
        txtNumero.setText(btn41.getText());
    }//GEN-LAST:event_btn41ActionPerformed

    private void btn42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn42ActionPerformed
        txtNumero.setText(btn42.getText());
    }//GEN-LAST:event_btn42ActionPerformed

    private void btn43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn43ActionPerformed
        txtNumero.setText(btn43.getText());
    }//GEN-LAST:event_btn43ActionPerformed

    private void btn44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn44ActionPerformed
        txtNumero.setText(btn44.getText());
    }//GEN-LAST:event_btn44ActionPerformed

    private void btn45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn45ActionPerformed
        txtNumero.setText(btn45.getText());
    }//GEN-LAST:event_btn45ActionPerformed

    private void btn46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn46ActionPerformed
        txtNumero.setText(btn46.getText());
    }//GEN-LAST:event_btn46ActionPerformed

    private void btn47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn47ActionPerformed
        txtNumero.setText(btn47.getText());
    }//GEN-LAST:event_btn47ActionPerformed

    private void btn48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn48ActionPerformed
        txtNumero.setText(btn48.getText());
    }//GEN-LAST:event_btn48ActionPerformed

    private void btn49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn49ActionPerformed
        txtNumero.setText(btn49.getText());
    }//GEN-LAST:event_btn49ActionPerformed

    private void btn50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn50ActionPerformed
        txtNumero.setText(btn50.getText());
    }//GEN-LAST:event_btn50ActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        boolean resultado = false;
        String numero= txtNumero.getText();
        String estado=(String) cbxEstado.getSelectedItem();
        String nombre= txtNombre.getText();
        String palaca= txtPlaca.getText();
        Vehiculo v = new Vehiculo(palaca);
        Vehiculo vehiculo = controladorVehiculo.read(v);
        
        Sitio sit= new Sitio(numero);
        //Sitio sitio= controladorSitio.read(sit);
        if (numero.isEmpty()||estado.isEmpty()||nombre.isEmpty()||palaca.isEmpty()||estado.equals("Libre")) {
            JOptionPane.showMessageDialog(this, "Llene todos los campos solicitados");
        }else{
            if(controladorSitio.read(sit)!= null){
                Sitio sitio= new Sitio(numero, estado, vehiculo);
                resultado =controladorSitio.update(sitio);    
            }else{
               Sitio sitio= new Sitio(numero, estado, vehiculo);
               resultado =controladorSitio.create(sitio);   
               //validarEstado();
            } 
            ventanaTiketIngreso.setNumero(numero);
            //ventanaPrincipal.getDesktopPane().add(ventanaTiketIngreso);
            ventanaTiketIngreso.setVisible(true);
            limpiar();
            JOptionPane.showMessageDialog(this, "Operación : " + resultado);
            //dispose();
        }
        
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        validarEstado();
    }//GEN-LAST:event_formInternalFrameActivated

    private void txt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2ActionPerformed

    private void btn51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn51ActionPerformed
        txtNumero.setText(btn51.getText());
    }//GEN-LAST:event_btn51ActionPerformed

    private void btn52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn52ActionPerformed
        txtNumero.setText(btn52.getText());
    }//GEN-LAST:event_btn52ActionPerformed

    private void btn53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn53ActionPerformed
        txtNumero.setText(btn53.getText());
    }//GEN-LAST:event_btn53ActionPerformed

    private void btn54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn54ActionPerformed
        txtNumero.setText(btn54.getText());
    }//GEN-LAST:event_btn54ActionPerformed

    private void btn55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn55ActionPerformed
        txtNumero.setText(btn55.getText());
    }//GEN-LAST:event_btn55ActionPerformed

    private void btn56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn56ActionPerformed
        txtNumero.setText(btn56.getText());
    }//GEN-LAST:event_btn56ActionPerformed

    private void btn57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn57ActionPerformed
        txtNumero.setText(btn57.getText());
    }//GEN-LAST:event_btn57ActionPerformed

    private void btn58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn58ActionPerformed
        txtNumero.setText(btn58.getText());
    }//GEN-LAST:event_btn58ActionPerformed

    private void btn59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn59ActionPerformed
        txtNumero.setText(btn59.getText());
    }//GEN-LAST:event_btn59ActionPerformed

    private void btn60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn60ActionPerformed
        txtNumero.setText(btn60.getText());
    }//GEN-LAST:event_btn60ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn16;
    private javax.swing.JButton btn17;
    private javax.swing.JButton btn18;
    private javax.swing.JButton btn19;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn21;
    private javax.swing.JButton btn22;
    private javax.swing.JButton btn23;
    private javax.swing.JButton btn24;
    private javax.swing.JButton btn25;
    private javax.swing.JButton btn26;
    private javax.swing.JButton btn27;
    private javax.swing.JButton btn28;
    private javax.swing.JButton btn29;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn30;
    private javax.swing.JButton btn31;
    private javax.swing.JButton btn32;
    private javax.swing.JButton btn33;
    private javax.swing.JButton btn34;
    private javax.swing.JButton btn35;
    private javax.swing.JButton btn36;
    private javax.swing.JButton btn37;
    private javax.swing.JButton btn38;
    private javax.swing.JButton btn39;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn40;
    private javax.swing.JButton btn41;
    private javax.swing.JButton btn42;
    private javax.swing.JButton btn43;
    private javax.swing.JButton btn44;
    private javax.swing.JButton btn45;
    private javax.swing.JButton btn46;
    private javax.swing.JButton btn47;
    private javax.swing.JButton btn48;
    private javax.swing.JButton btn49;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn50;
    private javax.swing.JButton btn51;
    private javax.swing.JButton btn52;
    private javax.swing.JButton btn53;
    private javax.swing.JButton btn54;
    private javax.swing.JButton btn55;
    private javax.swing.JButton btn56;
    private javax.swing.JButton btn57;
    private javax.swing.JButton btn58;
    private javax.swing.JButton btn59;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn60;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbxEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt10;
    private javax.swing.JTextField txt11;
    private javax.swing.JTextField txt12;
    private javax.swing.JTextField txt13;
    private javax.swing.JTextField txt14;
    private javax.swing.JTextField txt15;
    private javax.swing.JTextField txt16;
    private javax.swing.JTextField txt17;
    private javax.swing.JTextField txt18;
    private javax.swing.JTextField txt19;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt20;
    private javax.swing.JTextField txt21;
    private javax.swing.JTextField txt22;
    private javax.swing.JTextField txt23;
    private javax.swing.JTextField txt24;
    private javax.swing.JTextField txt25;
    private javax.swing.JTextField txt26;
    private javax.swing.JTextField txt27;
    private javax.swing.JTextField txt28;
    private javax.swing.JTextField txt29;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt30;
    private javax.swing.JTextField txt31;
    private javax.swing.JTextField txt32;
    private javax.swing.JTextField txt33;
    private javax.swing.JTextField txt34;
    private javax.swing.JTextField txt35;
    private javax.swing.JTextField txt36;
    private javax.swing.JTextField txt37;
    private javax.swing.JTextField txt38;
    private javax.swing.JTextField txt39;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt40;
    private javax.swing.JTextField txt41;
    private javax.swing.JTextField txt42;
    private javax.swing.JTextField txt43;
    private javax.swing.JTextField txt44;
    private javax.swing.JTextField txt45;
    private javax.swing.JTextField txt46;
    private javax.swing.JTextField txt47;
    private javax.swing.JTextField txt48;
    private javax.swing.JTextField txt49;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt50;
    private javax.swing.JTextField txt51;
    private javax.swing.JTextField txt52;
    private javax.swing.JTextField txt53;
    private javax.swing.JTextField txt54;
    private javax.swing.JTextField txt55;
    private javax.swing.JTextField txt56;
    private javax.swing.JTextField txt57;
    private javax.swing.JTextField txt58;
    private javax.swing.JTextField txt59;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextField txt60;
    private javax.swing.JTextField txt7;
    private javax.swing.JTextField txt8;
    private javax.swing.JTextField txt9;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
    private void limpiar() {
        txtNumero.setText("");
        cbxEstado.setSelectedIndex(0);
        txtPlaca.setText("");
        txtNombre.setText("");
        txtCedula.setText("");
    }  
}
