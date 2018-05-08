package com.samy.testeur.aideauxdevoirs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FicheTitre extends AppCompatActivity {
    Button fichecreation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiche_titre);

        //passer à l'ecran de création de la fiche
        this.fichecreation = (Button) findViewById(R.id.fiche);
        fichecreation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent creafiche = new Intent(getApplicationContext(),FicheCrea.class);
                startActivity(creafiche); //créée une nouvelle activité afin de créer la fiche
                finish();
            }
        });
    }
}
