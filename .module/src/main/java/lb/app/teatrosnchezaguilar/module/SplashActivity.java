package lb.app.teatrosnchezaguilar.module;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.view.Window;
import android.view.WindowManager;


public class SplashActivity extends ActionBarActivity {

    // Duración en milisegundos que se mostrará el splash
    private final int DURACION_SPLASH = 3000;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Quitamos barra de titulo de la aplicacion
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        //Quitamos barra de notificaciones
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // Tenemos una plantilla llamada splash.xml donde mostraremos la información que queramos (logotipo, etc.)
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            public void run() {
                // Cuando pasen los 3 segundos, pasamos a la actividad principal de la aplicación
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }

            ;
        }, DURACION_SPLASH);
    }
}
