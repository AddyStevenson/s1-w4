public class Name {

   private String myFirst;
   private String myMiddle;
   private String myLast;

   public Name(String first, String middle, String last) {
      myFirst = fixCase(first);
      myMiddle = fixCase(middle);
      myLast = fixCase(last);

   }

   public String lastFirst() {
      return myLast + ", " + myFirst + " " + myMiddle;
   }

   public String fullName() {
      return myFirst + " " + myMiddle + " " + myLast;
   }

   public String fixCase(String np) {
      np = np.toLowerCase().trim();
      np = np.substring(0, 1).toUpperCase() + np.substring(1);
      return np;
   }

   public String initials() {
      String i = myFirst.substring(0, 1) + myMiddle.substring(0, 1) + myLast.substring(0, 1);
      return i;

   }

   public String nickName() {
      return myFirst.substring(0, 1) + myLast.substring(0, 2);

   }

}
// // bad style
// private void fixFirst ( ) {
// myFirst = myFirst.toLowerCase().trim();
// myFirst = myFirst.substring(0,1).toUpperCase() + myFirst.substring(1);
// }

// // bad style
// private void fixMiddle ( ) {
// myMiddle = myMiddle.toLowerCase().trim();
// myMiddle = myMiddle.substring(0,1).toUpperCase() + myMiddle.substring(1);
// }

// // bad style
// private void fixLast ( ) {
// myLast = myLast.toLowerCase().trim();
// myLast = myLast.substring(0,1).toUpperCase() + myLast.substring(1);
// }
