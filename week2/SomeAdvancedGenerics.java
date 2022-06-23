// package week2;

// import java.util.ArrayList;
// import java.util.List;
// import java.util.stream.Collector;
// import java.util.stream.Collectors;

// /**
//  * Goals:
//  * -Recognize lower bounded wildcard
//  * -Recognize unbounded wildcard
//  * -Recognize upper bounded wildcard
//  * 
//  */
// public class SomeAdvancedGenerics {
//     public static void main(String[] args) {
//         // upper bounded wildcard <? extends Whatever>
//         List<Integer> myFavoriteInts = new ArrayList<>();
//         myFavoriteInts.add(3);
//         myFavoriteInts.add(1_000_000);
//         myFavoriteInts = removeNumbersLargerThan(myFavoriteInts, 10_000);

//         List<Double> myFavoriteDoubles = new ArrayList<>();
//         myFavoriteDoubles.add(3.0);
//         myFavoriteDoubles.add(0.3);
//         myFavoriteDoubles = removeNumbersLargerThan(myFavoriteDoubles, 10_000);
//         // How can we fix that????



//         // unbounded wildcard <?>
//         List<String> myFavoriteLetters = new ArrayList<>();
//         myFavoriteLetters.add("J");
//         List<String> myLeastFavoriteLetters = new ArrayList<>();
//         myLeastFavoriteLetters.add("Q");
//         myLeastFavoriteLetters.add("Z");
//         System.out.println(isLongerThan(myFavoriteLetters, myLeastFavoriteLetters));

//         // How can we use unbounded wildcard to fix the isLongerThan method?
//         System.out.println(isLongerThan(myFavoriteLetters, myFavoriteInts));


//         // lower bounded wildcard <? super Whatever>
//     }

//     private static List<Integer> removeNumbersLargerThan(List<Integer> numberList, int limit) {
//         // How can we fix this?
//         return numberList.stream().filter(number -> number < limit).toList();
//     }

//     private static <T> boolean isLongerThan(List<T> list1, List<T> list2) {
//        return list1.size() > list2.size();
//     }
// }
