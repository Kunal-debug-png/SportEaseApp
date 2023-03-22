package com.allandroidprojects.ecomsample.startup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.allandroidprojects.ecomsample.R;
import com.allandroidprojects.ecomsample.db.DBLogin;
import com.allandroidprojects.ecomsample.db.DBPayment;

public class MyOrder extends AppCompatActivity {
    EditText payment, upi, name, username, address;
    Button makepayment;
    DBPayment DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_order);

        Button orderBtn = (Button) findViewById(R.id.btnOrder);
        orderBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Toast.makeText(MyOrder.this, "Payment done Successfully!", Toast.LENGTH_SHORT).show();
            }

        });

        payment = (EditText) findViewById(R.id.OrderNumber);
        upi = (EditText) findViewById(R.id.ProductName);
        name = (EditText) findViewById(R.id.CompanyName);
        username = (EditText) findViewById(R.id.Quantity);
        address = (EditText) findViewById(R.id.address);
        makepayment = (Button) findViewById(R.id.btnOrder);
        DB = new DBPayment(this);

        makepayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pay = payment.getText().toString();
                String upi_id = upi.getText().toString();
                String custname = name.getText().toString();
                String user = username.getText().toString();
                String adres = address.getText().toString();
                if(pay.equals("")||upi_id.equals("")||custname.equals("")||user.equals("")||adres.equals(""))
                    Toast.makeText(MyOrder.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
                else{
                    Boolean checkuser = DB.checkusername(user);
                    if(checkuser==false){
                        Boolean insert = DB.insertData(pay, upi_id, custname, user, adres);
                        if(insert==true){
                            Toast.makeText(MyOrder.this, "Payment done Successfully!", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                            startActivity(intent);
                        }else{
                            Toast.makeText(MyOrder.this, "Payment Failed", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            }
        });

    }
}
