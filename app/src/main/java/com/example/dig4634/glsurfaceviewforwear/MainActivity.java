//This is a comment made by Peyton
//I have created a new fork

package com.example.dig4634.glsurfaceviewforwear;

import android.graphics.PixelFormat;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.widget.TextView;

public class MainActivity extends WearableActivity {

    MyRenderer my_renderer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GLSurfaceView surfaceView=findViewById(R.id.surfaceView);
        surfaceView.setEGLContextClientVersion(3);
        surfaceView.setZOrderOnTop(true);
        surfaceView.setEGLConfigChooser(8,8,8,8,16,0);
        surfaceView.getHolder().setFormat(PixelFormat.RGBA_8888);


        my_renderer=new MyRenderer(this);
        // my_renderer.showCamera(findViewById(R.id.textureView));

        surfaceView.setRenderer(my_renderer);
        surfaceView.setOnTouchListener(my_renderer);

        // Enables Always-on
        setAmbientEnabled();
    }
}
