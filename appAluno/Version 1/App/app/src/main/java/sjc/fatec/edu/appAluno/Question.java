package sjc.fatec.edu.appAluno;


import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Question extends AppCompatActivity {
    ArrayList<Bitmap> imgAll = new ArrayList<Bitmap>();
    ArrayList<String> perguntas=new ArrayList<>();

    int i = 0;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.question);
        perguntas.add("Pergunta1");
        perguntas.add("Pergunta2");
        perguntas.add("Pergunta3");
        perguntas.add("Pergunta4");
        perguntas.add("Pergunta4");
        perguntas.add("Pergunta6");
        perguntas.add("Pergunta7");
        perguntas.add("Pergunta8");


       i= setQuestion(i);
       /*img =(ImageView) findViewById(R.id.cenas);

        Bitmap scene;
        scene=BitmapFactory.decodeResource(getResources(),R.mipmap.scene1);
        imgAll.add(scene);
        scene=BitmapFactory.decodeResource(getResources(),R.mipmap.scene1);
        imgAll.add(scene);
        scene=BitmapFactory.decodeResource(getResources(),R.mipmap.scene1);
        imgAll.add(scene);

        img.setImageBitmap(imgAll.get(0));*/



    }

   // public void carregarImagem(View v){
      //  img.setImageBitmap(imgAll.get(i));
        //if(i>=2){i=0;}else{i+=1;}
    //}



    public int setQuestion(int var) {

        TextView text = (TextView) findViewById(R.id.editText1);
        Button bt01 = (Button) findViewById(R.id.button);
        Button bt02 = (Button) findViewById(R.id.button2);
        Button bt03 = (Button) findViewById(R.id.button3);
        Button bt04 = (Button) findViewById(R.id.button4);

        text.setText("Selecione ");
        bt01.setText(perguntas.get(var++));
        bt02.setText(perguntas.get(var++));
        bt03.setText(perguntas.get(var++));
        bt04.setText(perguntas.get(var++));
        return var;
    }
     public void valida(View v)
    {
        startActivity(new Intent(this,Scene.class));
    }

}
