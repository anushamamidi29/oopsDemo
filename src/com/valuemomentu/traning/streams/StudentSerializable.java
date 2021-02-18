package com.valuemomentu.traning.streams;

import java.io.Serializable;

public class StudentSerializable implements Serializable {
int id;
String name;
public StudentSerializable(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}

}
