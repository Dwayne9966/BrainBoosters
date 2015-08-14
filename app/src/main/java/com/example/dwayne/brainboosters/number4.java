package com.example.dwayne.brainboosters;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class number4 extends Activity {
    private MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number4);
        setVolumeControlStream(AudioManager.STREAM_MUSIC);
        mp = MediaPlayer.create(this, R.drawable.four);
        mp.start();
    }
    public void toword4(View view) {
        Intent intent = new Intent(getApplicationContext(),word4.class);
        startActivity(intent);
    }
}
