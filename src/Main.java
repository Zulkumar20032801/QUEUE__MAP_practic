import java.util.*;

public class Main {
    public static void main(String[] args) {

//         Homework 25.1
        
        Map<Car,CarDataBase>carDataBaseMap=new HashMap<>();

        carDataBaseMap.put(new Car(1,"В073ХС"),new CarDataBase(2007,"Bentley",1_000_000,"black"));
        carDataBaseMap.put(new Car(2,"В074ХС"),new CarDataBase(2010,"Faraday",1_200_000,"write"));
        carDataBaseMap.put(new Car(3,"В080ХС"),new CarDataBase(2015,"Bentley",800_000,"yellow"));
        carDataBaseMap.put(new Car(4,"В076ХС"),new CarDataBase(2021,"Ferrari Roma",42_000_000,"red"));
        carDataBaseMap.put(new Car(5,"В073ХС"),new CarDataBase(2023,"BMW i8 ",6_550_000,"black"));

        for (Map.Entry<Car,CarDataBase> i:carDataBaseMap.entrySet()) {
            System.out.println("key:"+i.getKey());
            System.out.println("value:"+i.getValue());
        }

//        Homework 25.2

        City city=new City(1,"London");
        City city1=new City(4,"Paris");
        City city2=new City(3,"Milan");
        City city3=new City(5,"Rim");
        City city4=new City(2,"Bishkek");

        ArrayList<City>cityArrayList=new ArrayList<>(Arrays.asList(city,city1,city2,city3,city4));
        TreeSet<City>citySet=new TreeSet<>();
        System.out.println("cityArrayList:"+cityArrayList);
        Collections.sort(cityArrayList);



        for (City c:cityArrayList) {
            if(c.getCode() % 2 !=0){
                citySet.add(c);
            }
        }
        System.out.print("TreeSet:"+citySet);
        }





    }
