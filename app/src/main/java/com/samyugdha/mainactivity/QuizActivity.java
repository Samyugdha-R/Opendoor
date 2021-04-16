package com.samyugdha.mainactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class QuizActivity extends AppCompatActivity {
    public static String expected;
    public EditText answer;
    public static TextView question;
    public static TextView sumanswer;
    public Button submitbutton;
    public Button maze;
    static int correctanswer=0;
    static int wronganswer=0;
    int a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        answer = (EditText) findViewById(R.id.answer);
        question = (TextView) findViewById(R.id.question);
        sumanswer = (TextView) findViewById(R.id.sumanswer);
        submitbutton = (Button) findViewById(R.id.submitbutton);
        setQuestion();
        submitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer.getText().toString().equals(expected)) {
                    Toast.makeText(QuizActivity.this, "Correct!", Toast.LENGTH_SHORT).show();
                    correctanswer++;
                    answer.setText("");
                    if (correctanswer > 0) {
                        Intent maze1 = new Intent(QuizActivity.this, AnagramMain.class);
                        startActivity(maze1);
                    }
                } else {
                    Toast.makeText(QuizActivity.this, "Wrong!", Toast.LENGTH_SHORT).show();
                    wronganswer++;
                    answer.setText("");
                    setQuestion();
                }
            }
        });

    }
    public static void setQuestion(){
        Random rand =new Random();
        int lhs= ThreadLocalRandom.current().nextInt(-10,10);
        int rhs=ThreadLocalRandom.current().nextInt(-10,10);
        int randomquestion=rand.nextInt(2);
        if(randomquestion==1)
        {
            question.setText("What is " + lhs + "+" + rhs + "?");
            expected="" +(lhs+rhs);
        }
        else if(randomquestion==2)
        {
            question.setText("What is" + lhs + "-" + rhs + "?");
            expected="" +(lhs-rhs);

        }
        else
        {
            question.setText("What is" + lhs + "*" + rhs + "?");
            expected="" +(lhs*rhs);
        }
        sumanswer.setText("You have got"+"  "+correctanswer+"  " +"CORRECT and "+"  "+wronganswer +"  "+"WRONG");

    }

}