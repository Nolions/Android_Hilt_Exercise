package tw.nolions.hiltexercise

import android.app.Application
import android.util.Log
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class BaseApplication: Application() {
    @Inject
    lateinit var hiltDog: DogHilt
    lateinit var dog: Dog

    override fun onCreate() {
        super.onCreate()

        Log.d("Hilt", "======BaseApplication======")
        inject()
        noInject()
    }

    private fun inject() {
        hiltDog.wow()
    }

    private fun noInject() {
        dog = Dog()
        dog.wow()
    }
}