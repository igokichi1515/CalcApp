package com.example.oubeika.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText edit1;
    EditText edit2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1 = (EditText) findViewById(R.id.edit1);
        edit2 = (EditText) findViewById(R.id.edit2);

        Button plus = (Button) findViewById(R.id.plus);
        Button minus = (Button) findViewById(R.id.minus);
        Button kakeru = (Button) findViewById(R.id.kakeru);
        Button waru = (Button) findViewById(R.id.waru);

        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        kakeru.setOnClickListener(this);
        waru.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        double result = 0;
        double num1 = Double.parseDouble(edit1.getText().toString());
        double num2 = Double.parseDouble(edit2.getText().toString());

        if(view != null){
            if(view.getId() == R.id.plus){
                result = num1 + num2;
            }else if(view.getId() == R.id.minus){
                result = num1 - num2;
            }else if(view.getId() == R.id.kakeru){
                result = num1 * num2;
            }else if(view.getId() == R.id.waru){
                result = num1 / num2;
            }
        }

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("RESULT", String.valueOf(result));
        startActivity(intent);
    }
}
