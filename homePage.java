package com.example.waiijo.waiijocom;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
/**
 * Created by mamay on 20/5/2560.
 */

public class homePage extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hompage);
    }
    public void ctLog(View view){
        startActivity(new Intent(this,MainActivity.class));
    }
    public void ptLog(View view){
        startActivity(new Intent(this,patientActivity.class));
    }
}
