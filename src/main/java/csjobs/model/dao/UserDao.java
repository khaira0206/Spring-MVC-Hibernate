package csjobs.model.dao;

import java.util.List;

import csjobs.model.User;


public interface UserDao {

    User getUserById( Integer id );

    List<User> getAllUsers();

}
