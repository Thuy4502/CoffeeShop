package com.example.deliveryapp;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainEditProduct extends AppCompatActivity {
    Button btnSave, btnEditImg;
    ImageView ivBack;
    ImageView ivGallery;

    public final int GALLERY_REQ_CODE = 1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_product);
        setControl();
        setEvent();
    }

    public void setControl() {
        btnSave = findViewById(R.id.btnSave);
        ivBack = findViewById(R.id.ivBack);
        btnEditImg = findViewById(R.id.btnEditImg);
        ivGallery = findViewById(R.id.ivGallery);


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            if(requestCode == GALLERY_REQ_CODE) {
                ivGallery.setImageURI(data.getData());
            }
        }
    }

    public void setEvent() {
        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btnSave.setAllCaps(false);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainEditProduct.this, SuccessfullyEdit.class);
                startActivity(intent);
            }
        });
        btnEditImg.setAllCaps(false);
        btnEditImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iGallery = new Intent(Intent.ACTION_PICK);
                iGallery.setData(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(iGallery, GALLERY_REQ_CODE);
            }
        });



    }
}
