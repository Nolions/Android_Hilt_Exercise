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

    @Inject
    lateinit var mCat: Cat

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("Hilt", "======Activity======")
        Log.d("Hilt", hiltDog.wow())

        Log.d("Hilt", "======Constructor======")
        Log.d("Hilt", dog.wow())

        Log.d("Hilt", "======Module======")
        Log.d("Hilt", pet.wow())

        bind()
    }

    private fun bind() {
        Log.d("Hilt", "======Bind======")

        val cat = mCat.bindAnimal(CatImpl())
        Log.d("Hilt", "animal type is ${cat.wow()}")
        Log.d("Hilt", "animal wow is ${cat.wow()}")
    }
}