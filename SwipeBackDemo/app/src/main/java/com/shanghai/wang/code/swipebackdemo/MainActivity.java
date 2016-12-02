package com.shanghai.wang.code.swipebackdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonA;
    private Button buttonB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonA=(Button)findViewById(R.id.buttonA);
        buttonB=(Button)findViewById(R.id.buttonB);


        buttonA.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonA:

                startActivity(new Intent(MainActivity.this,SwipeBackDemoActivity.class));

                break;
            case R.id.buttonB:
                break;
        }
    }
}
