package co.com.flowepp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class IngresarCodigoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresar_codigo);
    }

    public void goToElementos (View view){
        Intent goToElementos = new Intent(this, ElementosActivity.class);
        startActivity(goToElementos);
    }
}