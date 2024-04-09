package company;
/*
import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.KeyStore.TrustedCertificateEntry;
import java.time.DateTimeException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.sql.rowset.spi.SyncResolver;
*/

public class ObjectSample {

    public static void main(String[] args) {
        
        var department = new Department("営業部", "xx", 1000000);
        var employee = new Employee("鈴木", department, "課長", 100);
        
        employee.report();
        employee.report(2);
        employee.joinMeeting();
        
        System.out.println("");
        
        var devDepartment = new Department("開発部", "yy", 0);
        var engineer = new Engineer("田中", devDepartment, "一般社員", 88,"Java");
        
        
        engineer.report();
        engineer.joinMeeting();
        engineer.developSoftware();
        
        Employee projectManager = new Engineer("佐藤", devDepartment, "PM", 99, "Java");
        
        projectManager.report();
        projectManager.joinMeeting();
        if (projectManager instanceof Engineer) {
            ((Engineer)projectManager).developSoftware();
            
        }
    }
    
        

   /*Lesson3 Chapter6.4 [オブジェクト]
        
    String a = new String("Hello");
    String b = new String("Hello");
    String c = a;
    
    System.out.println(a == b);
    System.out.println(a == c);
    
    System.out.println(a.equals(b));
    
    Double d = 3.14;
    System.out.println(d.toString());
    
    System.out.println(d.hashCode());
    
    
    //Lesson3 Chapter6.4 [文字列]
    
    String str = " Hello World! ";
    System.out.println(str.length());
    
    System.out.println(str.substring(1, 4));

    System.out.println(str.contains("llo"));
    
    System.out.println(str.replace('1', 'L'));
    
    System.out.println(str.trim());
    
    String name = "Alice";
    int age = 25;
    double height = 1.7;
    
    String formattedString = "Name: %s, Age: %d, Height: %.2f". formatted(name, age, height);
    System.out.println(formattedString);
    
    //Lesson3 Chapter6.4 [数値]
    
    System.out.println(Math.abs(-5));
    
    System.out.println(Math.ceil(3.3));
    System.out.println(Math.floor(3.7));
    System.out.println(Math.round(3.5));
    
    System.out.println(Math.max(5,10));
    System.out.println(Math.min(5,10));
    
    System.out.println(Math.random());
    
    
  //Lesson3 Chapter6.4 [日付と時刻]
    
    System.out.println(LocalDate.now());
    System.out.println(LocalDate.of(2023, Month.DECEMBER, 5 ));
    
    System.out.println(LocalTime.now());
    System.out.println(LocalTime.of(13, 45));
    
    System.out.println(LocalDateTime.now());
    System.out.println(LocalDateTime.of(2023, Month.DECEMBER, 5,13,45
            ));
    System.out.println(Period.between(LocalDate.of(2023,1,1),LocalDate.of(2023,12,31)));
    System.out.println(Duration.between(LocalTime.of(9, 1), LocalTime.of(17, 0)));
    
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    System.out.println(LocalDateTime.now().format(formatter));
    
    try {
        System.out.println(LocalDateTime.parse("2023/12/05 15:30:45", formatter));
    } catch (DateTimeException e) {
        System.out.println("Error" + e.getMessage());
    }
    
    var tokyoTime = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
    
    var utcTime = tokyoTime.withZoneSameInstant(ZoneOffset.UTC);
    
    System.out.println("Tokyo Time: " + tokyoTime);
    System.out.println("UTC Time: " + utcTime);
    }
    
  //Lesson3 Chapter6.4 [テキストファイル]
    
    String content = "これは最初の行です。\nこれは次の行です。\nそして、これが最後の行です。";
    
    
    try {
        
        Files.writeString(Paths.get("example.txt"),content);
        
        String content2 = Files.readString(Paths.get("example.txt"));
        System.out.println(content2);
        
        List<String> lines = Files.readAllLines(Paths.get("example.txt"));
        var lineNumber = 1;
        for (String line : lines) {
            System.out.println("%d行目：％s".formatted(lineNumber,line));
            lineNumber++;
        }
    } catch (IOException e) {
        e.printStackTrace(); */
    }

