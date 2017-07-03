package com.example.lishuangling.designpatterndemo.observer_pattern.observer;

import android.util.Log;

import com.example.lishuangling.designpatterndemo.observer_pattern.event.TVEndEvent;
import com.example.lishuangling.designpatterndemo.observer_pattern.event.TVStartEvent;

/**
 * *   .--,       .--,
 * *  ( (  \.---./  ) )
 * *   '.__/o   o\__.'
 * *      {=  ^  =}
 * *       >  -  <
 * *      /       \
 * *     //       \\
 * *    //|   .   |\\
 * *    "'\       /'"_.-~^`'-.
 * *       \  _  /--'         `
 * *     ___)( )(___
 * *    (((__) (__)))
 * *
 * Created by lishuangling on 2017/7/3.
 */


public class LiSi extends TVReader {

    @Override
    void onTVStart(TVStartEvent event) {
        Log.e("lishling", "LiSi start watch ====="+ event.eventName);
    }

    @Override
    void onTVEnd(TVEndEvent event) {
        Log.e("lishling","LiSi stop watch ====="+ event.eventName);
    }
}
