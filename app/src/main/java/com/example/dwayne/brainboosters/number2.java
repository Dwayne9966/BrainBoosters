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

public class number2 extends Activity {
    SoundPool mySound;
    int twoId;
    private MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number2);
        mySound = new SoundPool(10,AudioManager.STREAM_MUSIC,0);
        twoId = mySound.load(this,R.drawable.two,1);
    }
    public void toword2(View view) {
        Intent intent = new Intent(getApplicationContext(),ex4.class);
        startActivity(intent);
    }
    public void sounded(View view) {
        mySound.play(twoId,1 ,1, 1, 0, 1);
    }
}