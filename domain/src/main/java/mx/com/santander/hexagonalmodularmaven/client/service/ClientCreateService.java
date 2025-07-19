package mx.com.santander.hexagonalmodularmaven.client.service;

import mx.com.santander.hexagonalmodularmaven.client.model.entity.Client;
import mx.com.santander.hexagonalmodularmaven.client.port.repository.ClientRepository;

public class ClientCreateService {

    // servicio que crea usurio.
    // este servicio solo hara uso de repository ya que no requiere traer registros.

    private ClientRepository cliRepository; // se va a realizar uso de repository para realizar persistencia.

//    - Validar que los datos sean correctos y únicos.
//    - Mandar un mensaje en Kafka al topic "clientes_creados" con los datos del cliente creado.

    public Client execute(Client client){

        
        return new Client();
    }


}
