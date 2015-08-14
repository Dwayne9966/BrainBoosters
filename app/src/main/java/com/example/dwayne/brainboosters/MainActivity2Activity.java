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
import android.widget.Button;


public class MainActivity2Activity extends Activity {
    private MediaPlayer mp;
    SoundPool mySound;
    int ferId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);
        mySound = new SoundPool(10,AudioManager.STREAM_MUSIC,0);
        ferId = mySound.load(this,R.drawable.showmethree,1);
    }
    public void rested(View view) {
        Intent intent = new Intent(getApplicationContext(),smileface.class);
        startActivity(intent);
    }
    public void wrongchoice(View view) {
        Intent intent = new Intent(getApplicationContext(),sadface.class);
        startActivity(intent);
    }
    public void slimz(View view) {

    }
}



