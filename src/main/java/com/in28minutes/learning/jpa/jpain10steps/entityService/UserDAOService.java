package com.in28minutes.learning.jpa.jpain10steps.entityService;

import com.in28minutes.learning.jpa.jpain10steps.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

// DAO means User Access Object, means this object is able to be accessed by User to the DB table.
@Repository
@Transactional
public class UserDAOService {
    // When I annotate @PersistenceContext,
    // If I persist(save) an object, that object will be tracked/managed by EntityManager
    // Other same objects will not get tracked
    @PersistenceContext
    private EntityManager entityManager;

    // Save a user to DB
    public long insert(User user) {
        // If above declared as @Transactional, everything start and end of entityManager will be transactions
        // Open transaction and make changes
        entityManager.persist(user);
        // Close transaction
        return user.getId();
    }
}
