package co.com.flowepp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class EscanearCodigoActivity extends AppCompatActivity {

    EditText editTextCodigo;
    Button btnEscanear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escanear_codigo);

        editTextCodigo = findViewById(R.id.editTextCodigo);
        btnEscanear = findViewById(R.id.btnEscanear);

        btnEscanear.setOnClickListener(mOnclickListener);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if (result != null)
            if (result.getContents() != null){
                editTextCodigo.setText("El código de barras es:`\n"+result.getContents());
            }else {
                editTextCodigo.setText("Error al escanear el código de barras");
            }
    }

    private View.OnClickListener mOnclickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.btnEscanear:
                    new IntentIntegrator(EscanearCodigoActivity.this).initiateScan();
                    break;
            }
        }
    };
}