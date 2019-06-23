package com.androiddesdecero.productflavors

import org.junit.After
import org.junit.Test


import org.junit.Assert.*
import org.junit.Before
import org.koin.core.context.startKoin
import org.koin.android.ext.android.inject
import org.koin.dsl.module

//import org.koin.dsl.module

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
class ExampleUnitTest {
    //val service by inject<HelloService>()

    @Before
    fun before() {
        val helloModule = module {

            single { HelloMessageData() }

            single { HelloServiceImpl(get()) as HelloTestImp }
        }
        startKoin {

            modules(helloModule)
        }
    }

    @After
    fun after() {
        //closeKoin()
    }

    @Test
    @Throws(Exception::class)
    fun addition_isCorrect() {
        assertEquals(4, (2 + 2).toLong())
    }

    @Test
    fun test_koin() {

        //service.hello()
    }
}