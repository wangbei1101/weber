package org.weber.cache;

import java.io.Serializable;

/**
 * User: wangbei
 * Date: 2015/12/18
 * Time: 15:39
 * Desc:
 */
public class Account implements Serializable {

    private int id;

    private String name;

    public Account(String name){
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
