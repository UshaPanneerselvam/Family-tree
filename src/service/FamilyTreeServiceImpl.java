package service;

import Entity.Person;
import org.springframework.stereotype.Service;
import repository.FamilyTreeRepository;

import javax.inject.Inject;

@Service
public class FamilyTreeServiceImpl implements FamilyTreeService{

    private final FamilyTreeRepository familyTreeRepository;

    @Inject
    public FamilyTreeServiceImpl(FamilyTreeRepository familyTreeRepository) {
        this.familyTreeRepository = familyTreeRepository;
    }

    @Override
    public void createPerson(Person person){
        familyTreeRepository.createPerson(person);
    }
}
