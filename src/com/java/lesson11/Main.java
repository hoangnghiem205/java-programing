package com.java.lesson11;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        try {


            FileInputStream fis = new FileInputStream("object.act");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student s = (Student) ois.readObject();
            System.out.println("THONG TIN STUDEN");
            System.out.println(s);


//            BufferedReader br = new BufferedReader(
//                    new InputStreamReader(System.in));
//
//            PrintWriter writer = new PrintWriter("noidung.txt");
//
//            int line = 1;
//
//            String text = "";
//            do {
//                System.out.print((line++) + ": ");
//                text = br.readLine();
//                if (text.equals("exit")) break;
//                writer.println(text);
//                writer.flush();
//            } while(true);
//            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }



        try {
            File f = new File("data.txt");

            if (f.exists()) {

                BufferedReader reader =
                        new BufferedReader(
                        new InputStreamReader(
                        new FileInputStream(f)));

                int num = Integer.parseInt(reader.readLine());
                System.out.println(num);
//                while (line != null) {
//                    System.out.println(line);
//                    line = reader.readLine();
//                }

//                FileInputStream fis = new FileInputStream(f);
//                FileOutputStream fos = new FileOutputStream("data_copy.txt");
//
//                int size = fis.available();
//
//                byte[] content = new byte[size];
//                fis.read(content);
//                fos.write(content);
////                for (int i = 0; i < size; i++) {
////                    System.out.print((char) fis.read());
////                }
//                fos.flush();
//                fos.close();
//                fis.close();


//            System.out.println("Abs path " + f.getAbsolutePath());
//            System.out.println("File path: " + f.getPath());
//            f.renameTo(new File("data_rename.txt"));
//            f.delete();
            } else {
                System.out.println("Khong ton tai");

                if (f.createNewFile()) {
                    System.out.println("Tao file thanh cong");
                } else {
                    System.out.println("Khong tao duoc file");
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
