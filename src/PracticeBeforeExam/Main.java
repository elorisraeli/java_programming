package PracticeBeforeExam;


public class Main {
    public static void main(String[] args) {
//        Dog dog = new Dog("boxer", 13, "brown");
//        System.out.println(dog);
//        dog.setName("david");
//        System.out.println(dog);
//        Cat mitzi = new Cat(5, "sara", "white");
//        String mitziName = mitzi.getName();
//        String mitziColor = mitzi.getColor();
//        System.out.println("The cat name is: " + mitziName + " and the color of the fur is: " + mitziColor);



        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addHead(1);
        linkedList.add(3);
        linkedList.add(65);
        linkedList.add(43);
        linkedList.add(76);
        linkedList.add(4575);
        linkedList.add(54);
        linkedList.add(412);
        linkedList.add(412346);
        linkedList.add(2);
        linkedList.addHead(76543);
        linkedList.add(76543);
        linkedList.add(5555);
        linkedList.addAt(324, 4);
//        MyLinkedList secondLinkedList = new MyLinkedList();
        System.out.println(linkedList.at(4));
        System.out.println(linkedList);
        System.out.println(linkedList.getTail().toString());
        System.out.println(linkedList.getHead().toString());
        System.out.println(linkedList.size());

        System.out.println(max_data(linkedList));
        System.out.println(linkedList.getNodeAt(3));

    }


    public static int max_data(MyLinkedList linkedList){
        int max = Integer.MIN_VALUE, counter=0;
        while (linkedList.getNodeAt(counter).getNext() != null){
            // there are 2 ways to call a node data, I use both :)
            if (linkedList.getNodeAt(counter).getData() > linkedList.at(counter+1))
                max = linkedList.at(counter);
            counter++;
        }
        return max;
    }
}




















//    public static int[] maxUpArray(int[] nums){
//        int[] temp1 = new int[nums.length];
//        int[] temp2 = new int[nums.length];
//        int i = 0;
//        while (i<nums.length) {
//            while (nums[i + 1] < nums[i]) {
//                temp1[i] = nums[i];
//                i++;
//            }
//            i++;
//            while (nums[i + 1] < nums[i]) {
//                temp1[i] = nums[i];
//                i++;
//            }
//            if (temp1.length > temp2.length) temp2 = new int[nums.length];
//            else temp1 = new int[nums.length];
//        }
//        if (temp1.length > temp2.length) return temp1;
//        else return temp2;
//    }
//
//    public static int[] withoutTen(int[] nums) {
//        int temp[] = new int[nums.length];
//        int j = 0;
//        int tens_counter = 0;
//        for(int i=0; i<nums.length; i++){
//            if(nums[i]!=10){
//                System.out.println(nums[i] + ", j: " + j + ", temp[j]: " + temp[j]);
//                temp[j]=nums[i];
//                j++;
//            }
//            else {
//                temp[nums.length-1-tens_counter] = 0;
//                tens_counter++;
//            }
//
//            System.out.println(Arrays.toString(temp));
//        }
//        return temp;
//    }

