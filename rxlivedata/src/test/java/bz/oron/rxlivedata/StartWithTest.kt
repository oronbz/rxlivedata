package bz.oron.rxlivedata

import android.arch.lifecycle.MutableLiveData
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Created by oron on 2/20/18.
 */
class StartWithTest: LiveDataTest() {

  @Test fun testStartWith() {
    val numberLiveData = MutableLiveData<Int>()

    val startWithTen = numberLiveData.startWith(10)

    observe(startWithTen)

    assertEquals(10, startWithTen.value)

    numberLiveData.value = 3

    assertEquals(3, startWithTen.value)
  }
}