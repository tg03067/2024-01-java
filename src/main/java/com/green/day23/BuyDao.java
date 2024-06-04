package com.green.day23;

import com.green.day22.MyConnection;
import org.checkerframework.checker.units.qual.C;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BuyDao {
    private final MyConnection myConn;
    public BuyDao(){
        this.myConn = new MyConnection();
    }
    //INSERT
    public int insBuy(BuyEntity entity){
        String sql = "INSERT INTO buy (mem_id, prod_name, group_name, price, amount) " +
                     " VALUES (?, ?, ?, ?, ?)" ;

        try(Connection conn = myConn.getConn();
            PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, entity.getMemId());
            ps.setString(2, entity.getProdName());
            ps.setString(3, entity.getGroupName());
            ps.setInt(4, entity.getPrice());
            ps.setInt(5, entity.getAmount());
            System.out.println(ps);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    //UPDATE
    public int updBuy(BuyEntity entity){ //num 컬럼 제외 모든 컬럼 수정.
        String sql = String.format("UPDATE buy SET mem_id = '%s', prod_name = '%s', group_name = '%s', price = '%d', amount = '%d' WHERE num = '%d';",
                                    entity.getMemId(), entity.getProdName(), entity.getGroupName(), entity.getPrice(), entity.getAmount(), entity.getNum());
//        String str = "UPDATE buy SET mem_id = ?, prod_name = ?, group_name = ?, price = ?, amount = ? WHERE num = ?";
//        try(Connection conn = myConn.getConn();
//        PreparedStatement ps = conn.prepareStatement(str)){
//            ps.setString(1, entity.getMemId());
//            ps.setString(2, entity.getProdName());
//            ps.setString(3, entity.getGroupName());
//            ps.setInt(4, entity.getPrice());
//            ps.setInt(5, entity.getAmount());
//            ps.setInt(6, entity.getNum());
//            return ps.executeUpdate();
//        } catch (Exception e){
//            e.printStackTrace();
//        }
//        return 0;
        Connection conn = null;
        Statement stat = null;
        int result = 0;
        try {
            conn = myConn.getConn();
            stat = conn.createStatement();
            return stat.executeUpdate(sql);
        } catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
    //DELETE
    public int delBuy(int num){
        String sql = "DELETE FROM buy WHERE num = ?";
        try(Connection conn = myConn.getConn();
        PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, num);
            return ps.executeUpdate();
        } catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }
    //SELECT - memid 누르면 구매정보가 나올 수 있게 작성해볼 것.
    public List<BuySleVo> selBuyGroupByMemId(){
       List<BuySleVo> list = new ArrayList<>();
       String sql = "SELECT mem_id, COUNT(mem_id) AS 'buyCount' FROM buy GROUP BY mem_id";

       try(Connection conn = myConn.getConn();
       PreparedStatement ps = conn.prepareStatement(sql);
       ResultSet rs = ps.executeQuery()){
           while(rs.next()){
               String mem_id = rs.getString("mem_id");
               Integer buyCount = rs.getInt("buyCount");

               BuySleVo entity = new BuySleVo(mem_id, buyCount);
               list.add(entity);
           }
       } catch (Exception e){
           e.printStackTrace();
       }
       return list;
    }
}
class BuySleListDaoTest{
    public static void main(String[] args){
        BuyDao dao = new BuyDao();
        List<BuySleVo> list = dao.selBuyGroupByMemId();
        for(BuySleVo entity : list){
            System.out.println(entity);
        }
    }
}
class BuyDelDaoTest{
    public static void main(String[] args){
        BuyDao dao = new BuyDao();
        int affectedRow = dao.delBuy(16);
        System.out.println("affectedRow: " + affectedRow);
    }
}
class BuyUpdDaoTest {
    public static void main(String[] args){
        BuyDao buyDao = new BuyDao();
        BuyEntity entity = new BuyEntity();

        entity.setNum(16);
        entity.setMemId("MMU");
        entity.setProdName("구두");
        entity.setGroupName("패션");
        entity.setPrice(300);
        entity.setAmount(3);

        int affectedRow = buyDao.updBuy(entity);
        System.out.println("affectedRow: " + affectedRow);
    }
}
class BuyDaoTest {
    public static void main(String[] args){
        BuyDao buyDao = new BuyDao(); // MyConnection 객체 주소값 갖게 된다.
        BuyEntity entity = new BuyEntity();
        entity.setMemId("RED");
        entity.setProdName("구두");
        entity.setGroupName("패션");
        entity.setPrice(300);
        entity.setAmount(3);

        int affectedRow = buyDao.insBuy(entity);
        System.out.println("affectedRow: " + affectedRow);
    }
}