package com.example.waiijo.waiijocom;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * Created by mamay on 20/5/2560.
 */

public class patientActivity extends Activity {
    String ptID;
    EditText pID;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.patient_activity);
        pID = (EditText) findViewById(R.id.patientID);
    }
    public void patientLog(View view){
        ptID = pID.getText().toString();
        String method = "patientlogin";
        BackgroundTask backgroundTask = new BackgroundTask(this);
        backgroundTask.execute(method,ptID);
    }
}
