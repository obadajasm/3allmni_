package com.example.a3allmni;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;


import com.example.a3allmni.model.letter;

public class SingleLetterActivity extends AppCompatActivity {

    ImageButton imageButton;
    ImageView imageView;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_letter);

        imageButton= findViewById(R.id.play_ib);
        imageView= findViewById(R.id.title_im);


      final  letter letter = getIntent().getParcelableExtra("letter");

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mediaPlayer != null ) {
                    if(mediaPlayer.isPlaying()) {
                        mediaPlayer.stop();
                        mediaPlayer.reset();
                        mediaPlayer.release();
                    }
                }

                mediaPlayer = MediaPlayer.create(SingleLetterActivity.this,letter.getPronounce());
                mediaPlayer.start();
            }
        });


       imageView.setBackgroundResource(letter.getImage());

        }



    @Override
    protected void onStop() {
        super.onStop();


        if(mediaPlayer!=null){
            mediaPlayer.stop();
            mediaPlayer = null;
        }


    }
}