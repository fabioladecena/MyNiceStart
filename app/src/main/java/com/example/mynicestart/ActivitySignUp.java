package com.example.mynicestart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
/**
 * Ventana de registro de la aplicación
 * @author fabid
 * @see MainActivity
 * @see ActivitySignUp
 */
public class ActivitySignUp extends AppCompatActivity {
    protected Button cancelButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        cancelButton = (Button)findViewById(R.id.button_cancel);
        cancelButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(ActivitySignUp.this, ActivityLogin.class);
                startActivity(intent);
            }
        });

    }
}