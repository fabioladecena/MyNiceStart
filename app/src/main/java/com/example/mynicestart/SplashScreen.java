package com.example.mynicestart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Ventana de bienvenida de la aplicación
 * @author fabid
 * @see ActivityLogin
 */
public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        openApp(true);

        TextView mySubtitle = (TextView)findViewById(R.id.textView4);
        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.alpha);
        mySubtitle.startAnimation(myanim);
        openApp(true);


    }

    private void openApp(boolean locationPermission) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen
                        .this, ActivityLogin.class);
                startActivity(intent);
                finish();
            }
        }, 5000);
    }
}