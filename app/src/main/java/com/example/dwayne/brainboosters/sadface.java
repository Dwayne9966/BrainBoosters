package com.example.dwayne.brainboosters;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class sadface extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sadface);
        Toast.makeText(getApplicationContext(),"Click back to Return",Toast.LENGTH_SHORT).show();
    }
    public void takeback(View view) {
        Intent intent =new Intent(getApplicationContext(),MainActivity2Activity.class);
        startActivity(intent);
    }
}