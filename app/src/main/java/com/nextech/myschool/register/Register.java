package com.nextech.myschool.register;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View.OnClickListener;
import com.nextech.myschool.R;
import com.nextech.myschool.TabLayoutActivity;

/**
 * Created by welcome on 7/11/2016.
 */
public class Register extends Activity {
    Button button;
   /* Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        addListenerOnButton();
    }

    public void addListenerOnButton() {

        final Context context = this;

        button = (Button) findViewById(R.id.btnRegister);

        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context,TabLayoutActivity.class);
                startActivity(intent);

            }

        });

    }

}*/
    /*    edtUsername = (EditText) findViewById(R.id.registerName);
        edtPassword = (EditText) findViewById(R.id.registerPassword);
        getEdtEmail = (EditText) findViewById(R.id.registerEmail);
        edtMobilenumber = (EditText) findViewById(R.id.mobile);
        edtAddess = (EditText) findViewById(R.id.address);
        TextView loginScreen = (TextView) findViewById(R.id.link_to_login);
        btnReg = (Button) findViewById(R.id.btnRegister);
        // Listening to Login Screen link
        loginScreen.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                finish();
            }
        });*/
        /*btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                if (edtUsername.getText().toString().length() == 0) {
                    edtUsername.setError("Please enter your username");
                    edtUsername.requestFocus();
                }
                if (edtPassword.getText().toString().length() == 0) {
                    edtPassword.setError("Please enter your password");
                    edtPassword.requestFocus();
                }
                if (edtMobilenumber.getText().toString().length() == 0) {
                    edtMobilenumber.setError("Please enter your mobile number");
                    edtMobilenumber.requestFocus();
                }
                if (getEdtEmail.getText().toString().length() == 0) {
                    getEdtEmail.setError("Please enter your email");
                    getEdtEmail.requestFocus();
                }
                if (edtAddess.getText().toString().length() == 0) {
                    edtAddess.setError("Please enter your address");
                    edtAddess.requestFocus();
                }
            }
        });*/

    Button btnReg;
    EditText edtUsername, edtPassword, edtmobile, edtemail, edtaddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        //initialization of all editText
        edtUsername = (EditText) findViewById(R.id.edtUsername);
        edtPassword = (EditText) findViewById(R.id.edtpass);
        edtmobile = (EditText) findViewById(R.id.edtMobile);
        edtemail = (EditText) findViewById(R.id.emai);
        edtaddress = (EditText) findViewById(R.id.edtAddress);
        //Initialization of Register Button
        btnReg = (Button) findViewById(R.id.btnRegister);

        //Registration button functionality
        btnReg.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if (edtUsername.getText().toString().length() == 0) {
                    edtUsername.setError("Username name not entered");
                    edtUsername.requestFocus();
                }
                if (edtPassword.getText().toString().length() == 0) {
                    edtPassword.setError("Password  not entered");
                    edtPassword.requestFocus();
                }

                if (edtmobile.getText().toString().length() == 0) {
                    edtmobile.setError("Mobile number is Required");
                    edtmobile.requestFocus();
                }
                if (edtemail.getText().toString().length() == 0) {
                    edtemail.setError("Please  entered email");
                    edtemail.requestFocus();
                }
                if (edtaddress.getText().toString().length() == 0) {
                    edtaddress.setError("Please entered addres");
                    edtaddress.requestFocus();
                } else {
                    Toast.makeText(getApplicationContext(), "Success", Toast.LENGTH_LONG).show();
                }
            }

        });
    }
        public void addListenerOnButton() {

            final Context context = this;

            button = (Button) findViewById(R.id.btnRegister);

            button.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    Intent intent = new Intent(context,TabLayoutActivity.class);
                    startActivity(intent);

                }

            });

        }
    }


