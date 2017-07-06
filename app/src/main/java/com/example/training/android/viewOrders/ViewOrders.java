package com.example.training.android.viewOrders;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.training.android.R;
import com.example.training.android.dummyDatabase.OrderRepo;
import com.example.training.android.model.Order;

public class ViewOrders extends AppCompatActivity {

    private OrderRepo orderRepo;

    public ViewOrders() {
        orderRepo = new OrderRepo();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_orders);

        ListAdapter listAdapter = new ArrayAdapter<Order>(this, android.R.layout.simple_list_item_1, orderRepo.getAll());
        ListView listView = (ListView) findViewById(R.id.orderList);
        listView.setAdapter(listAdapter);
    }
}
