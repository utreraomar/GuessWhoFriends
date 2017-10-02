package com.example.arturo.guesswhofriends;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.facebook.AccessToken;
import com.facebook.AccessTokenTracker;

public class MainActivity extends AppCompatActivity {

    private Button btnPlay, btnAchievments, btnConfig;
    private AccessTokenTracker tokenTracker;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPlay = (Button) findViewById(R.id.btnPlay);
        btnAchievments = (Button) findViewById(R.id.btnAchievments);
        btnConfig = (Button) findViewById(R.id.btnConfig);

        updateToken(AccessToken.getCurrentAccessToken());

        tokenTracker = new AccessTokenTracker() {
            @Override
            protected void onCurrentAccessTokenChanged(AccessToken oldAccessToken, AccessToken currentAccessToken) {
                updateToken(currentAccessToken);
            }
        };


    }

    public void updateToken(AccessToken token){
        if(token == null){
            Intent LoginActivity = new Intent(getApplicationContext(), LoginActivity.class);
            startActivity(LoginActivity);
        }
    }
}
