package com.example.counter;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Counter counter;
    private TextView counterTV;
    MediaPlayer player;
    public Integer theValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter = new Counter();
        counterTV = (TextView)findViewById(R.id.CountTextView);
        player = new MediaPlayer();
        theValue = counter.getValue();
        play();
    }
    public void increaseCounter(View view)
    {
        counter.incrementValue();
        String newValue = counter.getValue().toString();
        counterTV.setText(newValue);
    }
    public void play(){
        if(theValue == 1){
            player = MediaPlayer.create(this, R.raw.cymbalone);
        }


        player.start();
    }
}