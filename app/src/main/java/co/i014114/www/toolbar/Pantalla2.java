package co.i014114.www.toolbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;


public class Pantalla2 extends AppCompatActivity {
private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        toolbar =  (Toolbar)findViewById(R.id.tolbar1);
        showToolbar(getResources().getString(R.string.str_tb_p2 ),true);


    }

    public void showToolbar(String titulo, boolean upButton) {
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(titulo);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu mimenu) {
        getMenuInflater().inflate(R.menu.mimenu, mimenu);

        return super.onCreateOptionsMenu(mimenu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        showpantallaDos();


        return super.onOptionsItemSelected(item);
    }

    public void showpantallaDos(){
        Intent intent= new Intent(getApplicationContext(), MainActivity.class );
        startActivity(intent);
    }




}
