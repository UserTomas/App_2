package com.example.urban.app_2;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void selectButtonClicked(View view){
        RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup1);
        int id = rg.getCheckedRadioButtonId();
        RadioButton rb = (RadioButton) findViewById(id);
        String text = (String) rb.getText();
        Toast.makeText(getApplicationContext(),text, Toast.LENGTH_SHORT).show();
    }
}
