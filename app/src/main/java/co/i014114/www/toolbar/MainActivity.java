package co.i014114.www.toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.tolbar1);
        showToolbar(getResources().getString(R.string.str_tb_p1));
    }


    public void showToolbar(String titulo) {
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(titulo);
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
        Intent intent= new Intent(getApplicationContext(), Pantalla2.class );
        startActivity(intent);
    }


}
