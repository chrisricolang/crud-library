package com.sda.database.connection;

import com.sda.database.property.ConnectionProperty;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public abstract class DatabaseConnection {

    public ConnectionProperty getConnectionProperties(final String fileName){

        Properties properties = new Properties();

        try(FileInputStream fileInputStream = new FileInputStream(fileName)){
            properties.load(fileInputStream);
        } catch(IOException e){
            e.printStackTrace();
        }

        return ConnectionProperty.builder()
                .databaseUrl(properties.getProperty("database.url"))
                .driverName(properties.getProperty("database.driver"))
                .username(properties.getProperty("database.username"))
                .password(properties.getProperty("database.password")).build();
    }

    abstract void open(final ConnectionProperty connectionProperty);

    abstract void connect();

    abstract void close();
}
