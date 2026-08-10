import java.util.TreeSet;

class Record implements Comparable<Record>
 {

    String name;
    int Rollno;

    public Record(String name, int Rollno)
     {
        this.name = name;
        this.Rollno = Rollno;
    }

    @Override
    public int compareTo(Record r) 
    {
        return this.Rollno - r.Rollno;
    }

    @Override
    public String toString() 
    {
        return "Name: " + name + ", Roll No: " + Rollno;
    }
}

public class TreesetRecord {

    public static void main(String[] args) {

        TreeSet<Record> records = new TreeSet<>();
        Record a =new Record("Akshay",77);
        Record obj = new Record("Pratik",76);
        records.add(a);
        records.add(obj);

        System.out.println(records);
        
    }
}