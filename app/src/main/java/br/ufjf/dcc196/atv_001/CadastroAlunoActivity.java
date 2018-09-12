package br.ufjf.dcc196.atv_001;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CadastroAlunoActivity extends AppCompatActivity {
    private EditText txtNomeAluno;
    private EditText txtMatriculaAluno;
    private Button btnSalvarAluno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_aluno);

        setContentView(R.layout.activity_cadastro_servidor);
        txtNomeAluno = findViewById(R.id.txtAlunoNome);
        txtMatriculaAluno = findViewById(R.id.txtAlunoMatricula);
        btnSalvarAluno = findViewById(R.id.btnSalvarAluno);
        Bundle extras = getIntent().getExtras();


        btnSalvarAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent resultado = new Intent();
                resultado.putExtra(MainActivity.NOME,txtNomeAluno.getText().toString());
                resultado.putExtra(MainActivity.ALUNO_MATRICULA,txtMatriculaAluno.getText().toString());
                setResult(Activity.RESULT_OK, resultado);
                finish();

            }
        });






    }
}
