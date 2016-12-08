package sjc.fatec.edu.appAluno;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Aniro on 07/12/2016.
 */
public class Pontuacao extends AppCompatActivity{

    private Competencias comp;

    public void pontos(Button btn)
    {
        switch (btn.getId()){
            case R.id.button:
                comp.setComunicacao(comp.getComunicacao()+1);
                break;
            case R.id.button2:
                comp.setEquiEmocional(comp.getEquiEmocional()+1);
                break;
            case R.id.button3:
                comp.setResiliencia(comp.getResiliencia()+1);
                break;
            case R.id.button4:
                comp.setTrabEquipe(comp.getTrabEquipe()+1);
                break;
        }
    }

    public  void resultados(View v)
    {
        Integer texto=comp.getTrabEquipe();
        String msg= "Trabalho em equipe"+texto;

    }
}
