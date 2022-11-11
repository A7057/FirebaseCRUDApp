package com.example.shoesapp.views;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.widget.AppCompatButton;
import androidx.cardview.widget.CardView;

import com.example.shoesapp.R;
import com.example.shoesapp.utilis.model.ShoeItems;

public class DetailActivity extends Activity {
    private androidx.cardview.widget.CardView CardView;
    private AppCompatButton AddCartButton;
    private TextView shoesName, shoesDescription, priceTV;
    private ImageView img1;
    private ImageView tvView;
    private ShoeItems shoe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        shoe = getIntent().getParcelableExtra("shoeItem");
        initializedVariables();
        if (shoe != null) {
            setDataToWidgets();

        }

    }

    private void setDataToWidgets() {
        shoesName.setText(shoe.getShoesName());
        shoesDescription.setText(shoe.getShoesBrand());
        priceTV.setText(String.valueOf(shoe.getShoesPrice()));
        img1.setImageResource(shoe.getShoesImage());


    }

    private void initializedVariables() {
        CardView = findViewById(R.id.cardview);
        shoesName = findViewById(R.id.shoes_name);
        shoesDescription = findViewById(R.id.shoes_discription);
        img1 = findViewById(R.id.items_img);
        tvView = findViewById(R.id.additems);
        priceTV = findViewById(R.id.price);
        AddCartButton=findViewById(R.id.addCart);

    }
}
