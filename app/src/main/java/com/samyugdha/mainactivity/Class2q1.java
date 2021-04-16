package com.samyugdha.mainactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Class2q1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class2q1);
    }
    public void c2q1opt1(View view) {
        Intent opt1 = new Intent(Class2q1.this, MazeActivity2.class);
        startActivity(opt1);
    }

    public void c2q1opt2(View view) {
        Toast.makeText(Class2q1.this, "Retry", Toast.LENGTH_LONG).show();
    }

    public void c2q1opt3(View view) {
        Toast.makeText(Class2q1.this, "Retry", Toast.LENGTH_LONG).show();
    }

    public void c2q1opt4(View view)
    {
        Toast.makeText(Class2q1.this,"Retry",Toast.LENGTH_LONG).show();
    }
}