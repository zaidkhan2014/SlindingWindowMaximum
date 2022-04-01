import java.util.Stack;

public class slidingwindowmax {
    public static void fun(int [] arr,int key){
        //next greater element to the right
        int [] right=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        right[arr.length-1]= arr.length;
        st.push(arr.length-1);
        for (int i= arr.length-2;i>=0;i--){
            while (st.size()>0 && arr[i]>=arr[st.peek()]){
                st.pop();
            }
            if (st.size()==0){
                right[i]= arr.length;
            }
            else{
                right[i]=st.peek();
            }
            st.push(i);
        }

        for (int i=0;i<= arr.length-key;i++){
            int j=i;
            while(right[j]<i+key){
                j=right[j];
            }
            System.out.println(arr[j]);
        }

    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9};
        fun(arr,2);
    }
}
