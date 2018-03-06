package csjobs.model.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import csjobs.model.User;
import csjobs.model.dao.UserDao;



@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public User getUserById( Integer id )
    {
        return entityManager.find( User.class, id );
    }

    @Override
    public List<User> getAllUsers()
    {
        return entityManager.createQuery( "from User", User.class )
            .getResultList();
    }

}