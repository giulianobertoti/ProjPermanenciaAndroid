package sjc.fatec.edu.appAluno;

import android.widget.Button;

/**
 * Created by Aniro on 07/12/2016.
 */
public class Competencias {

    private Integer visaoFuturo;
    private Integer resiliencia;
    private Integer gestaoTempo;
    private Integer equiEmocional;
    private  Integer trabEquipe;
    private  Integer comunicacao;

    public void setResiliencia(Integer resiliencia) {
        this.resiliencia = resiliencia;
    }

    public Integer getTrabEquipe() {
        return trabEquipe;
    }

    public void setTrabEquipe(Integer trabEquipe) {
        this.trabEquipe = trabEquipe;
    }

    public Integer getComunicacao() {
        return comunicacao;
    }

    public void setComunicacao(Integer comunicacao) {
        this.comunicacao = comunicacao;
    }

    public Integer getEquiEmocional() {

        return equiEmocional;

    }

    public Integer getResiliencia() {
        return resiliencia;

    }

    public Integer getGestaoTempo() {
        return gestaoTempo;
    }

    public Integer getVisaoFuturo() {
        return visaoFuturo;

    }

    public void setEquiEmocional(Integer equiEmocional) {

        this.equiEmocional = equiEmocional;
    }
    public void pontos(Button btn)
    {
        switch (btn.getId()){
            case R.id.button:
                this.setComunicacao(this.getComunicacao()+1);
                break;
            case R.id.button2:
                this.setEquiEmocional(this.getEquiEmocional()+1);
                break;
            case R.id.button3:
                this.setResiliencia(this.getResiliencia()+1);
                break;
            case R.id.button4:
                this.setTrabEquipe(this.getTrabEquipe()+1);
                break;
        }
    }



}
