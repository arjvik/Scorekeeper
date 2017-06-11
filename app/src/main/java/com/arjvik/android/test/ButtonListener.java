package com.arjvik.android.test;

import android.view.View;
import android.widget.Button;

public class ButtonListener implements View.OnClickListener{

    private int scoreChange;
    private boolean isTeamA;
    public ButtonListener(int scoreChange,boolean isTeamA){
        this.scoreChange=scoreChange;
        this.isTeamA=isTeamA;
    }

    @Override
    public void onClick(View view) {
        if(isTeamA) {
            MainActivity.AScore+=scoreChange;
        }else{
            MainActivity.BScore+=scoreChange;
        }
        MainActivity.triggerScoreUpdate();
    }
}
