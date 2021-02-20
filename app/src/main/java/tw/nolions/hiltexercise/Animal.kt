package tw.nolions.hiltexercise

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

/**
 * Animal
 *
 * @constructor Create empty Animal
 */
interface Animal {
    /**
     * Type
     *
     * @return
     */
    fun type(): String

    fun wow(): String
}

@Module
@InstallIn(ActivityComponent::class)
abstract class AnimalModule {
    @BindRabbitAnimal
    @Binds
    abstract fun bindRabbit(rabbit: RabbitImpl): Animal

    @BindCatAnimal
    @Binds
    abstract fun bindCat(cat: CatImpl): Animal
}