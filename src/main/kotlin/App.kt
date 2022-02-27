import ui.main.MainActivity
import com.theapache64.cyclone.core.Application
import model.AppArgs

class App(
    appArgs: AppArgs,
) : Application() {
    companion object {
        lateinit var appArgs: AppArgs
    }

    init {
        App.appArgs = appArgs
    }

    override fun onCreate() {
        super.onCreate()

        val splashIntent = MainActivity.getStartIntent()
        startActivity(splashIntent)
    }
}

    fun main() {

        val appArgs = AppArgs(
            appName = "Vgetables", // To show on title bar
            version = "v1.0.0", // To show on title inside brackets
            versionCode = 100 // To compare with latest version code (in case if you want to prompt update)
        )
        App(appArgs).onCreate()
}