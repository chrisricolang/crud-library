package com.sda.database.repository;

import com.sda.database.connection.DatabaseConnection;
import com.sda.database.connection.MysqlDatabaseConnection;
import com.sda.database.entity.EmployeeEntity;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class EmployeeRepository implements CrudRepository<EmployeeEntity> {

    private final DatabaseConnection databaseConnection;

    @Override
    public List<EmployeeEntity> findAll() {

        return null;
    }

    @Override
    public Optional<EmployeeEntity> findById(long id) {
        return Optional.empty();
    }
}
