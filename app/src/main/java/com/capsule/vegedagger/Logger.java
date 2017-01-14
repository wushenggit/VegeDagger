package com.capsule.vegedagger;

import android.text.TextUtils;
import android.util.Log;

/**
 * Created by hhly-pc on 2016/12/23.
 */

public class Logger {

    private static String TAG = "vegeta";

    public static void setTAG(String tag) {
        TAG = tag;
    }

    public static void i(String msg) {
        i(null, msg);
    }

    public static void i(Object o, String msg) {
        Class c = o.getClass();
        String className = c.getName();
        className = className.substring(className.lastIndexOf("."));
        i(className, msg);
    }

    public static void i(String tag, String msg) {
        if (!BuildConfig.DEBUG) {
            return;
        }

        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        int currentIndex = -1;
        for (int i = 0; i < stackTraceElement.length; i++) {
            if (stackTraceElement[i].getMethodName().compareTo("i") == 0) {
                currentIndex = i;
            }
        }
        currentIndex++;

        String fullClassName = stackTraceElement[currentIndex].getClassName();
        String className = fullClassName.substring(fullClassName.lastIndexOf(".") + 1);
        String methodName = stackTraceElement[currentIndex].getMethodName();
        String lineNumber = String.valueOf(stackTraceElement[currentIndex].getLineNumber());

        if (TextUtils.isEmpty(tag)) {
            Log.i(TAG, msg + "\nat " + fullClassName + "." + methodName + "(" + className + ".java:" + lineNumber + ")");
        } else {
            Log.i(tag, msg + "\nat " + fullClassName + "." + methodName + "(" + className + ".java:" + lineNumber + ")");
        }

    }

}
