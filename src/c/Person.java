package c;

/*
 * Thanks to ChatGPT
 * 
 */

class Person implements Cloneable {
  String name;
  int yearBorn;

  public Person(String name, int year_birth) {
    this.name = name;
    this.yearBorn = year_birth;
  }

  @Override
  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
  
  public void setName(String s) {
	  name = s;
  }
}
