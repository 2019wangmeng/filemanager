package com.wm.filemanager.repository;

import com.wm.filemanager.entity.FileInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileInfoRepository extends JpaRepository<FileInfo,Integer> {
}
