package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import org.postgresql.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Main {
    private final static UserService userService = new UserServiceImpl();

    public static void main(String[] args) throws SQLException {

        userService.createUsersTable();

        userService.saveUser("Патрик", "Бэйтман", (byte) 27);
        userService.saveUser("Майкл", "Бьюри", (byte) 31);
        userService.saveUser("Брюс", "Уэйн", (byte) 34);
        userService.saveUser("Тревор", "Резник", (byte) 41);
        userService.getAllUsers();
        userService.removeUserById(3);
        userService.cleanUsersTable();
        userService.dropUsersTable();

    }
}
