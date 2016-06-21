package com.cursosdedesarrollo.myapplication2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        Log.d("App", "Llego a mi activity");
        setUpViews();
    }
    public void setUpViews(){
        b= (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("app","Pulsado");
                Toast text=Toast.makeText(getApplicationContext(),
                        R.string.pulsado,
                        Toast.LENGTH_LONG);
                text.show();
            }
        });
    }
    public void hola (View v){
        Log.d("app","hola");
        Toast text=Toast.makeText(this, R.string.hola_txt,Toast.LENGTH_LONG);
        text.show();
    }
    public void salta (View v){
        Intent i= new Intent(getApplicationContext(),
                MyActivity2.class);
        startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
