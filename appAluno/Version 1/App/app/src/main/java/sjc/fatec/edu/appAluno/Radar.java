package sjc.fatec.edu.appAluno;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

public class Radar extends AppCompatActivity {

    private EditText nomeEditText;
    private TextView saudacaoTextView;
    private String saudacao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radar);
    //this.nomeEditText=(EditText) findViewById(R.id.trabalho);
   /* Competencias comp=new Competencias();
        Integer texto=comp.getTrabEquipe();
        String msg= "Trabalho em equipe"+texto;
        this.saudacaoTextView.setText(msg);*/
    }






}