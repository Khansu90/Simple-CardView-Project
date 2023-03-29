package com.example.thehungrydeveloper;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
public class DessertsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desserts);

        ListView dessertsList = findViewById(R.id.list_view_desserts);

        Dish [] dishes = {

                new Dish("Cocoa and blackcurrant cake", "Moist cake made with cocoa and fresh blackcurrant", 499),
                new Dish("Mulberry and cardamom crumble", "Fresh mulberry and green cardamom topped with butter crumble", 699),
                new Dish("Lemon scones with chilli jam", "Vegan scones served with chilli jam and fresh coconut cream", 599),
                new Dish("Potato and banana vegan crepes", "Crispy vegan crepes filled with fresh potato and banana", 599),
                new Dish("Cinnamon and treacle buns", "Crumbly buns made with cinnamon and dark treacle", 499),



        };
        ArrayAdapter <Dish> dessertsAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,dishes);
        dessertsList.setAdapter(dessertsAdapter);





    }
}
