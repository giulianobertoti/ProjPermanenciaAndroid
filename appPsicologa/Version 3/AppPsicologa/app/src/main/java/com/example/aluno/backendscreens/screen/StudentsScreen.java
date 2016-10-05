package com.example.aluno.backendscreens.screen;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import android.app.AlertDialog;

import com.example.aluno.backendscreens.R;
import com.example.aluno.backendscreens.listview.Color;
import com.example.aluno.backendscreens.listview.ColorAdapter;
import com.example.aluno.backendscreens.model.Model;
import com.example.aluno.backendscreens.object.CoursesDatas;
import com.example.aluno.backendscreens.object.Student;


import java.util.ArrayList;

public class StudentsScreen extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students_screen);
        Model model = new Model();
        ArrayList<Student> students = model.studentsReturn(CoursesDatas.institution, CoursesDatas.period, CoursesDatas.year, CoursesDatas.course);
        ArrayList<Color> color_data = new ArrayList<Color>();

        //Alerta no caso de vazio
        AlertDialog alertDialog = new AlertDialog.Builder(this).create();
        alertDialog.setTitle("Atenção");
        alertDialog.setMessage("Nenhum aluno foi encontrado com estes critérios de busca!");
        alertDialog.setButton("Continuar", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            // Chamar a SpinerScreen
                trocarTela();
            }
        });
        //alertDialog.setIcon(R.drawable.icon); icone do alerta



        if(students.isEmpty()){
        // lista de estudantes vazia(nenhum estudante encontrado) mostrar um alerta e voltar para SpinnerScreen
            alertDialog.show();
        }

        for(Student std : students){

            if(std.getVerification() == 2){
                color_data.add(new Color(std.getName(), R.drawable.green));
            }

            if(std.getVerification() == 1){
                color_data.add( new Color(std.getName(), R.drawable.yellow));
            }
            if(std.getVerification() == 0){
                color_data.add( new Color(std.getName(), R.drawable.red));
            }
        }


        ColorAdapter adapter = new ColorAdapter(this,
                R.layout.list_view_row_students_screen, color_data);

        ListView listView = (ListView)findViewById(R.id.listView1);

        View header = (View)getLayoutInflater().inflate(R.layout.listview_header_row_students_screen, null);
        listView.addHeaderView(header);

        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {

                if(position > 0) {
                    Color color = (Color) parent.getItemAtPosition(position);
                    String name = color.getName();
                    Toast.makeText(getBaseContext(), "ABRIR TELA PRA COMENTAR", Toast.LENGTH_SHORT).show();

                /*
                Função troca tela. (Chamar a tela de comentario da psicologa)



                Intent intent = new Intent(StudentsScreen.this, "NOME_DA_ACTIVITY".class);
                startActivity(intent);
                //StudentsScreen.this.finish();//não tera tela para voltar
                */
                }
            }
        });

    }

    public void trocarTela() {
        Intent trocatela = new Intent(this, SpinnerScreen.class);
        startActivity(trocatela);
    }
}