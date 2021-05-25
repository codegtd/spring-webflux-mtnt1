package com.mongo.api.core.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class PostDto{

    private String id;
    private Date date;
    private String title;
    private String body;
    private String authorName;
    private List<String> idComments = new ArrayList<>();
}
