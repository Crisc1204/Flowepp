package co.com.flowepp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class RegistrarseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarse);
    }

    public void goToLogin (View view){
        Intent goToLogin = new Intent(this, LoginActivity.class);
        startActivity(goToLogin);
        Toast.makeText(this, R.string.textoRegistro, Toast.LENGTH_LONG).show();
    }
}