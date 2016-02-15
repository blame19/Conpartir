/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import ejb.Clients;
import ejb.ClientsFacadeLocal;
import ejb.DriverFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;


/**
 *
 * @author Matteo
 */
@Stateless
public class ClientsManager implements ClientsManagerLocal {
    @EJB
    private DriverFacadeLocal driverFacade;
    @EJB
    private ClientsFacadeLocal clientsFacade;
    
   

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

   @Override
    public List<Clients> showClients() {
        List<Clients> prova;
        prova = clientsFacade.findAll();
        
    return prova;
    }
    
}