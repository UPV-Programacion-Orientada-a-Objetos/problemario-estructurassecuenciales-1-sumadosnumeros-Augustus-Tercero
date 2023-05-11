class Main {
  public static void main(String[] args) {
    SumaDosNumeros obj = new SumaDosNumeros();
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    System.out.println(obj.suma(a, b));
  }
}
