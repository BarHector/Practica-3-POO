import java.util.ArrayList;

class Figuras {
    private Integer id;
    private String name;
    
    public Figuras(){
        id = 0;
        name = null;
    }

    public Figuras(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void repeat(ArrayList<String> originalList){
        ArrayList <String> figuresList = new ArrayList<>();
        ArrayList <Integer> repeat = new ArrayList<>();
        int r=0;
        String nameTwo;
        
        figuresList.add("TRIANGULO");
        figuresList.add("CUADRADO");
        figuresList.add("RECTANGULO");
        figuresList.add("ROMBO");
        figuresList.add("ROMBOIDE");
        figuresList.add("TRAPECIO");
        figuresList.add("POLIGONO REGULAR");
        figuresList.add("CIRCULO");

        for (int i = 0; i < figuresList.size(); i++){
            for (int j = 0; j < originalList.size(); j++){
                if(figuresList.get(i).equals(originalList.get(j))){    
                    r++;
                }
            }

            repeat.add(r);
            r=0;
        }

        for (int i = 0; i < figuresList.size(); i++) {
            nameTwo = figuresList.get(i).substring(0, 1).toUpperCase() + figuresList.get(i).substring(1).toLowerCase();
            System.out.println(nameTwo + ": " + repeat.get(i));
        }
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}