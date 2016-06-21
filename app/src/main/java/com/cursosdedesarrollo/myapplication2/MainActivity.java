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
    private Boolean primera=false;
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
    protected void onPause(){
        super.onPause();
        Log.d("Activity1","onPause");
    }
    protected void onResume(){
        super.onResume();
        Log.d("Activity1","onResume");
        if (primera==false){
            Log.d("Activity1","Es mi primera vez");
            primera=true;
        }else{
            Log.d("Activity1","He vuelto a la primera activity");
        }
    }
    protected void onStop(){
        super.onStop();
        Log.d("Activity1","onStop");
    }
    protected void onStart(){
        super.onStart();
        Log.d("Activity1","onStart");
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
