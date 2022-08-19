package com.xj.autodimens;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

import java.lang.reflect.Method;

public class ScreenUtil {

    /**

     @param context

     @return 获取屏幕原始尺寸高度，包括虚拟功能键高度

     */

    public static int getTotalHeight(Context context,boolean isHe) {

        int dpi = 0;

        WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);

        Display display = windowManager.getDefaultDisplay();

        DisplayMetrics displayMetrics = new DisplayMetrics();

        Class c;

        try {

            c = Class.forName("android.view.Display");

            @SuppressWarnings("unchecked")

            Method method = c.getMethod("getRealMetrics", DisplayMetrics.class);

            method.invoke(display, displayMetrics);

            if (isHe){
                dpi = displayMetrics.heightPixels;
            }else{
                dpi = displayMetrics.widthPixels;
            }

        } catch (Exception e) {

            e.printStackTrace();

        }

        return dpi;

    }

    /**

     @param context

     @return 获取屏幕内容高度不包括虚拟按键

     */

    public static int getScreenHeight(Context context,boolean isHe) {

        WindowManager wm = (WindowManager) context

                .getSystemService(Context.WINDOW_SERVICE);

        DisplayMetrics outMetrics = new DisplayMetrics();

        wm.getDefaultDisplay().getMetrics(outMetrics);

        if (isHe){
            return outMetrics.heightPixels;
        }else{
            return outMetrics.widthPixels;
        }

    }

}
