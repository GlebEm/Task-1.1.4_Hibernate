package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
//import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService { // ������ dao/service ������ ������������� ��������������� ����������
    UserDaoHibernateImpl userDaoHibernate = new UserDaoHibernateImpl(); //������ UserDao, ����� ���������������� ��� ������


    // service �������������� ������ dao
    public void createUsersTable() {
        userDaoHibernate.createUsersTable(); //service �������������� ������ dao
    }

    public void dropUsersTable() {
        userDaoHibernate.dropUsersTable();  //service �������������� ������ dao

    }

    public void saveUser(String name, String lastName, byte age) {
        //����� ������� ���������� ������ ���� ����� � ������� ( User � ������ � name �������� � ���� ������ )
        userDaoHibernate.saveUser(name, lastName, age); // service �������������� ������ dao
        System.out.println("User � ������ � " + name + " �������� � ���� ������ ");
    }

    public void removeUserById(long id) {
        userDaoHibernate.removeUserById(id);  //service �������������� ������ dao
    }

    public List<User> getAllUsers() {  //List<User> getAllUsers();
        List<User> users = userDaoHibernate.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }
        return users;
    }


    public void cleanUsersTable() {  // service �������������� ������ dao
        userDaoHibernate.cleanUsersTable();
    }
}
