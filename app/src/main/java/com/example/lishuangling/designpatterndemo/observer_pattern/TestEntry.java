package com.example.lishuangling.designpatterndemo.observer_pattern;

import com.example.lishuangling.designpatterndemo.observer_pattern.observable.CCTV;
import com.example.lishuangling.designpatterndemo.observer_pattern.observer.LiSi;
import com.example.lishuangling.designpatterndemo.observer_pattern.observer.ZhangShan;

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


public class TestEntry {

    public static void testObserverPattern(){
        CCTV cctv = new CCTV();
        cctv.addObserver(new ZhangShan());
        cctv.addObserver(new LiSi());
        cctv.startShow();
        cctv.stopShow();
    }
}
