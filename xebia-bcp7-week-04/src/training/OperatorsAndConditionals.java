package training;

class demo{
	
}
//Demonstrate Each and Every Operator (All Scenarios) + Usage of Conditional Operator
public class OperatorsAndConditionals {
	
	public static void main(String[] args) {

//	    Unary Operator 
		
//			expr++
		int i=24;
		System.out.println(i++);
		
//			expr--
		 i=24;
		System.out.println(i--);
		
//			++expr
		 i=24;
		System.out.println(++i);
//			--expr
		 i=24;
		System.out.println(--i);
//			+expr
		 i=24;
		System.out.println(+i);
//			-expr 
		i=24;
		System.out.println(-i);
//			~ 
		i=24;
		System.out.println(~i);
//			!
		boolean x=true;
		System.out.println(!x);
//	    Arithmetic Operator
		int a=5,b=7;
//			* 
		System.out.println(a+b);
//			/ 
		System.out.println(a/b);
//			%
		System.out.println(a%b);
//			+
		System.out.println(a+b);
//			-
		System.out.println(a-b);
		
//	    Shift Operator
		
		int k=5; //101
//			<<
		System.out.println(k<<3);//101000
//			>>
		System.out.println(k>>2);//001
//	    Relational Operator
		
//			<,>
		if(6>3)
			System.out.println("6>3");
//		 	<= >=
		
		if(4<=4)
			System.out.println("4<=4");
		
//			instanceof
		
		demo d=new demo();
		System.out.println(d instanceof demo);
		
//			==
		
		String s="hello";
		String z="hello";
		System.out.println(s==z);
//			!=
		System.out.println(s!=z);
		
//Conditional Operators
		
//	    Bitwise Operator
		
//			&
		
		System.out.println(7&4);//111 & 100 = 100(AND)
//			^
		
		System.out.println(3^7);//100 ^ 111(Xor)
//			|
		System.out.println(3|7);//100 | 111(Or)
//	    Logical Operator
		
//			&&
		System.out.println(5<2&&2<5);
//			||
		System.out.println(5<2||2<5);
//	    Ternary Operator
		
		System.out.println(7<10?"Less than 10":"More than 10");
//	    Assignment Operator
//			=
		int c=3;
//			+=
		System.out.println(c+=4);
//			-=
		System.out.println(c-=3);
//			*=
		System.out.println(c*=2);
//			/=
		System.out.println(c/=2);
//			%=
		System.out.println(c%=3);
//			&=
		int f=5;
		System.out.println(f&=3);//101 & 011 = 001
//			^=
		System.out.println(f^=4);//001 ^ 100 = 101
//			|=
		System.out.println(f|=9);//0101 | 1000 =1101
//			<<=
		System.out.println(f<<=2);//1101 <<= 110100
//			>>=
		System.out.println(f>>=3);//110100 >>= 110

	}

}
