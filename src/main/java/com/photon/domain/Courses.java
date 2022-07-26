package com.photon.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Courses {
    private Long id;
    private String title;
    private String desc;
    private String link;
}
