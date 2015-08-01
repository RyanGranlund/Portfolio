package com.digitalinfomesh.portfolio;

import android.support.v4.app.NotificationCompatSideChannelService;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.content.Context;



public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void showToast(View view) {

        CharSequence text;
        CharSequence label;

        switch(view.getId()){

            case R.id.btn0:
                label = getString(R.string.btn0Label);
                break;

            case R.id.btn1:
                label  = getString(R.string.btn1Label);
                break;

            case R.id.btn2:
                label = getString(R.string.btn2Label);
                break;

            case R.id.btn3:
                label = getString(R.string.btn3Label);
                break;

            case R.id.btn4:
                label = getString(R.string.btn4Label);
                break;

            case R.id.btn5:
                label = getString(R.string.btn5Label);
                break;

            default:
                label = "unknown";

        }
        Context context = getApplicationContext();
        text = "This button will launch my " + label + " app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();


    }



}
