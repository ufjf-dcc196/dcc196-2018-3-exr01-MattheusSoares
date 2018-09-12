package br.ufjf.dcc196.atv_001;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CadastroExternoActivity extends AppCompatActivity {
    private EditText txtNomeExterno;
    private EditText txtEmailExterno;
    private Button btnSalvarExterno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_externo);
        txtNomeExterno = findViewById(R.id.txtNomeExterno);
        txtEmailExterno = findViewById(R.id.txtEmailExterno);
        btnSalvarExterno = findViewById(R.id.btnSalvarExterno);
        Bundle extras = getIntent().getExtras();
        btnSalvarExterno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resultado = new Intent();
                resultado.putExtra(MainActivity.NOME,txtNomeExterno.getText().toString());
                resultado.putExtra(MainActivity.EMAIL_EXTERNO,txtEmailExterno.getText().toString());

                setResult(Activity.RESULT_OK, resultado);
                finish();

            }
        });
    }
}
