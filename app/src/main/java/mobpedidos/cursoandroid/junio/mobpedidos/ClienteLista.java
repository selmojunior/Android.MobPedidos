package mobpedidos.cursoandroid.junio.mobpedidos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ClienteLista extends AppCompatActivity {

    private Button btnVoltar;
    private Button btnNovo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente_lista);

        btnVoltar = (Button) findViewById(R.id.btnVoltar);
        btnNovo = (Button) findViewById(R.id.btnNovo);

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btnNovo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ClienteCadastro.class);
                startActivity(intent);
            }
        });
    }
}
