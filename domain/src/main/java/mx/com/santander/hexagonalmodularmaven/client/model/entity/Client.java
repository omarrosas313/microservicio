package mx.com.santander.hexagonalmodularmaven.client.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

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
}
