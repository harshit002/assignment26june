package com.example.harshit.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity","Hello World");
        Button b1=(Button)findViewById(R.id.button);
        EditText e1=findViewById(R.id.editText);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv=findViewById(R.id.tv1);
                tv.append("Hello world!!!!!!!!");

            }
        });

    }
}
