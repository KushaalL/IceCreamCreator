package com.example.criticalquestionpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.example.criticalquestionpractice.databinding.ActivityMain2Binding;
import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    private ActivityMain2Binding binding;
    String container = "";
    final static String intentKey1 = "Flavor";
    final static String intentKey2 = "Container";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        ArrayList<String> list = new ArrayList<>();
        list.add("Bowl");
        list.add("Cone");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,list);
        binding.main2Spinner.setAdapter(arrayAdapter);
        binding.main2Spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                container = list.get(position);

                System.out.println(container);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    binding.main2ButtonNext.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intentToLoadActvity2 = new Intent(MainActivity2.this,MainActivity3.class);
            intentToLoadActvity2.putExtra(intentKey1,getIntent().getStringExtra(MainActivity.intentKey1));
            intentToLoadActvity2.putExtra(intentKey2,container);
            startActivity(intentToLoadActvity2);
        }
    });
    }
}