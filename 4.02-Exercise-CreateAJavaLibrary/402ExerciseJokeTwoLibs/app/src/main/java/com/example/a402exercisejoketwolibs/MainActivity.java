package com.example.a402exercisejoketwolibs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.javajokes.JokeSmith;
import com.example.jokewizard.JokeWizard;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // This is from the manually added module
        JokeSmith jokeSmith = new JokeSmith();

        TextView textView = findViewById(R.id.helloText);
        textView.setText(jokeSmith.getJoke());

        // This is from the "wizardly" added module
        JokeWizard jokeWizard = new JokeWizard();

        TextView textViewForJokeWizard = findViewById(R.id.jokeFromJokeWizard);
        textViewForJokeWizard.setText(jokeWizard.getJoke());
    }
}
