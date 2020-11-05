package com.example.tutone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick (View view) {
        TextView textView = findViewById(R.id.text);
        EditText editText_name = findViewById(R.id.editText_name);

        TextView tv = (TextView) findViewById(R.id.text);
        tv.setText("Hello, " + editText_name.getText().toString());

    }
}
