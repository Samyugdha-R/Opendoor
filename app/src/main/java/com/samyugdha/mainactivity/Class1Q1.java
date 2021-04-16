package com.samyugdha.mainactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Class1Q1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class1_q1);
    }
    public  void opt1(View view)
    {
        Intent op1=new Intent(Class1Q1.this,MazeSplashActivity.class);
        startActivity(op1);
    }
    public void opt2(View view)
    {
        Toast.makeText(Class1Q1.this,"Retry",Toast.LENGTH_LONG).show();
    }
    public void opt3(View view)
    {
        Toast.makeText(Class1Q1.this,"Retry",Toast.LENGTH_LONG).show();
    }
    public void opt4(View view)
    {
        Toast.makeText(Class1Q1.this,"Retry",Toast.LENGTH_LONG).show();
    }
}