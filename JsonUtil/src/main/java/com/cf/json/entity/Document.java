package com.cf.json.entity;

import lombok.Data;

@Data
public class Document {
    public int uploadSize;
    public int spaceId;
    public String fileName;
    public int fileSize;
    public String fileType;
    public int fileId;
}
