package com.example.lishuangling.designpatterndemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.lishuangling.designpatterndemo.observer_pattern.TestEntry;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TestEntry.testObserverPattern();
    }
}
