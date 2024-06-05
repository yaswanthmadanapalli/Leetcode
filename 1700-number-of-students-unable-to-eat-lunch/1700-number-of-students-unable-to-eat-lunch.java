class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> studentQueue=new LinkedList<>();
        for(int i=0;i<students.length;i++){
            studentQueue.add(students[i]);
        }
        int sandwichIndex=0;
        int roundCounter=0;
        while(!studentQueue.isEmpty()){
            if(studentQueue.peek()==sandwiches[sandwichIndex]){
                studentQueue.poll();
                sandwichIndex++;
                roundCounter=0;
            }
            else{
                studentQueue.add(studentQueue.poll());
                roundCounter++;
            }
            if(roundCounter==studentQueue.size()){
                break;
            }
            
        }
        return studentQueue.size();
    }
}