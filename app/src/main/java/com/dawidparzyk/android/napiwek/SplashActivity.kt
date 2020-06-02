package com.dawidparzyk.android.napiwek

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.view.Window
import android.view.WindowManager


class SplashActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    FullScreen()

    setContentView(R.layout.activity_splash)

    Handler().postDelayed({

      startActivity(Intent(this, MainActivity::class.java))

      overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)

      finish()

    }, 2000)
  }

  private fun FullScreen() {
    requestWindowFeature(Window.FEATURE_NO_TITLE)

    window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN)

    supportActionBar?.hide()
  }
}
