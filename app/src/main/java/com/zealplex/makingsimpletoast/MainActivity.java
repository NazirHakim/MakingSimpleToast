package com.zealplex.makingsimpletoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void showToast(View view) {

        Toast.makeText(MainActivity.this, "This is A toast and It is going to be shown",Toast.LENGTH_LONG).show();

    }
}

