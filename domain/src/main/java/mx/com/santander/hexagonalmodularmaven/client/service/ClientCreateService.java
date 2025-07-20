package mx.com.santander.hexagonalmodularmaven.client.service;

import lombok.RequiredArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.client.model.dto.command.ClientCreateCommand;
import mx.com.santander.hexagonalmodularmaven.client.model.entity.Client;
import mx.com.santander.hexagonalmodularmaven.client.port.dao.ClientDao;
import mx.com.santander.hexagonalmodularmaven.client.port.repository.ClientRepository;

@RequiredArgsConstructor
public class ClientCreateService {

    private final ClientDao clientDao;
    private final ClientRepository clientRepository; 

    public Client execute( ClientCreateCommand clientCommmand ){

        //validaciones
        if( clientCommmand.getName() == null && clientCommmand.getEmail() == null ){ 

            throw new IllegalArgumentException("Campos Nombre/email obligatorios."); 
        }
        if( clientDao.getByEmail( clientCommmand.getEmail() ) != null ){
            throw new IllegalArgumentException("Email ya registrado.");
        }

        Client client = new Client().create(clientCommmand);

        return clientRepository.create(client);
    }


}
