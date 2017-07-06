package com.example.training.android.newOrder;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.training.android.R;
import com.example.training.android.model.Order;

public class OrderAdapter extends ArrayAdapter<Order>{

    public OrderAdapter(@NonNull Context context, Order[] orders) {
        super(context, R.layout.order_row, orders);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        View view = layoutInflater.inflate(R.layout.order_row, parent, false);

        Order item = getItem(position);
        TextView name = (TextView) view.findViewById(R.id.name);
        name.setText(item.getOrderNo());

        return view;
    }
}
