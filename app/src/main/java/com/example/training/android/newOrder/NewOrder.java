package com.example.training.android.newOrder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.training.android.R;
import com.example.training.android.dummyDatabase.OrderRepo;
import com.example.training.android.model.Order;

public class NewOrder extends AppCompatActivity {

    private OrderRepo orderRepo = new OrderRepo();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_order);

        String[] s = {"asd","rew" , "fda"};
        OrderAdapter orderAdapter = new OrderAdapter(this, (Order[]) orderRepo.getAll().toArray());
        ListView listView = (ListView) findViewById(R.id.newOrder);
        listView.setAdapter(orderAdapter);

    }
}
