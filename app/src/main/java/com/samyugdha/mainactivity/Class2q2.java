package com.samyugdha.mainactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Class2q2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class2q2);
    }
    public void c2q2opt2(View view) {
        Intent opt2 = new Intent(Class2q2.this, AnagramMain2.class);
        startActivity(opt2);
    }

    public void c2q2opt1(View view) {
        Toast.makeText(Class2q2.this, "Retry", Toast.LENGTH_LONG).show();
    }

    public void c2q2opt3(View view) {
        Toast.makeText(Class2q2.this, "Retry", Toast.LENGTH_LONG).show();
    }

    public void c2q3opt4(View view)
    {
        Toast.makeText(Class2q2.this,"Retry",Toast.LENGTH_LONG).show();
    }
}