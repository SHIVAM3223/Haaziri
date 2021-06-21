package com.hackslash.haaziri.utils;

import android.app.Activity;
import android.content.Context;

import androidx.core.content.res.ResourcesCompat;

import com.hackslash.haaziri.R;

import www.sanju.motiontoast.MotionToast;

public class MotionToastUtitls {

    public static void showInfoToast(Context mContext, String title, String message) {
        MotionToast.Companion.createColorToast((Activity) mContext,
                title,
                message,
                MotionToast.TOAST_INFO,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(mContext, R.font.helvetica_regular));
    }

    public static void showErrorToast(Context mContext, String title, String message) {
        MotionToast.Companion.createColorToast((Activity) mContext,
                title,
                message,
                MotionToast.TOAST_ERROR,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(mContext, R.font.helvetica_regular));
    }

    public static void showSuccessToast(Context mContext, String title, String message) {
        MotionToast.Companion.createColorToast((Activity) mContext,
                title,
                message,
                MotionToast.TOAST_SUCCESS,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(mContext, R.font.helvetica_regular));
    }

    public static void showWarningDialog(Context mContext, String title, String message) {
        MotionToast.Companion.createColorToast((Activity) mContext,
                title,
                message,
                MotionToast.TOAST_WARNING,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(mContext, R.font.helvetica_regular));
    }
}
