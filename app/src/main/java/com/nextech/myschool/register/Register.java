package com.nextech.myschool.register;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.nextech.myschool.splash.R;

/**
 * Created by welcome on 7/11/2016.
 */
public class Register extends AppCompatActivity {
    Button btnReg;
    EditText edtUsername,edtPassword, edtMobilenumber, getEdtEmail, edtAddess;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set View to register.xml
        setContentView(R.layout.activity_register);
        edtUsername=(EditText)findViewById(R.id.Username);
        edtPassword=(EditText)findViewById(R.id.password) ;
        edtMobilenumber=(EditText)findViewById(R.id.mobile_number);
        TextView loginScreen = (TextView) findViewById(R.id.link_to_login);
      btnReg=(Button)findViewById(R.id.btnRegister);
        // Listening to Login Screen link
        loginScreen.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                finish();
            }
        });
        btnReg.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View arg0){
                if(edtUsername.getText().toString().length()==0){
                    edtUsername.setError("Please enter your username");
                    edtUsername.requestFocus();
                }
                if(edtPassword.getText().toString().length()==0){
                    edtPassword.setError("Please enter your password");
                    edtPassword.requestFocus();
                }
            }

        });
    }
}