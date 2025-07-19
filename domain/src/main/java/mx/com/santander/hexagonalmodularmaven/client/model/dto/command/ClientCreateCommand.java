package mx.com.santander.hexagonalmodularmaven.client.model.dto.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter 
@Setter
public class ClientCreateCommand {

    private String name;
    private String lastname;
    private String email;
    private String cel;
    private String direction;

}
