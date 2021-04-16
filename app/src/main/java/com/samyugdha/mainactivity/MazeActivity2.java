package com.samyugdha.mainactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MazeActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maze2);
        Toast.makeText(MazeActivity2.this,"Click NEXT after completing the game !!!",Toast.LENGTH_LONG).show();
    }
    public void next(View view)
    {
        Intent next1=new Intent(MazeActivity2.this,Class2q2.class);
        startActivity(next1);
    }
}