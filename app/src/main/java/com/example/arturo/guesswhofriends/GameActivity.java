package com.example.arturo.guesswhofriends;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.facebook.AccessTokenTracker;

public class GameActivity extends AppCompatActivity {

    private AccessTokenTracker tokenTracker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        MainActivity main = new MainActivity();
        tokenTracker = main.getTokenTracker();

        

    }
}
