package com.codeclan.wordcount;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import static com.codeclan.wordcount.WordCount.wordCount;

public class EnterTextActivity extends AppCompatActivity {

    EditText textInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_text);

        textInput = (EditText)findViewById(R.id.text);
    }

    public void onCountButtonClicked(View button){
        Log.d(getClass().toString(), "Button was clicked!");

        String text = textInput.getText().toString();
        Log.d(getClass().toString(), "Text input was" + text);

        String count = "" + wordCount(text);
        Log.d("Word count is", count);


        Intent intent = new Intent(this, DisplayWordCountActivity.class);
        intent.putExtra("count", count);


        startActivity(intent);
    }
}
