package com.example.dwayne.brainboosters;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class sad2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sad2);
    }

    public void verkeerd(View view) {
        Intent intent = new Intent(getApplicationContext(), MainActivity3Activity.class);
        startActivity(intent);
    }
}