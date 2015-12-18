package org.weber.cache;

import java.io.Serializable;

/**
 * User: wangbei
 * Date: 2015/12/18
 * Time: 15:39
 * Desc:
 */
public class Account implements Serializable {


    private static final long serialVersionUID = 3876832359143250755L;

    private int id;

    private String name;

    private String no;

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

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }
}
