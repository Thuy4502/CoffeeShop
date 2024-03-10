package com.example.deliveryapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainCartDetail extends AppCompatActivity {
    TextView tvQuantity, tvName, tvPrice;
    ImageView ivMinus, ivAdd, ivProductImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_detail);
        setControl();
        setEvent();
    }
    public void setControl() {
        ivMinus = findViewById(R.id.ivMinus);
        ivAdd = findViewById(R.id.ivAdd);

    }

    public void setEvent() {}

}
