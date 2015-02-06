package lb.app.teatrosnchezaguilar.module;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                Intent i = new Intent();
                i.putExtra("nombre","luis");
                i.setClass(MainActivity.this, contacto.class);
                startActivity(i);
                return true;
            case R.id.action_quienes_somos:
                Log.i("ActionBar", "Guardar!");;
                return true;
            case R.id.action_programacion:
                Log.i("ActionBar", "Settings!");;
                return true;
            case R.id.action_calendario_eventos:
                Log.i("ActionBar", "Settings!");;
                return true;
            case R.id.action_como_llegar:
                Log.i("ActionBar", "Settings!");;
                return true;
            case R.id.action_contactenos:
                Log.i("ActionBar", "Settings!");;
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
