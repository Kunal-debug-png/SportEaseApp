package com.allandroidprojects.ecomsample.options;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.allandroidprojects.ecomsample.R;
import com.allandroidprojects.ecomsample.startup.Home;

public class Notifications extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);
           Button b;
           Intent i1;
           b = (Button) findViewById(R.id.btnnoti);
           b.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   startActivity(new Intent(Notifications.this, Home.class));
               }
           });

    }
}