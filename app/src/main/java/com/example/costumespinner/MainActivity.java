package com.example.costumespinner;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    ArrayList<modelclass> arrayList;
    Costumeaddapter costumeaddapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner=findViewById(R.id.spinner);
        arrayList=new ArrayList<>();
        costumeaddapter=new Costumeaddapter(this,R.layout.activity_model,arrayList);
        modelclass modelclass1=new modelclass(R.drawable.baseline_add_reaction_24,"reaction");
        modelclass modelclass2=new modelclass(R.drawable.baseline_access_alarm_24,"alarm");
        modelclass modelclass3=new modelclass(R.drawable.baseline_add_location_24,"location");
        modelclass modelclass4=new modelclass(R.drawable.baseline_add_a_photo_24,"take photo");
        modelclass modelclass5=new modelclass(R.drawable.baseline_add_ic_call_24,"call");
        costumeaddapter.add(modelclass1);
        costumeaddapter.add(modelclass2);
        costumeaddapter.add(modelclass3);
        costumeaddapter.add(modelclass4);
        costumeaddapter.add(modelclass5);
        spinner.setAdapter(costumeaddapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                modelclass modelclass=costumeaddapter.getItem(position);
                Toast.makeText(getApplicationContext(), "name"+modelclass.getName(), Toast.LENGTH_SHORT).show();
                Log.d("khaled", "onItemSelected: "+modelclass.getName());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}