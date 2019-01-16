package com.example.a404exercise;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.javajokes.JokeSmith;
import com.example.jokeandroidlib.JokeActivity;

import static com.example.jokeandroidlib.JokeActivity.JOKE_EXTRA;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getAJokeClick(View view) {
        JokeSmith smith = new JokeSmith();
        String joke = smith.getJoke();

        Intent intent = new Intent(this, JokeActivity.class);
        intent.putExtra(JOKE_EXTRA, joke);
        startActivity(intent);
    }
}
