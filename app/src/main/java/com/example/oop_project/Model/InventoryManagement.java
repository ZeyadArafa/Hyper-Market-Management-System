package com.example.oop_project.Model;
import java.lang.Exception;
import java.util.List;
import java.lang.Throwable;
public class InventoryManagement extends Employee{

    public static WareHouse warehouse;

    public InventoryManagement() {
        super();
    }

    public InventoryManagement(String username, String password) {
        super(username, password);
    }

    public InventoryManagement(InventoryManagement in) {
        super(in);
    }


}
