package com.allandroidprojects.ecomsample.product;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.allandroidprojects.ecomsample.R;

public class ProductRating extends AppCompatActivity {

    Spinner ps1;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_rating);

        ps1 = (Spinner) findViewById(R.id.poc1);
        b = (Button) findViewById(R.id.ratebtn);

        ArrayAdapter<CharSequence> a1 = ArrayAdapter.createFromResource(this, R.array.oc1, android.R.layout.simple_spinner_dropdown_item);
        ps1.setAdapter(a1);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ProductRating.this, "Thankyou! Your Product Rating is successfully Submitted.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}