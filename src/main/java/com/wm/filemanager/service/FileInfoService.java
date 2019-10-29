package com.wm.filemanager.service;

import com.wm.filemanager.entity.FileInfo;
import com.wm.filemanager.repository.FileInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class FileInfoService {
    @Autowired
    private FileInfoRepository fileInfoRepository;

    public FileInfo upload(MultipartFile file){
        FileInfo fileInfo = new FileInfo();
        if (!file.isEmpty()){
            try {
                String fileName = file.getOriginalFilename();//获取原始文件名
                fileInfo.setFileName(fileName);
                String extName = fileName.substring(fileName.lastIndexOf(".")); //文件扩展名
                fileInfo.setFileExt(extName);
                String filePath = "D:/upload/"; //文件保存路径
                fileName = filePath + UUID.randomUUID() + extName;
                fileInfo.setFileAddress(fileName);
                fileInfo.setFileSize(file.getSize());
                fileInfo.setContentType(file.getContentType());
                fileInfo.setFileCreateTime(LocalDateTime.now());
                fileInfo.setDeleteFlag(0);
                File finalFile = new File(fileName);
                if(!finalFile.getParentFile().exists()){
                    finalFile.getParentFile().mkdirs();
                }
                file.transferTo(finalFile);
                return fileInfoRepository.save(fileInfo);

            }catch (Exception e){
                e.printStackTrace();
            }
        }

        return null;
    }
}
