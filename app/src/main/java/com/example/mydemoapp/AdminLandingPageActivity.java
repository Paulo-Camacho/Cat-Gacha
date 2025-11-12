package com.example.mydemoapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class AdminLandingPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_admin_landing_page);
    }

    static Intent AdminLandingPageActivityIntentFactory(Context context) {
        Intent intent = new Intent(context, AdminLandingPageActivity.class);
        return intent;
    }

}