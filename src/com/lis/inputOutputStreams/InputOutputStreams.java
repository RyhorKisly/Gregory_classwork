package com.lis.inputOutputStreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class InputOutputStreams {


    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        Копируем файлы из одной директории в другую
//        Scanner scanner = new Scanner(System.in);
//        Path sourceDirectory = Path.of(scanner.nextLine());
//        Path targetDirectory = Path.of(scanner.nextLine());
//        try(DirectoryStream<Path> files = Files.newDirectoryStream(sourceDirectory)) {
//            for (Path file : files) {
//                if(Files.isRegularFile(file)) {
//                    Path resolve = targetDirectory.resolve(file.getFileName());
//                    Files.copy(file, resolve);
//                }
//            }
//        }






        //out
//        System.out.println("something");
//        System.err.println("something");






        // Enter data using Scanner
//        Scanner in = new Scanner(System.in);
//        System.out.println("You entered string :");
//        System.out.println(in.nextLine());
//        System.out.println("You entered integer :");
//        System.out.println(in.nextInt());
//
//
//        System.out.println("You entered float :");
//        System.out.println(in.nextFloat());
//        in.close();











//        Scanner in = new Scanner(System.in);
//        while (true) {
//            System.out.println("You entered integer :");
//            if (in.hasNextInt()) {
//                System.out.println("Done");
//                break;
//            } else {
//                in.next();
//            }
//        }
//        in.close();











//        // Enter data using BufferReader
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String name = null;
//        try {
//            name = reader.readLine();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                reader.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        System.out.println(name);











        // read from file java < 1.7
//        BufferedReader reader = null;
//        try {
//            reader = new BufferedReader(
//                    new InputStreamReader(
//                            new FileInputStream("FILE_NAME"), Charset.forName("UTF-8")));
//            String line;
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            // log error
//        } finally {
//            if (reader != null) {
//                try {
//                    reader.close();
//                } catch (IOException e) {
//                    // log warning
//                }
//            }
//        }








        // read from file java = 1.7
//        try (BufferedReader reader = new BufferedReader(
//                new InputStreamReader(
//                        new FileInputStream("FILE_NAME"), StandardCharsets.UTF_8))){
//            String line;
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            // log error
//        }











        List<String> lines = Files.readAllLines(Paths.get("FILE_NAME"), StandardCharsets.UTF_8);
        for(String line: lines){
            System.out.println(line);
        }












        // java = 8
//        Files.lines(Paths.get("FILE_NAME"), StandardCharsets.UTF_8).forEach(System.out::println);













//         пишем в файл с помощью OutputStream
//        String data = "someData";
//        OutputStream os = null;                                                                          // Для автоматического закрытия файла и освобождения
//        try {                                                                                            // ресурса объект FileOutputStream создается с помощью конструктции try...catch.
//            os = new FileOutputStream(new File("C:\\Users\\Workstation\\IdeaProjects" +          // Мjжно добавить true - файл добавиться снизу, или false - файл перезапишется
//                    "\\Gregory_classwork\\src\\com\\lis\\inputOutputStreams\\MisterFile"));
//            os.write(data.getBytes(), 0, data.length());                                             // Первое в скобках - перевод строки в байты
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                os.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }


//          читаем с файла с помощь. InputStream
//        FileInputStream fin = null;
//        try {
//            fin = new FileInputStream("C:\\Users\\Workstation\\IdeaProjects\\Gregory_classwork\\src\\com\\lis\\inputOutputStreams\\MisterFile");
//            int i = -1;
//            while ((i = fin.read()) != -1) {
//                System.out.print((char) i);
//            }
//        } catch (IOException ex) {
//
//            System.out.println(ex.getMessage());
//        } finally {
//            try {
//                if (fin != null)
//                    fin.close();
//            } catch (IOException ex) {
//                System.out.println(ex.getMessage());
//            }
//        }











//        Пишем с консоли и записываем в файл
//        try(BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
//            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Workstation\\IdeaProjects\\Gregory_classwork\\src\\com\\lis\\inputOutputStreams\\MisterFile")))
//        {
//            // чтение построчно
//            String text;
//            while(!(text=br.readLine()).equals("ESC")){
//                text=br.readLine();
//                bw.write(text + "\n");
//                bw.flush();
//                System.out.println(text);
//            }
//        }
//        catch(IOException ex){
//
//            System.out.println(ex.getMessage());
//        }





















    // пишем в файл с помощью BufferedWriter
        //BufferedWriter br = null;
        //try{
        //    br = new BufferedWriter(new FileWriter(new File("PATH_TO_FILE")));
        //    br.write(data);
        //} catch (IOException e) {
        //    e.printStackTrace();
        //}finally{
        //    try {
        //        br.close();
        //    } catch (IOException e) {
        //        e.printStackTrace();
        //    }
        //}


































        // пишем в файл с помощью FileWriter
        //File file = new File("PATH_TO_FILE");
        //FileWriter fr = null;
        //try {
        //    fr = new FileWriter(file);
        //    fr.write(data);
        //} catch (IOException e) {
        //    e.printStackTrace();
        //}finally{
        //    try {
        //        fr.close();
        //    } catch (IOException e) {
        //        e.printStackTrace();
        //    }
        //}







//         пишем в файл с помощью Files
//        Files.write(Paths.get("PATH_TO_FILE"), "data".getBytes());



















//
//        FileOutputStream fos = new FileOutputStream("FILE_NAME");
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        oos.writeInt(12345);
//        oos.writeObject("Today");
//        oos.writeObject(new Date());
//        oos.close();


        //FileInputStream fis = new FileInputStream("FILE_NAME");
        //ObjectInputStream ois = new ObjectInputStream(fis);
        //int i = ois.readInt();
        //String today = (String) ois.readObject();
        //Date date = (Date) ois.readObject();
        //ois.close();
        //System.out.println(i);
        //System.out.println(today);
        //System.out.println(date);

    }
}
