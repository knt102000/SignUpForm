package com.example.chiutsui.signupform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    private static final String TAG = "HomeActivity";
    public static final String EXTRA = "INFO";

    TextView welcomeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        welcomeText = (TextView) findViewById(R.id.welcomeUser);

        User user = (User) getIntent().getSerializableExtra(EXTRA);

        welcomeText.setText(String.format(getResources().getString(R.string.welcome),user.getUsername()));
    }
}
