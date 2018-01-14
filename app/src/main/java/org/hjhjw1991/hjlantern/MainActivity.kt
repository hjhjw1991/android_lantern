package org.hjhjw1991.hjlantern

import android.os.Bundle

/**
 * Created by HuangJun on 2018/1/13.
 */

class MainActivity(name: String = "MainActivity") :BaseActivity() {
    init {
        println("sub class $name")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("onCreate")
    }
}
