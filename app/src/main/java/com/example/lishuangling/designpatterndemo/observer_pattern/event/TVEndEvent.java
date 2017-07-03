package com.example.lishuangling.designpatterndemo.observer_pattern.event;

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


public class TVEndEvent extends IObserverEvent {
    public TVEndEvent(String eventName) {
        this.eventName = eventName;
    }
}
