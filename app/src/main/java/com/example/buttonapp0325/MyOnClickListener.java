package com.example.buttonapp0325;

import android.view.View;

public class MyOnClickListener implements View.OnClickListener {
    MainActivity mainActivity;
    public MyOnClickListener(MainActivity mainActivity) {
       this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View v) {
        mainActivity.mTextView1.setText("You clicked 황성택의 button!");
    }
}
