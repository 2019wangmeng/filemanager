package com.wm.filemanager.controller;

import com.wm.filemanager.entity.FileInfo;
import com.wm.filemanager.service.FileInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api")
public class FileInfoController {

    @Autowired
    private FileInfoService fileInfoService;

    @PostMapping("/upload")
    public FileInfo upload(@RequestParam MultipartFile file){
        return fileInfoService.upload(file);
    }
}
