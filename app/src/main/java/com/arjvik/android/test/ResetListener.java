package com.arjvik.android.test;

import android.view.View;

public class ResetListener implements View.OnClickListener {
    @Override
    public void onClick(View view) {
        MainActivity.AScore = 0;
        MainActivity.BScore = 0;
        MainActivity.triggerScoreUpdate();
    }
}
