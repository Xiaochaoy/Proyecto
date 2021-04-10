package com.company;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BaseDeDatos {
    static final String url = "jdbc:sqlite:database.db";

    static BaseDeDatos instance;
    static Connection connection;

    public static BaseDeDatos get(){
        if(instance == null){
            instance = new BaseDeDatos();

            try {
                connection = DriverManager.getConnection(url);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

        }
        return instance;
    }

    void deleteTables(){
        try (Statement statement = connection.createStatement()) {
            statement.execute("DROP TABLE IF EXISTS Alumnos");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    void deleteAlumnos(String p){
        try (Statement statement = connection.createStatement()) {
            statement.execute("DELETE from Alumnos where nom= ?");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    void createTables(){
        try (Statement statement = connection.createStatement()) {
            statement.execute("CREATE TABLE IF NOT EXISTS Alumnos (nom text, edat real, email text)");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void insertAlumnos(String nom, int edat, String email) {
        String sql = "INSERT INTO Alumnos(nom,edat,email) VALUES(?,?,?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, nom);
            preparedStatement.setInt(2, edat);
            preparedStatement.setString(3, email);
            preparedStatement.executeUpdate();
            System.out.println("\033[35m" + "Muy bien, las metido!" + "\033[0m");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Alumnos> selectAlumnos(){
        String sql = "SELECT nom, edat, email FROM Alumnos";

        List<Alumnos> listaAlumnos = new ArrayList<>();
        try (PreparedStatement preparedStatement  = connection.prepareStatement(sql)){

            ResultSet resultSet  = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String nom = resultSet.getString("nom");
                int edat = resultSet.getInt("edat");
                String email = resultSet.getString("email");
                listaAlumnos.add(new Alumnos(nom, edat, email));
            }
        } catch (SQLException e) {
            Mensaje mensaje = new Mensaje();
            mensaje.mostrarError("No hay Alumnos!");
            //System.out.println(e.getMessage());
        }

        return listaAlumnos;
    }
}
