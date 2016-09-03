package com.example.ahalya.frontscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ListOfWalkingGroups extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_walking_groups);
    }
    public void OnButtonRegisterClick(View v)
    {
        Intent intent = new Intent(ListOfWalkingGroups.this,Register.class);
        startActivity(intent);
    }
}
