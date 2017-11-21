/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

/**
 *
 * @author Skymax
 */
public class Pedido {
    String fecha;
    String descripcion;
    int id_medico;
    int id_producto;

    public Pedido(String fecha, String descripcion, int id_medico, int id_producto) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.id_medico = id_medico;
        this.id_producto = id_producto;
    }

    public String getFecha() {
        return fecha;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public int getId_medico() {
        return id_medico;
    }

    public int getId_producto() {
        return id_producto;
    }
    
}
