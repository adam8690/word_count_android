package com.codeclan.wordcount;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayWordCountActivity extends AppCompatActivity {

    TextView countText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_word_count);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String count = extras.getString("count");

        countText = (TextView)findViewById(R.id.wordcount_text);
        countText.setText("Word count is: " + count);


    }
}
