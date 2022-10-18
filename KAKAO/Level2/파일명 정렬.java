이렇게 푸는게 제일 Best고 다른거는 왜 틀린지 모르겠다

import java.util.*;

class Solution {
    public String[] solution(String[] files) {
        String[] answer = {};
        List<File> list = new ArrayList<>();
        for(int i=0; i< files.length; i++){
            String s = files[i];
            String head = "";
            String number = "";
            String tail = "";
            int idx = 0;
            for(int j=0; j<s.length(); j++){
                if(Character.isDigit(s.charAt(j))){
                    idx = j;
                    break;
                }
                head += s.charAt(j);
            }
            for(int j=idx ; j<s.length(); j++){
                if(!Character.isDigit(s.charAt(j))){
                    idx = j;
                    break;
                }
                number += s.charAt(j);
            }

            for(int j=idx; j<s.length(); j++){
                tail += s.charAt(j);
            }

            list.add(new File(s,head, number, tail));
        }

        Collections.sort(list);
        answer = new String[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i).getFileName();
        }


        return answer;
    }

    static class File implements Comparable<File>{
        String fileName;
        String head;
        int number;
        String tail;

        public File(String fileName, String head, String number, String tail){
            this.fileName = fileName;
            this.head = head.toUpperCase();
            this.number = Integer.parseInt(number);
            this.tail = tail;
        }

        public String getFileName(){
            return this.fileName;
        }

        @Override
        public int compareTo(File o) {
            if(this.head.equals(o.head)){
                return this.number - o.number;
            }else{
                return this.head.compareTo(o.head);
            }

        }
    }
}
