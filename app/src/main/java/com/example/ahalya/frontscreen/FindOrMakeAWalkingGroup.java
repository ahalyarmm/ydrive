package com.example.ahalya.frontscreen;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
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

    public void OnListOfWalkingGroupsButtonClick(View v)
    {
        Intent intent = new Intent(FindOrMakeAWalkingGroup.this, ListOfWalkingGroups.class);
        startActivity(intent);
    }

    public void OnFindYourWayToSchoolButtonClick(View v)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr=-27.499769,152.966786"));
        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
        startActivity(intent);
    }
}