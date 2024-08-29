package faithnyambura.io

import android.app.Application
import android.content.Context
import faithnyambura.io.models.Contact

class MyContactsApp: Application(){

    companion object{
        lateinit var appContext: Context

    }

    override fun onCreate() {
        super.onCreate()
        appContext= applicationContext
    }
}