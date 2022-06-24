package com.example.touchgamev2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.CountDownTimer;
import android.widget.Button;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Button button2;
    private Button iniciar;
    private TextView tvPonto;
    private TextView TvScore;
    TextView mostrar;
    private GameActivity Game;
    int ponto = 0;
    int record = 0;
    private MyCountDownTimer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button2 = findViewById(R.id.button2);
        mostrar = findViewById(R.id.mostrar);
        iniciar = findViewById(R.id.iniciar);
        iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setTimer();
            }
        });

    }

    //tvPonto = findViewById(R.id.tvPonto);
    //button2 = (Button) findViewById(R.id.button2);
    public void somaPonto(View view) {
        ponto++;
        TextView tvPonto = findViewById(R.id.tvPonto);
        tvPonto.setText("" + ponto);
    }

    public void setTimer() {

        ponto = 0;
        mostrar.setText("00:00");
        TextView tv = (TextView) findViewById(R.id.mostrar);
        timer = new MyCountDownTimer(this, tv, 15 * 1000, 1000) {

            @Override
            public void onFinish() {
                TextView tvPonto = findViewById(R.id.tvPonto);
                TextView TvScore = findViewById(R.id.TvScore);
                Toast.makeText(MainActivity.this, "Sua Pontuação:" + ponto, Toast.LENGTH_LONG).show();

                mostrar.setText("00:00");

                if (ponto > record) {
                    record = ponto;
                    TvScore.setText("" + record);
                    ponto = 0;
                    tvPonto.setText("");
                } else {
                    ponto = 0;
                    tvPonto.setText("");
                }

            }
        };
        timer.start();
    }
}