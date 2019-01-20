package com.sda.database;

import com.sda.database.connection.DatabaseConnection;
import com.sda.database.connection.H2DatabaseConnection;
import com.sda.database.connection.MysqlDatabaseConnection;
import com.sda.database.property.ConnectionProperty;
import com.sda.database.repository.EmployeeRepository;

public class CrudExample {

    public static void main(String[] args) {

        DatabaseConnection mysqlDatabaseConnection = new MysqlDatabaseConnection();
        ConnectionProperty connectionProperty = mysqlDatabaseConnection.getConnectionProperties(
                "src/main/resources/mysql-remote.properties");

        System.out.println(
                String.format("Driver name: %s , Database Name: %s, Username: %s, Password: %s",
                        connectionProperty.getDriverName(), connectionProperty.getDatabaseUrl(),
                        connectionProperty.getUsername(), connectionProperty.getPassword()));

      //  EmployeeRepository employeeRepository = new EmployeeRepository(databaseConnection);

       // DatabaseConnection h2DatabaseConnection = new H2DatabaseConnection();
        // EmployeeRepository employeeRepository1 = new EmployeeRepository(h2DatabaseConnection);
    }
}
