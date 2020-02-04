package com.example.funquotes;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.fun_quote_lib.FunQuotes;

public class MainActivity extends AppCompatActivity {

    private FunQuotes funQuotes = new FunQuotes();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
