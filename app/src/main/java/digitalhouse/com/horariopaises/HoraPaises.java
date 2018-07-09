package digitalhouse.com.horariopaises;

import android.content.Intent;
import android.icu.lang.UCharacter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class HoraPaises extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hora_paises);

        TextView txtFranca = (TextView) findViewById(R.id.txtFranca);
        TextView txtChina = (TextView) findViewById(R.id.txtChina);
        TextView txtAfrica = (TextView) findViewById(R.id.txtAfrica);

        Intent itxtHoraFranca = getIntent();
        Bundle bdltxtFranca = itxtHoraFranca.getExtras();
        String campoHoraFranca = bdltxtFranca.getString("ChaveHoraFranca");
        txtFranca.setText(campoHoraFranca);

        Intent itxtHoraChina = getIntent();
        Bundle bdltxtChina = itxtHoraChina.getExtras();
        String campoHoraChina = bdltxtChina.getString("ChaveHoraChina");
        txtChina.setText(campoHoraChina);

        Intent itxtHoraAfrica = getIntent();
        Bundle bdltxtAfrica = itxtHoraAfrica.getExtras();
        String campoHoraAfrica = bdltxtAfrica.getString("ChaveHoraAfrica");
        txtAfrica.setText(campoHoraAfrica);
    }
}
