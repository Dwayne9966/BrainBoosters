package com.example.dwayne.brainboosters;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity3Activity extends Activity {

    private SoundPool mySound;
    int redaudioId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity3);
        mySound = new SoundPool(10,AudioManager.STREAM_MUSIC, 0);
        redaudioId = mySound.load(this,R.drawable.showmeseven,1);
    }
    public void results(View view) {
        Intent intent =  new Intent(getApplicationContext(), smile2.class);
        startActivity(intent);
    }
    public void wrongchoice(View view) {
        Intent intent = new Intent(getApplicationContext(), sad2.class);
        startActivity(intent);
    }
    public void volts1(View view) {
        mySound.play(redaudioId,1 ,1, 1, 0, 1);
    }
}