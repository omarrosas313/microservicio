package mx.com.santander.hexagonalmodularmaven.client.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.client.model.dto.command.ClientCreateCommand;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Client {

    private ClientId id;
    private ClientName name;
    private ClientLastname lastname;
    private ClientEmail email;
    private ClientCel cel;
    private ClientDirection direction;

    public Client create( ClientCreateCommand command ){
        this.name = new ClientName( command.getName() );
        this.lastname = new ClientLastname( command.getName() );
        this.email = new ClientEmail( command.getEmail() );
        this.cel = new ClientCel( command.getCel() );
        this.direction = new ClientDirection( command.getCel() );
        return this;
    }
}
