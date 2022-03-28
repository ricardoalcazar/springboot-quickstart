package com.alcazar.spring.quickstart;


/**
 * Domain class for quick start
 */

public class Quote {

    /** instance variables */
    private String type;
    private String value;


    /**
     * Default constructor
     */
    public Quote(){
        type = new String();
        value = new String();
    }

    /**
     * Default constructor
     * @param type
     * @param value
     */
    public Quote(String type, String value){
        this.type = type;
        this.value = value;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Returns a string representation of the <class>Quote</class>
     * @return
     */
    public String toString(){
        return "Type: " + type + " Value: " + value;
    }

}
