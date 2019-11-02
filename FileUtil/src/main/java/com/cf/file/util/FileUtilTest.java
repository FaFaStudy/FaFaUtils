package com.cf.file.util;

import java.util.List;

/**
 * @author chenfa
 */
public class FileUtilTest {
    public static void main(String[] args) {
        //读取json文件，获取json字符串
        String filePath = "C:\\Users\\chenfa\\Desktop\\指纹库采集及存储说明\\wifi+蓝牙json格式\\WIFIscan.json";
        String jsonContent = FileUtil.ReadFile(filePath);
        System.out.println(jsonContent);
    }
}
