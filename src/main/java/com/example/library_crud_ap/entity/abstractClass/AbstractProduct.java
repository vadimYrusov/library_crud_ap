package com.example.library_crud_ap.entity.abstractClass;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
public abstract class AbstractProduct {

    private Long id;

    private String title;

    private String publishing;

    private String edition;

    private String theme;

    private String category;

    private String author;

    private Date release_date;
}
