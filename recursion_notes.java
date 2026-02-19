//Recursion : Executes again and again and again


//Types : 1. Direct recursion -> Head ->Method call start or middle
//                            ->Tail -> Method call last
//                            ->Tree -> Move than are recursion call 
//                            ->Nested
//Syntax :  Head
//          func()
//          {
//        	  func();
//        	  str1;
//          }
//Syntax :  Tail 
//          func()
//          {
//	        str1;
//	        func();
//          }
//Syntex : Tree
//         func()
//         {
//	      func();
//	      str1;
//	      func();
//         }
//Syntex :  Nested
//          func()
//          {
//	        str1;
//	        func(func());
//          }


//        2. Indirect recursion
//         func()
//         {
//            str1;
//			  func();
//			}
// 		      func();
//			{
//			  str1;
//		      func();
//			}

       

//Tail Recursion

package day17;

