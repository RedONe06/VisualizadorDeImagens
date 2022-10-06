package br.ulbra.visualizadordeimagens;

import android.os.Bundle;
import android.app.Activity;
import android.widget.*;

public class MainActivity extends Activity {

    ImageView imgFoto;
    Switch sw;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgFoto = (ImageView) findViewById(R.id.imgFoto);
        sw = (Switch) findViewById(R.id.switch1);

        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    imgFoto.setImageResource(R.drawable.image1);
                    sw.setText("Foto 1");
                } else {
                    imgFoto.setImageResource(R.drawable.image2);
                    sw.setText("Foto 2");
                }
            }
        });
    }
}