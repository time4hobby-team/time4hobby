/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.time4hobby.model;

/**
 *
 * @author Sindhu
 */
public enum Category {

    MUSIC("Music", Specialization.VOCAL, Specialization.PIANO, Specialization.GUITAR, Specialization.TRUMPET),
    DANCE("Dance"),
    KNITTING("Knitting");
    private final Specialization[] spec;
    private final String name;

    public Specialization[] getSpec() {
        return spec;
    }

    Category(String name, Specialization... spec) {
        this.name = name;
        this.spec = spec;
    }
}
