package com.javarush.task.task32.task3208;

import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Locale;

/* 
RMI-2
*/
public class Solution {
    public static final String UNIC_BINDING_NAME = "server.reverse";
    public static Registry registry;

    //pretend we start rmi client as CLIENT_THREAD thread
    public static Thread CLIENT_THREAD = new Thread(new Runnable() {
        @Override
        public void run() {
            try {
                for (String bindingName : registry.list()) {
                    Animal service = (Animal) registry.lookup(bindingName);
                    service.printName();
                    service.say();
                }
            } catch (RemoteException e) {
                e.printStackTrace();
            } catch (NotBoundException e) {
                e.printStackTrace();
            }
        }
    });

    //pretend we start rmi server as SERVER_THREAD thread
    public static Thread SERVER_THREAD = new Thread(new Runnable() {
        @Override
        public void run() {
            //напишите тут ваш код
            try {
                registry = LocateRegistry.createRegistry(2099);
                Cat cat = new Cat("Vasya");
                Dog dog = new Dog("Rex");
                Remote stubCat = UnicastRemoteObject.exportObject(cat, 0);
                Remote stubDog = UnicastRemoteObject.exportObject(dog, 0);
                registry.bind(UNIC_BINDING_NAME, stubCat);
                registry.bind(UNIC_BINDING_NAME, stubDog);
            } catch (RemoteException e) {
                e.printStackTrace(System.err);
            } catch (AlreadyBoundException e) {
                e.printStackTrace(System.err);
            }
        }
    });

    public static void main(String[] args) throws InterruptedException {
        //start rmi server thread
        SERVER_THREAD.start();
        Thread.sleep(1000);
        //start client
        CLIENT_THREAD.start();
    }
}