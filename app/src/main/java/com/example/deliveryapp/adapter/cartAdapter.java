package com.example.deliveryapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.deliveryapp.R;
import com.example.deliveryapp.model.cart;
import com.example.deliveryapp.model.product;

import java.util.List;

public class cartAdapter extends BaseAdapter
{
    Context context;
    private List<cart> list;
    ImageView ivAdd, ivMinus, ivProductImg, ivBack;
    TextView tvQuantity, tvName, tvPrice;


    public cartAdapter(Context context, List<cart> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        if(position < 0) return null;
        return list.get(position);

    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.layout_cart_item, null);
        }

        tvName = convertView.findViewById(R.id.tvName);
        tvPrice = convertView.findViewById(R.id.tvPrice);
        tvQuantity = convertView.findViewById(R.id.tvQuantity);
        ivAdd = convertView.findViewById(R.id.ivAdd);
        ivMinus = convertView.findViewById(R.id.ivMinus);
        ivProductImg = convertView.findViewById(R.id.ivProductImg);
        ivBack = convertView.findViewById(R.id.ivBack);

        cart cartItem = list.get(position);
        tvName.setText(cartItem.getName());
        tvPrice.setText(String.valueOf(cartItem.getPrice()));
        tvQuantity.setText((String.valueOf(cartItem.getQuantity())));
        ivProductImg.setImageResource(cartItem.getImg());
        ivMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });




        return convertView;

    }
}
