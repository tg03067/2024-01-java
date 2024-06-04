package com.green.day23;
//Vo ( Value Object ) - 대표하는 이름, 변하지않는것.
public class BuySleVo {
    private String memId;
    private int buyCount;
    public BuySleVo(String memId, int buyCount) {
        this.memId = memId;
        this.buyCount = buyCount;
    }
    public String getMemId(){ return memId; }
    public int getBuyCount(){ return buyCount; }

    @Override
    public String toString() {
        return "BuySleVo{" +
                "memId='" + memId + '\'' +
                ", buyCount=" + buyCount +
                '}';
    }
}