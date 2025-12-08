package com.erazero1.roots

import android.app.Application
import com.erazero1.roots.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin

class RootsApp: Application(){
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@RootsApp)
            modules(appModule)
        }
    }
}