package com.project.anubhav.testappfordatacollection;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class firstActivity extends AppCompatActivity {

    Button mPedButton,mCarButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        mPedButton = (Button)findViewById(R.id.PedButton);
        mCarButton = (Button)findViewById(R.id.CarButton);

        mPedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pedIntent = new Intent(v.getContext(),pedRecordingActivity.class);
                startActivity(pedIntent);
            }
        });

        mCarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent carIntent = new Intent(v.getContext(),carRecordingActivity.class);
                startActivity(carIntent);
            }
        });
    }

}
