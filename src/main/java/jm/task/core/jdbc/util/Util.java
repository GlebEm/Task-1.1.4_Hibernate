package jm.task.core.jdbc.util;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;




public class Util {


    private Util() {
    }

        public static SessionFactory getSessionFactory () {

            Configuration configuration = new Configuration().addAnnotatedClass(User.class);

            SessionFactory sessionFactory = configuration.buildSessionFactory();

//            try (Session session = sessionFactory.getCurrentSession()) {
//                session.beginTransaction();
//            } catch (Exception e) {
//                System.out.println("Ошибка при создании сессии" + e);
//            }
          return sessionFactory;
        }
    }
// реализуйте настройку соеденения с БД
