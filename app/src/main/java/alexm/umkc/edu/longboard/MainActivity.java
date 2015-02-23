package alexm.umkc.edu.longboard;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Chronometer;
import android.widget.Toast;

import java.util.Timer;

import static android.view.View.OnCreateContextMenuListener;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    static final private String TAG = "Long Board";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "Starting onCreate...");
        setContentView(R.layout.activity_main);

        View gpsButton = findViewById(R.id.GPSbutton);
        gpsButton.setOnClickListener(this);

        View timerButtton = findViewById(R.id.Timerbutton);
        timerButtton.setOnClickListener(this);

        View stuffButton = findViewById(R.id.Stuffbutton);
        stuffButton.setOnClickListener(this);




    }



    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.Refreshbutton:


        }
        switch(v.getId()){
            case R.id.GPSbutton:
                Intent intent = new Intent(this,GPS.class);
                startActivity(intent);


        }
        switch (v.getId()){
            case R.id.Timerbutton:
                Intent intent = new Intent(this, alexm.umkc.edu.longboard.Timer.class);
                startActivity(intent);

        }
        switch(v.getId()){
            case R.id.Stuffbutton:
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;



    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }

        return super.onOptionsItemSelected(item);
    }





    }

