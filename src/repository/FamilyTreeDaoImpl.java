package repository;

import Entity.Person;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(propagation = Propagation.NEVER)
public class FamilyTreeDaoImpl implements FamilyTreeDao{

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public void createPerson(Person person){

    }

}
