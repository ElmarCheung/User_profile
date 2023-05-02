package com.example.user_profile;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.DrawableRes;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.user_profile.databinding.ActivityUserProfileBinding;

import java.util.ArrayList;
import java.util.Arrays;

public class UserProfile extends AppCompatActivity {

    private ActivityUserProfileBinding binding;
    EditText user_name;
    EditText user_email;
    EditText user_phone_no;
    EditText children_name;
    EditText children_age;
    EditText children_year_group;
    EditText contact_number;
    Button edit_button;
    LinearLayout disability_list;
    LinearLayout expand_children_disability_info;
    LinearLayout allergy_list;
    LinearLayout expand_children_allergy_info;

    ImageView expand_disability;
    ImageView expand_allergy;
    int edit_flag = 0;
    int disability_fold_flag = 0;
    int allergy_fold_flag = 0;
    public ArrayList<String> disability_array = new ArrayList<String>(Arrays.asList("1","0","0","0","1","Poor eyesight"));
    public ArrayList<String> allergy_array = new ArrayList<String>(Arrays.asList("1","0","1","0","1","Apple"));
    String name = "user name";
    String email = "user email";
    String user_phone = "user phone";
    String child_name = "bobby";
    String age = "4";
    String year = "2";
    String em_contact = "emergency contact";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityUserProfileBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        user_name = findViewById(R.id.user_name);
        user_name.setText(name);
        user_name.setEnabled(false);
        user_email = findViewById(R.id.user_email);
        user_email.setText(email);
        user_email.setEnabled(false);
        user_phone_no = findViewById(R.id.user_phone_no);
        user_phone_no.setEnabled(false);
        user_phone_no.setText(user_phone);
        children_name = findViewById(R.id.children_name);
        children_name.setEnabled(false);
        children_name.setText(child_name);
        children_age = findViewById(R.id.children_age);
        children_age.setEnabled(false);
        children_age.setText(age);
        contact_number = findViewById(R.id.contact_number);
        contact_number.setEnabled(false);
        contact_number.setText(em_contact);
        children_year_group = findViewById(R.id.children_year_group);
        children_year_group.setEnabled(false);
        children_year_group.setText(year);

        edit_button = findViewById(R.id.edit_button);

        disability_list = findViewById(R.id.disability_list);
        allergy_list = findViewById(R.id.allergy_list);

        expand_disability = findViewById(R.id.expand_disability);
        expand_allergy = findViewById(R.id.expand_allergy);

        CheckBox anxiety_cb = new CheckBox(UserProfile.this);
        anxiety_cb.setTextColor(Color.GRAY);
        CheckBox autism_cb = new CheckBox(UserProfile.this);
        autism_cb.setTextColor(Color.GRAY);
        CheckBox depression_cb = new CheckBox(UserProfile.this);
        depression_cb.setTextColor(Color.GRAY);
        CheckBox hearing_loss_cb = new CheckBox(UserProfile.this);
        hearing_loss_cb.setTextColor(Color.GRAY);
        CheckBox other_disability_cb = new CheckBox(UserProfile.this);
        other_disability_cb.setTextColor(Color.GRAY);
        EditText other_disability = new EditText(UserProfile.this);

        anxiety_cb.setEnabled(false);
        autism_cb.setEnabled(false);
        depression_cb.setEnabled(false);
        hearing_loss_cb.setEnabled(false);
        other_disability_cb.setEnabled(false);
        other_disability.setEnabled(false);


        CheckBox pollen_cb = new CheckBox(UserProfile.this);
        pollen_cb.setTextColor(Color.GRAY);
        CheckBox milk_cb = new CheckBox(UserProfile.this);
        milk_cb.setTextColor(Color.GRAY);
        CheckBox peanut_cb = new CheckBox(UserProfile.this);
        peanut_cb.setTextColor(Color.GRAY);
        CheckBox animal_fur_cb = new CheckBox(UserProfile.this);
        animal_fur_cb.setTextColor(Color.GRAY);
        CheckBox other_allergy_cb = new CheckBox(UserProfile.this);
        other_allergy_cb.setTextColor(Color.GRAY);
        EditText other_allergy = new EditText(UserProfile.this);

        pollen_cb.setEnabled(false);
        milk_cb.setEnabled(false);
        peanut_cb.setEnabled(false);
        animal_fur_cb.setEnabled(false);
        other_allergy_cb.setEnabled(false);
        other_allergy.setEnabled(false);

        expand_children_disability_info = findViewById(R.id.expand_children_disability_info);
        expand_children_disability_info.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                if(disability_fold_flag == 0) {
                    expand_disability.setBackgroundResource(R.drawable.fold_arrow);
                    disability_fold_flag = 1;
                    anxiety_cb.setText("Anxiety");
                    anxiety_cb.setTextSize(18);
                    anxiety_cb.setTextColor(Color.BLACK);
                    disability_list.addView(anxiety_cb);
                    if (disability_array.get(0) == "1"){
                        anxiety_cb.setChecked(true);
                        anxiety_cb.setTextColor(Color.BLACK);
                    }
                    autism_cb.setText("Autism");
                    autism_cb.setTextSize(18);
                    disability_list.addView(autism_cb);
                    if (disability_array.get(1) == "1"){
                        autism_cb.setTextColor(Color.BLACK);
                        autism_cb.setChecked(true);
                    }
                    depression_cb.setText("Depression");
                    depression_cb.setTextSize(18);
                    disability_list.addView(depression_cb);
                    if (disability_array.get(2) == "1"){
                        depression_cb.setTextColor(Color.BLACK);
                        depression_cb.setChecked(true);
                    }
                    hearing_loss_cb.setText("Hearing Loss");
                    hearing_loss_cb.setTextSize(18);
                    disability_list.addView(hearing_loss_cb);
                    if (disability_array.get(3) == "1"){
                        hearing_loss_cb.setTextColor(Color.BLACK);
                        hearing_loss_cb.setChecked(true);
                    }
                    other_disability_cb.setText("Other disability");
                    other_disability_cb.setTextSize(18);
                    disability_list.addView(other_disability_cb);
                    if (disability_array.get(4) == "1") {
                        other_disability_cb.setChecked(true);
                        other_disability_cb.setTextColor(Color.BLACK);
                        disability_list.addView(other_disability);
                        other_disability.setText(disability_array.get(5));
                        other_disability.setTextColor(Color.BLACK);
                    }
                }
                else if(disability_fold_flag == 1){
                    expand_disability.setBackgroundResource(R.drawable.drop_down_arrow);
                    disability_fold_flag = 0;
                    disability_list.removeAllViews();
                }
            }
        });

        expand_children_allergy_info = findViewById(R.id.expand_children_allergy_info);
        expand_children_allergy_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(allergy_fold_flag == 0) {
                    expand_allergy.setBackgroundResource(R.drawable.fold_arrow);
                    allergy_fold_flag = 1;
                    pollen_cb.setText("Pollen");
                    pollen_cb.setTextSize(18);
                    pollen_cb.setTextColor(Color.BLACK);
                    allergy_list.addView(pollen_cb);
                    if (allergy_array.get(0) == "1"){
                        pollen_cb.setChecked(true);
                        pollen_cb.setTextColor(Color.BLACK);
                    }
                    milk_cb.setText("Milk");
                    milk_cb.setTextSize(18);
                    allergy_list.addView(milk_cb);
                    if (allergy_array.get(1) == "1"){
                        milk_cb.setTextColor(Color.BLACK);
                        milk_cb.setChecked(true);
                    }
                    peanut_cb.setText("Peanut");
                    peanut_cb.setTextSize(18);
                    allergy_list.addView(peanut_cb);
                    if (allergy_array.get(2) == "1"){
                        peanut_cb.setTextColor(Color.BLACK);
                        peanut_cb.setChecked(true);
                    }
                    animal_fur_cb.setText("Animal Fur");
                    animal_fur_cb.setTextSize(18);
                    allergy_list.addView(animal_fur_cb);
                    if (allergy_array.get(3) == "1"){
                        animal_fur_cb.setTextColor(Color.BLACK);
                        animal_fur_cb.setChecked(true);
                    }
                    other_allergy_cb.setText("Other allergy");
                    other_allergy_cb.setTextSize(18);
                    allergy_list.addView(other_allergy_cb);
                    if (allergy_array.get(4) == "1") {
                        other_allergy_cb.setChecked(true);
                        other_allergy_cb.setTextColor(Color.BLACK);
                        allergy_list.addView(other_allergy);
                        other_allergy.setText(allergy_array.get(5));
                        other_allergy.setTextColor(Color.BLACK);
                    }
                }
                else if(allergy_fold_flag == 1){
                    expand_allergy.setBackgroundResource(R.drawable.drop_down_arrow);
                    allergy_fold_flag = 0;
                    allergy_list.removeAllViews();
                }
            }
        });

        edit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edit_flag == 0){
                    edit_flag = 1;
                    user_name.setEnabled(true);
                    user_email.setEnabled(true);
                    user_phone_no.setEnabled(true);
                    children_age.setEnabled(true);
                    children_name.setEnabled(true);
                    children_year_group.setEnabled(true);
                    contact_number.setEnabled(true);
                    edit_button.setText("Finish");
                    anxiety_cb.setEnabled(true);
                    autism_cb.setEnabled(true);
                    depression_cb.setEnabled(true);
                    hearing_loss_cb.setEnabled(true);
                    other_disability_cb.setEnabled(true);
                    other_disability.setEnabled(true);
                    pollen_cb.setEnabled(true);
                    milk_cb.setEnabled(true);
                    peanut_cb.setEnabled(true);
                    animal_fur_cb.setEnabled(true);
                    other_allergy_cb.setEnabled(true);
                    other_allergy.setEnabled(true);

                }

                else if(edit_flag == 1){
                    edit_flag = 0;
                    user_name.setEnabled(false);
                    name = user_name.getText().toString();
                    user_email.setEnabled(false);
                    email = user_email.getText().toString();
                    user_phone_no.setEnabled(false);
                    user_phone = user_phone_no.getText().toString();
                    children_age.setEnabled(false);
                    age = children_age.getText().toString();
                    children_name.setEnabled(false);
                    child_name = children_name.getText().toString();
                    children_year_group.setEnabled(false);
                    year = children_year_group.getText().toString();
                    contact_number.setEnabled(false);
                    em_contact = contact_number.getText().toString();
                    edit_button.setText("Edit");
                    if(anxiety_cb.isChecked()){
                        disability_array.set(0,"1");
                        anxiety_cb.setTextColor(Color.BLACK);
                    } else{
                        disability_array.set(0,"0");
                        anxiety_cb.setTextColor(Color.GRAY);}
                    anxiety_cb.setEnabled(false);
                    if(autism_cb.isChecked()){
                        disability_array.set(1,"1");
                        autism_cb.setTextColor(Color.BLACK);
                    } else{
                        disability_array.set(1,"0");
                        autism_cb.setTextColor(Color.GRAY);}
                    autism_cb.setEnabled(false);
                    if(depression_cb.isChecked()){
                        disability_array.set(2,"1");
                        depression_cb.setTextColor(Color.BLACK);
                    } else{
                        disability_array.set(2,"0");
                        depression_cb.setTextColor(Color.GRAY);}
                    depression_cb.setEnabled(false);
                    if(hearing_loss_cb.isChecked()){
                        disability_array.set(3,"1");
                        hearing_loss_cb.setTextColor(Color.BLACK);
                    } else{
                        disability_array.set(3,"0");
                        hearing_loss_cb.setTextColor(Color.GRAY);}
                    hearing_loss_cb.setEnabled(false);
                    if(other_disability_cb.isChecked()){
                        disability_array.set(4,"1");
                        other_disability_cb.setTextColor(Color.BLACK);
                        disability_array.set(5,other_disability.getText().toString());
                    } else{
                        disability_array.set(4,"0");
                        disability_list.removeView(other_disability);
                        other_disability_cb.setTextColor(Color.GRAY);}
                    other_disability_cb.setEnabled(false);
                    other_disability.setEnabled(false);

                    if(pollen_cb.isChecked()){
                        allergy_array.set(0,"1");
                       pollen_cb.setTextColor(Color.BLACK);
                    } else{
                        allergy_array.set(0,"0");
                        pollen_cb.setTextColor(Color.GRAY);}
                    pollen_cb.setEnabled(false);
                    if(milk_cb.isChecked()){
                        allergy_array.set(1,"1");
                        milk_cb.setTextColor(Color.BLACK);
                    } else{
                        allergy_array.set(1,"0");
                        milk_cb.setTextColor(Color.GRAY);}
                    milk_cb.setEnabled(false);
                    if(peanut_cb.isChecked()){
                        allergy_array.set(2,"1");
                        peanut_cb.setTextColor(Color.BLACK);
                    } else{
                        allergy_array.set(2,"0");
                        peanut_cb.setTextColor(Color.GRAY);}
                    peanut_cb.setEnabled(false);
                    if(animal_fur_cb.isChecked()){
                        allergy_array.set(3,"1");
                        animal_fur_cb.setTextColor(Color.BLACK);
                    } else{
                        allergy_array.set(3,"0");
                        animal_fur_cb.setTextColor(Color.GRAY);}
                    animal_fur_cb.setEnabled(false);
                    if(other_allergy_cb.isChecked()){
                        allergy_array.set(4,"1");
                        other_allergy_cb.setTextColor(Color.BLACK);
                        allergy_array.set(5,other_allergy.getText().toString());
                    } else{
                        allergy_array.set(4,"0");
                        allergy_list.removeView(other_allergy);
                        other_allergy_cb.setTextColor(Color.GRAY);}
                    other_allergy_cb.setEnabled(false);
                    other_allergy.setEnabled(false);
                }
            }
        });

    }


}