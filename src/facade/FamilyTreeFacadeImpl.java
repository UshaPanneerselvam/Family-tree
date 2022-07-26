package facade;

import Entity.Person;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import service.FamilyTreeService;

import javax.inject.Inject;

@Service
public class FamilyTreeFacadeImpl implements FamilyTreeFacade{

    private final FamilyTreeService familyTreeService;

    @Inject
    public FamilyTreeFacadeImpl(FamilyTreeService familyTreeService) {
        this.familyTreeService = familyTreeService;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void createPerson(Person person) {
        familyTreeService.createPerson(person);
    }

}
