package com.example.homework_131;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class PressureActivity extends AppCompatActivity {
    private EditText upperEdtx;
    private EditText lowerEdtx;
    private EditText pulseEdtx;
    private CheckBox tahCheckBox;
    private EditText dateEdtx;
    private EditText timeEdtx;
    private Button saveBtn;
    private static final String TAG = "ПОЛЬЗОВАТЕЛЕМ НАЖАТА ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pressure);
        init();
        btnOnclick();
    }

    private void init() {
        upperEdtx = findViewById(R. id. upperEdtx);
        lowerEdtx = findViewById(R. id. lowerEdtx);
        pulseEdtx = findViewById(R. id. pulseEdtx);
        tahCheckBox = findViewById(R. id. tahCheckBox);
        dateEdtx = findViewById(R. id. dateEdtx);
        saveBtn = findViewById(R. id. saveBtn);
        timeEdtx = findViewById(R. id. timeEdtx);
    }

    private void btnOnclick() {
        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "кнопка сохранения");
                String upper = upperEdtx.getText().toString();
                String lower = lowerEdtx.getText().toString();
                String pulse = pulseEdtx.getText().toString();
                Boolean tah = tahCheckBox.isChecked();
                String date = dateEdtx.getText().toString();
                String time = timeEdtx.getText().toString();

                try {
                    int upperInt = Integer.parseInt(upper);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    Toast.makeText(PressureActivity.this, R.string.numExcMess, Toast.LENGTH_SHORT).show();
                }

                try {
                    int lowInt = Integer.parseInt(lower);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    Toast.makeText(PressureActivity.this, R.string.numExcMess, Toast.LENGTH_SHORT).show();
                }

                try {
                    int pulseInt = Integer.parseInt(lower);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    Toast.makeText(PressureActivity.this, R.string.numExcMess, Toast.LENGTH_SHORT).show();
                }

                Toast.makeText(PressureActivity.this, R.string.saveMess, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
