package mx.com.santander.hexagonalmodularmaven.client.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

import mx.com.santander.hexagonalmodularmaven.client.model.dto.ClientDto;
import mx.com.santander.hexagonalmodularmaven.client.model.entity.Client;
import mx.com.santander.hexagonalmodularmaven.client.model.entity.ClientCel;
import mx.com.santander.hexagonalmodularmaven.client.model.entity.ClientDirection;
import mx.com.santander.hexagonalmodularmaven.client.model.entity.ClientEmail;
import mx.com.santander.hexagonalmodularmaven.client.model.entity.ClientId;
import mx.com.santander.hexagonalmodularmaven.client.model.entity.ClientLastname;
import mx.com.santander.hexagonalmodularmaven.client.model.entity.ClientName;


@Mapper(componentModel = "spring")
@Component
public interface ClientDtoMapper {

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "lastname", target = "lastname")
    @Mapping(source = "email", target = "email")
    @Mapping(source = "cel", target = "cel")
    @Mapping(source = "direction", target = "direction")
    ClientDto toDto(Client client);


    
    default Long map(ClientId id) {
        return id != null ? id.getId() : null;
    }
    default String map(ClientName name) {
        return name != null ? name.getName() : null;
    }
    default String map(ClientLastname lastname) {
        return lastname != null ? lastname.getLastname() : null;
    }
    default String map(ClientEmail email) {
        return email != null ? email.getEmail() : null;
    }
    default String map(ClientCel cel) {
        return cel != null ? cel.getCel() : null;
    }
    default String map(ClientDirection direction) {
        return direction != null ? direction.getDirection() : null;
    }

}
