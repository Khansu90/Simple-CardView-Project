package com.example.thehungrydeveloper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CardView cardStarters;
    CardView cardMains;
    CardView cardDesserts;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardStarters= findViewById(R.id.card_view_starters);
        cardStarters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntentActivity = new Intent (MainActivity.this,StartersActivity.class);
                startActivity(myIntentActivity);
            }
        });

        cardMains = findViewById(R.id.card_view_mains);
        cardMains.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntenActivity = new Intent (MainActivity.this,MainCourseActivity.class);
                startActivity(myIntenActivity);
            }
        });

        cardDesserts = findViewById(R.id.card_view_desserts);
        cardDesserts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntentActivity = new Intent (MainActivity.this,DessertsActivity.class);
                startActivity(myIntentActivity);
            }
        });

        TextView mailText = findViewById(R.id.text_view_mail_address);
        mailText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myMailActivity = new Intent (Intent.ACTION_SENDTO);
                myMailActivity.setData(Uri.parse("mailto:"));
                startActivity(myMailActivity);
            }
        });























    }
}