package example.io;

import java.io.File;
import java.io.IOException;

public class FileTest {

    public void  createFile() throws IOException{

        File file =new  File("E:\\JAVA学习\\java.txt");
        Boolean flag = file.createNewFile();   //创建普通文件

    }

    public  void createDirectory(){
        File file =new  File("E:\\JAVA");
        file.mkdir();

    }

    public void deleteFile(String  filePath ){

        File file = new File(filePath);
        if(file.exists()){
            file.delete();
        }

    }

    public void deleteDirectory(){


    }


    public  void  write2file(){

    }



}
