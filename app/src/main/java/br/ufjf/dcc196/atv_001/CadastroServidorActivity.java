package br.ufjf.dcc196.atv_001;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CadastroServidorActivity extends AppCompatActivity {
    private EditText txtNomeServidor;
    private EditText txtSIAPEServidor;
    private Button btnSalvarServidor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_servidor);
        txtNomeServidor = findViewById(R.id.txtServidorNome);
        txtSIAPEServidor = findViewById(R.id.txtServidorSIAPE);
        btnSalvarServidor = findViewById(R.id.btnSalvarServidor);
        Bundle extras = getIntent().getExtras();
        btnSalvarServidor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent resultado = new Intent();
                resultado.putExtra(MainActivity.NOME,txtNomeServidor.getText().toString());
                resultado.putExtra(MainActivity.SERVIDOR_SIAPE,txtSIAPEServidor.getText().toString());
                setResult(Activity.RESULT_OK, resultado);
                finish();

            }
        });

    }
}
