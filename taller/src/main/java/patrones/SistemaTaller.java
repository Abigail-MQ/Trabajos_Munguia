/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrones;

/**
 *
 * @author HUAWEI
 */
public class SistemaTaller {
    private static SistemaTaller instancia;

    private SistemaTaller () {}

    public static SistemaTaller getInstancia() {
        if (instancia == null) {
            instancia = new SistemaTaller();
        }
        return instancia;
    }

    public void iniciar() {
        System.out.println("Sistema del taller iniciado correctamente. ");
    }
}
