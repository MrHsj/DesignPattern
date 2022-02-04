package com.hsj.pattern.observer.improve;


// 接口, 让WeatherData来实现
public interface Subject {

    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}

