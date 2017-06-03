package bamtain.com.test

import android.app.Application
import android.content.Context

/**
 * Created by Runo on 2017/06/03.
 */

fun ApplicationController.Companion.getContext(): Context { return ApplicationController.getInstance().applicationContext }