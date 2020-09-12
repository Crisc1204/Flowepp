package co.com.flowepp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    public void goToElementos (View view){
        Intent goToElementos = new Intent(this, ElementosActivity.class);
        startActivity(goToElementos);
    }
}