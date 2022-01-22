import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner nao = new Scanner(System.in);
        
        ArrayList <Figuras> figureList = new ArrayList<>();
        ArrayList <String> nameList = new ArrayList<>();
        
        Figuras figureOne = new Figuras();

        String figureName;
        int figureID=0;

        while(nao.hasNextLine()){
            figureName = nao.nextLine();
            figureOne = new Figuras(figureID, figureName);
            figureList.add(figureOne);
        }

        for(Figuras f: figureList){
            nameList.add(f.getName());
        }

        figureOne.repeat(nameList);
        nao.close();
    }
}