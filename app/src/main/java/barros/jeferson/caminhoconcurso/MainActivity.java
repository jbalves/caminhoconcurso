package barros.jeferson.caminhoconcurso;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.oceanbrasil.libocean.control.http.Request;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.ObjectStreamException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void openPlanejar(View view) {
        Intent intent = new Intent(this, PlanejarActivity.class);
        startActivity(intent);
    }

    public void openDisciplina(View view) {
        Intent intent = new Intent(this, DisciplinaActivity.class);
        startActivity(intent);
    }

    public void openTempo(View view) {
        Intent intent = new Intent(this, TempoActivity.class);
        startActivity(intent);
    }

    public void openTreinar(View view) {
        Intent intent = new Intent(this, TreinarActivity.class);
        startActivity(intent);
    }

    public void openObjetivos(View view) {
        Intent intent = new Intent(this, ObjetivosAcitivity.class);
        startActivity(intent);
    }

}
