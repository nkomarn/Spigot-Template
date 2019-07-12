package xyz.nkomarn.SeedTemplate.util;

import java.sql.Connection;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class Database {
    private static HikariDataSource ds;
    
    static {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("");
        config.setUsername("");
        config.setPassword("");  
        config.addDataSourceProperty("cachePrepStmts", "true");
        config.addDataSourceProperty("prepStmtCacheSize", "250");
        config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
        ds = new HikariDataSource(config);
    }

    public static Connection getConn() throws SQLException {
        return ds.getConnection();
    }
}