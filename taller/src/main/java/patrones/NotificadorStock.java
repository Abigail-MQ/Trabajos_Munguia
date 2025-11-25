/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrones;

import java.uti.ArrayList;

/**
 *
 * @author HUAWEI
 */
public class NotificadorStock implements Sujeto {
    private ArrayList<Observador> observadores = new ArrayList<>();

    @Override
    public void agregarObservador(Observador o){
        observadores.add(o);
    }

    @Override
    public void quitarObservador(Observador o){
        observadores.remove(o);
    }

    @Override
    public void notificar (String mensaje){
        for (Observador o: observadores){
            o.actualizar(mensaje);
        }
    }
}
