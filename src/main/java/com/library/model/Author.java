package com.library.model;

import java.util.List;

public class Author {

private int id;
private String fullName;
@Builder.Default
private List <Book> books = new ArrayList<>();
}
