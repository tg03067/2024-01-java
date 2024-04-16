package com.green.day23;
//Vo ( Value Object )
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