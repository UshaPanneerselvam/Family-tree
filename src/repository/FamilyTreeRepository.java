package repository;

import Entity.Person;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;

@Repository
public class FamilyTreeRepository {

    private final FamilyTreeDao familyTreeDao;

    @Inject
    public FamilyTreeRepository(FamilyTreeDao familyTreeDao) {
        this.familyTreeDao = familyTreeDao;
    }

    public void createPerson(Person person){
        familyTreeDao.createPerson(person);
    }
}
