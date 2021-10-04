  public static void pir(Node node, int d1, int d2) {
  if (node == null) {
    return;

  }
  if (node.data > d1 && node.data > d2) {
    pir(node.left, d1, d2);
  } else if (node.data < d1 && node.data < d2) {
    pir(node.right, d1, d2);
  } else {
    pir(node.left, d1, d2);
    System.out.println(node.data);
    pir(node.right, d1, d2);
  }
}
