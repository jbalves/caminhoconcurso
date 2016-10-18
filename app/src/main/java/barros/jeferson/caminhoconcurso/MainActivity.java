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

public class MainActivity extends AppCompatActivity implements Request.RequestListener {

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

    @Override
    public void onRequestOk(String resposta, JSONObject jsonObject, int code) {
        if (code == Request.NENHUM_ERROR) {
            Log.d("Debug","resposta: " + resposta);

            if (resposta !=null) {
                try {

                    JSONObject object = new JSONObject(resposta);

                    JSONArray concursos = object.getJSONArray("concursos");

                    for (int i = 0; i < concursos.length(); i++) {

                        JSONObject concurso = concursos.getJSONObject(i);
                        String orgao = concurso.getString("orgao");
                        String estado = concurso.getString("estado");
                        String ano = concurso.getString("ano");
                        String banca = concurso.getString("banca");

                        JSONArray livros = item.getJSONArray("livros");
                        for (int j=0; j<livros.length();j++){
                    }

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
