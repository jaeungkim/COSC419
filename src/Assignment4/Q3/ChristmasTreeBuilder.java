package Assignment4.Q3;


//Decorator design pattern question.
// You bought a beautiful Christmas tree on sale for $35.50,
// and you want to add three items to decorate the tree:
//- chain of colorful light --- cost 20.10
//- Candy canes from CandyLand – cost 25.20
//- sparking ribbons – cost 22.50.

//I am a beautiful Christmas Tree.
//I am a chain of colorful light.
//You need to plug me in to light up
// added candy stick from the world famous CandyLand
// Sweet !!
//I am a sparkling ribbon
//I add colors to the tree
// Ribbon cost 22.5
// candy stick cost 25.2
// light cost: 20.1
// xTree cost 35.5
//Total cost 103.3

import java.util.ArrayList;
import java.util.List;

// JAE UNG KIM - 37007135 COSC 419L
interface ChristmasTree {
    double price();
    String name();
}

//abstract class for light
class colorfulLight implements ChristmasTree{
    @Override
    public double price(){return 20.10;}

    @Override
    public String name(){return "I am a chain of colorful light.\n You need to plug me in to light up";}
}

//abstract class for candy canes
class candyCanes implements ChristmasTree{
    @Override
    public double price(){return 25.20;}

    @Override
    public String name(){return "added candy stick from the world famous CandyLand. \n Sweet !!";}
}

//abstract class for sparking ribbons
class sparkingRibbons implements ChristmasTree{
    @Override
    public double price(){return 22.50;}

    @Override
    public String name(){return "I am a sparkling ribbon. \n I add colors to the tree.";}
}

class Tree{
    private List<ChristmasTree> features = new ArrayList<>();
    public void addFeatures(ChristmasTree feature) {features.add(feature);}
    public double getCost(){
        double cost = 0.0;
        for(ChristmasTree feature : features){
            cost += feature.price();
        }
        return cost;
    }
    public void showItems(){
        for (ChristmasTree feature : features) {
            System.out.print(feature.name());
            System.out.println(", Price : " + feature.price());
        }
    }
}

class featureBuilder {
    public Tree prepareTree(){
        Tree tree = new Tree();
        tree.addFeatures(new colorfulLight());
        tree.addFeatures(new candyCanes());
        tree.addFeatures(new sparkingRibbons());
        return tree;
    }
}

public class ChristmasTreeBuilder {
    public static void main(String[] args) {

        featureBuilder featureBuilder = new featureBuilder();
        Tree tree = featureBuilder.prepareTree();
        tree.showItems();
        tree.getCost();

    }

}