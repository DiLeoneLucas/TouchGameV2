package com.example.touchgamev2;

import android.content.Context;
import android.os.CountDownTimer;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MyCountDownTimer extends CountDownTimer {

    private TextView tv;
    private Context context;
    private long timeInFuture;
    private long interval;


    public MyCountDownTimer(Context context, TextView tv, long timeInFuture, long interval){
        super(timeInFuture, interval);
        this.context = context;
        this.tv = tv;
    }


    @Override
    public void onTick(long millisUntilFinished) {
        //millisUntilFinished = é qnto tempo falta para acabar a contagem regressiva

        timeInFuture = millisUntilFinished;
        tv.setText(getCorrectTime(true, millisUntilFinished)+":"+getCorrectTime(false, millisUntilFinished));
    }

    @Override
    public void onFinish() {
        timeInFuture -= 60000;
        tv.setText(getCorrectTime(true, timeInFuture)+":"+getCorrectTime(false, timeInFuture));

        Toast.makeText(context, "FINISH!!!", Toast.LENGTH_SHORT).show();
    }

    private String getCorrectTime(boolean isMinute, long millisUntilFinished){
        String aux;
        int consCalendar = isMinute ? Calendar.MINUTE : Calendar.SECOND;
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(millisUntilFinished);

        aux = c.get(consCalendar) < 10 ? "0"+c.get(consCalendar) : ""+c.get(consCalendar);
        return(aux);
    }
}
