package com.example.training.android.model;

/**
 * Created by mdang on 05.07.2017.
 */

public class Order {
    private int orderNo;
    private int tableNo;

    public Order(int orderNo, int tableNo) {
        this.orderNo = orderNo;
        this.tableNo = tableNo;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public int getTableNo() {
        return tableNo;
    }

    public void setTableNo(int tableNo) {
        this.tableNo = tableNo;
    }
}
