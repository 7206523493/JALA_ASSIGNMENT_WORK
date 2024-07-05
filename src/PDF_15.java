//import java.io.FileInputStream;
//import java.io.IOException;
//import org.apache.poi.ss.usermodel.*;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//
//public class ReadUsingInputStream {
//    public static void main(String[] args) {
//        try (FileInputStream fis = new FileInputStream("example.txt")) {
//            int content;
//            while ((content = fis.read()) != -1) {
//                System.out.print((char) content);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
//
//
//public class WriteUsingOutputStream {
//    public static void main(String[] args) {
//        String data = "This is a test text.";
//        try (FileOutputStream fos = new FileOutputStream("example.txt")) {
//            fos.write(data.getBytes());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
//import java.io.BufferedInputStream;
//        import java.io.FileInputStream;
//        import java.io.IOException;
//
//public class ReadUsingBufferedInputStream {
//    public static void main(String[] args) {
//        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("example.txt"))) {
//            int content;
//            while ((content = bis.read()) != -1) {
//                System.out.print((char) content);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
//import java.io.BufferedOutputStream;
//        import java.io.FileOutputStream;
//        import java.io.IOException;
//
//public class WriteUsingBufferedOutputStream {
//    public static void main(String[] args) {
//        String data = "This is a test text.";
//        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("example.txt"))) {
//            bos.write(data.getBytes());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
//import java.io.BufferedOutputStream;
//        import java.io.FileOutputStream;
//        import java.io.IOException;
//
//public class WriteUsingBufferedOutputStream {
//    public static void main(String[] args) {
//        String data = "This is a test text.";
//        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("example.txt"))) {
//            bos.write(data.getBytes());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
//import java.io.FileReader;
//        import java.io.IOException;
//
//public class ReadUsingFileReader {
//    public static void main(String[] args) {
//        try (FileReader fr = new FileReader("example.txt")) {
//            int content;
//            while ((content = fr.read()) != -1) {
//                System.out.print((char) content);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
//import java.io.FileWriter;
//        import java.io.IOException;
//
//public class WriteUsingFileWriter {
//    public static void main(String[] args) {
//        String data = "This is a test text.";
//        try (FileWriter fw = new FileWriter("example.txt")) {
//            fw.write(data);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
//import java.io.BufferedReader;
//        import java.io.FileReader;
//        import java.io.IOException;
//
//public class ReadUsingBufferedReader {
//    public static void main(String[] args) {
//        try (BufferedReader br = new BufferedReader(new FileReader("example.txt"))) {
//            String line;
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
//import java.io.BufferedReader;
//        import java.io.FileReader;
//        import java.io.IOException;
//
//public class ReadUsingBufferedReader {
//    public static void main(String[] args) {
//        try (BufferedReader br = new BufferedReader(new FileReader("example.txt"))) {
//            String line;
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
//import java.io.BufferedWriter;
//        import java.io.FileWriter;
//        import java.io.IOException;
//
//public class WriteUsingBufferedWriter {
//    public static void main(String[] args) {
//        String data = "This is a test text.";
//        try (BufferedWriter bw = new BufferedWriter(new FileWriter("example.txt"))) {
//            bw.write(data);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
//import java.io.FileInputStream;
//        import java.io.IOException;
//        import java.util.Properties;
//
//public class ReadPropertiesFile {
//    public static void main(String[] args) {
//        try (FileInputStream fis = new FileInputStream("config.properties")) {
//            Properties prop = new Properties();
//            prop.load(fis);
//            System.out.println("Property value: " + prop.getProperty("key"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
//import org.apache.poi.ss.usermodel.*;
//        import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//        import java.io.FileInputStream;
//        import java.io.IOException;
//
//public class ReadExcelFile {
//    public static void main(String[] args) {
//        try (FileInputStream fis = new FileInputStream("example.xlsx");
//             Workbook workbook = new XSSFWorkbook(fis)) {
//            Sheet sheet = workbook.getSheetAt(0);
//            for (Row row : sheet) {
//                for (Cell cell : row) {
//                    switch (cell.getCellType()) {
//                        case STRING:
//                            System.out.print(cell.getStringCellValue() + "\t");
//                            break;
//                        case NUMERIC:
//                            System.out.print(cell.getNumericCellValue() + "\t");
//                            break;
//                        default:
//                            break;
//                    }
//                }
//                System.out.println();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
//
//public class WriteExcelFile {
//    public static void main(String[] args) {
//        Workbook workbook = new XSSFWorkbook();
//        Sheet sheet = workbook.createSheet("Sheet1");
//
//        Row row = sheet.createRow(0);
//        Cell cell = row.createCell(0);
//        cell.setCellValue("Hello, Excel!");
//
//        try (FileOutputStream fos = new FileOutputStream("example.xlsx")) {
//            workbook.write(fos);
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                workbook.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
