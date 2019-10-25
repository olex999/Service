package com.example.servis_086

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_google.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("http://wwww.instagram.com/fakhri0407"))
            startActivity(i)
        })

        btn_facebook.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/fakhri khairi"))
            startActivity(i)
        })

        var MediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.lagisyantik)

        img_play.setOnClickListener{
            MediaPlayer?.start()
        }

        img_pause.setOnClickListener{
            MediaPlayer?.pause()
        }

        img_stop.setOnClickListener{
            MediaPlayer?.stop()
            MediaPlayer?.seekTo(0)
        }
    }
}
