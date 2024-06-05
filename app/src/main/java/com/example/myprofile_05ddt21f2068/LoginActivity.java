package com.example.myprofile_05ddt21f2068;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private static final String HARDCODED_USERNAME = "Yong Hen Jun";
    private static final String HARDCODED_NRIC = "030407130307";

    private EditText editTextName;
    private EditText editTextNRIC;
    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextName = findViewById(R.id.Name);
        editTextNRIC = findViewById(R.id.nric);
        buttonLogin = findViewById(R.id.Login);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String enteredUsername = editTextName.getText().toString();
                String enteredNRIC = editTextNRIC.getText().toString();

                if (enteredUsername.equals(HARDCODED_USERNAME) && enteredNRIC.equals(HARDCODED_NRIC)) {
                    Intent intent = new Intent(LoginActivity.this, ProfileActivity.class);
                    intent.putExtra("name", enteredUsername);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(LoginActivity.this, "Invalid username or NRIC", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
