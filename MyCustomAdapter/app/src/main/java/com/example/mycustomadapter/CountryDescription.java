package com.example.mycustomadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class CountryDescription extends AppCompatActivity {

    private TextView textView;
    String[] countryDescription;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_description);

        textView = findViewById(R.id.txtId1);

        countryDescription = getResources().getStringArray(R.array.country_description);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            String position = bundle.getString("key");
            int pos = Integer.parseInt(position);
            textView.setText(countryDescription[pos]);
        }
    }
}