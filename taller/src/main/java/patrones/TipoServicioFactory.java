/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrones;

import modelo.TipoServicio;

/**
 *
 * @author HUAWEI
 */
public class TipoServicioFactory {
    public static TipoServicio obtenerTipo(String nombre) {
        switch (nombre.toLowerCase()) {
            case "mantenimiento":
                return TipoServicio.MANTENIMIENTO;
            case "reparacion":
                return TipoServicio.REPARACION;
            case "diagnostico":
                return TipoServicio.DIAGNOSTICO;
            default: 
                return TipoServicio.DIAGNOSTICO;
        }
    }
}
