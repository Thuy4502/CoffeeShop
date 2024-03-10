package com.example.deliveryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.deliveryapp.adapter.productAdapter;
import com.example.deliveryapp.model.product;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button btnProductMgmt, btnDiscountMgmt, btnStatistic, btnCustomerMgmt;
    LinearLayout btnOrderMgmt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setControl();
        setEvent();
    }

    public void setEvent() {
        btnProductMgmt.setAllCaps(false);
        btnProductMgmt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ProductList.class);
                startActivity(intent);

            }
        });


        btnDiscountMgmt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Đã click", Toast.LENGTH_LONG).show();

            }
        });
        btnDiscountMgmt.setAllCaps(false);

        btnStatistic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Đã click", Toast.LENGTH_LONG).show();

            }
        });
        btnStatistic.setAllCaps(false);

        btnOrderMgmt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Đã click", Toast.LENGTH_LONG).show();

            }
        });

        btnCustomerMgmt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Đã click", Toast.LENGTH_LONG).show();

            }
        });
        btnCustomerMgmt.setAllCaps(false);



    }

    public void setControl() {
        btnProductMgmt = findViewById(R.id.btnProductMgmt);
        btnOrderMgmt = findViewById(R.id.btnOrderMgmt);
        btnStatistic = findViewById(R.id.btnStatistic);
        btnDiscountMgmt = findViewById(R.id.btnDiscountMgmt);
        btnCustomerMgmt = findViewById(R.id.btnCustomerMgmt);
    }
}