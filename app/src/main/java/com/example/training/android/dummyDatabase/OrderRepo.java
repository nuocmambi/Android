package com.example.training.android.dummyDatabase;

import com.example.training.android.model.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mdang on 05.07.2017.
 */

public class OrderRepo {

    private List<Order> orderList = new ArrayList<>();

    public OrderRepo() {
        orderList.add(new Order(1,1));
        orderList.add(new Order(2,10));
        orderList.add(new Order(3,11));
    }

    public void save(Order order) {
        orderList.add(order);
    }

    public Order[] getAll(){
        return (Order[]) orderList.toArray();
    }
}
