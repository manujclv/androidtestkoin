package com.androiddesdecero.productflavors

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private var tvDepartamento: TextView? = null
    private var tvURLDepartamento: TextView? = null
    val helloService by inject<HelloService>()


    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        helloService.hello()
        tvDepartamento = findViewById(R.id.mainActivityTvDepartamento)
        tvDepartamento!!.text = Departamento.getDepartamento()

        tvURLDepartamento = findViewById(R.id.mainActivityTvURLDepartamento)
        tvURLDepartamento!!.text = BuildConfig.BASE_URL
    }
}
