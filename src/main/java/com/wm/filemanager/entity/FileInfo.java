package com.wm.filemanager.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "file_info")
public class FileInfo implements Serializable {
    private static final long serialVersionUID = 2673433359137655024L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "file_ext")
    private String fileExt; //文件扩展名

    @Column(name = "file_size")
    private Integer fileSize;  //文件大小

    @Column(name = "file_create_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private LocalDateTime fileCreateTime; //创建时间

    @Column(name = "file_address")
    private String fileAddress; //文件地址

    @Column(name = "content_type")
    private String contentType; //文件类型

    @Column(name = "delete_flag")
    private Integer deleteFlag;
}
