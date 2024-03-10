package com.example.deliveryapp;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.deliveryapp.adapter.cartAdapter;
import com.example.deliveryapp.model.cart;

import java.util.ArrayList;
import java.util.List;

public class MainCart extends AppCompatActivity {

    private List<cart> cartList;
    private cartAdapter adapter;
    private ListView lvCart;
    private Button btnBuy;

    public MainCart() {
        cartList = new ArrayList<>();
        cartList.add(new cart(1, "Phindi Choco", 50000, 10,  R.drawable.phindichoco));
        cartList.add(new cart(2, "Phindi Choco2", 250000, 8,  R.drawable.phindichoco));
        cartList.add(new cart(13, "Phindi Choco3", 30000, 7,  R.drawable.phindichoco));
        cartList.add(new cart(14, "Phindi Choco4", 33000, 11,  R.drawable.phindichoco));
        cartList.add(new cart(15, "Phindi Choco5", 40000, 6,  R.drawable.phindichoco));
        cartList.add(new cart(16, "Phindi Choco6", 50000, 10,  R.drawable.phindichoco));
        adapter = new cartAdapter(this, cartList);

    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layour_cart);
        setControl();
        setEvent();
        lvCart.setAdapter(adapter);
        System.out.println("Thành công");
    }

    public void setControl() {
        lvCart = findViewById(R.id.lvCart);
        btnBuy.setAllCaps(false);


    }

    public void setEvent() {


    }
}
