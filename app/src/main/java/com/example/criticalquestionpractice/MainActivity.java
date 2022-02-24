package com.example.criticalquestionpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.criticalquestionpractice.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    String flavor = "";
    static final String intentKey1 = "ABCD";
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.mainRadioGroupFlav.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(binding.mainRadioBChoc.isChecked())
                {
                    Toast.makeText(MainActivity.this,"You Selected Chocolate as your Flavor",Toast.LENGTH_SHORT).show();
                    flavor = "Chocolate";
                }
                else if(binding.mainRadioBVan.isChecked())
                {
                    Toast.makeText(MainActivity.this,"You Selected Vanilla as your Flavor",Toast.LENGTH_SHORT).show();
                    flavor = "Vanilla";
                }
            }
        });

        binding.mainButtonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentToLoadActvity = new Intent(MainActivity.this,MainActivity2.class);
                intentToLoadActvity.putExtra(intentKey1,flavor);
                startActivity(intentToLoadActvity);
            }
        });
    }
}