package Stack;


    class ReverseStackGFG {
	public static void reverseStack(Stack<Integer> st) {
		// This is Swaping aporach
		
		int s = 0, e = st.size() - 1;
		
		while (s < e) {
			int temp = st.get(s);
			st.set(s, st.get(e));
			st.set(e, temp);
			s++;
			e--;
		}
		
		// This is second Apporach
		/*Stack <Integer>ans = new Stack<>();
		Stack <Integer>ans1 = new Stack<>();
		
		while (!st.isEmpty()) {
			
			ans.push(st.pop());
		}
		while (!ans.isEmpty()) {
			
			ans1.push(ans.pop());
		}
		while (!ans1.isEmpty()) {
			
			st.push(ans1.pop());
		}
		*/
		
	}
}


