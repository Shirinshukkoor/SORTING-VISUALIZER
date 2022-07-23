package com.example.sortee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class second extends AppCompatActivity {

    private Button b;
    private Button q;
    private Button m;
    private Button i;
    private Button s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        b=findViewById(R.id.btn1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(second.this,third.class);
                startActivity(intent);
            }
        });

        q=findViewById(R.id.btn2);
        q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(second.this,third.class);
                startActivity(intent);
            }
        });

        i=findViewById(R.id.btn5);
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(second.this,third.class);
                startActivity(intent);
            }
        });

        m=findViewById(R.id.btn4);
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(second.this,third.class);
                startActivity(intent);
            }
        });

        s=findViewById(R.id.btn3);
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(second.this,third.class);
                startActivity(intent);
            }
        });
    }
}