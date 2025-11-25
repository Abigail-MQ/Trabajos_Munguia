/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrones;

import javax.swing.JOptionPane;

/**
 *
 * @author HUAWEI
 */
public class AlertaAdministrador implements Observador {
    @Override
    public void actualizar (String mensaje) {
        JOptionPane.showMessageDialog(null,
                                      "ALERTA DEL SISTEMA: \n" +message,
                                      "Advertencia",
                                      JOption.Pane.WARNING_MESSAGE);
    }
}
