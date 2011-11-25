import java.util.*;
public class AboutCollections
{
    public AboutCollections(){
    }

    public void mapSampleCode(){
        Map<String,Integer> phoneBook = new HashMap<String,Integer>();
        phoneBook.put("Weber-Wulff",2320);
        phoneBook.put("Busch",2214);
        phoneBook.put("Strippgen",3593);
        phoneBook.put("Jung",2877);
        phoneBook.put("Barthel",2416);
        phoneBook.put("Kleinen",3499);

        Set<String> names = phoneBook.keySet();
        List<String> nameList = new ArrayList<String>();
        nameList.addAll(names);
        Collections.sort(nameList);
        for (String name : nameList){
            System.out.println(name+" - ");
            System.out.println("       "
                +phoneBook.get(name));
        }
    }

}
