package com.antoniocappiello.dateutilsexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.antoniocappiello.dateutils.DateUtils;

import java.util.Date;

public class ExampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);

        TextView examplesView = (TextView) findViewById(R.id.examples);
        String time = DateUtils.getTime(new Date(System.currentTimeMillis()));

        examplesView.setText(" + DateUtils.getTime(DATE) -> " + time);
        examplesView.append("\n + more utils will follow with...");
        examplesView.append("\n + ...other blog posts.");

    }
}
