package com.example.ahalya.frontscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity
{

    EditText nameText;
    EditText emailText;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gettoschool);

        nameText =  (EditText) findViewById(R.id.editText);
        emailText = (EditText) findViewById(R.id.editText2);
    }

    public void onClick(View v)
    {


        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("message/rfc822");
        i.putExtra(Intent.EXTRA_EMAIL, new String[]{"maitha7@gmail.com"});
        i.putExtra(Intent.EXTRA_SUBJECT, "Y Drive");
        i.putExtra(Intent.EXTRA_TEXT, nameText.getText().toString() + " wants to create a walking group. Their email address is " + emailText.getText().toString());

        try
        {
            startActivity(Intent.createChooser(i, "Send mail..."));
        }
        catch (android.content.ActivityNotFoundException ex)
        {
            Toast.makeText(Register.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();

        }
    }
}
