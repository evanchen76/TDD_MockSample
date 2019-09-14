import org.junit.Assert
import org.junit.Test

class UmbrellaTest {

    @Test
    fun totalPrice_sunnyDay(){
        val umbrella = Umbrella()
        val weather = StubWeather()
        weather.fakeIsSunny = true

        val actual = umbrella.totalPrice(weather, 3,100)
        val expected = 270
        Assert.assertEquals(expected, actual)
    }
}