package com.davronxolboyev.app.davlatnitop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Poytaxt extends AppCompatActivity {

    TextView countryname;
    RadioButton quiz1;
    RadioButton quiz2;
    RadioButton quiz3;
    RadioButton quiz4;
    ImageView backimage;
    int count = 0;
    List<PoytaxtSnif> poytaxtList = new ArrayList<>();

    SoundPool sp;
    int correct;
    int incorrect;
    int winner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poytaxt);

        sp = new SoundPool(2, AudioManager.STREAM_MUSIC,0);
        correct = sp.load(this,R.raw.correctanswersound,1);
        incorrect = sp.load(this,R.raw.wronganswersound,1);
        winner = sp.load(this,R.raw.winnersound,1);
        listener();

        CapitalsList();

        Poytaxtsetimage(count);

        ImagesClick();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(getApplicationContext(),MainActivity.class));
    }

    private void Poytaxtsetimage(int count) {
        if (count>19){

            play(winner);

            Toast.makeText(
                    Poytaxt.this,
                    "Tabriklayman. O`yin tugadi...",
                    Toast.LENGTH_LONG
            ).show();

            Intent intent = new Intent(Poytaxt.this,MainActivity.class);
            startActivity(intent);

            Poytaxt.this.finish();
        }else {
            Falsebutton();
            countryname.setText(poytaxtList.get(count).getName());
            backimage.setImageResource(poytaxtList.get(count).getImage());
            quiz1.setText(poytaxtList.get(count).getQuiz1());
            quiz2.setText(poytaxtList.get(count).getQuiz2());
            quiz3.setText(poytaxtList.get(count).getQuiz3());
            quiz4.setText(poytaxtList.get(count).getQuiz4());
        }
    }

    public  void Falsebutton(){
        quiz1.setChecked(false);
        quiz2.setChecked(false);
        quiz3.setChecked(false);
        quiz4.setChecked(false);
    }

    private void ImagesClick() {
        quiz1.setOnClickListener(v -> {
            quiz1.setChecked(true);
            quiz2.setChecked(false);
            quiz3.setChecked(false);
            quiz4.setChecked(false);
            if (count==5 || count==3 || count==15){
                play(correct);
                Poytaxtsetimage(++count);
            }else {
                play(incorrect);
            }

        });

        quiz2.setOnClickListener(v -> {
            quiz1.setChecked(false);
            quiz2.setChecked(true);
            quiz3.setChecked(false);
            quiz4.setChecked(false);
            if (count==9 || count==1 || count==6 || count==13 || count==16){
                play(correct);
                Poytaxtsetimage(++count);
            }else {
                play(incorrect);
            }

        });

        quiz3.setOnClickListener(v -> {
            quiz1.setChecked(false);
            quiz2.setChecked(false);
            quiz3.setChecked(true);
            quiz4.setChecked(false);
            if (count==0 || count==7 || count==10 || count==4 || count==18 || count==19 || count==14){
                play(correct);
                Poytaxtsetimage(++count);
            }else {
                play(incorrect);
            }

        });


        quiz4.setOnClickListener(v -> {
            quiz1.setChecked(false);
            quiz2.setChecked(false);
            quiz3.setChecked(false);
            quiz4.setChecked(true);
            if (count==8 || count==2 || count==11 || count==12 || count==17){
                play(correct);
                Poytaxtsetimage(++count);
            }else {
                play(incorrect);
            }

        });

    }

    private void CapitalsList() {

        poytaxtList.add(new PoytaxtSnif(
                "Saudi Arabia","Dubai","Madrid","Riyadh","Dehli"
                ,R.drawable.riyadh
        ));

        poytaxtList.add(new PoytaxtSnif(
                "Japan","Seoul","Tokyo","Warsaw","Berlin"
                ,R.drawable.tokyo
        ));
        poytaxtList.add(new PoytaxtSnif(
                "France","Madrid","Buenos Ayres","London","Paris"
                ,R.drawable.paris
        ));
        poytaxtList.add(new PoytaxtSnif(
                "Uzbekistan","Tashkent","Dushanbe","Samarqand","Beijing"
                ,R.drawable.tashkent
        ));
        poytaxtList.add(new PoytaxtSnif(
                "India","Bollywood","London","Dehli","Bishkek"
                ,R.drawable.dehli
        ));


        poytaxtList.add(new PoytaxtSnif(
                "Brasil","Brasil","Rio de Janerio","Amazon","Zagreb"
                ,R.drawable.brasil
        ));

        poytaxtList.add(new PoytaxtSnif(
                "Russia","Kiev","Moscow","Bern","Ashgabat"
                ,R.drawable.moscow
        ));
        poytaxtList.add(new PoytaxtSnif(
                "China","Seoul","Buenos Ayres","Beijing","Tehran"
                ,R.drawable.beijing
        ));
        poytaxtList.add(new PoytaxtSnif(
                "Croatia","Croatia","London","Paris","Zagreb"
                ,R.drawable.zagreb
        ));
        poytaxtList.add(new PoytaxtSnif(
                "Argentina","Paris","Buenos Ayres","Rome","Dubai"
                ,R.drawable.buenos_aires
        ));


        poytaxtList.add(new PoytaxtSnif(
                "Germany","Lyuksemburg","Madrid","Berlin","Rome"
                ,R.drawable.berlin
        ));

        poytaxtList.add(new PoytaxtSnif(
                "Iran","Nursultan","Tel Aviv","Warsaw","Tehran"
                ,R.drawable.tehran
        ));
        poytaxtList.add(new PoytaxtSnif(
                "Poland","Madrid","Tokyo","Bern","Warsaw"
                ,R.drawable.warsaw
        ));
        poytaxtList.add(new PoytaxtSnif(
                "Tajikistan","Tashkent","Dushanbe","Kobul","Tehran"
                ,R.drawable.dushanbe
        ));
        poytaxtList.add(new PoytaxtSnif(
                "United Kingdom","Bollywood","Oksford","London","New York"
                ,R.drawable.london
        ));


        poytaxtList.add(new PoytaxtSnif(
                "Urugvay","Montevideo","Amazon","Berlin","Rome"
                ,R.drawable.montevideo
        ));

        poytaxtList.add(new PoytaxtSnif(
                "Turkmenistan","Nursultan","Ashgabat","Dushanbe","Tehran"
                ,R.drawable.ashgabat
        ));
        poytaxtList.add(new PoytaxtSnif(
                "Spain","Barcelona","Singapur","Bern","Madrid"
                ,R.drawable.madrid
        ));
        poytaxtList.add(new PoytaxtSnif(
                "Switzerland","Berlin","Switzerland","Bern","Kiev"
                ,R.drawable.bern
        ));
        poytaxtList.add(new PoytaxtSnif(
                "South Korea","Hollywood","Tokyo","Seoul","New York"
                ,R.drawable.seoul
        ));

    }

    private void listener() {
        countryname = findViewById(R.id.countryName);
        quiz1 = findViewById(R.id.radiBtn1);
        quiz2 = findViewById(R.id.radiBtn2);
        quiz3 = findViewById(R.id.radiBtn3);
        quiz4 = findViewById(R.id.radiBtn4);
        backimage = findViewById(R.id.capitalImage);
    }

    public void play(int soundID){
        sp.play(soundID,1,1,0,0,1);
    }
}