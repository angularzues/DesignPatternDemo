package com.example.lishuangling.designpatterndemo.observer_pattern.observable;

import com.example.lishuangling.designpatterndemo.observer_pattern.event.IObserverEvent;
import com.example.lishuangling.designpatterndemo.observer_pattern.observer.Observer;

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


public interface Observable <T extends Observer> {
    void addObserver(T observer);

    void deleteObserver(T observer);

    void  notifyObserver(IObserverEvent event);
}
