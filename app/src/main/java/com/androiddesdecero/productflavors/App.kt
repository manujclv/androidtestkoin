package com.androiddesdecero.productflavors

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.dsl.module

class App :Application(){
    override fun onCreate() {
        super.onCreate()
        val helloModule = module {

            single { HelloMessageData() }

            single { HelloServiceImpl(get()) as HelloService }
        }

        startKoin{
            androidLogger()
            androidContext(this@App)
            modules(helloModule)
        }
    }
}