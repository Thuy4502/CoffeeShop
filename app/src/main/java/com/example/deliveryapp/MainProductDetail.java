package com.example.deliveryapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.colormoon.readmoretextview.ReadMoreTextView;
import com.example.deliveryapp.model.product;

public class MainProductDetail extends AppCompatActivity {
    TextView tvNameDetail, tvPriceDetail;
    Button btnEdit, btnXoa;
    ImageView ivHome;

    private ReadMoreTextView tvReadMore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_detail);
        setControl();
        setEvent();
    }
    public void setEvent() {
        product sp = (product) getIntent().getSerializableExtra("item");
        tvNameDetail.setText(sp.getProductName());
        String price = String.valueOf(sp.getPrice());
        tvPriceDetail.setText(price);
        tvReadMore.setCollapsedText("Read more");
        tvReadMore.setTrimLines(2);


        btnXoa.setAllCaps(false);
        btnXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainProductDetail.this, DeleteProduct.class);
                startActivity(intent);
            }
        });


        btnEdit.setAllCaps(false);
        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainProductDetail.this, MainEditProduct.class);
                startActivity(intent);
            }
        });

        ivHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainProductDetail.this, MainActivity.class);
                startActivity(intent);
            }
        });



    }
    public void setControl() {

        tvReadMore = findViewById(R.id.tvReadMore);
        tvNameDetail = findViewById(R.id.tvNameDetail);
        tvPriceDetail = findViewById(R.id.tvPriceDetail);
        btnEdit = findViewById(R.id.btnEdit);
        btnXoa = findViewById(R.id.btnXoa);
        ivHome = findViewById(R.id.ivHome);



    }
}
