package bamtain.com.test

import android.app.Application

/**
 * Created by Runo on 2017/06/03.
 */
class ApplicationController: Application() {

    override fun onCreate() {
        super.onCreate()
        sInstance = this
    }

    companion object {

        private lateinit var sInstance: ApplicationController

        fun getInstance(): ApplicationController {
            return sInstance
        }
    }
}