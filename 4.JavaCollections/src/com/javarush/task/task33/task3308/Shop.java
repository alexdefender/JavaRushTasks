package com.javarush.task.task33.task3308;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlType(name = "shop")
@XmlRootElement
public class Shop {
    public Goods goods;    // товары
    public int count;
    public double profit;  // прибыль
    public String[] secretData;

    static class Goods {
        List names;
    }
}
