package com.pedrovelasco.pulsame_veces;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private int cuenta = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    protected void onSaveInstanceState(Bundle outState){
        Button bnt = (Button) findViewById(R.id.button);
        super.onSaveInstanceState(outState);
        String texto = String.valueOf(bnt.getText());
        outState.putInt("Cuenta", cuenta);
        outState.putString("texto", texto);
    }

    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        cuenta = savedInstanceState.getInt("Cuenta");
        Button bnt = (Button) findViewById(R.id.button);
        bnt.setText(savedInstanceState.getString("texto"));

    }

        public void pulsar(View view){
            cuenta++;

            Button bnt = (Button) findViewById(R.id.button);
            Resources res = getResources();

            String ntext = res.getQuantityString(R.plurals.num,cuenta,cuenta);

            bnt.setText(ntext);

        }
    }





