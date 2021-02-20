package tw.nolions.hiltexercise

import android.app.Application
import android.util.Log
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class BaseApplication : Application() {
    @Inject
    lateinit var hiltDog: DogHilt

    override fun onCreate() {
        super.onCreate()

        Log.d("Hilt", "======Application======")
        Log.d("Hilt", hiltDog.wow())
    }
}