package mx.edu.cetis108.cetis108app_003;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tijeras_onClick (View v) {
        EditText text1 = (EditText)findViewById(R.id.txtnum1);
        EditText text2 = (EditText)findViewById(R.id.txtnum2);
        TextView textovacio = (TextView)findViewById(R.id.textovacio);
        TextView texto = (TextView)findViewById(R.id.texto);
        TextView texto2 = (TextView)findViewById(R.id.texto2);
        float text11 = Float.parseFloat(text1.getText().toString());
        float text22 = Float.parseFloat(text2.getText().toString());

        if(text11>text22) {
            float resultado = text11 - text22;
            texto.setText("resultado: " +resultado);
            texto2.setText("el mayor es: "+text11);
            textovacio.setText("los numeros se han restado");
        }
        if(text22>text11) {
            float resultado1 = text11 + text22;
            texto.setText("resultado:" +resultado1);
            texto2.setText("el mayor es: " +text22);
            textovacio.setText("los numeros se han sumado");
        }
        if(text11==text22) {
            texto.setText("los numeros son iguales!");
            texto2.setText(" ");
        }
    }
}