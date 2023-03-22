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
import com.allandroidprojects.ecomsample.db.DBLogin;

public class MyAccount extends AppCompatActivity {
    EditText username, password;
    Button login;
    DBLogin DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_account);

        TextView register = (TextView) findViewById(R.id.registerclick);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MyAccount.this, Registration.class));
            }
        });

        username = (EditText) findViewById(R.id.txtUrname);
        password = (EditText) findViewById(R.id.txtPassword);
        login = (Button) findViewById(R.id.btnlogin);
        DB = new DBLogin(this);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String pass = password.getText().toString();

                if(user.equals("")||pass.equals(""))
                    Toast.makeText(MyAccount.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
                else{
                    Boolean checkuser = DB.checkusername(user);
                    if(checkuser==false){
                        Boolean insert = DB.insertData(user, pass);
                        if(insert==true){
                            Toast.makeText(MyAccount.this, "Login successfully", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                            startActivity(intent);
                        }else{
                            Toast.makeText(MyAccount.this, "Login failed", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            }
        });
    }
}
