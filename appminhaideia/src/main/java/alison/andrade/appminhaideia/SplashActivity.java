package alison.andrade.appminhaideia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    String TAG = "APP_MINHA_IDEIA";

    //Medida em milessegundo = 5 segundos
    int tempoDeEspera = 1000 * 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //metodo trocar de tela
        trocarTela();
    }

    //Camelcase : palavras compostas primeira letra minuscula e segunda maiuscula
    private void trocarTela() {
        //tempo de espera
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent trocarDeTela = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(trocarDeTela);
                finish();
            }
        }, tempoDeEspera);

    }

}