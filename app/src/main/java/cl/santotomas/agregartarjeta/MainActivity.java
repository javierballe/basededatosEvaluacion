package cl.santotomas.agregartarjeta;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText numeroTarjeta,nombre,apellido,año,mes,CVV;
    List<EditText> campos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numeroTarjeta = (EditText) findViewById(R.id.nuTarjeta);
        nombre = (EditText) findViewById(R.id.nombr);
        apellido = (EditText) findViewById(R.id.apelli);
        año = (EditText) findViewById(R.id.año);
        mes = (EditText) findViewById(R.id.mis);
        CVV = (EditText) findViewById(R.id.CV);
        campos = Arrays.asList(numeroTarjeta,nombre,apellido,año,mes,CVV);

    }
    public void registrar(View v)
    {
        if(validar())
        {
            //Toast.makeText(context: this, text: "ingreso datos", Toast.LENGTH_SHORT).show();
        }


    }

    public boolean validar()
    {
        boolean retorno=true;
        String R1=numeroTarjeta.getText().toString();
        String R2=nombre.getText().toString();
        String R3=apellido.getText().toString();
        String R4=año.getText().toString();
        String R5=mes.getText().toString();
        String R6=CVV.getText().toString();
        if(R1.isEmpty())
        {
            numeroTarjeta.setError("Campo obligatorio");
            return retorno;
        }
        if(R2.isEmpty())
        {
            nombre.setError("Campo obligatorio");
            return retorno;
        }
        if(R3.isEmpty())
        {
            apellido.setError("Campo obligatorio");
            return retorno;
        }
        if(R4.isEmpty())
        {
            año.setError("Campo obligatorio ");
            return retorno;
        }
        if(R5.isEmpty())
        {
            mes.setError("Campo obligatorio");
            return retorno;
        }
        if(R6.isEmpty())
        {
            CVV.setError("Campo obligatorio");
            return retorno;
        }
        return retorno;
    }

}