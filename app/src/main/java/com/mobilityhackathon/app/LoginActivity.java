package com.mobilityhackathon.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Click(View view) {
        //Intent i = new Intent(this, RegistrationDetails.class);
        //startActivity(i);
        //Intent i = new Intent(this, MainScreen.class);
        //startActivity(i);
        //Intent i = new Intent(this, VotingPage.class);
        //startActivity(i);
        //Intent i = new Intent(this, Leaderboard.class);
        Intent i = new Intent(this, RegistrationDetails.class);
        startActivity(i);
//        Intent i = new Intent(this, VotingPage.class);
//        startActivity(i);
    }
}
