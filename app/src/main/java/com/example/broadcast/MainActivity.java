package com.example.broadcast;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;

public class MainActivity extends BroadcastReceiver {

    TextView textView;
    MainActivity(TextView textView){
        this.textView=textView;

    }
    @SuppressLint("SetTextI18n")
    @Override
    public void onReceive(Context context, Intent intent) {
        int percentage= intent.getIntExtra("level",0);
        if(percentage!=0){
            textView.setText(percentage + "%");
        }
    }
}


