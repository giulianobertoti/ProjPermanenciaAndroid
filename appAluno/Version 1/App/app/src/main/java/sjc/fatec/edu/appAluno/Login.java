package sjc.fatec.edu.appAluno;

/**
 * Created by Aniro on 07/12/2016.
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class Login extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.telaprincipal);
        Button btn = (Button) findViewById(R.id.btnLogin);


        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Login.this, Scene.class);
                startActivity(it);
            }
        });

    }
}
