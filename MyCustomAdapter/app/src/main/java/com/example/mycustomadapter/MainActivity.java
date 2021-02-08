package com.example.mycustomadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private String[] countryNames;
    private int[] flags = {R.drawable.afghanistan, R.drawable.armenia, R.drawable.azerbaijan, R.drawable.bahrain,
            R.drawable.bangladesh, R.drawable.bhutan, R.drawable.china, R.drawable.india,
            R.drawable.japan, R.drawable.nepal, R.drawable.pakistan, R.drawable.srilanka};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countryNames = getResources().getStringArray(R.array.country_names);

        listView = findViewById(R.id.lstviewId);

        //custom listview toirir jonno akta class toiri kora holo
        CountryAdapter adapter = new CountryAdapter(this, countryNames, flags);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = countryNames[position];
                Toast.makeText(MainActivity.this, value, Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, CountryDescription.class);
                String index = String.valueOf(position);
                intent.putExtra("key", index);
                startActivity(intent);
            }
        });
    }
}