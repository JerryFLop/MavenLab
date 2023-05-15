package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class People {
List<Person> personlist = new LinkedList<>();

  public void add(Person person){

      personlist.add(person);

}
public Person findById(long id){
for(Person findId: personlist){
    Long helpMeWithId = findId.getId();
    if(helpMeWithId.equals(id)){
        return findId;
    }
}

      return null ;
}
public boolean contains(Person person){
    return personlist.contains(person);
}

public void remove(Person person){
      personlist.remove(person);
}


public void removeId(long id){
      for(Person byeId : personlist){
          if(byeId.getId() == id){
               personlist.remove(byeId);
          }
      }


}


public void removeAll(){
      personlist.clear();
}


public int count(){

   return personlist.size();













}













}
