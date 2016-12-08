package sjc.fatec.edu.appAluno;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);


        TextView jogar=( TextView) findViewById(R.id.jogo);
        TextView sair=( TextView) findViewById(R.id.sair);
        TextView pontos=( TextView) findViewById(R.id.pontos);
        TextView grafico=( TextView) findViewById(R.id.grafico);



        jogar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainMenu.this, Login.class);
                startActivity(it);
            }
        });

        grafico.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainMenu.this, Radar.class);
                startActivity(it);
            }
        });

        sair.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                onDestroy();
            }
        });
    }
    @Override
   public void onDestroy()
    {
        super.onDestroy();
    }

   /* public void opcao(View view)
    {
        switch (view.getId())

        {
            case R.id.jogo:
                startActivity(new Intent(MainMenu.this,Login.class));
                break;
        }
    }*/




}
