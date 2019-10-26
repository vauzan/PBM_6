package com.vauzan.pert6

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vauzan.pert7.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Facebook.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/"))
            startActivity(i)
        }
        instgram.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.instagram.com/"))
            startActivity(i)
        }

        var MediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.test1)
        Play.setOnClickListener{
            MediaPlayer?.start()
        }
        Pause.setOnClickListener{
            MediaPlayer?.pause()
        }
        Stop.setOnClickListener{
            MediaPlayer?.pause()
            MediaPlayer?.seekTo(0)
        }

    }
}