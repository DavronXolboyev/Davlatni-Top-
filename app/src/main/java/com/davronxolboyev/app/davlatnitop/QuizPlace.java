package com.davronxolboyev.app.davlatnitop;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class QuizPlace extends AppCompatActivity {

    int n;
    List<BayroqSnif> bayroqlist = new ArrayList<>();
    List<GerbSnif> gerblist = new ArrayList<>();
    TextView name;
    ImageView image1;
    ImageView image2;
    ImageView image3;
    ImageView image4;
    ImageView backgraund;
    int count = 0;
    int countgerb = 0;

    SoundPool sp;
    int correct;
    int incorrect;
    int winner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_place);


        sp = new SoundPool(2, AudioManager.STREAM_MUSIC,0);
        correct = sp.load(this,R.raw.correctanswersound,1);
        incorrect = sp.load(this,R.raw.wronganswersound,1);
        winner = sp.load(this,R.raw.winnersound,1);
        listener();

        Intent intent = getIntent();
        n = intent.getExtras().getInt("key");
        switch (n){
            case 1 :{

                backgraund.setImageResource(R.drawable.bayroq);

                Bayroq();

                Bayroqtartib(count);

                ButtonsClickbayroq();

                break;
            }
            case 2 : {

                backgraund.setImageResource(R.drawable.gerbimage);

                Gerb();

                Gerbtartib(countgerb);

                ButtonsClickgerb();

                break;
            }
        }


    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(getApplicationContext(),MainActivity.class));
    }

    private void listener() {
        name = findViewById(R.id.countryname);
        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);
        image3 = findViewById(R.id.image3);
        image4 = findViewById(R.id.image4);
        backgraund = findViewById(R.id.back);
    }


    private void Gerb() {
        // 0 - index
        gerblist.add(new GerbSnif(
                "Russia",
                R.drawable.argentinagerb,
                R.drawable.russiagerb,
                R.drawable.francegerb,
                R.drawable.brazilgerb
        ));
        // 1 - index
        gerblist.add(new GerbSnif(
                "Uzbekistan",
                R.drawable.uzbekistangerb,
                R.drawable.tajikistangerb,
                R.drawable.unitedkingdomgerb,
                R.drawable.germanygerb
        ));
        // 2 - index
        gerblist.add(new GerbSnif(
                "Argentina",
                R.drawable.argentinagerb,
                R.drawable.turkmenistangerb,
                R.drawable.urugvaygerb,
                R.drawable.switzerlandgerb
        ));
        // 3 - index
        gerblist.add(new GerbSnif(
                "Japan",
                R.drawable.chinagerb,
                R.drawable.croatiagerb,
                R.drawable.japangerb,
                R.drawable.polandgerb
        ));
        // 4 - index
        gerblist.add(new GerbSnif(
                "Croatia",
                R.drawable.saudiarabiagerb,
                R.drawable.southkoreagerb,
                R.drawable.spaingerb,
                R.drawable.croatiagerb
        ));
        // 5 - index
        gerblist.add(new GerbSnif(
                "India",
                R.drawable.irangerb,
                R.drawable.polandgerb,
                R.drawable.indiagerb,
                R.drawable.tajikistangerb
        ));

        // 6 - index
        gerblist.add(new GerbSnif(
                "China",
                R.drawable.irangerb,
                R.drawable.chinagerb,
                R.drawable.switzerlandgerb,
                R.drawable.southkoreagerb
        ));
        // 7 - index
        gerblist.add(new GerbSnif(
                "Iran",
                R.drawable.tajikistangerb,
                R.drawable.russiagerb,
                R.drawable.irangerb,
                R.drawable.indiagerb
        ));
        // 8 - index
        gerblist.add(new GerbSnif(
                "Urugvay",
                R.drawable.argentinagerb,
                R.drawable.urugvaygerb,
                R.drawable.unitedkingdomgerb,
                R.drawable.croatiagerb
        ));
        // 9 - index
        gerblist.add(new GerbSnif(
                "Germany",
                R.drawable.germanygerb,
                R.drawable.polandgerb,
                R.drawable.unitedkingdomgerb,
                R.drawable.russiagerb
        ));
        // 10 - index
        gerblist.add(new GerbSnif(
                "United Kingdom",
                R.drawable.russiagerb,
                R.drawable.unitedkingdomgerb,
                R.drawable.francegerb,
                R.drawable.spaingerb
        ));
        // 11 - index
        gerblist.add(new GerbSnif(
                "France",
                R.drawable.argentinagerb,
                R.drawable.russiagerb,
                R.drawable.francegerb,
                R.drawable.brazilgerb
        ));
        // 12 - index
        gerblist.add(new GerbSnif(
                "Switzerland",
                R.drawable.urugvaygerb,
                R.drawable.polandgerb,
                R.drawable.switzerlandgerb,
                R.drawable.croatiagerb
        ));
        // 13 - index
        gerblist.add(new GerbSnif(
                "Turkmenistan",
                R.drawable.uzbekistangerb,
                R.drawable.turkmenistangerb,
                R.drawable.tajikistangerb,
                R.drawable.saudiarabiagerb
        ));

        // 14 - index
        gerblist.add(new GerbSnif(
                "Brazil",
                R.drawable.argentinagerb,
                R.drawable.urugvaygerb,
                R.drawable.unitedkingdomgerb,
                R.drawable.brazilgerb
        ));
        // 15 - index
        gerblist.add(new GerbSnif(
                "Saudi Arabia",
                R.drawable.irangerb,
                R.drawable.uzbekistangerb,
                R.drawable.saudiarabiagerb,
                R.drawable.spaingerb
        ));
        // 16 - index
        gerblist.add(new GerbSnif(
                "Poland",
                R.drawable.switzerlandgerb,
                R.drawable.saudiarabiagerb,
                R.drawable.spaingerb,
                R.drawable.polandgerb
        ));
        // 17 - index
        gerblist.add(new GerbSnif(
                "Tadjikistan",
                R.drawable.tajikistangerb,
                R.drawable.chinagerb,
                R.drawable.croatiagerb,
                R.drawable.francegerb
        ));
        // 18 - index
        gerblist.add(new GerbSnif(
                "Spain",
                R.drawable.switzerlandgerb,
                R.drawable.germanygerb,
                R.drawable.francegerb,
                R.drawable.spaingerb
        ));
        // 19 - index
        gerblist.add(new GerbSnif(
                "South Korea",
                R.drawable.japangerb,
                R.drawable.southkoreagerb,
                R.drawable.chinagerb,
                R.drawable.germanygerb
        ));
    }

    private void Gerbtartib(int i){
        if (i>19){
            play(winner);
            Toast.makeText(
                    QuizPlace.this,
                    "Tabriklayman. O`yin tugadi...",
                    Toast.LENGTH_LONG
            ).show();

            Intent intent = new Intent(QuizPlace.this,MainActivity.class);
            startActivity(intent);
            QuizPlace.this.finish();
        }else {
            name.setText(gerblist.get(i).getName());
            image1.setImageResource(gerblist.get(i).getImage1());
            image2.setImageResource(gerblist.get(i).getImage2());
            image3.setImageResource(gerblist.get(i).getImage3());
            image4.setImageResource(gerblist.get(i).getImage4());
        }
    }

    private void ButtonsClickgerb(){
        image1.setOnClickListener(v -> {
            if (countgerb==1 || countgerb==2 || countgerb==9 || countgerb==17){
                play(correct);
                Gerbtartib(++countgerb);
            }else {
               play(incorrect);
                Toast.makeText(
                        QuizPlace.this,
                        "Nahotki bilmasang ...",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });

        image2.setOnClickListener(v -> {
            if (countgerb==0 || countgerb==6 || countgerb==13 || countgerb==8 || countgerb==10 || countgerb==19){
                play(correct);
                Gerbtartib(++countgerb);
            }else {
               play(incorrect);
                Toast.makeText(
                        QuizPlace.this,
                        "Nahotki bilmasang ...",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });

        image3.setOnClickListener(v -> {
            if (countgerb==3 || countgerb==5 || countgerb==7 || countgerb==11 || countgerb==12 || countgerb==15){
                play(correct);
                Gerbtartib(++countgerb);
            }else {
               play(incorrect);
                Toast.makeText(
                        QuizPlace.this,
                        "Nahotki bilmasang ...",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });

        image4.setOnClickListener(v -> {
            if (countgerb==4 || countgerb==14 || countgerb==16 || countgerb==18){
                play(correct);
                Gerbtartib(++countgerb);
            }else {
               play(incorrect);
                Toast.makeText(
                        QuizPlace.this,
                        "Nahotki bilmasang ...",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });
    }



    private void Bayroq() {
        // 0 - index
        bayroqlist.add(new BayroqSnif(
                "Russia",
                R.drawable.argentina,
                R.drawable.russia,
                R.drawable.france,
                R.drawable.brazil
        ));
        // 1 - index
        bayroqlist.add(new BayroqSnif(
                "India",
                R.drawable.iran,
                R.drawable.poland,
                R.drawable.india,
                R.drawable.tajikistan
        ));
        // 2 - index
        bayroqlist.add(new BayroqSnif(
                "Argentina",
                R.drawable.argentina,
                R.drawable.turkmenistan,
                R.drawable.urugvay,
                R.drawable.switzerland
        ));
        // 3 - index
        bayroqlist.add(new BayroqSnif(
                "Japan",
                R.drawable.china,
                R.drawable.croatia,
                R.drawable.japan,
                R.drawable.poland
        ));
        // 4 - index
        bayroqlist.add(new BayroqSnif(
                "Croatia",
                R.drawable.saudiarabia,
                R.drawable.southkorea,
                R.drawable.spain,
                R.drawable.croatia
        ));
        // 5 - index
        bayroqlist.add(new BayroqSnif(
                "Uzbekistan",
                R.drawable.uzbekistan,
                R.drawable.tajikistan,
                R.drawable.unitedkingdom,
                R.drawable.germany
        ));
        // 6 - index
        bayroqlist.add(new BayroqSnif(
                "China",
                R.drawable.iran,
                R.drawable.china,
                R.drawable.switzerland,
                R.drawable.southkorea
        ));
        // 7 - index
        bayroqlist.add(new BayroqSnif(
                "Turkmenistan",
                R.drawable.uzbekistan,
                R.drawable.turkmenistan,
                R.drawable.tajikistan,
                R.drawable.saudiarabia
        ));
        // 8 - index
        bayroqlist.add(new BayroqSnif(
                "Urugvay",
                R.drawable.argentina,
                R.drawable.urugvay,
                R.drawable.unitedkingdom,
                R.drawable.croatia
        ));
        // 9 - index
        bayroqlist.add(new BayroqSnif(
                "Germany",
                R.drawable.germany,
                R.drawable.poland,
                R.drawable.unitedkingdom,
                R.drawable.russia
        ));
        // 10 - index
        bayroqlist.add(new BayroqSnif(
                "Saudi Arabia",
                R.drawable.iran,
                R.drawable.uzbekistan,
                R.drawable.saudiarabia,
                R.drawable.spain
        ));
        // 11 - index
        bayroqlist.add(new BayroqSnif(
                "Spain",
                R.drawable.switzerland,
                R.drawable.germany,
                R.drawable.france,
                R.drawable.spain
        ));
        // 12 - index
        bayroqlist.add(new BayroqSnif(
                "Switzerland",
                R.drawable.urugvay,
                R.drawable.poland,
                R.drawable.switzerland,
                R.drawable.croatia
        ));
        // 13 - index
        bayroqlist.add(new BayroqSnif(
                "Iran",
                R.drawable.tajikistan,
                R.drawable.russia,
                R.drawable.iran,
                R.drawable.india
        ));
        // 14 - index
        bayroqlist.add(new BayroqSnif(
                "South Korea",
                R.drawable.japan,
                R.drawable.southkorea,
                R.drawable.china,
                R.drawable.germany
        ));
        // 15 - index
        bayroqlist.add(new BayroqSnif(
                "United Kingdom",
                R.drawable.russia,
                R.drawable.unitedkingdom,
                R.drawable.france,
                R.drawable.spain
        ));
        // 16 - index
        bayroqlist.add(new BayroqSnif(
                "Poland",
                R.drawable.switzerland,
                R.drawable.saudiarabia,
                R.drawable.spain,
                R.drawable.poland
        ));
        // 17 - index
        bayroqlist.add(new BayroqSnif(
                "Tadjikistan",
                R.drawable.tajikistan,
                R.drawable.china,
                R.drawable.croatia,
                R.drawable.france
        ));
        // 18 - index
        bayroqlist.add(new BayroqSnif(
                "France",
                R.drawable.argentina,
                R.drawable.russia,
                R.drawable.france,
                R.drawable.brazil
        ));
        // 19 - index
        bayroqlist.add(new BayroqSnif(
                "Brazil",
                R.drawable.argentina,
                R.drawable.urugvay,
                R.drawable.unitedkingdom,
                R.drawable.brazil
        ));
    }

    private void Bayroqtartib(int i) {
        if (i>19){
            play(winner);
            Toast.makeText(
                    QuizPlace.this,
                    "Tabriklayman. O`yin tugadi...",
                    Toast.LENGTH_LONG
            ).show();

            Intent intent = new Intent(QuizPlace.this,MainActivity.class);
            startActivity(intent);
            QuizPlace.this.finish();
        }else {
            name.setText(bayroqlist.get(i).getName());
            image1.setImageResource(bayroqlist.get(i).getImage1());
            image2.setImageResource(bayroqlist.get(i).getImage2());
            image3.setImageResource(bayroqlist.get(i).getImage3());
            image4.setImageResource(bayroqlist.get(i).getImage4());
        }
    }

    private void ButtonsClickbayroq() {
        image1.setOnClickListener(v -> {
            if (count==2 || count==5 || count==9 || count==17){
                Bayroqtartib(++count);
                play(correct);
            }else {
               play(incorrect);
                Toast.makeText(
                        QuizPlace.this,
                        "Nahotki bilmasang ...",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });

        image2.setOnClickListener(v -> {
            if (count==0 || count==6 || count==7 || count==8 || count==14 || count==15){
                play(correct);
                Bayroqtartib(++count);
            }else {
               play(incorrect);
                Toast.makeText(
                        QuizPlace.this,
                        "Nahotki bilmasang ...",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });

        image3.setOnClickListener(v -> {
            if (count==1 || count==3 || count==10 || count==12 || count==13 || count==18){
                play(correct);
                Bayroqtartib(++count);
            }else {
               play(incorrect);
                Toast.makeText(
                        QuizPlace.this,
                        "Nahotki bilmasang ...",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });

        image4.setOnClickListener(v -> {
            if (count==4 || count==11 || count==16 || count==19){
                play(correct);
                    Bayroqtartib(++count);
            }else {
               play(incorrect);
                Toast.makeText(
                        QuizPlace.this,
                        "Nahotki bilmasang ...",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });
    }

    public void play(int soundID){
        sp.play(soundID,1,1,0,0,1);
    }
}