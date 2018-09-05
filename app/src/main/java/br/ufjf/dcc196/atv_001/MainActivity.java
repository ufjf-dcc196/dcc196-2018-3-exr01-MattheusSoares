package br.ufjf.dcc196.atv_001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static final String NOME = "nome";
    public static final String ALUNO_MATRICULA = "";
    public static final String SERVIDOR_SIAPE = "";
    public static final String EMAIL_EXTERNO = "";

    private Button btnCadastrarAluno;
    private Button btnCadastrarServidor;
    private Button btnCadastrarExterno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCadastrarAluno = (Button) findViewById(R.id.btnCadastroAluno);
        btnCadastrarServidor = (Button) findViewById(R.id.btnCadastroServidor);
        btnCadastrarExterno = (Button) findViewById(R.id.btnCadastroExterno);
    }
}
