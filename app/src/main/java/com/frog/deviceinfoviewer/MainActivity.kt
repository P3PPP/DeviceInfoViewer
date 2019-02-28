package net.p3ppp.deviceinfoviewer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.os.Build
import android.util.DisplayMetrics


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var metrics = DisplayMetrics()
        windowManager.defaultDisplay.getRealMetrics(metrics)

        var textView = findViewById<TextView>(R.id.textView)
        textView.text = """
            Model
            ${Build.MODEL}

            Display Size(pixels)
            Width:${metrics.widthPixels}px x Height:${metrics.heightPixels}px

            Display Size(dp)
            Width:${metrics.widthPixels / metrics.density}dp x Height:${metrics.heightPixels / metrics.density}dp

            Density
            Density:${metrics.density}
            Density DPI:${metrics.densityDpi}

            DPI
            X DPI:${metrics.xdpi}
            Y DPI:${metrics.ydpi}
            """
    }
}
