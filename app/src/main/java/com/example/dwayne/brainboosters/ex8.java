package com.example.dwayne.brainboosters;

import android.app.Activity;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class ex8 extends Activity {
SoundPool mySound;
    int exsound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex8);
        mySound = new SoundPool(10, AudioManager.STREAM_MUSIC,0);
        exsound = mySound.load(this,R.drawable.showmethree,1);
    }
}
