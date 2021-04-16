package com.samyugdha.mainactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MazeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MazeActivity.this,"Click NEXT after completing the game !!!",Toast.LENGTH_LONG).show();
    }

    public void next(View view)
    {
        Intent next1=new Intent(MazeActivity.this,Class1Q2.class);
        startActivity(next1);
    }
}