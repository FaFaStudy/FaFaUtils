package com.cf.excel.util;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.util.CellAddress;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelTest {
    public static void main(String[] args) throws IOException {
//        String fin="C:\\Users\\chenfa\\Desktop\\cf.xls";
//        String fout="C:\\Users\\chenfa\\Desktop\\cf1.xls";
//        WriteLetter(fin,fout);
    }

    public static void WriteLetter(String fin, String fout) throws IOException {
        FileInputStream excelFileInputStream = new FileInputStream(fin);
        HSSFWorkbook workbook = new HSSFWorkbook(excelFileInputStream);//拿到文件转化为javapoi可操纵类型
        HSSFSheet sheet = workbook.getSheetAt(0);

        CellAddress address = new CellAddress("A3");//这样的构造方法可以直接拿到对应行和列下标
        HSSFRow row = sheet.getRow(address.getRow());//得到行
        System.out.println(row);
        HSSFCell cell = row.getCell(address.getColumn());//得到列
        System.out.println(cell);
        System.out.println(cell.getStringCellValue());//打印该数据到控制台

        cell.setCellValue("厚积薄发");//改变数据
        FileOutputStream excelFileOutPutStream = new FileOutputStream(fout);//写数据到这个路径上
        workbook.write(excelFileOutPutStream);

        excelFileInputStream.close();
        excelFileOutPutStream.close();
        System.out.println("done");
    }
}
