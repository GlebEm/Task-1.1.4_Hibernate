package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
//import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService { //  лассы dao/service должны реализовывать соответствующие интерфейсы
    UserDaoHibernateImpl userDaoHibernate = new UserDaoHibernateImpl(); //создал UserDao, чтобы переиспользовать его методы


    // service переиспользует методы dao
    public void createUsersTable() {
        userDaoHibernate.createUsersTable(); //service переиспользует методы dao
    }

    public void dropUsersTable() {
        userDaoHibernate.dropUsersTable();  //service переиспользует методы dao

    }

    public void saveUser(String name, String lastName, byte age) {
        //ѕосле каждого добавлени€ должен быть вывод в консоль ( User с именем Ц name добавлен в базу данных )
        userDaoHibernate.saveUser(name, lastName, age); // service переиспользует методы dao
        System.out.println("User с именем Ц " + name + " добавлен в базу данных ");
    }

    public void removeUserById(long id) {
        userDaoHibernate.removeUserById(id);  //service переиспользует методы dao
    }

    public List<User> getAllUsers() {  //List<User> getAllUsers();
        List<User> users = userDaoHibernate.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }
        return users;
    }


    public void cleanUsersTable() {  // service переиспользует методы dao
        userDaoHibernate.cleanUsersTable();
    }
}
