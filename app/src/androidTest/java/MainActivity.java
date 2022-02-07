package com.example.premex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;

import android.widget.Toast;


import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    FirebaseAuth mAuth;
    EditText editTextEmailAddress, editTextPassword;
    Button passwordRecovery;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAuth = FirebaseAuth.getInstance();

        editTextEmailAddress = findViewById(R.id.editTextEmailAddress);
        editTextPassword =  findViewById(R.id.editTextPassword);

        findViewById(R.id.registerbtn).setOnClickListener(this);
        findViewById(R.id.loginbtn).setOnClickListener(this);
        passwordRecovery = findViewById(R.id.forgotPassword);

    }

    private void userLogin(){

        String email = editTextEmailAddress.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();

        if (email.isEmpty()){
            editTextEmailAddress.setError("Email is required");
            editTextEmailAddress.requestFocus();
            return;
        }

        if (password.isEmpty()){
            editTextPassword.setError("Password is required");
            editTextPassword.requestFocus();
        }

        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            editTextEmailAddress.setError("Please enter a valid email");
            editTextEmailAddress.requestFocus();
            return;

        }

        if(password.length()<6){
            editTextPassword.setError("Minimum length of password should be 6");
            editTextPassword.requestFocus();
            return;
        }

        mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(task -> {
            if (task.isSuccessful()){
                finish();
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }else{
                Toast.makeText(getApplicationContext(),task.getException().getMessage(),Toast.LENGTH_SHORT).show();
            }

        });

    }

    @Override
    protected void onStart() {
        super.onStart();

        if(mAuth.getCurrentUser()!=null){
            finish();
            startActivity(new Intent(this, ProfileActivity.class));
        }
    }

    @Override
    public void onClick(View view){
        switch(view.getId()){
            case R.id.registerbtn:
                finish();
                startActivity(new Intent(this, RegisterActivity.class));

                break;

            case R.id.loginbtn:
                userLogin();
                break;

            case R.id.forgotPassword:

                startActivity(new Intent (this, ForgotPassword.class ));
                        break;

        }
    }

}