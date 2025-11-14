package com.example.mydemoapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mydemoapp.Database.GachaDatabase;
import com.example.mydemoapp.Database.GachaRepository;
import com.example.mydemoapp.Database.entities.User;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "GACHA_TEST";

    public static Intent mainActivityFactory(Context applicationContext) {
        try {
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GachaRepository repo = GachaRepository.getRepository(getApplication());

        // Sanity TEST
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    List<User> users = repo.getUserDAO().getAllUsers();

                    for (User u : users) {
                        Log.i(TAG,
                                "User: " + u.getUsername() +
                                        " | Admin? " + u.isAdmin());
                    }
                } catch (Exception e) {
                    Log.wtf(TAG, "Error reading users", e);
                }
            }
        });
        binding.loginAdminButtonMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(UserActivity.userActivityFactory(getApplicationContext()));
            }
        });
    }
    static Intent mainActivityFactory(Context context){
        Intent intent = new Intent(context, MainActivity.class);
        return intent;
    }
}