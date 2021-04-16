package com.samyugdha.mainactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Class1Q3 extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class1_q3);
        button=findViewById(R.id.c1q3op1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),Congratulation.class);
                startActivity(i);
            }
        });
    }

//    public void c1q3opt1(View view) {
//        Intent opt1 = new Intent(Class1Q3.this, Congratulation.class);
//        startActivity(opt1);
//    }

    public void c1q3opt2(View view) {
        Toast.makeText(Class1Q3.this, "Retry", Toast.LENGTH_LONG).show();
    }

    public void c1q3opt3(View view) {
        Toast.makeText(Class1Q3.this, "Retry", Toast.LENGTH_LONG).show();
    }

    public void opt4(View view)
    {
        Toast.makeText(Class1Q3.this,"Retry",Toast.LENGTH_LONG).show();
    }
}