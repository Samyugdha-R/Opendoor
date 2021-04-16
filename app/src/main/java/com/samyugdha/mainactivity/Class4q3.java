package com.samyugdha.mainactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Class4q3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class4q3);
    }
    public void c4q3opt3(View view) {
        Intent opt3 = new Intent(Class4q3.this,CountdownActivity.class);
        startActivity(opt3);
    }

    public void c4q3opt2(View view) {
        Toast.makeText(Class4q3.this, "Retry", Toast.LENGTH_LONG).show();
    }

    public void c4q3opt1(View view) {
        Toast.makeText(Class4q3.this, "Retry", Toast.LENGTH_LONG).show();
    }

    public void c4q3opt4(View view)
    {
        Toast.makeText(Class4q3.this,"Retry",Toast.LENGTH_LONG).show();
    }
}