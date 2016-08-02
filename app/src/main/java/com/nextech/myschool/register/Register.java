package com.nextech.myschool.register;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.nextech.myschool.TabLayoutActivity;
import com.nextech.myschool.R;
/**
 * Created by welcome on 7/11/2016.
 */
public class Register extends Activity {
    Button button;

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

}
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

