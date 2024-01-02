package com.example.cryptoapp.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.cryptoapp.R;

public class loginActivity extends AppCompatActivity {
private EditText userEDT, passEDT;
private Button loginBTN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
        setVariable();
    }
    private void initView(){
        userEDT = findViewById(R.id.editTextText);
        passEDT = findViewById(R.id.editTextText2);
        loginBTN = findViewById(R.id.loginBTN);

    }
    private void setVariable(){
        loginBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (userEDT.getText().toString().isEmpty() || passEDT.getText().toString().isEmpty()){
                    Toast.makeText(loginActivity.this, "PLEASE FILL OUT THE LOGIN FORM", Toast.LENGTH_SHORT).show();
                } else if (userEDT.getText().toString().equals("Ab") && passEDT.getText().toString().equals("1234")) {
                    startActivity(new Intent(loginActivity.this,MainActivity.class));
                }
            }
        });
    }
}