public class Lab1Stage1 {

public static void main(String[] args){
    Animal[] allAnimals;
    int i;
    
    Animal a = new Animal();

    allAnimals = new Animal[3];
   
    allAnimals[0] = new Cat("Kurre");
    allAnimals[1] = new Dog("Vilma");
    allAnimals[2] = new Cat("Bamse");
    
    for (i = 0; i < allAnimals.length; i = i + 1){
        allAnimals[i].introduceYourself();    
    }
}
    
}

