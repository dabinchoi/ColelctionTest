package my.examples.javaexam;
import java.util.*;
public class Folder1 {
    private String name;
    private List<File> files;
    private List<Folder> folders;

    public Folder1(String name){

    }
    public void rename(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

}
