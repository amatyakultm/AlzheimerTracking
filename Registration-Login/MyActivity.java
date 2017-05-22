package com.example.waiijo.waiijocom;

/**
 * Created by mamay on 19/5/2560.
 */

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.app.Activity;

public class MyActivity extends Activity {
    String username;
    String password;
    String fName;
    String lName;
    String email;
    String phoneNum;

    EditText txtUsername,txtPassword,txtfName,txtlName,txtphoneNum,txtEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_my);
        txtUsername = (EditText) findViewById(R.id.Username);
        txtPassword = (EditText) findViewById(R.id.Password);
        txtfName = (EditText) findViewById(R.id.fName);
        txtlName = (EditText) findViewById(R.id.lName);
        txtEmail = (EditText) findViewById(R.id.email);
        txtphoneNum = (EditText) findViewById(R.id.phoneNum);
    }
    public void userReg(View view){
        username = txtUsername.getText().toString();
        password = txtPassword.getText().toString();
        fName = txtfName.getText().toString();
        lName = txtlName.getText().toString();
        email = txtEmail.getText().toString();
        phoneNum = txtphoneNum.getText().toString();
        String method = "register";
        BackgroundTask backgroundTask = new BackgroundTask(this);
        backgroundTask.execute(method,username,password,fName,lName,phoneNum,email);
        finish();
    }
}

