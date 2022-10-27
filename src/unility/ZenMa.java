/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unility;

import java.text.Normalizer;
import java.util.Random;
import java.util.regex.Pattern;

/**
 *
 * @author ACER
 */
public class ZenMa {
    public static String ZenMaTheoTen(String value){//NGUyỄN ANH DŨNG
        if(value.isEmpty()|| value.isBlank()) return "";
        var temp = value.trim().toLowerCase();//nguyễn anh dũng
        String[] arrName = temp.split("\\s+");//cắt chuỗi về mảng
        String finalName =VietHoaChuCaiDau(arrName[arrName.length-1]).trim();//dũng
        for (int i = 0; i < arrName.length-1; i++) {
            finalName += LayChuCaiDau(arrName[i]);
        }
        return unAccent(finalName);// Dungna
    }
     public static String ZenMaTheoTensv(String value){//NGUyỄN ANH DŨNG
        Random ran = new Random();
        int number = ran.nextInt(1000);
        if(value.isEmpty()|| value.isBlank()) return "";
        var temp = value.trim().toLowerCase();//nguyễn anh dũng
        String[] arrName = temp.split("\\s+");//cắt chuỗi về mảng
        String finalName =VietHoaChuCaiDau(arrName[arrName.length-1]).trim();//dũng
        for (int i = 0; i < arrName.length-1; i++) {
            finalName += LayChuCaiDau(arrName[i]);
        }
        return unAccent(finalName)+"ph"+number;// Dungna
    }
     
     public static String ZenMaTheoTengv(String value){//NGUyỄN ANH DŨNG
        Random ran = new Random();
        int number = ran.nextInt(1000);
        if(value.isEmpty()|| value.isBlank()) return "";
        var temp = value.trim().toLowerCase();//nguyễn anh dũng
        String[] arrName = temp.split("\\s+");//cắt chuỗi về mảng
        String finalName =VietHoaChuCaiDau(arrName[arrName.length-1]).trim();//dũng
        for (int i = 0; i < arrName.length-1; i++) {
            finalName += LayChuCaiDau(arrName[i]);
        }
        return unAccent(finalName)+"gv"+number;// Dungna
    }
    //2.phuong thuc viet hoa full name
    public static String VietHoaFullName(String value){//NGUyỄN ANH DŨNG
        var temp = value.trim().toLowerCase();//nguyễn anh dũng
        String[] arrName = temp.split("\\s+");//cắt chuỗi về mảng
        String finalName ="";//dũng
        for (int i = 0; i < arrName.length; i++) {
            finalName +=VietHoaChuCaiDau(arrName[i]);
        }
        return finalName;
    }
    
    private static String VietHoaChuCaiDau(String value){ //dũng => Dũng
        var temp = value.trim().toLowerCase();
        return String.valueOf(temp.charAt(0)).toUpperCase()+temp.substring(1)+" ";//=>D
    }
    // phương thức lấy chữ cái đầu
    private static String LayChuCaiDau(String value){ //dũNg => D
        var temp = value.trim().toLowerCase();//dũng
        return String.valueOf(temp.charAt(0));//=>D
    }
    
    private static String unAccent(String s) {//Convert từ tiếng việt có dấu về tiếng việt 0 dấu
    String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
    Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
    return pattern.matcher(temp).replaceAll("").replaceAll("Đ", "D").replace("đ", "d");
  }
}
