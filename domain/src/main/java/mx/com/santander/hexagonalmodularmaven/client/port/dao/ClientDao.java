package mx.com.santander.hexagonalmodularmaven.client.port.dao;

import java.util.List;

import mx.com.santander.hexagonalmodularmaven.client.model.entity.Client;

public interface ClientDao {

    Client getById(Long id);
    Client getByEmail(String email);
    List<Client> getAll();

}
