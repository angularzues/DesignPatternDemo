package com.example.lishuangling.designpatterndemo.observer_pattern.observer;

import com.example.lishuangling.designpatterndemo.observer_pattern.event.IObserverEvent;
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


public abstract class TVReader implements Observer {
    @Override
    public final void onNotify(IObserverEvent event) {
        if (event instanceof TVStartEvent){
            onTVStart((TVStartEvent) event);
        }else if (event instanceof TVEndEvent){
            onTVEnd((TVEndEvent) event);
        }
    }


    abstract void onTVStart(TVStartEvent event);

    abstract void onTVEnd(TVEndEvent event);
}
