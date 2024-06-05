package com.example.myprofile_05ddt21f2068;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    private TextView textViewProfile;
    private Button buttonUpdateProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        textViewProfile = findViewById(R.id.textViewProfile);
        buttonUpdateProfile = findViewById(R.id.buttonUpdateProfile);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String name = extras.getString("name");
            textViewProfile.setText("Welcome, " + name);
        }

        buttonUpdateProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ProfileActivity.this, "Your profile has successfully updated", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
