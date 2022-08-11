package pl.coderslab.servicepanel.dao;

import org.springframework.stereotype.Repository;
import pl.coderslab.servicepanel.entity.CustomerEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class CustomerDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void save(CustomerEntity customerEntity) {
        entityManager.persist(customerEntity);
    }

}
