package botChat;

import java.util.ArrayList;

import javax.swing.JFrame;



public class StockValue extends JFrame{
	public static ArrayList<String> alllist=new ArrayList<String>();
	public static ArrayList<String> rlist=new ArrayList<String>();
	public static ArrayList<String> plist=new ArrayList<String>();
	public static ArrayList<String> nlist=new ArrayList<String>();
	public static ArrayList<String> meword=new ArrayList<String>();
	public static ArrayList<String> kaword=new ArrayList<String>();
	
	String[] rList={"しにたい","しにそう","つかれ"};//反応するワードを考える
	String[] pList= {"だいじょうぶだよ","ゆっくりしていいんだよ","がんばったよ"};//なだめる、ほめるワードを考える
	String[] nList= {"そっか","それで？","ふーん"};//けなす、ささるワードを考える
	
	public StockValue() {}
	
	public String[] getreactionList() {
		int ii=0;
		String[] Ret=new String[rlist.size()];
		if(rlist.size()==0) return rList;
		else {
			for(String Li:rlist) {
				Ret[ii]=Li;
				ii++;
				}
			return Ret;}
	}
	public String[] getPList() {
		int ii=0;
		String[] Ret=new String[plist.size()];
		if(plist.size()==0) return pList;
		else {
			for(String Li:plist) {
				Ret[ii]=Li;
				ii++;
				}
			return Ret;}
		}
	public String[] getNList() {
		int ii=0;
		String[] Ret=new String[nlist.size()];
		if(nlist.size()==0) return nList;
		else {
			for(String Li:nlist) {
				Ret[ii]=Li;
				ii++;
				}
			return Ret;}
		}
	
	public String[] listAdd(String addword,int A,String[] list){
		String[] Ret=new String[list.length+1];
		alllist.clear();int ii=0;
		for(int i=0;i<list.length;i++) {alllist.add(i,list[i]);}
				
		alllist.add(addword);
		
		for(String Li:alllist) {
			Ret[ii]=Li;
			ii++;
			}
		
		if(A==0) rlist=alllist;
		else if(A==1) plist=alllist;
		else if(A==2) nlist=alllist;
		return Ret;
	}
	
	public String[] listRemove(int A,String B,String[] list) {
		String[] Ret=new String[list.length];
		alllist.clear();
		int ii=0;
		for(int i=0;i<list.length;i++) {alllist.add(i,list[i]);}
		
		for(int i=0;i<list.length;i++) {
			if((alllist.get(i)).equals(B)) {
				alllist.remove(i);
				break;
			} 
		}
		for(String Li:alllist) {
			Ret[ii]=Li;
			ii++;
			}
		
		if(A==0) rlist=alllist;
		else if(A==1) plist=alllist;
		else if(A==2) nlist=alllist;
		
		return Ret;
	}
	
	public String[] getme() {
		String[] list=new String[meword.size()];
		int i=0;
		for(String word:meword) {
			list[i]=word;
			i++;
		}
		return list;
	}
	public String[] getyou() {
		String[] list=new String[kaword.size()];
		int i=0;
		for(String word:kaword) {
			list[i]=word;
			i++;
		}
		return list;
	}
	public void wordset() {
		Gui gui=new Gui();
		
		String[] word1=new String[meword.size()];
		String[] word2=new String[kaword.size()];
		
		
		int i;
		i=0;
		for(String word:meword) {
			word1[i]=word;
			i++;
		}
		i=0;
		for(String word:kaword) {
			word2[i]=word;
			i++;
			}
		
		
		gui.RetValue(word1,word2);
	}
	public void RetMeword(String word){
		meword.add(word);
	}
	public void RetKaword(String word){
		kaword.add(word);
	}
}

