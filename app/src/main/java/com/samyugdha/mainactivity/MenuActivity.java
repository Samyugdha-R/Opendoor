package com.samyugdha.mainactivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
public class MenuActivity extends AppCompatActivity {
    public Button Maze;
    //public Button Anagram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Maze = (Button) findViewById(R.id.Class1);
        //Anagram = (Button) findViewById(R.id.Anagram);
        Maze.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                Intent maze1 = new Intent(MenuActivity.this, Class1Q1.class);
                startActivity(maze1);

            }

        }
        );
    }
    public void class2(View view)
    {
        Intent class2 = new Intent(MenuActivity.this, Class2q1.class);
        startActivity(class2);
    }
    public void class3(View view)
    {
        Intent class3= new Intent(MenuActivity.this,Class3q1.class);
                startActivity(class3);
    }
    public void class4(View view)
    {
        Intent class4= new Intent(MenuActivity.this,Class4Q1.class);
        startActivity(class4);
    }
    public void class5(View view)
    {
        Intent class5= new Intent(MenuActivity.this,MazeActivity.class);
        startActivity(class5);
    }
    public void exit(View view)
    {
        finish();
        System.exit(0);
    }
}