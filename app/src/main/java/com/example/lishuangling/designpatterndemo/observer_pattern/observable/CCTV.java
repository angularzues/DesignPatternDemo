package com.example.lishuangling.designpatterndemo.observer_pattern.observable;

import android.util.Log;

import com.example.lishuangling.designpatterndemo.observer_pattern.event.IObserverEvent;
import com.example.lishuangling.designpatterndemo.observer_pattern.event.TVEndEvent;
import com.example.lishuangling.designpatterndemo.observer_pattern.event.TVStartEvent;
import com.example.lishuangling.designpatterndemo.observer_pattern.observer.Observer;

import java.util.ArrayList;
import java.util.List;

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


public class CCTV implements ITV, Observable {


    private List<Observer> observers = new ArrayList<>();

    @Override
    public void startShow() {
        Log.e("lishling", "cctv===============startShow");
        notifyObserver(new TVStartEvent("cctv"));
    }

    @Override
    public void stopShow() {
        Log.e("lishling", "cctv===============stopShow");
        notifyObserver(new TVEndEvent("cctv"));
    }


    //如果想要加入优先级，或者线程之类的，也无非是使的 for 循环的过程丰富一些。
    @Override
    public void notifyObserver(IObserverEvent event) {
        for (Observer observer : observers) {
            observer.onNotify(event);
        }
    }


    // 如果想要采用编译期注解，或者 runtime 注解，其作用也无非使 add 和 delete 过程解耦
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }
}
