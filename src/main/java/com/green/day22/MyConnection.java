package com.green.day22;




import java.sql.*;

public class MyConnection {
    private final String DRIVER = "org.mariadb.jdbc.Driver";
    private final String HOST = "localhost"; // ip주소
    private final String POST = "3306"; // 포트번호
    private final String DB_NAME = "market_db"; // 데이터베이스명.
    private final String USERNAME = "root";
    private final String PASSWORD = "green502";

    public Connection getConn() throws SQLException, ClassNotFoundException {
        // jdbc:mariadb://localhost:3306/market_db
        String url = String.format("jdbc:mariadb://%s:%s/%s", HOST, POST, DB_NAME);
        //                          접속주소 오타X
        Class.forName(DRIVER);
        Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
        System.out.println("DB 접속 완료!");
        return conn;
    }
    public void close(Connection conn){
        if(conn == null){ return; }
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void close(Statement stat, Connection conn){
        if(stat != null);{
            try {
                stat.close();
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
        close(conn);
    }

    public void close(ResultSet rs, Statement stat, Connection conn){
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        close(stat, conn);
    }
}

class MyconnectionTest {
    public static void main(String[] args){
        MyConnection myConnection = new MyConnection();
        Connection conn = null;
        try {
            conn = myConnection.getConn();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            myConnection.close(conn); // instanse 메소드, void 메소드, 파라미터 1개 타입은? Connection
        }
    }
}