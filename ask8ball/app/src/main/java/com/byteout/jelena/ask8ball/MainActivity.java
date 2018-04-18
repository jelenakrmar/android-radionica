package com.byteout.jelena.ask8ball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView answer; // TextView u koji ćemo upisivati odgovor.
    Button changeAnswer; // Dugme koje slući za promenu odgovora.
    String answersList[] = {"Ne", "Nikad", "Definitivno", "Da", "Verovatno", "Možda", "Nemam pojma"}; // Lista mogućih odgovora.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // Poziv roditeljske funkcije onCreate(), da bi se sve sve izvršilo kako treba.
        setContentView(R.layout.activity_main); // Povezivanje layout fajla sa kodom. Ovde upišemo naziv fajla u kome smo definisali vizuelni izgled aktivnosti.
        // Obično je ova linija već tu kad kreiramo praznu aktivnost, ako smo štiklirali "generate layout file" prilikom kreiranja aktivnosti.

        changeAnswer = findViewById(R.id.button); // Dohvatanje komponente (dugmeta) po njenom ID-u.
        answer = findViewById(R.id.answer); // Dohvatanje komponente (TextView-a) po njenom ID-u.

        /*

        Definisanje ponašanja - šta se dešava klikom na dugme. Uvek se piše na ovaj način:

        changeAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ---> OVDE IDE NAŠ KOD
            }
        });

        */

        changeAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int index = new Random().nextInt(answersList.length); // Dohvatanje nasumičnog (random) broja u Javi.
                // Ova funkcija vraća broj d 0 do answersList.length-1, što je u ovom slučaju 6
                answer.setText(answersList[index]); // Promena teksta u TextView-u.
            }
        });
    }
}
