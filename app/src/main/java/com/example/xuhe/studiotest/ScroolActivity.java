package com.example.xuhe.studiotest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScroolActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_scrollto, btn_scrollby;
    private TextView tv_color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrool);
        btn_scrollto = (Button) findViewById(R.id.btn_scrollto);
        btn_scrollto.setOnClickListener(this);
        btn_scrollby = (Button) findViewById(R.id.btn_scrollby);
        btn_scrollby.setOnClickListener(this);
        tv_color = (TextView) findViewById(R.id.tv_color);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_scrollby:
                tv_color.scrollBy(100, 200);
                break;
            case R.id.btn_scrollto:
                tv_color.scrollTo(100, 200);
                break;
            default:

                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrool, menu);
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
}
