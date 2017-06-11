package com.arjvik.android.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static TextView mTeamAScore, mTeamBScore;
    public static Button mPlus3A, mPlus2A, mMinus1A,
            mPlus3B, mPlus2B, mMinus1B;
    public static int AScore=0, BScore=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTeamAScore = (TextView) findViewById(R.id.teamAScore);
        mTeamBScore = (TextView) findViewById(R.id.teamBScore);
        mPlus3A = (Button) findViewById(R.id.plus3A);
        mPlus2A = (Button) findViewById(R.id.plus2A);
        mMinus1A = (Button) findViewById(R.id.minus1A);
        mPlus3B = (Button) findViewById(R.id.plus3B);
        mPlus2B = (Button) findViewById(R.id.plus2B);
        mMinus1B = (Button) findViewById(R.id.minus1B);
        mPlus3A.setOnClickListener(new ButtonListener(3,true));
        mPlus2A.setOnClickListener(new ButtonListener(2,true));
        mMinus1A.setOnClickListener(new ButtonListener(-1,true));
        mPlus3B.setOnClickListener(new ButtonListener(3,false));
        mPlus2B.setOnClickListener(new ButtonListener(2,false));
        mMinus1B.setOnClickListener(new ButtonListener(-1,false));
    }
    public static void triggerScoreUpdate() {
        mTeamAScore.setText(Integer.toString(AScore));
        mTeamBScore.setText(Integer.toString(BScore));
    }
}