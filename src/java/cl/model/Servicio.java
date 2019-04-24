package cl.model;

import java.util.ArrayList;
import javax.ejb.Singleton;

/**
 *
 * @author profe Hernán
 * 
 */
@Singleton
public class Servicio implements ServicioLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    private ArrayList<Cliente> lista = new ArrayList<>();

    public Servicio() {
        
        lista.add(new Cliente("Juan","Cerda"));
        lista.add(new Cliente("David","Aguirre"));
        lista.add(new Cliente("Jorge","Caceres"));
        
    }
//
    @Override
    public void agregarCliente(Cliente cli) {
        
        lista.add(cli);
        
    }

    @Override
    public ArrayList<Cliente> getClientes() {
        return lista;
    }

    @Override
    public Cliente buscar(String rut) {
        return null;
    }


    

  
    
    
    
    
    
    
}
