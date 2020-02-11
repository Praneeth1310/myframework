package com.thd.common.utils;
//import org.apache.commons.collections4.bag.SynchronizedSortedBag;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Excelutil {

    public ArrayList<String> readxlFname(int colno0, int colno1) throws IOException {


        String dir = System.getProperty("user.dir");
        String replaceString = dir.replace("\\","\\\\");
        System.out.println("current dir = " + replaceString);
        FileInputStream fis = new FileInputStream(replaceString+"\\src\\test\\resources\\Testdata.xls");
        HSSFWorkbook wb = new HSSFWorkbook(fis);
        HSSFSheet sheet = wb.getSheet("NameGenerator");
        System.out.println(sheet);
        Iterator<Row> rowit1 = sheet.iterator();
        Iterator<Row> rowit2 = sheet.iterator();
        rowit1.next();
        rowit2.next();
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();
        while (rowit1.hasNext()) {
            list1.add(rowit1.next().getCell(colno0).getStringCellValue());
            list2.add(rowit2.next().getCell(colno1).getStringCellValue());
        }
//        System.out.println(list2);
        int length = list1.size();
        if (length != list2.size()) { // Too many names, or too many numbers // Fail
            System.out.println("Both the Lists are of different sizes. Please check and update the sheet");
        }
        // Make a new list
        ArrayList<String> array3 = new ArrayList<String>(length);
        for (int i = 0; i < length; i++) { // Loop through every name/phone number combo
             array3.add(list1.get(i) + "" + list2.get(i));
             Collections.shuffle(array3);
        // Concat the two, and add it
        }
        System.out.println(array3);
        return array3;
    }

    public ArrayList<String> readxlLname(int colno2 , int colno3) throws IOException {
        String dir = System.getProperty("user.dir");
        String replaceString = dir.replace("\\","\\\\");
        System.out.println("current dir = " + replaceString);
        FileInputStream fis = new FileInputStream(replaceString+"\\src\\test\\resources\\Testdata.xls");
//        FileInputStream fis = new FileInputStream("C:\\Users\\RXM8315\\workspace\\THD_WD_AUTO_1130\\src\\test\\resources\\Testdata.xls");
        HSSFWorkbook wb = new HSSFWorkbook(fis);
        HSSFSheet sheet = wb.getSheet("NameGenerator");
        System.out.println(sheet);
        Iterator<Row> rowit1 = sheet.iterator();
        Iterator<Row> rowit2 = sheet.iterator();
        rowit1.next();
        rowit2.next();
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();
        while (rowit1.hasNext()) {
            list1.add(rowit1.next().getCell(colno2).getStringCellValue());
            list2.add(rowit2.next().getCell(colno3).getStringCellValue());
        }
//        System.out.println(list2);
        int length = list1.size();
        if (length != list2.size()) { // Too many names, or too many numbers // Fail
            System.out.println("Both the Lists are of different sizes. Please check and update the sheet");
        }
        // Make a new list
        ArrayList<String> array3 = new ArrayList<String>(length);
        for (int i = 0; i < length; i++) { // Loop through every name/phone number combo
            array3.add(list1.get(i) + "" + list2.get(i));
            Collections.shuffle(array3);
            // Concat the two, and add it
        }
        System.out.println(array3);
        return array3;


    }
    public  String  SSNGenerator() {


            long timeSeed = System.nanoTime(); // to get the current date time value

            double randSeed = Math.random() * 1000; // random number generation

            long midSeed = (long) (timeSeed * randSeed); // mixing up the time and
            // rand number.

            // variable timeSeed
            // will be unique


            // variable rand will
            // ensure no relation
            // between the numbers

            String s = midSeed + "";
            String subStr = s.substring(0, 9);

            int finalSeed = Integer.parseInt(subStr);    // integer value

            System.out.println(finalSeed);
            String Final = String.valueOf(finalSeed);
            return Final;

        }





// public static void main(String[] args) throws IOException, InterruptedException {
//        Excelutil util = new Excelutil();
//      ArrayList<String> FName = util.readxlFname(0, 1);
//     System.out.println(FName);
//        ArrayList<String> LName = util.readxlLname(2);
//     System.out.println(LName);
//     System.out.println(util.ssngenerator);
//     util.NumberGen();
//        }

}