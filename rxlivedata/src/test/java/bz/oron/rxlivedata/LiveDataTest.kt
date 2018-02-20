package bz.oron.rxlivedata

import android.arch.core.executor.testing.InstantTaskExecutorRule
import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleOwner
import android.arch.lifecycle.LifecycleRegistry
import android.arch.lifecycle.LiveData
import org.junit.Rule
import org.junit.rules.TestRule
import org.mockito.Mockito

/**
 * Created by oron on 2/20/18.
 */
open class LiveDataTest {
  @get:Rule
  var rule: TestRule = InstantTaskExecutorRule()

  private val lifecycle = LifecycleRegistry(Mockito.mock(LifecycleOwner::class.java))

  private fun resume() {
    lifecycle.handleLifecycleEvent(Lifecycle.Event.ON_RESUME)
  }

  internal fun<T> observe(liveData: LiveData<T>) {
    resume()
    liveData.observe({ lifecycle }) {}
  }
}