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
import android.widget.Toast;

public class numbers1 extends Activity {
    private MediaPlayer mp;
    private SoundPool mySound;
    int redaudioId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers1);
        mySound = new SoundPool(10,AudioManager.STREAM_MUSIC,0);
        redaudioId = mySound.load(this,R.drawable.one,1);
        Toast.makeText(getApplicationContext(), "Click here", Toast.LENGTH_LONG).show();
    }
    public void toword1(View v) {
        Intent intent = new Intent(getApplicationContext(),MainActivity2Activity.class);
        startActivity(intent);
    }
    public void fede(View view) {
        mySound.play(redaudioId,1 ,1, 1, 0, 1);
    }
}
