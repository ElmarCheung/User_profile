package com.example.user_profile;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentDetails extends AppCompatActivity {

    TextView student_name;
    TextView student_age;
    TextView student_year_group;
    TextView parent_number;
    TextView emergency_number;

    LinearLayout disability_list;
    LinearLayout allergy_list;

    public ArrayList<String> disability_array = new ArrayList<String>(Arrays.asList("1","0","0","0","1","Poor eyesight"));
    public ArrayList<String> allergy_array = new ArrayList<String>(Arrays.asList("1","0","1","0","1","Apple"));

    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        String name = "Bobby";
        String age = "4";
        String year_group = "2";
        setContentView(R.layout.activity_student_details);

        student_name = findViewById(R.id.student_name);
        student_age = findViewById(R.id.student_age);
        student_year_group = findViewById(R.id.student_year_group);

        student_name.setText(name + "'s details");
        student_name.setTextSize(20);
        student_age.setText("Age: " + age);
        student_age.setTextSize(20);
        student_year_group.setText("Year group: " + year_group);
        student_year_group.setTextSize(20);

        parent_number = findViewById(R.id.parent_number);
        emergency_number = findViewById(R.id.emergency_number);

        disability_list = findViewById(R.id.disability_list);
        allergy_list = findViewById(R.id.allergy_list);

        TextView anxiety = new TextView(getApplicationContext());
        TextView autism = new TextView(getApplicationContext());
        TextView depression = new TextView(getApplicationContext());
        TextView hearing_loss = new TextView(getApplicationContext());
        TextView other_disability = new TextView(getApplicationContext());

        TextView pollen = new TextView(getApplicationContext());
        TextView milk = new TextView(getApplicationContext());
        TextView peanut = new TextView(getApplicationContext());
        TextView animal_fur = new TextView(getApplicationContext());
        TextView other_allergy = new TextView(getApplicationContext());

        if(disability_array.get(0) == "1"){
            anxiety.setText("Anxiety");
            anxiety.setTextSize(20);
            disability_list.addView(anxiety);
        }
        if(disability_array.get(1) == "1"){
            autism.setText("Autism");
            anxiety.setTextSize(20);
            disability_list.addView(autism);
        }
        if(disability_array.get(2) == "1"){
            depression.setText("Depression");
            anxiety.setTextSize(20);
            disability_list.addView(depression);
        }
        if(disability_array.get(3) == "1"){
            hearing_loss.setText("Hearing loss");
            anxiety.setTextSize(20);
            disability_list.addView(hearing_loss);
        }
        if(disability_array.get(4) == "1"){
            other_disability.setText(disability_array.get(5));
            other_disability.setTextSize(20);
            disability_list.addView(other_disability);
        }

        if(allergy_array.get(0) == "1"){
            pollen.setText("Pollen");
            pollen.setTextSize(20);
            allergy_list.addView(pollen);
        }
        if(allergy_array.get(1) == "1"){
            milk.setText("Milk");
            milk.setTextSize(20);
            allergy_list.addView(milk);
        }
        if(allergy_array.get(2) == "1"){
            peanut.setText("Peanut");
            peanut.setTextSize(20);
            allergy_list.addView(peanut);
        }
        if(allergy_array.get(3) == "1"){
            animal_fur.setText("Animal Fur");
            animal_fur.setTextSize(20);
            allergy_list.addView(animal_fur);
        }
        if(allergy_array.get(4) == "1"){
            other_allergy.setText(allergy_array.get(5));
            other_allergy.setTextSize(20);
            allergy_list.addView(other_allergy);
        }

    }
}
