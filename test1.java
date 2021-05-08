package com.test;

import util.DBUtil;

import java.sql.Connection;

public class test1 {
    public static void main(String[] args) {
        Connection conn= DBUtil.getConn();
    }
}
