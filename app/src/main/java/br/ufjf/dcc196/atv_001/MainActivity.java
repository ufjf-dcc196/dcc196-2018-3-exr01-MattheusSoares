package br.ufjf.dcc196.atv_001;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static final String NOME = "nome";
    public static final String ALUNO_MATRICULA = "";
    public static final String SERVIDOR_SIAPE = "";
    public static final String EMAIL_EXTERNO = "";

    public ArrayList<String> Alunos_Nomes;
    public ArrayList<String> Alunos_Matriculas;

    public ArrayList<String> Servidor_Nomes;
    public ArrayList<String> Servidor_SIAPE;

    public ArrayList<String> Externo_Nomes;
    public ArrayList<String> Externo_EMails;

    public static final int REQUEST_ALUNO = 1;
    public static final int REQUEST_SERVIDOR = 1;
    public static final int REQUEST_EXTERNO = 1;

    private Button btnCadastrarAluno;
    private Button btnCadastrarServidor;
    private Button btnCadastrarExterno;

    private TextView txtTotalAlunos;
    private TextView txtTotalServidor;
    private TextView txtTotalExterno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTotalAlunos = findViewById(R.id.txtTotalAlunos);
        txtTotalExterno = findViewById(R.id.txtTotalExterno);
        txtTotalServidor = findViewById(R.id.txtTotalServidor);

        btnCadastrarAluno = (Button) findViewById(R.id.btnCadastroAluno);
        btnCadastrarServidor = (Button) findViewById(R.id.btnCadastroServidor);
        btnCadastrarExterno = (Button) findViewById(R.id.btnCadastroExterno);

        btnCadastrarAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_1 = new Intent(MainActivity.this,CadastroAlunoActivity.class);
                startActivityForResult(intent_1, MainActivity.REQUEST_ALUNO);

            }
        });
        btnCadastrarServidor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_2 = new Intent(MainActivity.this,CadastroServidorActivity.class);
                startActivityForResult(intent_2, MainActivity.REQUEST_SERVIDOR);

            }
        });
        btnCadastrarExterno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_3 = new Intent(MainActivity.this,CadastroExternoActivity.class);
                startActivityForResult(intent_3, MainActivity.REQUEST_EXTERNO);

            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        super.onActivityResult(requestCode, resultCode, data);


        if(requestCode == MainActivity.REQUEST_ALUNO && resultCode == Activity.RESULT_OK && data != null){
            Bundle bundleResultado = data.getExtras();
            if(bundleResultado.getString(NOME)!=null && bundleResultado.getString(ALUNO_MATRICULA)!=null){
                Alunos_Nomes.add(bundleResultado.getString(NOME));
                Alunos_Matriculas.add(bundleResultado.getString(ALUNO_MATRICULA));
            }
            txtTotalAlunos.setText("Total de Alunos Cadastrados"+Alunos_Matriculas.size());
        }

        if(requestCode == MainActivity.REQUEST_SERVIDOR && resultCode == Activity.RESULT_OK && data != null){
            Bundle bundleResultado = data.getExtras();
            if(bundleResultado.getString(NOME)!=null && bundleResultado.getString(SERVIDOR_SIAPE)!=null){
                Servidor_Nomes.add(bundleResultado.getString(NOME));
                Servidor_SIAPE.add(bundleResultado.getString(SERVIDOR_SIAPE));
            }
            txtTotalServidor.setText("Total de Servidores Cadastrados"+Servidor_SIAPE.size());
        }


        if(requestCode == MainActivity.REQUEST_EXTERNO && resultCode == Activity.RESULT_OK && data != null){
            Bundle bundleResultado = data.getExtras();
            if(bundleResultado.getString(NOME)!=null && bundleResultado.getString(EMAIL_EXTERNO)!=null){
                Externo_Nomes.add(bundleResultado.getString(NOME));
                Externo_EMails.add(bundleResultado.getString(EMAIL_EXTERNO));
            }
            txtTotalExterno.setText("Total de Cadastrados Externos"+Externo_EMails.size());
        }

    }

}
