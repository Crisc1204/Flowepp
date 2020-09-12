package co.com.flowepp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToLogin (View view){
        Intent goToLogin = new Intent(this, LoginActivity.class);
        startActivity(goToLogin);
    }

    public void goToRegistrarse (View view){
        Intent goToRegistrarse = new Intent(this, RegistrarseActivity.class);
        startActivity(goToRegistrarse);
    }
}