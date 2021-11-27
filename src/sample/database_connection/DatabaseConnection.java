package sample.database_connection;

import sample.entity.Contract;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseConnection {

    private static final String SELECT_STATEMENT = "SELECT * FROM CONTRACT";

    public static final String CONNECTION_URL = "jdbc:mysql://localhost:3306/my_db?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    public static final String USER_NAME = "bestuser";
    public static final String PASSWORD = "bestuser";

    public static List<Contract> getAllContract() {
        List<Contract> allContracts = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(CONNECTION_URL, USER_NAME, PASSWORD)) {
            PreparedStatement ps = connection.prepareStatement(SELECT_STATEMENT);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String signingDate = resultSet.getString("signing_date");
                int contractId = resultSet.getInt("contract_id");
                String updateDate = resultSet.getString("update_date");
                allContracts.add(new Contract(id, signingDate, contractId, updateDate));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return allContracts;
    }

    public static void main(String[] args) {
        for(Contract contract : getAllContract()) {
            System.out.println(contract);
        }
    }
}
