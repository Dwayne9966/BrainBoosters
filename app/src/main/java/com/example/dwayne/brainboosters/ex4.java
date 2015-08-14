package com.example.dwayne.brainboosters;

import android.app.Activity;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class ex4 extends Activity {
    SoundPool mySound;
    int redaudioId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex4);
        mySound = new SoundPool(10, AudioManager.STREAM_MUSIC,0);
        redaudioId = mySound.load(this,R.drawable.show_me_five,1);
    }

    public void fivers(View view) {mySound.play(redaudioId,1 ,1, 1, 0, 1);
    }
}
