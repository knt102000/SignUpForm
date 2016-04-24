package com.example.chiutsui.signupform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private static final String TAG = "LoginActivity";

    Button mSubmitBtn;
    EditText mUsernameField;
    EditText mPasswordField;
    EditText mPasswordConfirmField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mSubmitBtn = (Button) findViewById(R.id.submit_button);
        mUsernameField = (EditText) findViewById(R.id.username_field);
        mPasswordField = (EditText) findViewById(R.id.password_field);
        mPasswordConfirmField = (EditText) findViewById(R.id.confirm_field);

        mSubmitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = mUsernameField.getText().toString();
                String password = mPasswordField.getText().toString();
                String confirmPassword = mPasswordConfirmField.getText().toString();

                if (confirmPassword.equals(password)) {
                    User newUser = new User(username, password);

                    Intent i = new Intent(LoginActivity.this, HomeActivity.class);
                    i.putExtra(HomeActivity.EXTRA, newUser);
                    startActivity(i);
                }
            }
        });
    }
}
