package lb.app.teatrosnchezaguilar.module;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class como_llegar extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_como_llegar);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        Intent i = new Intent();

        switch (item.getItemId()) {
            case R.id.action_settings:
                i.setClass(this, MainActivity.class);
                startActivity(i);
                return true;
            case R.id.action_quienes_somos:
                i.setClass(this, quienes_somos.class);
                startActivity(i);
                return true;
            case R.id.action_programacion:
                Log.i("ActionBar", "Settings!");;
                return true;
            case R.id.action_calendario_eventos:
                Log.i("ActionBar", "Settings!");;
                return true;
            case R.id.action_como_llegar:
                i.setClass(this, como_llegar.class);
                startActivity(i);
                return true;
            case R.id.action_contactenos:
                i.setClass(this, contacto.class);
                startActivity(i);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
