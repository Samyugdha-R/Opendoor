package com.samyugdha.mainactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MazeActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maze4);
        Toast.makeText(MazeActivity4.this,"Click NEXT after completing the game !!!",Toast.LENGTH_LONG).show();
    }
    public void next(View view)
    {
        Intent next1=new Intent(MazeActivity4.this,Class4Q2.class);
        startActivity(next1);
    }
}