package com.example.deliveryapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.deliveryapp.MainProductDetail;
import com.example.deliveryapp.R;
import com.example.deliveryapp.model.product;

import java.io.Serializable;
import java.util.List;

public class productAdapter extends BaseAdapter {
    private Context context;
    private List<product> list;
    ImageView ivHinh;
    TextView tvProductName, tvProductPrice, tvProductId, tvProductQuan;

    ListView lvProduct;
    CheckBox cbProduct;
    RelativeLayout itemClick;
    public productAdapter(Context context, List<product> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        if(position < 0) {
            return null;
        }
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.layout_product_item, null);
        }
        cbProduct = convertView.findViewById(R.id.cbProduct);
        ivHinh = convertView.findViewById(R.id.ivProduct);
        tvProductName = convertView.findViewById(R.id.tvProductName);
        tvProductPrice = convertView.findViewById(R.id.tvProductPrice);
        tvProductId = convertView.findViewById(R.id.tvProductId);
        tvProductQuan = convertView.findViewById(R.id.tvProductQuan);
        lvProduct = convertView.findViewById(R.id.lvProductList);
        itemClick = convertView.findViewById(R.id.itemClick);

        product sp = list.get(position);
        ivHinh.setImageResource(sp.getImageId());
        tvProductName.setText(sp.getProductName());
        String convertPrice = Long.toString(sp.getPrice());
        tvProductPrice.setText(convertPrice);
        String convertId = Integer.toString(sp.getProductId());
        tvProductId.setText(convertId);
        String convertQuan = Integer.toString(sp.getQuantity());
        tvProductQuan.setText(convertQuan);

        itemClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MainProductDetail.class);
                intent.putExtra("item",  sp);
                context.startActivity(intent);
            }
        });

//        lvProduct.setClickable(true);
//        lvProduct.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Intent intent = new Intent(context, MainProductDetail.class);
//                intent.putExtra("item",  sp);
//                context.startActivity(intent);
//            }
//        });


        return convertView;
    }
}
