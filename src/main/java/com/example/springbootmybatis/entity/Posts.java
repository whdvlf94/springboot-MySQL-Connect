package com.example.springbootmybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.w3c.dom.Text;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Posts {
    private int id;
    private String user_id;
    private String title;
    private Text contents;
    private int del_yn;
    private Date createAt;

    public Posts(int id, String user_id, String title, Text contents) {
        this.id = id;
        this.user_id = user_id;
        this.title = title;
        this.contents = contents;
    }
}
