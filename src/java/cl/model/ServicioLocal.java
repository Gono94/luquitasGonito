/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.model;

import java.util.ArrayList;
import javax.ejb.Local;

/**
 *
 * @author sistemas
 */
@Local
public interface ServicioLocal {

    void agregarCliente(Cliente cli);

    ArrayList<Cliente> getClientes();

    Cliente buscar(String rut);

    Cliente eliminar(String rut);
    
}
