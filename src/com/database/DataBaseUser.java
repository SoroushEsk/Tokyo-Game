package com.database;

import java.sql.SQLException;

public class DataBaseUser {



    public void createTable() throws SQLException {

        Database.getInstance().executeUpdate("CREATE TABLE IF NOT EXISTS employees (\n" +
                "    id INT PRIMARY KEY,\n" +
                "    department VARCHAR(50),\n" +
                "    salary DECIMAL(10, 2)\n" +
                ");\n ");
    }
}
