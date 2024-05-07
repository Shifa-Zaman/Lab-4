//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestList  {
    public static void main(String[] args) throws IOException {
        List<String[]> test = new ArrayList<>();
        BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\angela\\IdeaProjects\\CsvFile\\src\\SampleCSVFile_2kb.txt"));
        String line;
        while ((line=bf.readLine())!=null){
            String [] cells=line.split(",");
            test.add(cells);
        }

        for (String[] cells : test) {
            for (String cell : cells) {
                System.out.println(cell);
            }
            System.out.println();
        }

    }



}