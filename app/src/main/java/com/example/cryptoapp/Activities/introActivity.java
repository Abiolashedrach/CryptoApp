package com.example.cryptoapp.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.cryptoapp.R;

public class introActivity extends AppCompatActivity {
private ImageView goBTN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        initView();
        setVariable();
    }

    private void setVariable() {
        goBTN.setOnClickListener(v -> startActivity(new Intent(introActivity.this, loginActivity.class)));
    }

    private void initView() {
        goBTN = findViewById(R.id.goBTN);
    }

}