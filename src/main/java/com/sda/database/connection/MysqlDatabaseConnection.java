package com.sda.database.connection;

import com.sda.database.property.ConnectionProperty;
import lombok.extern.java.Log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Log
public class MysqlDatabaseConnection extends DatabaseConnection {

    private Connection connection = null;

    @Override
    public void open(final ConnectionProperty connectionProperty) {
        try {
            Connection connection = DriverManager.getConnection(connectionProperty.getDatabaseUrl(), connectionProperty.getUsername(), connectionProperty.getPassword());
            log.info("Connection established to the driver " + connectionProperty.getDriverName());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void connect() {

    }

    @Override
    public void close() {
        try {
            if (!connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
