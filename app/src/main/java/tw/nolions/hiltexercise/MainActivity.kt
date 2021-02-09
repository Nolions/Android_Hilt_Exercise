package tw.nolions.hiltexercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var hiltDog: DogHilt
    lateinit var dog: Dog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("Hilt", "======MainActivity======")
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