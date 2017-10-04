import java.util.ArrayList;
import java.util.Iterator;

public class Generate {
    public ArrayList<Integer> Generate(ArrayList<Integer> L, ArrayList<Integer> P) {
        ArrayList<Integer> Q = new ArrayList<>();
        Iterator<Integer> iterL = L.iterator();
        Iterator<Integer> iterP = P.iterator();

        int counter = 0;
        int valL = iterL.next();
        for(int i = 0; i < P.size(); i++){
            int index = iterP.next();
            while(iterL.hasNext() && counter != index){
                valL = iterL.next();
                counter++;
            }
            Q.add(valL);
        }
        return Q;
    }
}
