package com.example.mynicestart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
/**
 * Ventana de inicio de sesión de la aplicación
 * @author fabid
 * @see MainActivity
 * @see ActivitySignUp
 */
public class ActivityLogin extends AppCompatActivity {
    protected Button loginButton;
    protected Button signupButton;
    protected ImageView campBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginButton = (Button)findViewById(R.id.button_login);
        loginButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(ActivityLogin.this, MainActivity.class);
                startActivity(intent);
            }
        });

        signupButton = (Button)findViewById(R.id.button_signup);
        signupButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(ActivityLogin.this, ActivitySignUp.class);
                startActivity(intent);
            }
        });

        campBack = findViewById(R.id.campBackground);
        Glide.with(this)
                .load("https://3.bp.blogspot.com/-0BuYr8DB50s/W_KlWEDzO9I/AAAAAAAA9hk/tqySwV1wc102ot8J70_irUvZKRHD-13NgCLcBGAs/s1600/G01%2B%25281%2529.png")
                .centerCrop()
                .transition(DrawableTransitionOptions.withCrossFade(500))
                .placeholder(new ColorDrawable(this.getResources().getColor(R.color.colorPrimary)))
                .into(campBack);
    }
}