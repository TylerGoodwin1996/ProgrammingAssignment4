/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
* C202 Program 4
* prog.java
* Purpose: Create methods that find words in a random dictionary and compare them to a books words.
* Remove all unwanted characters and then show the average amount of string computations.
* @author Tyler Goodwin
* @version 1.0 10/25/16
*/
import java.util.*;
import java.io.*;
public class prog4 {
    MyLinkedList<String> A = new MyLinkedList<String>();
    MyLinkedList<String> B = new MyLinkedList<String>();
    MyLinkedList<String> C = new MyLinkedList<String>();
    MyLinkedList<String> D = new MyLinkedList<String>();
    MyLinkedList<String> E = new MyLinkedList<String>();
    MyLinkedList<String> F = new MyLinkedList<String>();
    MyLinkedList<String> G = new MyLinkedList<String>();
    MyLinkedList<String> H = new MyLinkedList<String>();
    MyLinkedList<String> I = new MyLinkedList<String>();
    MyLinkedList<String> J = new MyLinkedList<String>();
    MyLinkedList<String> K = new MyLinkedList<String>();
    MyLinkedList<String> L = new MyLinkedList<String>();
    MyLinkedList<String> M = new MyLinkedList<String>();
    MyLinkedList<String> N = new MyLinkedList<String>();
    MyLinkedList<String> O = new MyLinkedList<String>();
    MyLinkedList<String> P = new MyLinkedList<String>();
    MyLinkedList<String> Q = new MyLinkedList<String>();
    MyLinkedList<String> R = new MyLinkedList<String>();
    MyLinkedList<String> S = new MyLinkedList<String>();
    MyLinkedList<String> T = new MyLinkedList<String>();
    MyLinkedList<String> U = new MyLinkedList<String>();
    MyLinkedList<String> V = new MyLinkedList<String>();
    MyLinkedList<String> W = new MyLinkedList<String>();
    MyLinkedList<String> X = new MyLinkedList<String>();
    MyLinkedList<String> Y = new MyLinkedList<String>();
    MyLinkedList<String> Z = new MyLinkedList<String>();
    //Reads the random dictionary file and creates sunlists for each letter of the alphabet and puts all the words that start with each letter into one of the 26 sublists.
    public void readD(){
        try{
            File dictionary = new File("random_dictionary.txt");
            Scanner input = new Scanner(dictionary);
            while(input.hasNext()){
                String list = input.next().toLowerCase();
                char t = list.charAt(0);
                switch(t){
                    case 'a': A.add(list);break;
                    case 'b': B.add(list);break;
                    case 'c': C.add(list);break;
                    case 'd': D.add(list);break;
                    case 'e': E.add(list);break;
                    case 'f': F.add(list);break;
                    case 'g': G.add(list);break;
                    case 'h': H.add(list);break;
                    case 'i': I.add(list);break;
                    case 'j': J.add(list);break;
                    case 'k': K.add(list);break;
                    case 'l': L.add(list);break;
                    case 'm': M.add(list);break;
                    case 'n': N.add(list);break;
                    case 'o': O.add(list);break;
                    case 'p': P.add(list);break;
                    case 'q': Q.add(list);break;
                    case 'r': R.add(list);break;
                    case 's': S.add(list);break;
                    case 't': T.add(list);break;
                    case 'u': U.add(list);break;
                    case 'v': V.add(list);break;
                    case 'w': W.add(list);break;
                    case 'x': X.add(list);break;
                    case 'y': Y.add(list);break;
                    case 'z': Z.add(list);break;
                    default:; break;         
                }
            }
            input.close();
        }
        catch (IOException e){
            
        }
        
    }
    //Reads the oliver and compares it with the dictionary to find the amount of letter in and not in the dictionary.
    public void readO(){
        try {
            MyLinkedList[] l = new MyLinkedList[26];
            File oliver = new File("oliver.txt");
            Scanner input = new Scanner(oliver);
            int wordsFound = 0;
            int wordsNotFound = 0;
            while(input.hasNext()){
                String list = input.next().replaceAll("\\W", "").replaceAll("[0-9]", "").replaceAll("[-_]", "").toLowerCase();
                char t = ' ';
                if(!list.equals("")){
                    t = list.charAt(0);
                }
                switch(t){
                    case 'a': if(A.contains(list)){wordsFound++;}else{wordsNotFound++;};break;
                    case 'b': if(B.contains(list)){wordsFound++;}else{wordsNotFound++;};break;
                    case 'c': if(C.contains(list)){wordsFound++;}else{wordsNotFound++;};break;
                    case 'd': if(D.contains(list)){wordsFound++;}else{wordsNotFound++;};break;
                    case 'e': if(E.contains(list)){wordsFound++;}else{wordsNotFound++;};break;
                    case 'f': if(F.contains(list)){wordsFound++;}else{wordsNotFound++;};break;
                    case 'g': if(G.contains(list)){wordsFound++;}else{wordsNotFound++;};break;
                    case 'h': if(H.contains(list)){wordsFound++;}else{wordsNotFound++;};break;
                    case 'i': if(I.contains(list)){wordsFound++;}else{wordsNotFound++;};break;
                    case 'j': if(J.contains(list)){wordsFound++;}else{wordsNotFound++;};break;
                    case 'k': if(K.contains(list)){wordsFound++;}else{wordsNotFound++;};break;
                    case 'l': if(L.contains(list)){wordsFound++;}else{wordsNotFound++;};break;
                    case 'm': if(M.contains(list)){wordsFound++;}else{wordsNotFound++;};break;
                    case 'n': if(N.contains(list)){wordsFound++;}else{wordsNotFound++;};break;
                    case 'o': if(O.contains(list)){wordsFound++;}else{wordsNotFound++;};break;
                    case 'p': if(P.contains(list)){wordsFound++;}else{wordsNotFound++;};break;
                    case 'q': if(Q.contains(list)){wordsFound++;}else{wordsNotFound++;};break;
                    case 'r': if(R.contains(list)){wordsFound++;}else{wordsNotFound++;};break;
                    case 's': if(S.contains(list)){wordsFound++;}else{wordsNotFound++;};break;
                    case 't': if(T.contains(list)){wordsFound++;}else{wordsNotFound++;};break;
                    case 'u': if(U.contains(list)){wordsFound++;}else{wordsNotFound++;};break;
                    case 'v': if(V.contains(list)){wordsFound++;}else{wordsNotFound++;};break;
                    case 'w': if(W.contains(list)){wordsFound++;}else{wordsNotFound++;};break;
                    case 'x': if(X.contains(list)){wordsFound++;}else{wordsNotFound++;};break;
                    case 'y': if(Y.contains(list)){wordsFound++;}else{wordsNotFound++;};break;
                    case 'z': if(Z.contains(list)){wordsFound++;}else{wordsNotFound++;};break;
                    default:; break;         
                }
            }
            input.close();
            System.out.println("Words found:" + wordsFound);
            System.out.println("Words not found:" + wordsNotFound);
        } 
        catch (IOException e) {
        }
    }
    //Runs all the methods
    public static void main(String[] args){
        prog4 jim = new prog4();
        jim.readD();
        jim.readO();
    }
    
}
