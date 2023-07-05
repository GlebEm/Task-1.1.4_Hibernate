package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService { // ������ dao/service ������ ������������� ��������������� ����������
    UserDao userDao = new UserDaoJDBCImpl(); //������ UserDao, ����� ���������������� ��� ������


    // service �������������� ������ dao
    public void createUsersTable() {
        userDao.createUsersTable(); //service �������������� ������ dao
    }

    public void dropUsersTable() {
        userDao.dropUsersTable();  //service �������������� ������ dao

    }

    public void saveUser(String name, String lastName, byte age) {
        //����� ������� ���������� ������ ���� ����� � ������� ( User � ������ � name �������� � ���� ������ )
        userDao.saveUser(name, lastName, age); // service �������������� ������ dao
        System.out.println("User � ������ � " + name + " �������� � ���� ������ ");
    }

    public void removeUserById(long id) {
        userDao.removeUserById(id);  //service �������������� ������ dao
    }

    public List<User> getAllUsers() {  //List<User> getAllUsers();
        List<User> users = userDao.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }
        return users;
    }


    public void cleanUsersTable() {  // service �������������� ������ dao
        userDao.cleanUsersTable();
    }
}
