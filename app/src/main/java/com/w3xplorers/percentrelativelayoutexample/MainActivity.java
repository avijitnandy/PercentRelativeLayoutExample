package com.w3xplorers.percentrelativelayoutexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button login;
    EditText userName, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // init the View's
        userName = (EditText) findViewById(R.id.userName);
        password = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.login);
// perform setOnClickListener Event on Login Button
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
// validate user name and password
                if (userName.getText().toString().trim().length() > 0 && password.getText().toString().trim().length() > 0) {
// display a thanks you message with user name
                    Toast.makeText(getApplicationContext(), "Thank You " + userName.getText().toString(), Toast.LENGTH_SHORT).show();
                } else {
// display an error message that fill user name and password
                    Toast.makeText(getApplicationContext(), "Please Enter Your User Name And Password.!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}