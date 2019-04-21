package mobpedidos.cursoandroid.junio.mobpedidos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ClienteCadastro extends AppCompatActivity {

    private Button btnSalvar1;
    private Button btnSalvar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente_cadastro);

        btnSalvar1 = (Button) findViewById(R.id.btnSalvar1);
        btnSalvar2 = (Button) findViewById(R.id.btnSalvar2);

        btnSalvar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (salvar()) {

                } else {

                }
            }
        });

        btnSalvar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (salvar()) {

                } else {

                }
            }
        });

    }

    public boolean salvar() {
        return true;
    }
}
