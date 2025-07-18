package mx.com.santander.hexagonalmodularmaven.client.service;

import java.util.List;

import mx.com.santander.hexagonalmodularmaven.client.model.entity.Client;
import mx.com.santander.hexagonalmodularmaven.client.port.dao.ClientDao;

public class ClientAllService {

    private ClientDao clientDao;

    public List<Client> execute(){
        return clientDao.getAll();
    }

}
