class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");
  
  int totalMnMs = 55*9;
  double blueMnMs = totalMnMs * .24;
  System.out.println("blue: " + blueMnMs);

  double brownMnMs = totalMnMs * .13;
  System.out.println("brown: " + brownMnMs);
  double greenMnMs = totalMnMs *.16;
  System.out.println("green: " + greenMnMs);
  double orangeMnMs = totalMnMs * .20;
  System.out.println("orange: " + orangeMnMs);

  double redMnMs = totalMnMs * .13;
  System.out.println("red: " + redMnMs);

  double yellowMnMs = totalMnMs * .14;
  System.out.println("yellow: " + yellowMnMs);

  double sumOfMnMs = blueMnMs + brownMnMs + greenMnMs + orangeMnMs + redMnMs + yellowMnMs;
  System.out.println("Sum " + sumOfMnMs);
  
  if (blueMnMs > brownMnMs && greenMnMs > redMnMs)
  System.out.println("Blue over Brown and Green Over Red");

  if (brownMnMs <= orangeMnMs)
  System.out.println("Brown is less than or equal to Orange");

  if (sumOfMnMs == totalMnMs)
  System.out.println("Numbers Match");
  }
}