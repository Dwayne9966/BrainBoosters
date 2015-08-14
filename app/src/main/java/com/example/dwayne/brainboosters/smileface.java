package com.example.dwayne.brainboosters;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class smileface extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smileface);
    }

    public void forward(View view) {
        Intent intent = new Intent(getApplicationContext(), number6.class);
        startActivity(intent);
    }
}
