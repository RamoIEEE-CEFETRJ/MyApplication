package com.example.ramocefetieee.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class DisplayTextActivity extends AppCompatActivity {

    private TextView viewText;
    private Button button_close;
    public Bundle receive_text;
    public String textInput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_text);

        button_close = (Button)findViewById(R.id.button_close);
        viewText = (TextView)findViewById(R.id.viewText);

        Intent int_displaytext = getIntent();
        receive_text = int_displaytext.getBundleExtra("sent_text");
        textInput = receive_text.getString("text_to_display");
        viewText.setText(textInput);
    }
}
