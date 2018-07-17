
public static void main(String args[]){
boolean stmt1 = "champ" == "champ";
boolean stmt2 = new String("champ").equals(new String("champ"));
boolean stmt3 = "champ".toString()=="champ";

System.out.println(stmt1 && stmt2 && stmt3);
}
