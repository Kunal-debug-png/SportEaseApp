package com.allandroidprojects.ecomsample.startup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.allandroidprojects.ecomsample.R;
import com.allandroidprojects.ecomsample.db.DBRegistration;

public class Registration extends AppCompatActivity {
    EditText firstname, lastname, username, password;
    Button register;
    DBRegistration DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        TextView login = (TextView) findViewById(R.id.txtlogintext);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Registration.this, MyAccount.class));
            }
        });

        username = (EditText) findViewById(R.id.txtUrname);
        password = (EditText) findViewById(R.id.txtPassword);
        firstname = (EditText) findViewById(R.id.txtFname);
        lastname = (EditText) findViewById(R.id.txtLname);
        register = (Button) findViewById(R.id.btnRegister);
        DB = new DBRegistration(this);
        register.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {
                String user = username.getText().toString();
                String pass = password.getText().toString();
                String fname = firstname.getText().toString();
                String lname = lastname.getText().toString();

                if(user.equals("")||pass.equals("")||fname.equals("")||lname.equals(""))
                    Toast.makeText(Registration.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
                else{
                    Boolean checkuser = DB.checkusername(user);
                    if(checkuser==false){
                        Boolean insert = DB.insertData(user, pass, fname, lname);
                        if(insert==true){
                            Toast.makeText(Registration.this, "Registered successfully", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                            startActivity(intent);
                        }else{
                            Toast.makeText(Registration.this, "Registration failed", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            }
        });
    }
}
