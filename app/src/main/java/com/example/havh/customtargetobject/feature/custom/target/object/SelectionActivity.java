package com.example.havh.customtargetobject.feature.custom.target.object;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.havh.customtargetobject.R;
import com.example.havh.customtargetobject.feature.HomeActivity;

public class SelectionActivity extends AppCompatActivity{

    private Button btnStatus;
    private Button btnSelfie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
        btnStatus = findViewById(R.id.btn_status);
        btnSelfie = findViewById(R.id.btn_selfie);

        btnSelfie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SelectionActivity.this,FaceActivity.class));

            }
        });

        btnStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SelectionActivity.this,HomeActivity.class));
            }
        });
    }
}
