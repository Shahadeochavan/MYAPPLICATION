package com.nextech.myschool.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.nextech.myschool.R;
import com.nextech.myschool.TabLayoutActivity;
import com.nextech.myschool.register.Register;

public class Login extends AppCompatActivity {
 @Override
        public void onCreate(Bundle savedInstanceState) {
               super.onCreate(savedInstanceState);
                // setting default screen to login.xml
           setContentView(R.layout.activity_login);

        TextView registerScreen = (TextView) findViewById(R.id.btnRegister);

                        // Listening to register new account link
        registerScreen.setOnClickListener(new View.OnClickListener() {

                                                public void onClick(View v) {
                                                    // Switching to Register screen
                                                        Intent intent = new Intent(getApplicationContext(), Register.class);
                                                startActivity(intent);
                                           }
                                   });
     TextView login=(TextView)findViewById(R.id.btnLogin);
     login.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent intent=new Intent(getApplicationContext(),TabLayoutActivity.class);
             startActivity(intent);
         }
     });
            }
    }
