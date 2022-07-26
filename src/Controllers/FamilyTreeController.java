package Controllers;

import Entity.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.rmi.ServerException;

public class FamilyTreeController {

    @PostMapping(value ="/person", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.CREATED)
    public void createChild(@RequestBody final Person person) throws ServerException {
        if(person == null) {
            throw new ServerException("Request body null", new Exception());
        } else {

        }
    }
}
