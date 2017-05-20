package com.example.waiijo.waiijocom;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.app.Activity;
import android.widget.EditText;

public class MainActivity extends Activity {
    String username;
    String password;
    EditText txtUsername,txtPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtUsername = (EditText) findViewById(R.id.Username);
        txtPassword = (EditText) findViewById(R.id.Password);
    }
    public void userReg(View view){
        startActivity(new Intent(this,MyActivity.class));
    }
    public void userLogin(View view){
        username = txtUsername.getText().toString();
        password = txtPassword.getText().toString();
        String method = "login";
        BackgroundTask backgroundTask = new BackgroundTask(this);
        backgroundTask.execute(method,username,password);
    }
}
