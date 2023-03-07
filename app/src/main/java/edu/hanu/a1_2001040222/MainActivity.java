package edu.hanu.a1_2001040222;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TableLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    protected MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get refs
        TableLayout hiraganaTable = findViewById(R.id.hiraganaTable);
        TableLayout katakanaTable = findViewById(R.id.katakanaTable);
        TextView titleHiragana = findViewById(R.id.titleHiragana);
        TextView titleKatakana = findViewById(R.id.titleKatakana);


        //TODO: get refs from button in Hiragana table to set sound
        ImageButton btnHiraganaA = findViewById(R.id.btnHiraganaA);
        ImageButton btnHiraganaI = findViewById(R.id.btnHiraganaI);
        ImageButton btnHiraganaE = findViewById(R.id.btnHiraganaE);
        ImageButton btnHiraganaU = findViewById(R.id.btnHiraganaU);
        ImageButton btnHiraganaO = findViewById(R.id.btnHiraganaO);
        ImageButton btnHiraganaKa = findViewById(R.id.btnHiraganaKa);
        ImageButton btnHiraganaKi = findViewById(R.id.btnHiraganaKi);
        ImageButton btnHiraganaKu = findViewById(R.id.btnHiraganaKu);
        ImageButton btnHiraganaKe = findViewById(R.id.btnHiraganaKe);
        ImageButton btnHiraganaKo = findViewById(R.id.btnHiraganaKo);
        ImageButton btnHiraganaSa = findViewById(R.id.btnHiraganaSa);
        ImageButton btnHiraganaSu = findViewById(R.id.btnHiraganaSu);
        ImageButton btnHiraganaSe = findViewById(R.id.btnHiraganaSe);
        ImageButton btnHiraganaSo = findViewById(R.id.btnHiraganaSo);
        ImageButton btnHiraganaTa = findViewById(R.id.btnHiraganaTa);
        ImageButton btnHiraganaShi = findViewById(R.id.btnHiraganaShi);
        ImageButton btnHiraganaTsu = findViewById(R.id.btnHiraganaTsu);
        ImageButton btnHiraganaTe = findViewById(R.id.btnHiraganaTe);
        ImageButton btnHiraganaTo = findViewById(R.id.btnHiraganaTo);
        ImageButton btnHiraganaNa = findViewById(R.id.btnHiraganaNa);
        ImageButton btnHiraganaNi = findViewById(R.id.btnHiraganaNi);
        ImageButton btnHiraganaNu = findViewById(R.id.btnHiraganaNu);
        ImageButton btnHiraganaNe = findViewById(R.id.btnHiraganaNe);
        ImageButton btnHiraganaNo = findViewById(R.id.btnHiraganaNo);
        ImageButton btnHiraganaHo = findViewById(R.id.btnHiraganaHo);
        ImageButton btnHiraganaFu = findViewById(R.id.btnHiraganaFu);
        ImageButton btnHiraganaHa = findViewById(R.id.btnHiraganaHa);
        ImageButton btnHiraganaHe = findViewById(R.id.btnHiraganaHe);
        ImageButton btnHiraganaHi = findViewById(R.id.btnHiraganaHi);
        ImageButton btnHiraganaMa = findViewById(R.id.btnHiraganaMa);
        ImageButton btnHiraganaMi = findViewById(R.id.btnHiraganaMi);
        ImageButton btnHiraganaMu = findViewById(R.id.btnHiraganaMu);
        ImageButton btnHiraganaMe = findViewById(R.id.btnHiraganaMe);
        ImageButton btnHiraganaMo = findViewById(R.id.btnHiraganaMo);
        ImageButton btnHiraganaYa = findViewById(R.id.btnHiraganaYa);
        ImageButton btnHiraganaYu = findViewById(R.id.btnHiraganaYu);
        ImageButton btnHiraganaYo = findViewById(R.id.btnHiraganaYo);
        ImageButton btnHiraganaRa = findViewById(R.id.btnHiraganaRa);
        ImageButton btnHiraganaRi = findViewById(R.id.btnHiraganaRi);
        ImageButton btnHiraganaRu = findViewById(R.id.btnHiraganaRu);
        ImageButton btnHiraganaRe = findViewById(R.id.btnHiraganaRe);
        ImageButton btnHiraganaRo = findViewById(R.id.btnHiraganaRo);
        ImageButton btnHiraganaWa = findViewById(R.id.btnHiraganaWa);
        ImageButton btnHiraganaWo = findViewById(R.id.btnHiraganaWo);
        ImageButton btnHiraganaN = findViewById(R.id.btnHiraganaN);
        ImageButton btnHiraganaChi = findViewById(R.id.btnHiraganaChi);


        //TODO: get refs from button in Katakana table to set sound
        ImageButton btnKatakanaE = findViewById(R.id.btnKatakanaE);
        ImageButton btnKatakanaU = findViewById(R.id.btnKatakanaU);
        //click for Wo
        ImageButton btnKatakanaO = findViewById(R.id.btnKatakanaO);
        ImageButton btnKatakanaKa = findViewById(R.id.btnKatakanaKa);
        ImageButton btnKatakanaKi = findViewById(R.id.btnKatakanaKi);
        ImageButton btnKatakanaKu = findViewById(R.id.btnKatakanaKu);
        ImageButton btnKatakanaKe = findViewById(R.id.btnKatakanaKe);
        ImageButton btnKatakanaKo = findViewById(R.id.btnKatakanaKo);
        ImageButton btnKatakanaSa = findViewById(R.id.btnKatakanaSa);
        ImageButton btnKatakanaSu = findViewById(R.id.btnKatakanaSu);
        ImageButton btnKatakanaSe = findViewById(R.id.btnKatakanaSe);
        ImageButton btnKatakanaSo = findViewById(R.id.btnKatakanaSo);
        ImageButton btnKatakanaTa = findViewById(R.id.btnKatakanaTa);
        ImageButton btnKatakanaShi = findViewById(R.id.btnKatakanaShi);
        ImageButton btnKatakanaTsu = findViewById(R.id.btnKatakanaTsu);
        ImageButton btnKatakanaTe = findViewById(R.id.btnKatakanaTe);
        ImageButton btnKatakanaTo = findViewById(R.id.btnKatakanaTo);
        ImageButton btnKatakanaNa = findViewById(R.id.btnKatakanaNa);
        ImageButton btnKatakanaNi = findViewById(R.id.btnKatakanaNi);
        ImageButton btnKatakanaNu = findViewById(R.id.btnKatakanaNu);
        ImageButton btnKatakanaNe = findViewById(R.id.btnKatakanaNe);
        ImageButton btnKatakanaNo = findViewById(R.id.btnKatakanaNo);
        ImageButton btnKatakanaHo = findViewById(R.id.btnKatakanaHo);
        ImageButton btnKatakanaFu = findViewById(R.id.btnKatakanaFu);
        ImageButton btnKatakanaHa = findViewById(R.id.btnKatakanaHa);
        ImageButton btnKatakanaHe = findViewById(R.id.btnKatakanaHe);
        ImageButton btnKatakanaHi = findViewById(R.id.btnKatakanaHi);
        ImageButton btnKatakanaMa = findViewById(R.id.btnKatakanaMa);
        ImageButton btnKatakanaMi = findViewById(R.id.btnKatakanaMi);
        ImageButton btnKatakanaMu = findViewById(R.id.btnKatakanaMu);
        ImageButton btnKatakanaMe = findViewById(R.id.btnKatakanaMe);
        ImageButton btnKatakanaMo = findViewById(R.id.btnKatakanaMo);
        ImageButton btnKatakanaYa = findViewById(R.id.btnKatakanaYa);
        ImageButton btnKatakanaYu = findViewById(R.id.btnKatakanaYu);
        ImageButton btnKatakanaYo = findViewById(R.id.btnKatakanaYo);
        ImageButton btnKatakanaRa = findViewById(R.id.btnKatakanaRa);
        ImageButton btnKatakanaRi = findViewById(R.id.btnKatakanaRi);
        ImageButton btnKatakanaRu = findViewById(R.id.btnKatakanaRu);
        ImageButton btnKatakanaRe = findViewById(R.id.btnKatakanaRe);
        ImageButton btnKatakanaRo = findViewById(R.id.btnKatakanaRo);
        ImageButton btnKatakanaWa = findViewById(R.id.btnKatakanaWa);
        ImageButton btnKatakanaN = findViewById(R.id.btnKatakanaN);
        ImageButton btnKatakanaWo = findViewById(R.id.btnKatakanaWo);
        ImageButton btnKatakanaA = findViewById(R.id.btnKatakanaA);
        ImageButton btnKatakanaI = findViewById(R.id.btnKatakanaI);
        ImageButton btnKatakanaChi = findViewById(R.id.btnKatakanaChi);

        btnHiraganaA.setOnClickListener(this);
        btnKatakanaA.setOnClickListener(this);

        btnHiraganaI.setOnClickListener(this);
        btnKatakanaI.setOnClickListener(this);

        btnHiraganaU.setOnClickListener(this);
        btnKatakanaU.setOnClickListener(this);

        btnHiraganaE.setOnClickListener(this);
        btnKatakanaE.setOnClickListener(this);

        btnHiraganaO.setOnClickListener(this);
        btnKatakanaO.setOnClickListener(this);

        btnHiraganaKa.setOnClickListener(this);
        btnKatakanaKa.setOnClickListener(this);

        btnHiraganaKi.setOnClickListener(this);
        btnKatakanaKi.setOnClickListener(this);

        btnHiraganaKu.setOnClickListener(this);
        btnKatakanaKu.setOnClickListener(this);

        btnHiraganaKe.setOnClickListener(this);
        btnKatakanaKe.setOnClickListener(this);

        btnHiraganaKo.setOnClickListener(this);
        btnKatakanaKo.setOnClickListener(this);

        btnHiraganaSa.setOnClickListener(this);
        btnKatakanaSa.setOnClickListener(this);

        btnHiraganaShi.setOnClickListener(this);
        btnKatakanaShi.setOnClickListener(this);

        btnHiraganaSu.setOnClickListener(this);
        btnKatakanaSu.setOnClickListener(this);

        btnHiraganaSe.setOnClickListener(this);
        btnKatakanaSe.setOnClickListener(this);

        btnHiraganaSo.setOnClickListener(this);
        btnKatakanaSo.setOnClickListener(this);

        btnHiraganaTa.setOnClickListener(this);
        btnKatakanaTa.setOnClickListener(this);

        btnHiraganaChi.setOnClickListener(this);
        btnKatakanaChi.setOnClickListener(this);

        btnHiraganaTsu.setOnClickListener(this);
        btnKatakanaTsu.setOnClickListener(this);

        btnHiraganaTe.setOnClickListener(this);
        btnKatakanaTe.setOnClickListener(this);

        btnHiraganaTo.setOnClickListener(this);
        btnKatakanaTo.setOnClickListener(this);

        btnHiraganaNa.setOnClickListener(this);
        btnKatakanaNa.setOnClickListener(this);

        btnHiraganaNi.setOnClickListener(this);
        btnKatakanaNi.setOnClickListener(this);

        btnHiraganaNu.setOnClickListener(this);
        btnKatakanaNu.setOnClickListener(this);

        btnHiraganaNe.setOnClickListener(this);
        btnKatakanaNe.setOnClickListener(this);

        btnHiraganaNo.setOnClickListener(this);
        btnKatakanaNo.setOnClickListener(this);

        btnHiraganaHa.setOnClickListener(this);
        btnKatakanaHa.setOnClickListener(this);

        btnHiraganaHi.setOnClickListener(this);
        btnKatakanaHi.setOnClickListener(this);

        btnHiraganaFu.setOnClickListener(this);
        btnKatakanaFu.setOnClickListener(this);

        btnHiraganaHe.setOnClickListener(this);
        btnKatakanaHe.setOnClickListener(this);

        btnHiraganaHo.setOnClickListener(this);
        btnKatakanaHo.setOnClickListener(this);

        btnHiraganaMa.setOnClickListener(this);
        btnKatakanaMa.setOnClickListener(this);

        btnHiraganaMi.setOnClickListener(this);
        btnKatakanaMi.setOnClickListener(this);

        btnHiraganaMu.setOnClickListener(this);
        btnKatakanaMu.setOnClickListener(this);

        btnHiraganaMe.setOnClickListener(this);
        btnKatakanaMe.setOnClickListener(this);

        btnHiraganaMo.setOnClickListener(this);
        btnKatakanaMo.setOnClickListener(this);

        btnHiraganaYa.setOnClickListener(this);
        btnKatakanaYa.setOnClickListener(this);

        btnHiraganaYu.setOnClickListener(this);
        btnKatakanaYu.setOnClickListener(this);

        btnHiraganaYo.setOnClickListener(this);
        btnKatakanaYo.setOnClickListener(this);

        btnHiraganaRa.setOnClickListener(this);
        btnKatakanaRa.setOnClickListener(this);

        btnHiraganaRi.setOnClickListener(this);
        btnKatakanaRi.setOnClickListener(this);

        btnHiraganaRu.setOnClickListener(this);
        btnKatakanaRu.setOnClickListener(this);

        btnHiraganaRe.setOnClickListener(this);
        btnKatakanaRe.setOnClickListener(this);

        btnHiraganaRo.setOnClickListener(this);
        btnKatakanaRo.setOnClickListener(this);

        btnHiraganaWa.setOnClickListener(this);
        btnKatakanaWa.setOnClickListener(this);

        btnHiraganaWo.setOnClickListener(this);
        btnKatakanaWo.setOnClickListener(this);

        btnHiraganaN.setOnClickListener(this);
        btnKatakanaN.setOnClickListener(this);

        SwitchCompat switchCompat = findViewById(R.id.sw);

        switchCompat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (switchCompat.isChecked()) {
                    katakanaTable.animate().alpha(1).setDuration(1000);
                    titleKatakana.animate().alpha(1).setDuration(1000);

                    hiraganaTable.animate().alpha(0).setDuration(1000);
                    titleHiragana.animate().alpha(0).setDuration(1000);
                } else {
                    hiraganaTable.animate().alpha(1).setDuration(1000);
                    titleHiragana.animate().alpha(1).setDuration(1000);

                    katakanaTable.animate().alpha(0).setDuration(1000);
                    titleKatakana.animate().alpha(0).setDuration(1000);
                }
            }
        });
    }

    @Override
    public void onClick(View view) {
        final ArrayList<Integer> playlist;
        playlist = new ArrayList<>();
        playlist.add(R.raw.h_a);
        playlist.add(R.raw.h_i);
        playlist.add(R.raw.h_u);
        playlist.add(R.raw.h_e);
        playlist.add(R.raw.h_o);
        playlist.add(R.raw.h_ka);
        playlist.add(R.raw.h_ki);
        playlist.add(R.raw.h_ku);
        playlist.add(R.raw.h_ke);
        playlist.add(R.raw.h_ko);
        playlist.add(R.raw.h_sa);
        playlist.add(R.raw.h_shi);
        playlist.add(R.raw.h_su);
        playlist.add(R.raw.h_se);
        playlist.add(R.raw.h_so);
        playlist.add(R.raw.h_ta);
        playlist.add(R.raw.h_chi);
        playlist.add(R.raw.h_tsu);
        playlist.add(R.raw.h_te);
        playlist.add(R.raw.h_to);
        playlist.add(R.raw.h_na);
        playlist.add(R.raw.h_ni);
        playlist.add(R.raw.h_nu);
        playlist.add(R.raw.h_ne);
        playlist.add(R.raw.h_no);
        playlist.add(R.raw.h_ha);
        playlist.add(R.raw.h_hi);
        playlist.add(R.raw.h_fu);
        playlist.add(R.raw.h_he);
        playlist.add(R.raw.h_ho);
        playlist.add(R.raw.h_ma);
        playlist.add(R.raw.h_mi);
        playlist.add(R.raw.h_mu);
        playlist.add(R.raw.h_me);
        playlist.add(R.raw.h_mo);
        playlist.add(R.raw.h_ya);
        playlist.add(R.raw.h_yu);
        playlist.add(R.raw.h_yo);
        playlist.add(R.raw.h_ra);
        playlist.add(R.raw.h_ri);
        playlist.add(R.raw.h_ru);
        playlist.add(R.raw.h_re);
        playlist.add(R.raw.h_ro);
        playlist.add(R.raw.h_wa);
        playlist.add(R.raw.h_o);
        playlist.add(R.raw.h_n);


        if (view.getId() == R.id.btnHiraganaA || view.getId() == R.id.btnKatakanaA) {
            if (mediaPlayer != null)
            {
                mediaPlayer.reset();     // reset stops and release on any state of the player
            }

            mediaPlayer = MediaPlayer.create(this, playlist.get(0));

            mediaPlayer.start();
        }
        else if (view.getId() == R.id.btnHiraganaI || view.getId() == R.id.btnKatakanaI) {
            if (mediaPlayer != null)
            {
                mediaPlayer.reset();     // reset stops and release on any state of the player
            }
            mediaPlayer = MediaPlayer.create(this, playlist.get(1));
            mediaPlayer.start();

        }
        else if (view.getId() == R.id.btnHiraganaU || view.getId() == R.id.btnKatakanaU) {
            if (mediaPlayer != null)
            {
                mediaPlayer.reset();     // reset stops and release on any state of the player
            }
            mediaPlayer = MediaPlayer.create(this, playlist.get(2));
            mediaPlayer.start();
        }
        else if (view.getId() == R.id.btnHiraganaE || view.getId() == R.id.btnKatakanaE) {
            if (mediaPlayer != null)
            {
                mediaPlayer.reset();     // reset stops and release on any state of the player
            }
            mediaPlayer = MediaPlayer.create(this, playlist.get(3));
            mediaPlayer.start();
        }
        else if (view.getId() == R.id.btnHiraganaO || view.getId() == R.id.btnKatakanaO) {
            if (mediaPlayer != null)
            {
                mediaPlayer.reset();     // reset stops and release on any state of the player
            }
            mediaPlayer = MediaPlayer.create(this, playlist.get(4));
            mediaPlayer.start();
        }
        else if (view.getId() == R.id.btnHiraganaKa || view.getId() == R.id.btnKatakanaKa) {
            if (mediaPlayer != null)
            {
                mediaPlayer.reset();     // reset stops and release on any state of the player
            }
            mediaPlayer = MediaPlayer.create(this, playlist.get(5));
            mediaPlayer.start();
        }
        else if (view.getId() == R.id.btnHiraganaKi || view.getId() == R.id.btnKatakanaKi) {
            if (mediaPlayer != null)
            {
                mediaPlayer.reset();     // reset stops and release on any state of the player
            }
            mediaPlayer = MediaPlayer.create(this, playlist.get(6));
            mediaPlayer.start();
        }
        else if (view.getId() == R.id.btnHiraganaKu || view.getId() == R.id.btnKatakanaKu) {
            if (mediaPlayer != null)
            {
                mediaPlayer.reset();     // reset stops and release on any state of the player
            }
            mediaPlayer = MediaPlayer.create(this, playlist.get(7));
            mediaPlayer.start();
        }
        else if (view.getId() == R.id.btnHiraganaKe || view.getId() == R.id.btnKatakanaKe) {
            if (mediaPlayer != null)
            {
                mediaPlayer.reset();     // reset stops and release on any state of the player
            }
            mediaPlayer = MediaPlayer.create(this, playlist.get(8));
            mediaPlayer.start();
        }
        else if (view.getId() == R.id.btnHiraganaKo || view.getId() == R.id.btnKatakanaKo) {
            if (mediaPlayer != null)
            {
                mediaPlayer.reset();     // reset stops and release on any state of the player
            }
            mediaPlayer = MediaPlayer.create(this, playlist.get(9));
            mediaPlayer.start();
        }
        else if (view.getId() == R.id.btnHiraganaSa || view.getId() == R.id.btnKatakanaSa) {
            if (mediaPlayer != null)
            {
                mediaPlayer.reset();     // reset stops and release on any state of the player
            }
            mediaPlayer = MediaPlayer.create(this, playlist.get(10));
            mediaPlayer.start();
        }
        else if (view.getId() == R.id.btnHiraganaShi || view.getId() == R.id.btnKatakanaShi) {
            if (mediaPlayer != null)
            {
                mediaPlayer.reset();     // reset stops and release on any state of the player
            }
            mediaPlayer = MediaPlayer.create(this, playlist.get(11));
            mediaPlayer.start();
        }
        else if (view.getId() == R.id.btnHiraganaSu || view.getId() == R.id.btnKatakanaSu) {
            if (mediaPlayer != null)
            {
                mediaPlayer.reset();     // reset stops and release on any state of the player
            }
            mediaPlayer = MediaPlayer.create(this, playlist.get(12));
            mediaPlayer.start();
        }
        else if (view.getId() == R.id.btnHiraganaSe || view.getId() == R.id.btnKatakanaSe) {
            if (mediaPlayer != null)
            {
                mediaPlayer.reset();     // reset stops and release on any state of the player
            }
            mediaPlayer = MediaPlayer.create(this, playlist.get(13));
            mediaPlayer.start();
        }
        else if (view.getId() == R.id.btnHiraganaSo || view.getId() == R.id.btnKatakanaSo) {
            if (mediaPlayer != null)
            {
                mediaPlayer.reset();     // reset stops and release on any state of the player
            }
            mediaPlayer = MediaPlayer.create(this, playlist.get(14));
            mediaPlayer.start();
        }
        else if (view.getId() == R.id.btnHiraganaTa || view.getId() == R.id.btnKatakanaTa) {
            if (mediaPlayer != null)
            {
                mediaPlayer.reset();     // reset stops and release on any state of the player
            }
            mediaPlayer = MediaPlayer.create(this, playlist.get(15));
            mediaPlayer.start();
        }
        else if (view.getId() == R.id.btnHiraganaChi || view.getId() == R.id.btnKatakanaChi) {
            if (mediaPlayer != null)
            {
                mediaPlayer.reset();     // reset stops and release on any state of the player
            }
            mediaPlayer = MediaPlayer.create(this, playlist.get(16));
            mediaPlayer.start();
        }
        else if (view.getId() == R.id.btnHiraganaTsu || view.getId() == R.id.btnKatakanaTsu) {
            if (mediaPlayer != null)
            {
                mediaPlayer.reset();     // reset stops and release on any state of the player
            }
            mediaPlayer = MediaPlayer.create(this, playlist.get(17));
            mediaPlayer.start();
        }
        else if (view.getId() == R.id.btnHiraganaTe || view.getId() == R.id.btnKatakanaTe) {
            if (mediaPlayer != null)
            {
                mediaPlayer.reset();     // reset stops and release on any state of the player
            }
            mediaPlayer = MediaPlayer.create(this, playlist.get(18));
            mediaPlayer.start();
        }
        else if (view.getId() == R.id.btnHiraganaTo || view.getId() == R.id.btnKatakanaTo) {
            if (mediaPlayer != null)
            {
                mediaPlayer.reset();     // reset stops and release on any state of the player
            }
            mediaPlayer = MediaPlayer.create(this, playlist.get(19));
            mediaPlayer.start();
        }
        else if (view.getId() == R.id.btnHiraganaNa || view.getId() == R.id.btnKatakanaNa) {
            if (mediaPlayer != null)
            {
                mediaPlayer.reset();     // reset stops and release on any state of the player
            }
            mediaPlayer = MediaPlayer.create(this, playlist.get(20));
            mediaPlayer.start();
        }
        else if (view.getId() == R.id.btnHiraganaNi || view.getId() == R.id.btnKatakanaNi) {
            if (mediaPlayer != null)
            {
                mediaPlayer.reset();     // reset stops and release on any state of the player
            }
            mediaPlayer = MediaPlayer.create(this, playlist.get(21));
            mediaPlayer.start();
        }
        else if (view.getId() == R.id.btnHiraganaNu || view.getId() == R.id.btnKatakanaNu) {
            if (mediaPlayer != null)
            {
                mediaPlayer.reset();     // reset stops and release on any state of the player
            }
            mediaPlayer = MediaPlayer.create(this, playlist.get(22));
            mediaPlayer.start();
        }
        else if (view.getId() == R.id.btnHiraganaNe || view.getId() == R.id.btnKatakanaNe) {
            if (mediaPlayer != null)
            {
                mediaPlayer.reset();     // reset stops and release on any state of the player
            }
            mediaPlayer = MediaPlayer.create(this, playlist.get(23));
            mediaPlayer.start();
        }
        else if (view.getId() == R.id.btnHiraganaNo || view.getId() == R.id.btnKatakanaNo) {
            if (mediaPlayer != null)
            {
                mediaPlayer.reset();     // reset stops and release on any state of the player
            }
            mediaPlayer = MediaPlayer.create(this, playlist.get(24));
            mediaPlayer.start();
        }
        else if (view.getId() == R.id.btnHiraganaHa || view.getId() == R.id.btnKatakanaHa) {
            if (mediaPlayer != null)
            {
                mediaPlayer.reset();     // reset stops and release on any state of the player
            }
            mediaPlayer = MediaPlayer.create(this, playlist.get(25));
            mediaPlayer.start();
        }

        else if (view.getId() == R.id.btnHiraganaHi || view.getId() == R.id.btnKatakanaHi) {
            if (mediaPlayer != null)
            {
                mediaPlayer.reset();     // reset stops and release on any state of the player
            }
            mediaPlayer = MediaPlayer.create(this, playlist.get(26));
            mediaPlayer.start();
        }
        else if (view.getId() == R.id.btnHiraganaFu || view.getId() == R.id.btnKatakanaFu) {
            if (mediaPlayer != null)
            {
                mediaPlayer.reset();     // reset stops and release on any state of the player
            }
            mediaPlayer = MediaPlayer.create(this, playlist.get(27));
            mediaPlayer.start();
        }
        else if (view.getId() == R.id.btnHiraganaHe || view.getId() == R.id.btnKatakanaHe) {
            if (mediaPlayer != null)
            {
                mediaPlayer.reset();     // reset stops and release on any state of the player
            }
            mediaPlayer = MediaPlayer.create(this, playlist.get(28));
            mediaPlayer.start();
        }
        else if (view.getId() == R.id.btnHiraganaHo || view.getId() == R.id.btnKatakanaHo) {
            if (mediaPlayer != null)
            {
                mediaPlayer.reset();     // reset stops and release on any state of the player
            }
            mediaPlayer = MediaPlayer.create(this, playlist.get(29));
            mediaPlayer.start();
        }
        else if (view.getId() == R.id.btnHiraganaMa || view.getId() == R.id.btnKatakanaMa) {
            if (mediaPlayer != null)
            {
                mediaPlayer.reset();     // reset stops and release on any state of the player
            }
            mediaPlayer = MediaPlayer.create(this, playlist.get(30));
            mediaPlayer.start();
        }
        else if (view.getId() == R.id.btnHiraganaMi || view.getId() == R.id.btnKatakanaMi) {
            if (mediaPlayer != null)
            {
                mediaPlayer.reset();     // reset stops and release on any state of the player
            }
            mediaPlayer = MediaPlayer.create(this, playlist.get(31));
            mediaPlayer.start();
        }

        else if (view.getId() == R.id.btnHiraganaMu || view.getId() == R.id.btnKatakanaMu) {
            if (mediaPlayer != null)
            {
                mediaPlayer.reset();     // reset stops and release on any state of the player
            }
            mediaPlayer = MediaPlayer.create(this, playlist.get(32));
            mediaPlayer.start();
        }
        else if (view.getId() == R.id.btnHiraganaMe || view.getId() == R.id.btnKatakanaMe) {
            if (mediaPlayer != null)
            {
                mediaPlayer.reset();     // reset stops and release on any state of the player
            }
            mediaPlayer = MediaPlayer.create(this, playlist.get(33));
            mediaPlayer.start();
        }
        else if (view.getId() == R.id.btnHiraganaMo || view.getId() == R.id.btnKatakanaMo) {
            if (mediaPlayer != null)
            {
                mediaPlayer.reset();     // reset stops and release on any state of the player
            }
            mediaPlayer = MediaPlayer.create(this, playlist.get(34));
            mediaPlayer.start();
        }
        else if (view.getId() == R.id.btnHiraganaYa || view.getId() == R.id.btnKatakanaYa) {
            if (mediaPlayer != null)
            {
                mediaPlayer.reset();     // reset stops and release on any state of the player
            }
            mediaPlayer = MediaPlayer.create(this, playlist.get(35));
            mediaPlayer.start();
        }
        else if (view.getId() == R.id.btnHiraganaYu || view.getId() == R.id.btnKatakanaYu) {
            if (mediaPlayer != null)
            {
                mediaPlayer.reset();     // reset stops and release on any state of the player
            }
            mediaPlayer = MediaPlayer.create(this, playlist.get(36));
            mediaPlayer.start();
        }
        else if (view.getId() == R.id.btnHiraganaYo || view.getId() == R.id.btnKatakanaYo) {
            if (mediaPlayer != null)
            {
                mediaPlayer.reset();     // reset stops and release on any state of the player
            }
            mediaPlayer = MediaPlayer.create(this, playlist.get(37));
            mediaPlayer.start();
        }
        else if (view.getId() == R.id.btnHiraganaRa || view.getId() == R.id.btnKatakanaRa) {
            if (mediaPlayer != null)
            {
                mediaPlayer.reset();     // reset stops and release on any state of the player
            }
            mediaPlayer = MediaPlayer.create(this, playlist.get(38));
            mediaPlayer.start();
        }
        else if (view.getId() == R.id.btnHiraganaRi || view.getId() == R.id.btnKatakanaRi) {
            if (mediaPlayer != null)
            {
                mediaPlayer.reset();     // reset stops and release on any state of the player
            }
            mediaPlayer = MediaPlayer.create(this, playlist.get(39));
            mediaPlayer.start();
        }
        else if (view.getId() == R.id.btnHiraganaRu || view.getId() == R.id.btnKatakanaRu) {
            if (mediaPlayer != null)
            {
                mediaPlayer.reset();     // reset stops and release on any state of the player
            }
            mediaPlayer = MediaPlayer.create(this, playlist.get(40));
            mediaPlayer.start();
        }
        else if (view.getId() == R.id.btnHiraganaRe || view.getId() == R.id.btnKatakanaRe) {
            if (mediaPlayer != null)
            {
                mediaPlayer.reset();     // reset stops and release on any state of the player
            }
            mediaPlayer = MediaPlayer.create(this, playlist.get(41));
            mediaPlayer.start();
        }
        else if (view.getId() == R.id.btnHiraganaRo || view.getId() == R.id.btnKatakanaRo) {
            if (mediaPlayer != null)
            {
                mediaPlayer.reset();     // reset stops and release on any state of the player
            }
            mediaPlayer = MediaPlayer.create(this, playlist.get(42));
            mediaPlayer.start();
        }
        else if (view.getId() == R.id.btnHiraganaWa || view.getId() == R.id.btnKatakanaWa) {
            if (mediaPlayer != null)
            {
                mediaPlayer.reset();     // reset stops and release on any state of the player
            }
            mediaPlayer = MediaPlayer.create(this, playlist.get(43));
            mediaPlayer.start();
        }
        else if (view.getId() == R.id.btnHiraganaWo || view.getId() == R.id.btnKatakanaWo) {
            if (mediaPlayer != null)
            {
                mediaPlayer.reset();     // reset stops and release on any state of the player
            }
            mediaPlayer = MediaPlayer.create(this, playlist.get(44));
            mediaPlayer.start();
        }
        else if (view.getId() == R.id.btnHiraganaN || view.getId() == R.id.btnKatakanaN) {
            if (mediaPlayer != null)
            {
                mediaPlayer.reset();     // reset stops and release on any state of the player
            }
            mediaPlayer = MediaPlayer.create(this, playlist.get(45));
            mediaPlayer.start();
        }

    }
}

