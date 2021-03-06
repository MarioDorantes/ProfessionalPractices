/*
Institution: Universidad Veracruzana
File creator: Carlos Gabriel Flores Lira
Class name: CoordinatorDAO
Date of creation: May 7th. 2020
*/
package dataAccess;

import Domain.Coordinator;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CoordinatorDAO implements ICoordinatorDAO  {
    private final ConnectDB connectDB;
    private Connection connection;
    private Statement consultation;
    private ResultSet results;

    public CoordinatorDAO () {
        connectDB = new ConnectDB();
    }


    @Override
    public Coordinator searchCoordinatorByIDPerson(int id_person) {
        Coordinator coordinator = null;
        try (Connection connection = connectDB.getConnection()){
            String query = "SELECT id_person, name FROM coordinator where id_person = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id_person);
            statement.executeQuery();
            while (results.next()) {
                coordinator = new Coordinator();
                coordinator.setId_person(results.getInt("id_person"));
                coordinator.setName(results.getString("name"));
            }
        } catch (SQLException exc) {
            Logger.getLogger(ProjectDAO.class.getName()).log(Level.SEVERE, null, exc);
        }
        return coordinator;
    }

    @Override
    public Coordinator searchCoordinatorByKeyword(String keyword) {
        Coordinator coordinator = null;
        try (Connection connection = connectDB.getConnection()){
            String query = "SELECT id_person, name FROM coordinator where name LIKE %{?}%";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, keyword);
            statement.executeQuery();
            while (results.next()) {
                coordinator = new Coordinator();
                coordinator.setId_person(results.getInt("id_person"));
                coordinator.setName(results.getString("name"));
            }
        } catch (SQLException exc) {
            Logger.getLogger(CoordinatorDAO.class.getName()).log(Level.SEVERE, null, exc);
        }
        return coordinator;
    }

    @Override
    public void deleteCoordinatorByIDPerson(int id_person) {
        Scanner sc = new Scanner(System.in);
        Connection connect = null;
        PreparedStatement sentence = null;
        try {
            connect = connectDB.getConnection();
            String query = "START TRANSACTION; DELETE FROM coordinator WHERE id_person = ?";
            sentence = connect.prepareStatement(query);
            sentence.setInt(1, id_person);
            results = sentence.executeQuery();
        } catch (SQLException exc) {
            Logger.getLogger(CoordinatorDAO.class.getName()).log(Level.SEVERE, null, exc);
        }
        String flag = null;
        while (!flag.equals("Y") || !flag.equals("N")) {
            System.out.println("Are you sure you want to erase this data? Y/N");
            flag = sc.nextLine();
            if (flag.equals("Y")) {
                try {
                    sentence = connect.prepareStatement("COMMIT");
                    sentence.executeQuery();
                } catch (SQLException exc) {
                    System.out.println("The operation couldn't be completed.");
                }
            } else if (flag.equals("N")) {
                try {
                    sentence = connect.prepareStatement("ROLLBACK");
                    sentence.executeQuery();
                } catch (SQLException exc) {
                    System.out.println("The operation couldn't be completed.");
                }
            } else {
                System.out.println("Answer not valid. Try again.");
            }
        }
    }

    @Override
    public List<Coordinator> returnAllCoordinators() {
        List<Coordinator> AllCoordinators = new ArrayList();
        Coordinator coordinator = null;
        try (Connection connection = connectDB.getConnection()) {
            String query = "SELECT id_person, name FROM coordinator";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.executeQuery();
            while (results.next()) {
                coordinator = new Coordinator();
                coordinator.setId_person(results.getInt("id_person"));
                coordinator.setName(results.getString("name"));
                AllCoordinators.add(coordinator);
            }
        } catch (SQLException exc) {
            Logger.getLogger(CoordinatorDAO.class.getName()).log(Level.SEVERE, null, exc);

        }
        return AllCoordinators;
    }
}
