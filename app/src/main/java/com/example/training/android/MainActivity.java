package com.example.training.android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.training.android.viewOrders.ViewOrders;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void viewOrders(View view) {
        Intent intent = new Intent(this, ViewOrders.class);
        startActivity(intent);
    }
}
