package common.util;

import org.apache.poi.ss.usermodel.*;
import org.springframework.util.ObjectUtils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;

public class ExcelUtil {

    public static void main(String[] args) {
        readExcel("E:\\yunda\\二期\\微笑基础数据表(1).xlsx");
    }

    private static void readExcel(String path) {
        File file = new File(path);
        FileInputStream fis = null;
        Workbook workBook = null;
        if (file.exists()) {
            try {
                fis = new FileInputStream(file);
                workBook = WorkbookFactory.create(fis);
                int numberOfSheets = workBook.getNumberOfSheets();
                Sheet sheetAt1 = workBook.getSheet("one");
                Sheet sheetAt = workBook.getSheetAt(0);
                //获取工作表名称
                String sheetName = sheetAt1.getSheetName();
                System.out.println("工作表名称：" + sheetName);
                // 获取当前Sheet的总行数
                int rowsOfSheet = sheetAt1.getPhysicalNumberOfRows();
                System.out.println("当前表格的总行数:" + rowsOfSheet);
                for(int i =0;i<rowsOfSheet;i++){
                    if(ObjectUtils.isEmpty(sheetAt1.getRow(i))){continue;}
                    Row row = sheetAt1.getRow(i);
                    String str = "insert into ordercenter_dict ( dict_code, dict_name, dict_value, description, dict_type, deleted, create_time,create_by, update_time, update_by ,remark)values ( ' ";
                    String str1 = "','订单来源','";
                    String str2 = "','订单来源','OrderSource',0,now(),'',now(),'','');";
                    String  first =getStr(row.getCell(0));
                    String  two =getStr(row.getCell(1));
                    System.out.println(str+first+str1+two+str2);
                }
                if (fis != null) {
                    fis.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("文件不存在!");
        }
    }

    private static String getStr(Cell cell){
        Object obj = null;
        if (cell.getCellTypeEnum() == CellType.NUMERIC) {
            obj = (int) cell.getNumericCellValue();
        }
        if (cell.getCellTypeEnum() == CellType.STRING) {
            obj = cell.getStringCellValue();
        }
        if (cell.getCellTypeEnum() == CellType.STRING) {
            obj = cell.getStringCellValue();
        }
        if (cell.getCellTypeEnum() == CellType.NUMERIC) {
            obj = cell.getDateCellValue();
        }
        if (cell.getCellTypeEnum() == CellType.NUMERIC) {
            obj = cell.getNumericCellValue();
        }
        return String.valueOf(obj);
    }
}
