import java.util.ArrayList;

public class IntersectionUnion {

    public ArrayList<Integer> intersection(ArrayList<Integer> list1, ArrayList<Integer> list2){

        int index1 = 0;
        int index2 = 0;
        ArrayList<Integer> inter = new ArrayList<>();

        while (index1 < list1.size() && index2 < list2.size()) {
            int num1 = list1.get(index1);
            int num2 = list2.get(index2);
            if(num1 < num2){
                index1++;
            } else if (num1 > num2) {
                index2++;
            } else {
                inter.add(list1.get(index1));
                index1++;
                index2++;
            }
        }
        return inter;
    }

    public ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2){

        int index1 = 0;
        int index2 = 0;
        ArrayList<Integer> uni = new ArrayList<>();

        while (index1 < list1.size() || index2 < list2.size()) {
            int num1 = list1.get(index1);
            int num2 = list2.get(index2);
            if(num1 < num2){
                uni.add(num1);
                index1++;
            } else if (num1 > num2) {
                uni.add(num2);
                index2++;
            } else {
                uni.add(list1.get(index1));
                index1++;
                index2++;
            }
        }

        while (index1 < list1.size()) {
            uni.add(list1.get(index1));
            index1++;
        }
        while (index2 < list2.size()) {
            uni.add(list2.get(index1));
            index2++;
        }
        return uni;
    }

}
