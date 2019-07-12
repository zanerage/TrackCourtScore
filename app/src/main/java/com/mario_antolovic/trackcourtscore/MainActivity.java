package com.mario_antolovic.trackcourtscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    int totalscoreHome = 0;
    int totalscoreAway = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void threeptsH (View v) {
        totalscoreHome = totalscoreHome + 3;
       scoreHomeTeam(totalscoreHome);
    }
    public void twoptsH (View v) {
        totalscoreHome = totalscoreHome + 2;
        scoreHomeTeam(totalscoreHome);
    }
    public void freethrowH (View v) {
        totalscoreHome = totalscoreHome + 1;
        scoreHomeTeam(totalscoreHome);
    }
    public void threeptsA (View v) {
        totalscoreAway = totalscoreAway + 3;
        scoreAwayTeam(totalscoreAway);
    }
    public void twoptsA (View v) {
        totalscoreAway= totalscoreAway +2;
        scoreAwayTeam(totalscoreAway);
    }
    public void freethrowA (View v) {
        totalscoreAway= totalscoreAway+1;
        scoreAwayTeam(totalscoreAway);
    }


    public void scoreHomeTeam (int score) {
        TextView scoreView = (TextView) findViewById(R.id.total_Score_home);
        scoreView.setText(String.valueOf(score));
    }
    public void scoreAwayTeam (int score) {
        TextView scoreView = (TextView) findViewById(R.id.total_Away_score);
        scoreView.setText(String.valueOf(score));
    }

  public void rst_btn (View v) {
        totalscoreHome = 0;
        totalscoreAway = 0;
        scoreAwayTeam(totalscoreAway);
        scoreHomeTeam(totalscoreHome);

  }
}
