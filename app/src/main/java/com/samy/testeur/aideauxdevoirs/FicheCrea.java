package com.samy.testeur.aideauxdevoirs;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FicheCrea extends AppCompatActivity {
    Button retour;
    EditText edit;
    Button sauvegarde;
    File path = getApplicationContext().getFilesDir();
    EditText titre;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiche_crea);

        //bouton de retour sur le menu principal
        this.retour = (Button) findViewById(R.id.retour);
        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menu = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(menu);
                finish();
            }
        });

        //écriture dans un fichier
        this.titre = (EditText) findViewById(R.id.title);
        this.edit = (EditText) findViewById(R.id.contenu);
        File file = new File(path, titre.toString());
        FileOutputStream stream = new FileOutputStream(file);
        try {
            stream.write(edit.toString().getBytes());
        }
        } finally {
            stream.close();
        }

    }
}