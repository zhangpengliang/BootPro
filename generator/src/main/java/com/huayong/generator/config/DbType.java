package com.huayong.generator.config;


public enum DbType {
    MYSQL("mysql"),
    ORACLE("oracle"),
    SQL_SERVER("sql_server"),
    POSTGRE_SQL("postgre_sql");

    private final String value;

    private DbType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
