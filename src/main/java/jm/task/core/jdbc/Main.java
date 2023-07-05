package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import org.postgresql.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * � ������ main ������ Main ������ ����������� ��������� ��������:
 * �������� ������� User(��)
 * ���������� 4 User(��) � ������� � ������� �� ���� �����. ����� ������� ���������� ������ ���� ����� � �������
 * ( User � ������ � name �������� � ���� ������ )
 * ��������� ���� User �� ���� � ����� � ������� ( ������ ���� ������������� toString � ������ User)
 * ������� ������� User(��)
 * �������� �������
 */

public class Main {
    private final static UserService userService = new UserServiceImpl();

    public static void main(String[] args) throws SQLException {
//        Class<Driver>driverClass = Driver.class;
//        String url = "jdbc:postgresql://localhost:5432/webapp";
//        String password = "postgres";
//        String username = "postgres";
//        try(var connection= Util.open()){
//           System.out.println(connection.getTransactionIsolation());
//       }

        // ���������� �������� �����

        userService.createUsersTable(); //�������� ������� User(��)


//����� ������� ���������� ������ ���� ����� � ������� ( User � ������ � name �������� � ���� ������ )

        userService.saveUser("������", "�������", (byte) 27);
        userService.saveUser("�����", "�����", (byte) 31);
        userService.saveUser("����", "����", (byte) 34);
        userService.saveUser("������", "������", (byte) 41);

        //��������� ���� User �� ���� � ����� � ������� ( ������ ���� ������������� toString � ������ User)

        userService.getAllUsers();

        userService.removeUserById(3);
        userService.cleanUsersTable(); //������� ������� User(��)
        userService.dropUsersTable(); //�������� �������

    }
}
