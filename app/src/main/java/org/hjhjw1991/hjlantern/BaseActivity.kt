package org.hjhjw1991.hjlantern

import android.app.Activity
import android.os.Bundle

/**
 * Created by HuangJun on 2018/1/13.
 */

abstract class BaseActivity(val name: String = "BastActivity"): Activity() {
    init {
        println("init block")
        println("$name")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("onCreate")
    }
}
