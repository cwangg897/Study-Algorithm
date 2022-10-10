실패 케이스를 못찾았다 (다시풀기)


import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        String regExp = "^[A-Z]*$";
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        for(int i=0; i<str1.length()-1; i++){
            String s  = "";
            s+= str1.charAt(i);
            s+= str1.charAt(i+1);

            if(s.matches(regExp)){
                list1.add(s);
            }
        }

        for(int i=0; i<str2.length()-1; i++){
            String s  = "";
            s+= str2.charAt(i);
            s+= str2.charAt(i+1);

            if(s.matches(regExp)){
                list2.add(s);
            }
        }

        Collections.sort(list1);
        Collections.sort(list2);


        List<String> gyo = new ArrayList<>();
        List<String> union = new ArrayList<>();

        for(int i=0; i< list1.size(); i++){
            if(list2.remove(list1.get(i))){
                gyo.add(list1.get(i));
            }
            union.add(list1.get(i));
        }

        for(int i=0; i< list2.size(); i++){
            union.add(list2.get(i));
        }

        double re = 0;
        if(union.size() ==0){
            re = 1;
        } else{
            re = (double) gyo.size() / union.size();
        }

        answer = (int) (re*65536);
        return answer;
    }
}
