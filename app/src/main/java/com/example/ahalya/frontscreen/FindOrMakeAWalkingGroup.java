package com.example.ahalya.frontscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


import java.util.List;
import java.util.jar.Attributes;

public class FindOrMakeAWalkingGroup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_or_make_awalking_group);
    }

    public void OnButton8Click(View v)
    {
        Intent intent = new Intent(FindOrMakeAWalkingGroup.this, ListOfWalkingGroups.class);
        startActivity(intent);
    }
}