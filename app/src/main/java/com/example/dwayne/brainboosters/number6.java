package com.example.dwayne.brainboosters;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

public class number6 extends Activity {
    private MediaPlayer mp;
    SoundPool mySound;
    int redaudioId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number6);
        mySound = new SoundPool(10,AudioManager.STREAM_MUSIC,0);
        redaudioId = mySound.load(this,R.drawable.six,1);
    }
    public void wordsix(View view) {
        Intent intent = new Intent(getApplicationContext(), ex3.class);
        startActivity(intent);
    }
    public void sound(View view) {
        mySound.play(redaudioId,1,1,1,0,1);
    }
}