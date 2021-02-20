package tw.nolions.hiltexercise

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var hiltDog: DogHilt

    @Inject
    lateinit var dog: Dog

    @Inject
    lateinit var pet: Pet

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("Hilt", "======Activity======")
        Log.d("Hilt", hiltDog.wow())

        Log.d("Hilt", "======Constructor======")
        Log.d("Hilt", dog.wow())

        Log.d("Hilt", "======Module======")
        Log.d("Hilt", pet.wow())
    }
}