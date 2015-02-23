package alexm.umkc.edu.longboard;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.Chronometer;
import android.widget.TextView;
import android.widget.Toast;


public class Timer extends ActionBarActivity implements View.OnClickListener {

    private Chronometer T;
    static final private String TAG = "Timer";


    private int StartCount = 0;
    private int StopCount = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "Starting onCreate...");

    setContentView(R.layout.layout_main_menu);

    View startButton = findViewById(R.id.StartButton);
    startButton.setOnClickListener(this);

    View stopButtton = findViewById(R.id.StopButton);
    stopButtton.setOnClickListener(this);

    UpdateChron();
    UpdateCount();




}


    public void UpdateCount(){
        TextView Start = (TextView) findViewById(R.id.StartCount);
        Start.setText(Integer.toString(StartCount));
        TextView Stop = (TextView) findViewById(R.id.StopCount);
        Stop.setText(Integer.toString(StopCount));
    }
    private void showElapsedTime() {
        long elapsedMillis = SystemClock.elapsedRealtime() - T.getBase();
        Toast.makeText(Timer.this, "Elapsed milliseconds: " + elapsedMillis,
                Toast.LENGTH_SHORT).show();
    }

    public void UpdateChron() {
        T = (Chronometer) findViewById(R.id.chronometer);

        T.setBase(SystemClock.elapsedRealtime());
    }

    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.StartButton:

                StartCount++;
                UpdateCount();

                T.start();

                UpdateChron();


        }
        switch (v.getId()){
            case R.id.StopButton:
                StopCount++;
                UpdateCount();
                T.stop();
                showElapsedTime();

        }

    }
}
