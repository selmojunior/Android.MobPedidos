package mobpedidos.cursoandroid.junio.mobpedidos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imvClientes;
    private ImageView imvProdutos;
    private ImageView imvPedidos;
    private ImageView imvRelatorios;
    private ImageView imvSincronizar;
    private ImageView imvConfiguracao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imvClientes = (ImageView) findViewById(R.id.imvClientes);
        imvProdutos = (ImageView) findViewById(R.id.imvProdutos);
        imvPedidos = (ImageView) findViewById(R.id.imvPedidos);
        imvRelatorios = (ImageView) findViewById(R.id.imvRelatorios);
        imvSincronizar = (ImageView) findViewById(R.id.imvSincronizar);
        imvConfiguracao = (ImageView) findViewById(R.id.imvConfiguracao);

        imvClientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ClienteLista.class);
                startActivity(intent);
            }
        });

        imvProdutos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), "Funcionalidade em desenvolvimento!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), ProdutoLista.class);
                startActivity(intent);
            }
        });

        imvPedidos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), "Funcionalidade em desenvolvimento!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), PedidoLista.class);
                startActivity(intent);
            }
        });

        imvRelatorios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), "Funcionalidade em desenvolvimento!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), RelatorioLista.class);
                startActivity(intent);
            }
        });
        imvSincronizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), "Funcionalidade em desenvolvimento!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), Sincronizar.class);
                startActivity(intent);
            }
        });

        imvConfiguracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), "Funcionalidade em desenvolvimento!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), Configuracao.class);
                startActivity(intent);
            }
        });
    }
}
