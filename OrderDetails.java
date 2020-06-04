package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.security.Key;

public class OrderDetails extends AppCompatActivity {
    TextView listView,priceView;
    String list_choices;
    Double price_bd,price_rs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_details);
        listView = (TextView) findViewById(R.id.listView);
        priceView = (TextView) findViewById(R.id.priceView);


        Bundle bundle = getIntent().getExtras();
        assert bundle != null;
        list_choices = bundle.getString("choices");
        price_bd = bundle.getDouble("price");


        price_rs = price_bd * 1;


        listView.setText(list_choices);
        priceView.setText(price_bd.toString()+"RS : "+price_rs.toString());

    }

    
    
}

