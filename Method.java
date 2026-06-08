import java.util.*;

public class Method {
    public static void main(String[] args) {

        // code for map

        // Create the Map
        // Map<Integer, String> student = new HashMap<>();

        // Entry the data in map
        List<Integer> list1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list1.add(sc.nextInt());
        }


        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : list1) {
            if(frequencyMap.containsKey(num)){
                int f= frequencyMap.get(num);
                frequencyMap.put(num, f+1);
            }else{
                frequencyMap.put(num, 1);
            }

                
        }
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
       
        sc.close();
        
    }
}

    /*
     * student.put(212, "Satyam Singh");
     * student.put(200, "Kishan Toamr");
     * student.put(231, "Divyansh Dhupad");
     * student.put(207, "Akash Marko");
     * student.put(212, "Abhishek Singh");
     * System.out.println(student);
     * 
     * // Itreating the map
     * for(Map.Entry<Integer,String> map :student.entrySet()){
     * System.out.println(map.getKey() + " " + map.getValue());
     * }
     * 
     */
    /*
     * List<Integer> list1 = new ArrayList<>();
     * List<Integer> list2 = new ArrayList<>();
     * list1.add(1);
     * list1.add(2);
     * list1.add(4);
     * list1.add(3);
     * list2.add(1);
     * list2.add(2);
     * list2.add(3);
     * list2.add(5);
     * 
     * 
     * System.out.println(list1.containsAll(list2));
     * System.out.println(list1.retainAll(list2)); // This will modify list1 to keep
     * only elements that are also in list2
     * System.out.println(list1); // Print the modified list1
     * System.out.println(list1.removeAll(list2)); // Print the modified list2
     */
// find the frequency of each element in list1 through set
 //Set<Integer> set = new HashSet<>(list1);
    /* for (int o : set) {
            int f = 0;
            for (int m : list1) {
                if (o == m) {
                    f++;

                }
            }
            System.out.println(o + " " + f);
            
        } */

