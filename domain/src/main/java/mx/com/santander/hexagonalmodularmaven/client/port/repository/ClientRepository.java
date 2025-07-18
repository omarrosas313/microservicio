package mx.com.santander.hexagonalmodularmaven.client.port.repository;

import mx.com.santander.hexagonalmodularmaven.client.model.entity.Client;

public interface ClientRepository {

    
    Client create(Client client); // -revisar cual es el parametro correcto.
    void update(Client client); // -revisar 
    Client delete(Client client);

}
