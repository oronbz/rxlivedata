package bz.oron.rxlivedata

import android.arch.lifecycle.MutableLiveData
import org.junit.Assert
import org.junit.Test

/**
 * Created by oron on 2/20/18.
 */
class FilterTest: LiveDataTest() {

  @Test fun testFilter() {
    val numberLiveData = MutableLiveData<Int>()
    val greaterThanThreeLiveData = numberLiveData.filter { it > 3 }

    observe(greaterThanThreeLiveData)

    numberLiveData.value = 5

    Assert.assertEquals(5, greaterThanThreeLiveData.value)

    numberLiveData.value = 2

    Assert.assertEquals(5, greaterThanThreeLiveData.value)

    numberLiveData.value = 6

    Assert.assertEquals(6, greaterThanThreeLiveData.value)
  }
}