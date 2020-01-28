package ru.Eltex;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {

        FileInputStream fis;
        Properties property = new Properties();

        try {
            fis = new FileInputStream("src/main/resources/config.properties");
            property.load(fis);

            String host = property.getProperty("db.host");
            String login = property.getProperty("db.login");
            String password = property.getProperty("db.password");

            Connection connection = DriverManager.getConnection(host, login, password);
            Statement statement = connection.createStatement();

            Student Egor = new Student();
            Egor.setId(10);
            Egor.setName("Egor");
            Egor.setPhone("80000000000");
            Egor.setGroup("I-32");
            Egor.setTicket(4);
            statement.executeUpdate("INSERT INTO User (id, name, phone) VALUES(" + Egor.getId() + ", \'"+ Egor.getName() +"\'," + " \'"+ Egor.getPhone() +"\');");
            statement.executeUpdate("INSERT INTO Student (id, ticket, g) VALUES(" + Egor.getId() + ", \'"+ Egor.getTicket() +"\'," + " \'"+ Egor.getGroup() +"\');");

            Teacher Alisa = new Teacher();
            Alisa.setId(11);
            Alisa.setName("Alisa");
            Alisa.setPhone("90000000000");
            Alisa.setDepartment("Computing Systems");
            Alisa.setInterest("Math");
            Alisa.setInterest("Read books");
            Alisa.setInterest("Walk");
            statement.executeUpdate("INSERT INTO User (id, name, phone) VALUES(" + Alisa.getId() + ", \'"+ Alisa.getName() +"\'," + " \'"+ Alisa.getPhone() +"\');");
            statement.executeUpdate("INSERT INTO Teacher (id, department, interest) VALUES(" + Alisa.getId() + ", \'"+ Alisa.getDepartment() +"\'," + " \'"+ Alisa.getInterests() +"\');");

            System.out.println("I want to display the names from the User database");
            ResultSet resultSet = statement.executeQuery("SELECT name FROM User");
            while (resultSet.next())
                System.out.println(resultSet.getString("name"));


            connection.close();

        } catch (IOException | SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
