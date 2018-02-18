package bz.oron.rxlivedataapp

import android.arch.lifecycle.MutableLiveData
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import bz.oron.rxlivedata.filterNull

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val oron = MutableLiveData<String>()
    oron.filterNull()
  }
}
