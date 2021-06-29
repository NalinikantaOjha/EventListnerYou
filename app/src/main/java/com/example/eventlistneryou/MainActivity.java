package com.example.eventlistneryou;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.jetbrains.annotations.NotNull;

public class MainActivity extends AppCompatActivity {
    private TextView mTvSaveInstance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTvSaveInstance=findViewById(R.id.tvSaveInstance);
        mTvSaveInstance.setText("Hey Masai");

        if(savedInstanceState!=null){
            String data = savedInstanceState.getString("Key");
            mTvSaveInstance.setText(data);
    }
}
    @Override
    protected void onSaveInstanceState(@NonNull @NotNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("Key","Screen Rotation.");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String data = savedInstanceState.getString("Key");
    }
}