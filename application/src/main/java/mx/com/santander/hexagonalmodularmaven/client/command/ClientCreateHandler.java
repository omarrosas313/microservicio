package mx.com.santander.hexagonalmodularmaven.client.command;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.client.mapper.ClientDtoMapper;
import mx.com.santander.hexagonalmodularmaven.client.model.dto.ClientDto;
import mx.com.santander.hexagonalmodularmaven.client.model.dto.command.ClientCreateCommand;
import mx.com.santander.hexagonalmodularmaven.client.service.ClientCreateService;

@Component
@RequiredArgsConstructor
public class ClientCreateHandler {

    private final ClientCreateService userCreateService;
    private final ClientDtoMapper clientMapper;

    public ClientDto execute(ClientCreateCommand clientCommand){
        return clientMapper
        .toDto(userCreateService.execute( clientCommand));
    }
    
}
