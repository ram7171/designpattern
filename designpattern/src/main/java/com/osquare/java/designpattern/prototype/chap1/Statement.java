package com.osquare.java.designpattern.prototype.chap1;

import java.util.List;

public class Statement implements Cloneable {
    private String sql;
    private List<String> parameter;
    private Record record;

    public String getSql() { return sql;  }
    public List<String> getParameter() { return parameter; }
    public Record getRecord() {  return record; }

    public Statement(String sql, List<String> parameter, Record record) {
        this.sql = sql;
        this.parameter = parameter;
        this.record = record;
    }

    public Statement clone() {
        try {
            return (Statement) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

}
