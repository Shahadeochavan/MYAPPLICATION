package com.nextech.myschool.login;
import android.content.res.Configuration;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.nextech.myschool.R;
import com.nextech.myschool.TabLayoutActivity;
import com.nextech.myschool.register.Register;

import java.util.Locale;

public class Login extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        // setting default screen to login.xml
        setContentView( R.layout.activity_login );
              TextView registerScreen = (TextView) findViewById( R.id.btnRegister );

        // Listening to register new account link
        registerScreen.setOnClickListener( new View.OnClickListener() {

            public void onClick(View v) {
                // Switching to Register screen
                Intent intent = new Intent( getApplicationContext(), Register.class );
                startActivity( intent );
            }
        } );
        TextView login = (TextView) findViewById( R.id.btnLogin );
        login.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( getApplicationContext(), TabLayoutActivity.class );
                startActivity( intent );
            }
        } );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate( R.menu.menu_main, menu );
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                String languageToLoad = "en"; // your language
                Locale locale = new Locale(languageToLoad);
                Locale.setDefault(locale);
                Configuration config = new Configuration();
                config.locale = locale;
                getBaseContext().getResources().updateConfiguration(config,
                        getBaseContext().getResources().getDisplayMetrics());
                this.setContentView(R.layout.activity_login);
                return true;
            case R.id.actins_hn:
                languageToLoad = "hi"; // your language
                locale = new Locale(languageToLoad);
                Locale.setDefault(locale);
                config = new Configuration();
                config.locale = locale;
                getBaseContext().getResources().updateConfiguration(config,
                        getBaseContext().getResources().getDisplayMetrics());
                this.setContentView(R.layout.activity_login);
                return true;

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected( item );

        }
    }
}

/*

   @Override
     public boolean onCreateOptionsMenu(Menu menu) {
         MenuInflater inflater = getMenuInflater();
         inflater.inflate(R.menu.menu_main, menu);
         return super.onCreateOptionsMenu(menu);
     }
     @Override
     public boolean onOptionsItemSelected(MenuItem item) {
         switch (item.getItemId()) {
             case R.id.eng:
                 String languageToLoad = "en"; // your language
                 Locale locale = new Locale(languageToLoad);
                 Locale.setDefault(locale);
                 Configuration config = new Configuration();
                 config.locale = locale;
                 getBaseContext().getResources().updateConfiguration(config,
                         getBaseContext().getResources().getDisplayMetrics());
                 this.setContentView(R.layout.activity_login);
                 break;
             case R.id.hn:
                 languageToLoad = "hi"; // your language
                 locale = new Locale(languageToLoad);
                 Locale.setDefault(locale);
                 config = new Configuration();
                 config.locale = locale;
                 getBaseContext().getResources().updateConfiguration(config,
                         getBaseContext().getResources().getDisplayMetrics());
                 this.setContentView(R.layout.activity_login);
                 break;
             case R.id.fr:
                 languageToLoad = "fr"; // your language
                 locale = new Locale(languageToLoad);
                 Locale.setDefault(locale);
                 config = new Configuration();
                 config.locale = locale;
                 getBaseContext().getResources().updateConfiguration(config,
                         getBaseContext().getResources().getDisplayMetrics());
                 this.setContentView(R.layout.activity_login);
                 break;
             case R.id.de:
                 languageToLoad = "de"; // your language
                 locale = new Locale(languageToLoad);
                 Locale.setDefault(locale);
                 config = new Configuration();
                 config.locale = locale;
                 getBaseContext().getResources().updateConfiguration(config,
                         getBaseContext().getResources().getDisplayMetrics());
                 this.setContentView(R.layout.activity_login);
                 break;
             default:
                 break;
         }
         return super.onOptionsItemSelected(item);
     }
 }


*/
