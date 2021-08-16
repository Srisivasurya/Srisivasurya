package Test;
import java.util.ArrayList;
import java.util.List;

public class Array1 {
    public static void main(String[] args)
    {
        List<String> data=new ArrayList<>();
        data.add("Java");
        data.add("cobol");
        data.add("java");
        data.add("c++");
        data.add("javascript");
        data.add("javascript");
        data.add("c++");
        System.out.println(data);
        List<String> data2=new ArrayList<>();
        for(String data0:data){
            if(!data2.contains(data0))
            {
                data2.add(data0);
            }
        }
        for(String data3: data2)
        {
            System.out.println("data2:"+data2);
        }
    }
}
