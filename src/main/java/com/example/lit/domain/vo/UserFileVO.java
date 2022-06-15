package com.example.lit.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class UserFileVO {
    private String uuid;
    private String uploadPath;
    private String name;
    private String image;
    private Long userNumber;
}
