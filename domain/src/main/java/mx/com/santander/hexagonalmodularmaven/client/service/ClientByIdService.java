package mx.com.santander.hexagonalmodularmaven.client.service;

import mx.com.santander.hexagonalmodularmaven.client.model.entity.Client;
import mx.com.santander.hexagonalmodularmaven.client.port.dao.ClientDao;

public class ClientByIdService {

    private ClientDao clientDao;
    
    public Client execute(Long id){
        
        return clientDao.getById(id);
    }

}
