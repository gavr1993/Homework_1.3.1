package com.example.homework_131;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class VitStatActivity extends AppCompatActivity {
    private EditText weightEdtx;
    private EditText stepsEdtx;
    private Button saveBtn;
    private static final String TAG = "ПОЛЬЗОВАТЕЛЕМ НАЖАТА ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vit_stat);
        init();
        saveListen();
    }

    private void init() {
        weightEdtx = findViewById(R. id. weightEdtx);
        stepsEdtx = findViewById(R. id. stepsEdtx);
        saveBtn = findViewById(R. id. saveBtn);
    }

    private void saveListen() {
        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "кнопка сохранения");
                String weight = weightEdtx.getText().toString();
                String steps = stepsEdtx.getText().toString();
                VitStats vitStats = new VitStats(weight, steps);

                try {
                    double weightInt = Double.parseDouble(weight);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    Toast.makeText(VitStatActivity.this, R.string.numExcMess, Toast.LENGTH_SHORT).show();
                }

                try {
                    int stepsInt = Integer.parseInt(steps);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    Toast.makeText(VitStatActivity.this, R.string.numExcMess, Toast.LENGTH_SHORT).show();
                }

                Toast.makeText(VitStatActivity.this, R.string.saveMess, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
