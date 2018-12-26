package my.examples.javaexam;

public class File1 {
    private String name;
    private long length;

    public File1(String name){
        this.name=name;
    }
    public void rename(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
