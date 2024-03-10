package com.example.deliveryapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import com.example.deliveryapp.adapter.productAdapter;
import com.example.deliveryapp.model.product;

import java.util.ArrayList;
import java.util.List;

public class ProductList extends AppCompatActivity {

    private String filter[] = {"Đồ uống", "Bánh ngọt", "Giá tăng dần", "Giá giảm dần"};
    private Spinner spnFilter;
    private ImageView ivBack;
    private SearchView searchView;
    private Button btnSearch, btnDel;
    private ImageButton btnAdd;

    private List<product> productList;
    private productAdapter adapter;

    ListView lvProductList;

    public ProductList() {
        productList = new ArrayList<>();
        productList.add(new product(1, "Trà vải lài", 50000,R.drawable.img, 100));
        productList.add(new product(2, "Trà đào", 40000,R.drawable.img, 34));
        productList.add(new product(3, "Coffee sữa đá", 20000,R.drawable.img, 99));
        productList.add(new product(4, "Bạc xỉu", 30000,R.drawable.img, 88));
        productList.add(new product(5, "Capuchino", 50000,R.drawable.img, 77));
        productList.add(new product(6, "Trà vải lài", 50000,R.drawable.img, 100));
        productList.add(new product(7, "Trà đào", 40000,R.drawable.img, 34));
        productList.add(new product(8, "Coffee sữa đá", 20000,R.drawable.img, 99));
        productList.add(new product(9, "Bạc xỉu", 30000,R.drawable.img, 88));
        productList.add(new product(11, "Capuchino", 50000,R.drawable.img, 77));
        adapter = new productAdapter(this, productList);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);
        setControl();
        setEvent();
        lvProductList.setAdapter(adapter);
    }

    public void setEvent() {
        ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, filter);
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        spnFilter.setAdapter(adapter);
        spnFilter.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ProductList.this, "Bạn đã chọn mục " + filter[position], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(ProductList.this, "Chua chon điều kiện lọc", Toast.LENGTH_SHORT).show();
            }
        });

        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        searchView.clearFocus();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return true;
            }


        });
        btnSearch.setAllCaps(false);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProductList.this, AddProduct.class);
                startActivity(intent);
            }
        });

        btnDel.setAllCaps(false);
        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProductList.this, DeleteProduct.class);
                startActivity(intent);
            }
        });



    }

    public void setControl() {
        spnFilter = findViewById(R.id.spnFilter);
        ivBack = findViewById(R.id.ivBack);
        searchView = findViewById(R.id.searchView);
        btnSearch = findViewById(R.id.btnSearch);
        lvProductList = findViewById(R.id.lvProductList);
        btnAdd = findViewById(R.id.btnAdd);
        btnDel = findViewById(R.id.btnDel);
    }


}