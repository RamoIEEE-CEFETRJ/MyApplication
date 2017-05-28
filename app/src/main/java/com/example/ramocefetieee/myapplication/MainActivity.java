package com.example.ramocefetieee.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private Button button_confirm;
    private EditText text_input;
    public Bundle input_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_confirm = (Button)findViewById(R.id.button_confirm);
        text_input = (EditText)findViewById(R.id.text_input);

        button_confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int_displaytext = new Intent(MainActivity.this, DisplayTextActivity.class);
                input_text.putString("text_to_display", text_input.getText().toString());
                int_displaytext.putExtra("send_text", input_text);
                startActivity(int_displaytext);
            }
        });
    }
}
