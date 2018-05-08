package com.samy.testeur.aideauxdevoirs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Button fichecreation;
    Button quizjouer;
    Button ficheconsultation;
    Button quizcreation;
    Button intituler;
    Button inscription;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //changement d'écran lorsuqe l'on appuie sur le bouton creer une fiche
        /*this.fichecreation = (Button) findViewById(R.id.fiche);
        fichecreation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent creafiche = new Intent(getApplicationContext(),FicheCrea.class);
                startActivity(creafiche); //créée une nouvelle activité afin de créer la fiche
                finish();
            }
        });*/

        this.quizjouer = (Button) findViewById(R.id.playquiz);
        quizjouer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jouerquiz = new Intent(getApplicationContext(),QuizPlay.class);
                startActivity(jouerquiz);
                finish();
            }
        });

        this.ficheconsultation =(Button) findViewById(R.id.consultfiche);
        ficheconsultation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent consulter = new Intent(getApplicationContext(),FicheConsult.class);
                startActivity(consulter);
                finish();
            }
        });

        this.quizcreation = (Button) findViewById(R.id.quiz);
        quizcreation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent creequiz = new Intent(getApplicationContext(),QuizCrea.class);
                startActivity(creequiz);
                finish();
            }
        });

        this.intituler = (Button) findViewById(R.id.creafiche2);
        intituler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mettretitre = new Intent(getApplicationContext(),FicheTitre.class);
                startActivity(mettretitre);
                finish();
            }
        });

    this.inscription = (Button) findViewById(R.id.inscription);

        inscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent otherActivity = new Intent(getApplicationContext(), Inscription.class);
                startActivity(otherActivity);
                finish();
            }
        });
    }
}
