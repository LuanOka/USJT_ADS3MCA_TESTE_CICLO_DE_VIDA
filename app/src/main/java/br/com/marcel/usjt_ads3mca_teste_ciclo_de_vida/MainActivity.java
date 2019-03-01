package br.com.marcel.usjt_ads3mca_teste_ciclo_de_vida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public void ir(View view) {
        Intent i = new Intent (this, SegundaActivity.class);
        startActivity(i);

        private static final String TAG = "ciclodevida";
        @Override
        protected void onCreate (Bundle SavedInstanceState){
            super.onCreate(SavedInstanceState);
            setContentView(R.layout.activity_main);
            log.i(TAG, "MainActivity.onCreate");
        }

        @Override
        protected void onStart () {
            super.onStart();
            Log.i(TAG, "MainActivity.onStart");
        }

        @Override
        protected void onResume () {
            super.onResume();
            Log.i(TAG, ",MainActivity.onResume");
        }

        @Override
        protected void onPause () {
            super.onPause();
            Log.i(TAG, "MainActivity.onPause");
        }

        @Override
        protected void onStop () {
            super.onStop();
            Log.i(TAG, "MainActivity.onStop");
        }

        @Override
        protected void onDestroy () {
            super.onDestroy();
            Log.i(TAG, "MainActivity.onSDestroy");
        }

        @Override
        protected void onRestart () {
            super.onRestart();
            Log.i(TAG, "MainActivity.onRestart");
        }
    }
}
