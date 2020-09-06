package mx.com.cesarangel10.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int puntosequipoA = 0;
    int puntosequipoB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void UnoparaelEquipoA (View v){
       puntosequipoA = puntosequipoA + 1;
       displayforTeamA(puntosequipoA);
    }

    public void DosparaelEquipoA (View v) {
        puntosequipoA = puntosequipoA + 2;
        displayforTeamA(puntosequipoA);
    }

    public void TresparaelEquipoA (View v){
        puntosequipoA = puntosequipoA + 3;
        displayforTeamA(puntosequipoA);
    }

    public void UnoparaelEquipoB (View v) {
        puntosequipoB = puntosequipoB + 1;
        displayforTeamB(puntosequipoB);
    }

    public void DosparaelEquipoB (View v) {
        puntosequipoB = puntosequipoB + 2;
        displayforTeamB(puntosequipoB);
    }

    public void TresparaelEquipoB (View v){
        puntosequipoB = puntosequipoB + 3;
        displayforTeamB(puntosequipoB);
    }

    public void RestablecerPuntuaje (View v){
        puntosequipoA = 0;
        puntosequipoB = 0;
        displayforTeamA(puntosequipoA);
        displayforTeamB(puntosequipoB);
    }

    public void displayforTeamA (int punto){
        TextView puntoView = (TextView) findViewById(R.id.equipo_a_puntos);
        puntoView.setText(String.valueOf(punto));
    }

    public void displayforTeamB (int punto){
        TextView puntoView = (TextView) findViewById(R.id.equipo_b_puntos);
        puntoView.setText(String.valueOf(punto));
    }
}