package com.samy.testeur.aideauxdevoirs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class QuizCrea extends AppCompatActivity {
    Button retour;
    EditText titrequiz;
    EditText nombrequestions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_crea);

        //bouton de retour sur le menu principal
        this.retour = (Button) findViewById(R.id.retour);
        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menu = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(menu);
                finish();
            }

            //bouton sauvegarde
        });

        //code pour permettre à l'utilisateur de créer les quiz ici

        //affectation du titre au quiz

        this.titrequiz = (EditText) findViewById(R.id.titrequiz);
        TextWatcher tw = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        };

        titrequiz.addTextChangedListener(tw);
        String tq = titrequiz.getText().toString();

        //initialisation du nombre de questions
        this.nombrequestions = (EditText) findViewById(R.id.nombrequestions);
        TextWatcher tw2 = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        };
        // nombrequestions.addTextChangedListener(tw2);
        String nbq = nombrequestions.getText().toString();
       // int nb = int.valueOf(nbq);

        //ici, créer "nombrequestions" questions en appelant le contrsucteur de la classe Question autant de fois que nécessaire
      //  for (int i=1; i<=nb; i++){
       //     this.Question(tq, ,);

        }

    }
//}