package com.nikola;

import com.nikola.model.Datasource;

public class Main {

    public static void main(String[] args) {
        Datasource datasource = new Datasource();
        if(!datasource.open()) {
            System.out.println("Can't open datasource");
            return;
        }

        datasource.close();
    }
}
