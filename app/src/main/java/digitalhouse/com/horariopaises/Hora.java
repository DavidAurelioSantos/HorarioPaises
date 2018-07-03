package digitalhouse.com.horariopaises;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Hora extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hora);

        Button bAH = (Button) findViewById(R.id.bAH);
        Button bAM = (Button) findViewById(R.id.bAM);
        Button bDH = (Button) findViewById(R.id.bDH);
        Button bDM = (Button) findViewById(R.id.bDM);

        final TextView txtHora = (TextView) findViewById(R.id.txtHora);
        TextView txtPonto = (TextView) findViewById(R.id.txtPonto);
        final TextView txtMinuto = (TextView) findViewById(R.id.txtMinuto);
        final TextView txtPeriodo = (TextView) findViewById(R.id.txtperiodo);

        bAH.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                if(txtHora.getText().toString().equals("11")){
                    txtHora.setText("00");
                    if(txtPeriodo.getText().toString().equals("PM")){
                        txtPeriodo.setText("AM");
                    }else{
                        txtPeriodo.setText("PM");
                    }
                }else {
                    int resultado = Integer.parseInt(txtHora.getText().toString()) + 1;
                    String a = String.valueOf(resultado);
                    txtHora.setText(a);
                }
            }
        });

        bAM.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                if(txtMinuto.getText().toString().equals("59")){
                    txtMinuto.setText("00");
                }else{
                    int resultado = Integer.parseInt(txtMinuto.getText().toString()) + 1;
                    String a = String.valueOf(resultado);
                    txtMinuto.setText(a);
                }
            }
        });

        bDH.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                if(txtHora.getText().toString().equals("0"))  {
                    txtHora.setText("11");
                }else {
                    int resultado = Integer.parseInt(txtHora.getText().toString()) - 1;
                    String a = String.valueOf(resultado);
                    txtHora.setText(a);
                }
            }
        });
    }
}
