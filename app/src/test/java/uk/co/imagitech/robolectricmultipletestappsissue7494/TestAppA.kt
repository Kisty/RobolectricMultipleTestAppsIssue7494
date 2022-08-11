package uk.co.imagitech.robolectricmultipletestappsissue7494

import org.robolectric.TestLifecycleApplication
import uk.co.imagitech.robolectricmultipletestappsissue7494.App
import java.lang.reflect.Method

class TestAppA : App(), TestLifecycleApplication {
    override fun beforeTest(method: Method?) {
        mainValue = 1
    }

    override fun prepareTest(test: Any?) {
        mainValue = 1
    }

    override fun afterTest(method: Method?) {

    }

}