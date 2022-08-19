package com.xj.autodimens

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val temp = resources.getDimension(R.dimen.y200)

        Log.e("test", "onCreate: origin=${ScreenUtil.getTotalHeight(this,true)},,trans:${ScreenUtil.getScreenHeight(this,true)}," +
                "" +
                "width  origin=${ScreenUtil.getTotalHeight(this,false)},,trans:${ScreenUtil.getScreenHeight(this,false)}" )
    }
}