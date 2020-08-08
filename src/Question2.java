import java.util.HashMap;

public class Question2 {
    public boolean canConvertString(String s, String t, int k) {

        if (s.length() != t.length())
            return false;

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            if (!(s.charAt(i) == t.charAt(i))) {

                int dif = t.charAt(i) - s.charAt(i);

                if (dif < 0)
                    dif += 26;

                if (dif > k)
                    return false;

                if (hm.containsKey(dif)) {

                    hm.put(dif, hm.get(dif) + 1);


                    if (((hm.get(dif) * 26) + dif) > k){

                        return false;
                    }
                }
                else {
                    hm.put(dif, 0);
                }


            }
        }

        return true;


    }
}
