package com.afshan.android.droidcafe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public abstract class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    RadioButton mRadioBUtton1;
    RadioButton mRadioBUtton2;
    RadioButton mRadioBUtton3;

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String spinnerlabel = adapterView.getItemAtPosition(i).toString();
        Toast.makeText(MainActivity.this, spinnerlabel, Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner = (Spinner) findViewById(R.id.Spinner);
        spinner.setOnItemSelectedListener(this);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.SpinArray, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        if(spinner != null)
        {
            spinner.setAdapter(adapter);
        }
        mRadioBUtton1 = (RadioButton) findViewById(R.id.radioButton3);
        mRadioBUtton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mRadioBUtton1.isChecked())
                {
                    Toast.makeText(MainActivity.this, "You have Selected Pick Up", Toast.LENGTH_LONG).show();
                }

            }
        });
        mRadioBUtton2 = (RadioButton) findViewById(R.id.radioButton2);
        mRadioBUtton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mRadioBUtton2.isChecked()) {
                    Toast.makeText(MainActivity.this, "You have Selected Next Day Ground Service", Toast.LENGTH_LONG).show();

                }
            }
        });
        mRadioBUtton3 = (RadioButton) findViewById(R.id.radioButton);
        mRadioBUtton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mRadioBUtton3.isChecked())
                Toast.makeText(MainActivity.this, "You have Selected Same Day Messenger Service", Toast.LENGTH_LONG).show();
            }
        });


    }
}
