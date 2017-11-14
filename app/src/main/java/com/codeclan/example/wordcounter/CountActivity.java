package com.codeclan.example.wordcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count);

        Intent intent  = getIntent();

        Bundle extras = intent.getExtras();

        String Answer = extras.getString("Words");

        TextView answerTextView = findViewById(R.id.AnswerPage);
        answerTextView.setText(Answer);
    }
}
