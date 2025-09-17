class Animal {
  private String animalType;
  private int age;

  public void setVariables() {
    animalType = "dog";
    age = 5;
  }

  public void printInfo() {
    System.out.println("I am a " + animalType);
    System.out.println("I am " + age + " years old");
  }

}
